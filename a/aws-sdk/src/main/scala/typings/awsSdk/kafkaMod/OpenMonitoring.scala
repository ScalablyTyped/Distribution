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
  
  inline def apply(Prometheus: Prometheus): OpenMonitoring = {
    val __obj = js.Dynamic.literal(Prometheus = Prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMonitoring]
  }
  
  extension [Self <: OpenMonitoring](x: Self) {
    
    inline def setPrometheus(value: Prometheus): Self = StObject.set(x, "Prometheus", value.asInstanceOf[js.Any])
  }
}
