package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroupStickinessConfig extends js.Object {
  /**
    * The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
    */
  var DurationSeconds: js.UndefOr[TargetGroupStickinessDurationSeconds] = js.native
  /**
    * Indicates whether target group stickiness is enabled.
    */
  var Enabled: js.UndefOr[TargetGroupStickinessEnabled] = js.native
}

object TargetGroupStickinessConfig {
  @scala.inline
  def apply(): TargetGroupStickinessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupStickinessConfig]
  }
  @scala.inline
  implicit class TargetGroupStickinessConfigOps[Self <: TargetGroupStickinessConfig] (val x: Self) extends AnyVal {
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
    def setDurationSeconds(value: TargetGroupStickinessDurationSeconds): Self = this.set("DurationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationSeconds: Self = this.set("DurationSeconds", js.undefined)
    @scala.inline
    def setEnabled(value: TargetGroupStickinessEnabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
  }
  
}

