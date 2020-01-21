package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroupsConfig extends js.Object {
  /**
    * One or more target groups.
    */
  var TargetGroups: js.UndefOr[typings.awsSdk.ec2Mod.TargetGroups] = js.native
}

object TargetGroupsConfig {
  @scala.inline
  def apply(TargetGroups: TargetGroups = null): TargetGroupsConfig = {
    val __obj = js.Dynamic.literal()
    if (TargetGroups != null) __obj.updateDynamic("TargetGroups")(TargetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupsConfig]
  }
}

