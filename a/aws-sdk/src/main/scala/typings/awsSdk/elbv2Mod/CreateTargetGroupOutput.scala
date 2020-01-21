package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTargetGroupOutput extends js.Object {
  /**
    * Information about the target group.
    */
  var TargetGroups: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroups] = js.native
}

object CreateTargetGroupOutput {
  @scala.inline
  def apply(TargetGroups: TargetGroups = null): CreateTargetGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (TargetGroups != null) __obj.updateDynamic("TargetGroups")(TargetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTargetGroupOutput]
  }
}

