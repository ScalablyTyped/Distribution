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
  def apply(): TargetGroupTuple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupTuple]
  }
  @scala.inline
  implicit class TargetGroupTupleOps[Self <: TargetGroupTuple] (val x: Self) extends AnyVal {
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
    def setTargetGroupArn(value: TargetGroupArn): Self = this.set("TargetGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupArn: Self = this.set("TargetGroupArn", js.undefined)
    @scala.inline
    def setWeight(value: TargetGroupWeight): Self = this.set("Weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("Weight", js.undefined)
  }
  
}

