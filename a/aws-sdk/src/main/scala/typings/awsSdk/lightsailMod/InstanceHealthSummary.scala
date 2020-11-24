package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceHealthSummary extends js.Object {
  
  /**
    * Describes the overall instance health. Valid values are below.
    */
  var instanceHealth: js.UndefOr[InstanceHealthState] = js.native
  
  /**
    * More information about the instance health. If the instanceHealth is healthy, then an instanceHealthReason value is not provided. If  instanceHealth  is initial, the  instanceHealthReason  value can be one of the following:     Lb.RegistrationInProgress  - The target instance is in the process of being registered with the load balancer.     Lb.InitialHealthChecking  - The Lightsail load balancer is still sending the target instance the minimum number of health checks required to determine its health status.   If  instanceHealth  is unhealthy, the  instanceHealthReason  value can be one of the following:     Instance.ResponseCodeMismatch  - The health checks did not return an expected HTTP code.     Instance.Timeout  - The health check requests timed out.     Instance.FailedHealthChecks  - The health checks failed because the connection to the target instance timed out, the target instance response was malformed, or the target instance failed the health check for an unknown reason.     Lb.InternalError  - The health checks failed due to an internal error.   If  instanceHealth  is unused, the  instanceHealthReason  value can be one of the following:     Instance.NotRegistered  - The target instance is not registered with the target group.     Instance.NotInUse  - The target group is not used by any load balancer, or the target instance is in an Availability Zone that is not enabled for its load balancer.     Instance.IpUnusable  - The target IP address is reserved for use by a Lightsail load balancer.     Instance.InvalidState  - The target is in the stopped or terminated state.   If  instanceHealth  is draining, the  instanceHealthReason  value can be one of the following:     Instance.DeregistrationInProgress  - The target instance is in the process of being deregistered and the deregistration delay period has not expired.  
    */
  var instanceHealthReason: js.UndefOr[InstanceHealthReason] = js.native
  
  /**
    * The name of the Lightsail instance for which you are requesting health check data.
    */
  var instanceName: js.UndefOr[ResourceName] = js.native
}
object InstanceHealthSummary {
  
  @scala.inline
  def apply(): InstanceHealthSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceHealthSummary]
  }
  
  @scala.inline
  implicit class InstanceHealthSummaryOps[Self <: InstanceHealthSummary] (val x: Self) extends AnyVal {
    
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
    def setInstanceHealth(value: InstanceHealthState): Self = this.set("instanceHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceHealth: Self = this.set("instanceHealth", js.undefined)
    
    @scala.inline
    def setInstanceHealthReason(value: InstanceHealthReason): Self = this.set("instanceHealthReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceHealthReason: Self = this.set("instanceHealthReason", js.undefined)
    
    @scala.inline
    def setInstanceName(value: ResourceName): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceName: Self = this.set("instanceName", js.undefined)
  }
}
