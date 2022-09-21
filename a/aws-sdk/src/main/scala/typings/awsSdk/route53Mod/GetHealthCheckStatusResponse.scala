package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHealthCheckStatusResponse extends StObject {
  
  /**
    * A list that contains one HealthCheckObservation element for each Amazon Route 53 health checker that is reporting a status about the health check endpoint.
    */
  var HealthCheckObservations: typings.awsSdk.route53Mod.HealthCheckObservations
}
object GetHealthCheckStatusResponse {
  
  inline def apply(HealthCheckObservations: HealthCheckObservations): GetHealthCheckStatusResponse = {
    val __obj = js.Dynamic.literal(HealthCheckObservations = HealthCheckObservations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckStatusResponse]
  }
  
  extension [Self <: GetHealthCheckStatusResponse](x: Self) {
    
    inline def setHealthCheckObservations(value: HealthCheckObservations): Self = StObject.set(x, "HealthCheckObservations", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckObservationsVarargs(value: HealthCheckObservation*): Self = StObject.set(x, "HealthCheckObservations", js.Array(value*))
  }
}
