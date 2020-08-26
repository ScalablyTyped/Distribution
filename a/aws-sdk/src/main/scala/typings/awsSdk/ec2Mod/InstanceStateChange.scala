package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStateChange extends js.Object {
  /**
    * The current state of the instance.
    */
  var CurrentState: js.UndefOr[InstanceState] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The previous state of the instance.
    */
  var PreviousState: js.UndefOr[InstanceState] = js.native
}

object InstanceStateChange {
  @scala.inline
  def apply(): InstanceStateChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStateChange]
  }
  @scala.inline
  implicit class InstanceStateChangeOps[Self <: InstanceStateChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentState(value: InstanceState): Self = this.set("CurrentState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentState: Self = this.set("CurrentState", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setPreviousState(value: InstanceState): Self = this.set("PreviousState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousState: Self = this.set("PreviousState", js.undefined)
  }
  
}

