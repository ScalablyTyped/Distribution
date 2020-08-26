package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingGroup extends js.Object {
  /**
    * An Auto Scaling lifecycle event hook name.
    */
  var hook: js.UndefOr[AutoScalingGroupHook] = js.native
  /**
    * The Auto Scaling group name.
    */
  var name: js.UndefOr[AutoScalingGroupName] = js.native
}

object AutoScalingGroup {
  @scala.inline
  def apply(): AutoScalingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingGroup]
  }
  @scala.inline
  implicit class AutoScalingGroupOps[Self <: AutoScalingGroup] (val x: Self) extends AnyVal {
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
    def setHook(value: AutoScalingGroupHook): Self = this.set("hook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHook: Self = this.set("hook", js.undefined)
    @scala.inline
    def setName(value: AutoScalingGroupName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

