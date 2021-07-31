package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenMonitoringInfo extends StObject {
  
  /**
    * 
    Prometheus settings.
    
    */
  var Prometheus: PrometheusInfo
}
object OpenMonitoringInfo {
  
  @scala.inline
  def apply(Prometheus: PrometheusInfo): OpenMonitoringInfo = {
    val __obj = js.Dynamic.literal(Prometheus = Prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMonitoringInfo]
  }
  
  @scala.inline
  implicit class OpenMonitoringInfoMutableBuilder[Self <: OpenMonitoringInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrometheus(value: PrometheusInfo): Self = StObject.set(x, "Prometheus", value.asInstanceOf[js.Any])
  }
}
