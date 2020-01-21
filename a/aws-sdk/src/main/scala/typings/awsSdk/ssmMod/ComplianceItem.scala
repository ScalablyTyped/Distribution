package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceItem extends js.Object {
  /**
    * The compliance type. For example, Association (for a State Manager association), Patch, or Custom:string are all valid compliance types.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.native
  /**
    * A "Key": "Value" tag combination for the compliance item.
    */
  var Details: js.UndefOr[ComplianceItemDetails] = js.native
  /**
    * A summary for the compliance item. The summary includes an execution ID, the execution type (for example, command), and the execution time.
    */
  var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.native
  /**
    * An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article; for example: KB4010320.
    */
  var Id: js.UndefOr[ComplianceItemId] = js.native
  /**
    * An ID for the resource. For a managed instance, this is the instance ID.
    */
  var ResourceId: js.UndefOr[ComplianceResourceId] = js.native
  /**
    * The type of resource. ManagedInstance is currently the only supported resource type.
    */
  var ResourceType: js.UndefOr[ComplianceResourceType] = js.native
  /**
    * The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.
    */
  var Severity: js.UndefOr[ComplianceSeverity] = js.native
  /**
    * The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
    */
  var Status: js.UndefOr[ComplianceStatus] = js.native
  /**
    * A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.
    */
  var Title: js.UndefOr[ComplianceItemTitle] = js.native
}

object ComplianceItem {
  @scala.inline
  def apply(
    ComplianceType: ComplianceTypeName = null,
    Details: ComplianceItemDetails = null,
    ExecutionSummary: ComplianceExecutionSummary = null,
    Id: ComplianceItemId = null,
    ResourceId: ComplianceResourceId = null,
    ResourceType: ComplianceResourceType = null,
    Severity: ComplianceSeverity = null,
    Status: ComplianceStatus = null,
    Title: ComplianceItemTitle = null
  ): ComplianceItem = {
    val __obj = js.Dynamic.literal()
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType.asInstanceOf[js.Any])
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    if (ExecutionSummary != null) __obj.updateDynamic("ExecutionSummary")(ExecutionSummary.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Severity != null) __obj.updateDynamic("Severity")(Severity.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceItem]
  }
}

