package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutComplianceItemsRequest extends js.Object {
  /**
    * Specify the compliance type. For example, specify Association (for a State Manager association), Patch, or Custom:string.
    */
  var ComplianceType: ComplianceTypeName = js.native
  /**
    * A summary of the call execution that includes an execution ID, the type of execution (for example, Command), and the date/time of the execution using a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
    */
  var ExecutionSummary: ComplianceExecutionSummary = js.native
  /**
    * MD5 or SHA-256 content hash. The content hash is used to determine if existing information should be overwritten or ignored. If the content hashes match, the request to put compliance information is ignored.
    */
  var ItemContentHash: js.UndefOr[ComplianceItemContentHash] = js.native
  /**
    * Information about the compliance as defined by the resource type. For example, for a patch compliance type, Items includes information about the PatchSeverity, Classification, etc.
    */
  var Items: ComplianceItemEntryList = js.native
  /**
    * Specify an ID for this resource. For a managed instance, this is the instance ID.
    */
  var ResourceId: ComplianceResourceId = js.native
  /**
    * Specify the type of resource. ManagedInstance is currently the only supported resource type.
    */
  var ResourceType: ComplianceResourceType = js.native
}

object PutComplianceItemsRequest {
  @scala.inline
  def apply(
    ComplianceType: ComplianceTypeName,
    ExecutionSummary: ComplianceExecutionSummary,
    Items: ComplianceItemEntryList,
    ResourceId: ComplianceResourceId,
    ResourceType: ComplianceResourceType,
    ItemContentHash: ComplianceItemContentHash = null
  ): PutComplianceItemsRequest = {
    val __obj = js.Dynamic.literal(ComplianceType = ComplianceType.asInstanceOf[js.Any], ExecutionSummary = ExecutionSummary.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    if (ItemContentHash != null) __obj.updateDynamic("ItemContentHash")(ItemContentHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutComplianceItemsRequest]
  }
}

