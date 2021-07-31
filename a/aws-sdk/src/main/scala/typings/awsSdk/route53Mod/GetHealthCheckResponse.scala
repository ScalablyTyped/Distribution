package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHealthCheckResponse extends StObject {
  
  /**
    * A complex type that contains information about one health check that is associated with the current AWS account.
    */
  var HealthCheck: typings.awsSdk.route53Mod.HealthCheck
}
object GetHealthCheckResponse {
  
  @scala.inline
  def apply(HealthCheck: HealthCheck): GetHealthCheckResponse = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckResponse]
  }
  
  @scala.inline
  implicit class GetHealthCheckResponseMutableBuilder[Self <: GetHealthCheckResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheck(value: HealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
  }
}
