package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingGroup extends js.Object {
  /**
    * The name of the Auto Scaling group associated with an Amazon EKS managed node group.
    */
  var name: js.UndefOr[String] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

