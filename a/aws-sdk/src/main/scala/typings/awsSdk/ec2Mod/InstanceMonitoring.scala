package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceMonitoring extends js.Object {
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[typings.awsSdk.ec2Mod.Monitoring] = js.native
}

object InstanceMonitoring {
  @scala.inline
  def apply(): InstanceMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMonitoring]
  }
  @scala.inline
  implicit class InstanceMonitoringOps[Self <: InstanceMonitoring] (val x: Self) extends AnyVal {
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
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setMonitoring(value: Monitoring): Self = this.set("Monitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoring: Self = this.set("Monitoring", js.undefined)
  }
  
}

