package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHealthCheckRequest extends js.Object {
  
  /**
    * A unique string that identifies the request and that allows you to retry a failed CreateHealthCheck request without the risk of creating two identical health checks:   If you send a CreateHealthCheck request with the same CallerReference and settings as a previous request, and if the health check doesn't exist, Amazon Route 53 creates the health check. If the health check does exist, Route 53 returns the settings for the existing health check.   If you send a CreateHealthCheck request with the same CallerReference as a deleted health check, regardless of the settings, Route 53 returns a HealthCheckAlreadyExists error.   If you send a CreateHealthCheck request with the same CallerReference as an existing health check but with different settings, Route 53 returns a HealthCheckAlreadyExists error.   If you send a CreateHealthCheck request with a unique CallerReference but settings identical to an existing health check, Route 53 creates the health check.  
    */
  var CallerReference: HealthCheckNonce = js.native
  
  /**
    * A complex type that contains settings for a new health check.
    */
  var HealthCheckConfig: typings.awsSdk.route53Mod.HealthCheckConfig = js.native
}
object CreateHealthCheckRequest {
  
  @scala.inline
  def apply(CallerReference: HealthCheckNonce, HealthCheckConfig: HealthCheckConfig): CreateHealthCheckRequest = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], HealthCheckConfig = HealthCheckConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHealthCheckRequest]
  }
  
  @scala.inline
  implicit class CreateHealthCheckRequestOps[Self <: CreateHealthCheckRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallerReference(value: HealthCheckNonce): Self = this.set("CallerReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckConfig(value: HealthCheckConfig): Self = this.set("HealthCheckConfig", value.asInstanceOf[js.Any])
  }
}
