package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHealthCheckRequest extends StObject {
  
  /**
    * A unique string that identifies the request and that allows you to retry a failed CreateHealthCheck request without the risk of creating two identical health checks:   If you send a CreateHealthCheck request with the same CallerReference and settings as a previous request, and if the health check doesn't exist, Amazon Route 53 creates the health check. If the health check does exist, Route 53 returns the settings for the existing health check.   If you send a CreateHealthCheck request with the same CallerReference as a deleted health check, regardless of the settings, Route 53 returns a HealthCheckAlreadyExists error.   If you send a CreateHealthCheck request with the same CallerReference as an existing health check but with different settings, Route 53 returns a HealthCheckAlreadyExists error.   If you send a CreateHealthCheck request with a unique CallerReference but settings identical to an existing health check, Route 53 creates the health check.  
    */
  var CallerReference: HealthCheckNonce
  
  /**
    * A complex type that contains settings for a new health check.
    */
  var HealthCheckConfig: typings.awsSdk.route53Mod.HealthCheckConfig
}
object CreateHealthCheckRequest {
  
  @scala.inline
  def apply(CallerReference: HealthCheckNonce, HealthCheckConfig: HealthCheckConfig): CreateHealthCheckRequest = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], HealthCheckConfig = HealthCheckConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHealthCheckRequest]
  }
  
  @scala.inline
  implicit class CreateHealthCheckRequestMutableBuilder[Self <: CreateHealthCheckRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallerReference(value: HealthCheckNonce): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckConfig(value: HealthCheckConfig): Self = StObject.set(x, "HealthCheckConfig", value.asInstanceOf[js.Any])
  }
}
