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
  def apply(name: String = null): AutoScalingGroup = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingGroup]
  }
}

