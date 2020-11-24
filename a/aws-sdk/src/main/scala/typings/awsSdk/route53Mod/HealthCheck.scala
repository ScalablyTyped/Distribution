package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthCheck extends js.Object {
  
  /**
    * A unique string that you specified when you created the health check.
    */
  var CallerReference: HealthCheckNonce = js.native
  
  /**
    * A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for this health check.
    */
  var CloudWatchAlarmConfiguration: js.UndefOr[typings.awsSdk.route53Mod.CloudWatchAlarmConfiguration] = js.native
  
  /**
    * A complex type that contains detailed information about one health check.
    */
  var HealthCheckConfig: typings.awsSdk.route53Mod.HealthCheckConfig = js.native
  
  /**
    * The version of the health check. You can optionally pass this value in a call to UpdateHealthCheck to prevent overwriting another change to the health check.
    */
  var HealthCheckVersion: typings.awsSdk.route53Mod.HealthCheckVersion = js.native
  
  /**
    * The identifier that Amazon Route 53assigned to the health check when you created it. When you add or update a resource record set, you use this value to specify which health check to use. The value can be up to 64 characters long. 
    */
  var Id: HealthCheckId = js.native
  
  /**
    * If the health check was created by another service, the service that created the health check. When a health check is created by another service, you can't edit or delete it using Amazon Route 53. 
    */
  var LinkedService: js.UndefOr[typings.awsSdk.route53Mod.LinkedService] = js.native
}
object HealthCheck {
  
  @scala.inline
  def apply(
    CallerReference: HealthCheckNonce,
    HealthCheckConfig: HealthCheckConfig,
    HealthCheckVersion: HealthCheckVersion,
    Id: HealthCheckId
  ): HealthCheck = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], HealthCheckConfig = HealthCheckConfig.asInstanceOf[js.Any], HealthCheckVersion = HealthCheckVersion.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheck]
  }
  
  @scala.inline
  implicit class HealthCheckOps[Self <: HealthCheck] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setHealthCheckVersion(value: HealthCheckVersion): Self = this.set("HealthCheckVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: HealthCheckId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchAlarmConfiguration(value: CloudWatchAlarmConfiguration): Self = this.set("CloudWatchAlarmConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchAlarmConfiguration: Self = this.set("CloudWatchAlarmConfiguration", js.undefined)
    
    @scala.inline
    def setLinkedService(value: LinkedService): Self = this.set("LinkedService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedService: Self = this.set("LinkedService", js.undefined)
  }
}
