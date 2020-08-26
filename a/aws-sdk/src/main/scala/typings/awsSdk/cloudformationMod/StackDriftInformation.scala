package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackDriftInformation extends js.Object {
  /**
    * Most recent time when a drift detection operation was initiated on the stack, or any of its individual resources that support drift detection.
    */
  var LastCheckTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * Status of the stack's actual configuration compared to its expected template configuration.     DRIFTED: The stack differs from its expected template configuration. A stack is considered to have drifted if one or more of its resources have drifted.    NOT_CHECKED: AWS CloudFormation has not checked if the stack differs from its expected template configuration.    IN_SYNC: The stack's actual configuration matches its expected template configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var StackDriftStatus: typings.awsSdk.cloudformationMod.StackDriftStatus = js.native
}

object StackDriftInformation {
  @scala.inline
  def apply(StackDriftStatus: StackDriftStatus): StackDriftInformation = {
    val __obj = js.Dynamic.literal(StackDriftStatus = StackDriftStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackDriftInformation]
  }
  @scala.inline
  implicit class StackDriftInformationOps[Self <: StackDriftInformation] (val x: Self) extends AnyVal {
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
    def setStackDriftStatus(value: StackDriftStatus): Self = this.set("StackDriftStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastCheckTimestamp(value: Timestamp): Self = this.set("LastCheckTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastCheckTimestamp: Self = this.set("LastCheckTimestamp", js.undefined)
  }
  
}

