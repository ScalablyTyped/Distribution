package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetOperationSummary extends js.Object {
  /**
    * The type of operation: CREATE, UPDATE, or DELETE. Create and delete operations affect only the specified stack instances that are associated with the specified stack set. Update operations affect both the stack set itself as well as all associated stack set instances.
    */
  var Action: js.UndefOr[StackSetOperationAction] = js.native
  /**
    * The time at which the operation was initiated. Note that the creation times for the stack set operation might differ from the creation time of the individual stacks themselves. This is because AWS CloudFormation needs to perform preparatory work for the operation, such as dispatching the work to the requested regions, before actually creating the first stacks.
    */
  var CreationTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The time at which the stack set operation ended, across all accounts and regions specified. Note that this doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account or region.
    */
  var EndTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The unique ID of the stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The overall status of the operation.    FAILED: The operation exceeded the specified failure tolerance. The failure tolerance value that you've set for an operation is applied for each region during stack create and update operations. If the number of failed stacks within a region exceeds the failure tolerance, the status of the operation in the region is set to FAILED. This in turn sets the status of the operation as a whole to FAILED, and AWS CloudFormation cancels the operation in any remaining regions.    QUEUED: [Service-managed permissions] For automatic deployments that require a sequence of operations. The operation is queued to be performed. For more information, see the stack set operation status codes in the AWS CloudFormation User Guide.    RUNNING: The operation is currently being performed.    STOPPED: The user has cancelled the operation.    STOPPING: The operation is in the process of stopping, at user request.     SUCCEEDED: The operation completed creating or updating all the specified stacks without exceeding the failure tolerance for the operation.  
    */
  var Status: js.UndefOr[StackSetOperationStatus] = js.native
}

object StackSetOperationSummary {
  @scala.inline
  def apply(
    Action: StackSetOperationAction = null,
    CreationTimestamp: Timestamp = null,
    EndTimestamp: Timestamp = null,
    OperationId: ClientRequestToken = null,
    Status: StackSetOperationStatus = null
  ): StackSetOperationSummary = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp.asInstanceOf[js.Any])
    if (EndTimestamp != null) __obj.updateDynamic("EndTimestamp")(EndTimestamp.asInstanceOf[js.Any])
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSetOperationSummary]
  }
}

