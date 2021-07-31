package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenMonitoring extends StObject {
  
  /**
    * 
    Prometheus settings.
    
    */
  var Prometheus: typings.awsSdk.kafkaMod.Prometheus
}
object OpenMonitoring {
  
  @scala.inline
  def apply(Prometheus: Prometheus): OpenMonitoring = {
    val __obj = js.Dynamic.literal(Prometheus = Prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMonitoring]
  }
  
  @scala.inline
  implicit class OpenMonitoringMutableBuilder[Self <: OpenMonitoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrometheus(value: Prometheus): Self = StObject.set(x, "Prometheus", value.asInstanceOf[js.Any])
  }
}
