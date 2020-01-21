package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceChange extends js.Object {
  /**
    * The change action.
    */
  var Action: js.UndefOr[ChangeAction] = js.native
  /**
    * Information about the resource changes.
    */
  var Details: js.UndefOr[ResourceChangeDetails] = js.native
  /**
    * The ID of the resource, as defined in the CloudFormation template.
    */
  var LogicalResourceId: js.UndefOr[typings.awsSdk.servicecatalogMod.LogicalResourceId] = js.native
  /**
    * The ID of the resource, if it was already created.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsSdk.servicecatalogMod.PhysicalResourceId] = js.native
  /**
    * If the change type is Modify, indicates whether the existing resource is deleted and replaced with a new one.
    */
  var Replacement: js.UndefOr[typings.awsSdk.servicecatalogMod.Replacement] = js.native
  /**
    * The type of resource.
    */
  var ResourceType: js.UndefOr[PlanResourceType] = js.native
  /**
    * The change scope.
    */
  var Scope: js.UndefOr[typings.awsSdk.servicecatalogMod.Scope] = js.native
}

object ResourceChange {
  @scala.inline
  def apply(
    Action: ChangeAction = null,
    Details: ResourceChangeDetails = null,
    LogicalResourceId: LogicalResourceId = null,
    PhysicalResourceId: PhysicalResourceId = null,
    Replacement: Replacement = null,
    ResourceType: PlanResourceType = null,
    Scope: Scope = null
  ): ResourceChange = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    if (LogicalResourceId != null) __obj.updateDynamic("LogicalResourceId")(LogicalResourceId.asInstanceOf[js.Any])
    if (PhysicalResourceId != null) __obj.updateDynamic("PhysicalResourceId")(PhysicalResourceId.asInstanceOf[js.Any])
    if (Replacement != null) __obj.updateDynamic("Replacement")(Replacement.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Scope != null) __obj.updateDynamic("Scope")(Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceChange]
  }
}

