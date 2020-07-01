package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackInstanceComprehensiveStatus extends js.Object {
  /**
    *    CANCELLED: The operation in the specified account and Region has been cancelled. This is either because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation has been exceeded.    FAILED: The operation in the specified account and Region failed. If the stack set operation fails in enough accounts within a Region, the failure tolerance for the stack set operation as a whole might be exceeded.    INOPERABLE: A DeleteStackInstances operation has failed and left the stack in an unstable state. Stacks in this state are excluded from further UpdateStackSet operations. You might need to perform a DeleteStackInstances operation, with RetainStacks set to true, to delete the stack instance, and then delete the stack manually.    PENDING: The operation in the specified account and Region has yet to start.    RUNNING: The operation in the specified account and Region is currently in progress.    SUCCEEDED: The operation in the specified account and Region completed successfully.  
    */
  var DetailedStatus: js.UndefOr[StackInstanceDetailedStatus] = js.native
}

object StackInstanceComprehensiveStatus {
  @scala.inline
  def apply(DetailedStatus: StackInstanceDetailedStatus = null): StackInstanceComprehensiveStatus = {
    val __obj = js.Dynamic.literal()
    if (DetailedStatus != null) __obj.updateDynamic("DetailedStatus")(DetailedStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackInstanceComprehensiveStatus]
  }
}

