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
  def apply(CPUUtilization: CPUUtilization = null, LoadAverage: LoadAverage = null): SystemStatus = {
    val __obj = js.Dynamic.literal()
    if (CPUUtilization != null) __obj.updateDynamic("CPUUtilization")(CPUUtilization.asInstanceOf[js.Any])
    if (LoadAverage != null) __obj.updateDynamic("LoadAverage")(LoadAverage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemStatus]
  }
}

