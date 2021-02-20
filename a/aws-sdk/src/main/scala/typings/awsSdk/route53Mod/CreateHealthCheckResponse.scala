package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHealthCheckResponse extends StObject {
  
  /**
    * A complex type that contains identifying information about the health check.
    */
  var HealthCheck: typings.awsSdk.route53Mod.HealthCheck = js.native
  
  /**
    * The unique URL representing the new health check.
    */
  var Location: ResourceURI = js.native
}
object CreateHealthCheckResponse {
  
  @scala.inline
  def apply(HealthCheck: HealthCheck, Location: ResourceURI): CreateHealthCheckResponse = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHealthCheckResponse]
  }
  
  @scala.inline
  implicit class CreateHealthCheckResponseMutableBuilder[Self <: CreateHealthCheckResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheck(value: HealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: ResourceURI): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
  }
}
