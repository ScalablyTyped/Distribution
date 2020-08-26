package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemStatus extends js.Object {
  /**
    * CPU utilization metrics for the instance.
    */
  var CPUUtilization: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.CPUUtilization] = js.native
  /**
    * Load average in the last 1-minute, 5-minute, and 15-minute periods. For more information, see Operating System Metrics.
    */
  var LoadAverage: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.LoadAverage] = js.native
}

object SystemStatus {
  @scala.inline
  def apply(): SystemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemStatus]
  }
  @scala.inline
  implicit class SystemStatusOps[Self <: SystemStatus] (val x: Self) extends AnyVal {
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
    def setCPUUtilization(value: CPUUtilization): Self = this.set("CPUUtilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCPUUtilization: Self = this.set("CPUUtilization", js.undefined)
    @scala.inline
    def setLoadAverageVarargs(value: LoadAverageValue*): Self = this.set("LoadAverage", js.Array(value :_*))
    @scala.inline
    def setLoadAverage(value: LoadAverage): Self = this.set("LoadAverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadAverage: Self = this.set("LoadAverage", js.undefined)
  }
  
}

