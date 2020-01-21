package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenMonitoringInfo extends js.Object {
  /**
    * 
    Prometheus settings.
    
    */
  var Prometheus: PrometheusInfo = js.native
}

object OpenMonitoringInfo {
  @scala.inline
  def apply(Prometheus: PrometheusInfo): OpenMonitoringInfo = {
    val __obj = js.Dynamic.literal(Prometheus = Prometheus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenMonitoringInfo]
  }
}

