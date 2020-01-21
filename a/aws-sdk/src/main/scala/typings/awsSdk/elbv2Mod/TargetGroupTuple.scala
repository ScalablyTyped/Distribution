package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroupTuple extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroupArn] = js.native
  /**
    * The weight. The range is 0 to 999.
    */
  var Weight: js.UndefOr[TargetGroupWeight] = js.native
}

object TargetGroupTuple {
  @scala.inline
  def apply(TargetGroupArn: TargetGroupArn = null, Weight: Int | Double = null): TargetGroupTuple = {
    val __obj = js.Dynamic.literal()
    if (TargetGroupArn != null) __obj.updateDynamic("TargetGroupArn")(TargetGroupArn.asInstanceOf[js.Any])
    if (Weight != null) __obj.updateDynamic("Weight")(Weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupTuple]
  }
}

