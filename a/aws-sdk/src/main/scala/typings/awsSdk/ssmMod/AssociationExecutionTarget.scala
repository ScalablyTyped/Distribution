package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationExecutionTarget extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.ssmMod.AssociationId] = js.native
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.ssmMod.AssociationVersion] = js.native
  /**
    * Detailed information about the execution status.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  /**
    * The execution ID.
    */
  var ExecutionId: js.UndefOr[AssociationExecutionId] = js.native
  /**
    * The date of the last execution.
    */
  var LastExecutionDate: js.UndefOr[DateTime] = js.native
  /**
    * The location where the association details are saved.
    */
  var OutputSource: js.UndefOr[typings.awsSdk.ssmMod.OutputSource] = js.native
  /**
    * The resource ID, for example, the instance ID where the association ran.
    */
  var ResourceId: js.UndefOr[AssociationResourceId] = js.native
  /**
    * The resource type, for example, instance.
    */
  var ResourceType: js.UndefOr[AssociationResourceType] = js.native
  /**
    * The association execution status.
    */
  var Status: js.UndefOr[StatusName] = js.native
}

object AssociationExecutionTarget {
  @scala.inline
  def apply(
    AssociationId: AssociationId = null,
    AssociationVersion: AssociationVersion = null,
    DetailedStatus: StatusName = null,
    ExecutionId: AssociationExecutionId = null,
    LastExecutionDate: DateTime = null,
    OutputSource: OutputSource = null,
    ResourceId: AssociationResourceId = null,
    ResourceType: AssociationResourceType = null,
    Status: StatusName = null
  ): AssociationExecutionTarget = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (AssociationVersion != null) __obj.updateDynamic("AssociationVersion")(AssociationVersion.asInstanceOf[js.Any])
    if (DetailedStatus != null) __obj.updateDynamic("DetailedStatus")(DetailedStatus.asInstanceOf[js.Any])
    if (ExecutionId != null) __obj.updateDynamic("ExecutionId")(ExecutionId.asInstanceOf[js.Any])
    if (LastExecutionDate != null) __obj.updateDynamic("LastExecutionDate")(LastExecutionDate.asInstanceOf[js.Any])
    if (OutputSource != null) __obj.updateDynamic("OutputSource")(OutputSource.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationExecutionTarget]
  }
}

