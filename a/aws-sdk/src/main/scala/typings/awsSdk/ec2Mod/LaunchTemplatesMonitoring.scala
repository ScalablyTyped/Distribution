package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplatesMonitoring extends js.Object {
  /**
    * Indicates whether detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object LaunchTemplatesMonitoring {
  @scala.inline
  def apply(): LaunchTemplatesMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplatesMonitoring]
  }
  @scala.inline
  implicit class LaunchTemplatesMonitoringOps[Self <: LaunchTemplatesMonitoring] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
  }
  
}

