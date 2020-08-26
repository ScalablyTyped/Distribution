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
  def apply(): StackInstanceComprehensiveStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackInstanceComprehensiveStatus]
  }
  @scala.inline
  implicit class StackInstanceComprehensiveStatusOps[Self <: StackInstanceComprehensiveStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetailedStatus(value: StackInstanceDetailedStatus): Self = this.set("DetailedStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailedStatus: Self = this.set("DetailedStatus", js.undefined)
  }
  
}

