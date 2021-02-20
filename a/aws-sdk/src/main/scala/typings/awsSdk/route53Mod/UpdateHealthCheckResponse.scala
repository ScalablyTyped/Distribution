package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateHealthCheckResponse extends StObject {
  
  /**
    * A complex type that contains the response to an UpdateHealthCheck request.
    */
  var HealthCheck: typings.awsSdk.route53Mod.HealthCheck = js.native
}
object UpdateHealthCheckResponse {
  
  @scala.inline
  def apply(HealthCheck: HealthCheck): UpdateHealthCheckResponse = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHealthCheckResponse]
  }
  
  @scala.inline
  implicit class UpdateHealthCheckResponseMutableBuilder[Self <: UpdateHealthCheckResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheck(value: HealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
  }
}
