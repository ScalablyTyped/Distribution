package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HealthCheck extends js.Object {
  /**
    * The number of consecutive health checks successes required before moving the instance to the Healthy state.
    */
  var HealthyThreshold: typings.awsSdk.elbMod.HealthyThreshold = js.native
  /**
    * The approximate interval, in seconds, between health checks of an individual instance.
    */
  var Interval: HealthCheckInterval = js.native
  /**
    * The instance being checked. The protocol is either TCP, HTTP, HTTPS, or SSL. The range of valid ports is one (1) through 65535. TCP is the default, specified as a TCP: port pair, for example "TCP:5000". In this case, a health check simply attempts to open a TCP connection to the instance on the specified port. Failure to connect within the configured timeout is considered unhealthy. SSL is also specified as SSL: port pair, for example, SSL:5000. For HTTP/HTTPS, you must include a ping path in the string. HTTP is specified as a HTTP:port;/;PathToPing; grouping, for example "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is issued to the instance on the given port and path. Any answer other than "200 OK" within the timeout period is considered unhealthy. The total length of the HTTP ping target must be 1024 16-bit Unicode characters or less.
    */
  var Target: HealthCheckTarget = js.native
  /**
    * The amount of time, in seconds, during which no response means a failed health check. This value must be less than the Interval value.
    */
  var Timeout: HealthCheckTimeout = js.native
  /**
    * The number of consecutive health check failures required before moving the instance to the Unhealthy state.
    */
  var UnhealthyThreshold: typings.awsSdk.elbMod.UnhealthyThreshold = js.native
}

object HealthCheck {
  @scala.inline
  def apply(
    HealthyThreshold: HealthyThreshold,
    Interval: HealthCheckInterval,
    Target: HealthCheckTarget,
    Timeout: HealthCheckTimeout,
    UnhealthyThreshold: UnhealthyThreshold
  ): HealthCheck = {
    val __obj = js.Dynamic.literal(HealthyThreshold = HealthyThreshold.asInstanceOf[js.Any], Interval = Interval.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any], UnhealthyThreshold = UnhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheck]
  }
  @scala.inline
  implicit class HealthCheckOps[Self <: HealthCheck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHealthyThreshold(value: HealthyThreshold): Self = this.set("HealthyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: HealthCheckInterval): Self = this.set("Interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: HealthCheckTarget): Self = this.set("Target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: HealthCheckTimeout): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnhealthyThreshold(value: UnhealthyThreshold): Self = this.set("UnhealthyThreshold", value.asInstanceOf[js.Any])
  }
  
}

