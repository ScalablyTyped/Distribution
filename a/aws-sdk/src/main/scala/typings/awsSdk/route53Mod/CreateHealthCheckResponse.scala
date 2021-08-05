package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHealthCheckResponse extends StObject {
  
  /**
    * A complex type that contains identifying information about the health check.
    */
  var HealthCheck: typings.awsSdk.route53Mod.HealthCheck
  
  /**
    * The unique URL representing the new health check.
    */
  var Location: ResourceURI
}
object CreateHealthCheckResponse {
  
  inline def apply(HealthCheck: HealthCheck, Location: ResourceURI): CreateHealthCheckResponse = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHealthCheckResponse]
  }
  
  extension [Self <: CreateHealthCheckResponse](x: Self) {
    
    inline def setHealthCheck(value: HealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: ResourceURI): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
  }
}
