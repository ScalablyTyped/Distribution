package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthCheckCustomConfig extends js.Object {
  
  /**
    *  This parameter has been deprecated and is always set to 1. AWS Cloud Map waits for approximately 30 seconds after receiving an UpdateInstanceCustomHealthStatus request before changing the status of the service instance.  The number of 30-second intervals that you want AWS Cloud Map to wait after receiving an UpdateInstanceCustomHealthStatus request before it changes the health status of a service instance. Sending a second or subsequent UpdateInstanceCustomHealthStatus request with the same value before 30 seconds has passed doesn't accelerate the change. AWS Cloud Map still waits 30 seconds after the first request to make the change.
    */
  var FailureThreshold: js.UndefOr[typings.awsSdk.servicediscoveryMod.FailureThreshold] = js.native
}
object HealthCheckCustomConfig {
  
  @scala.inline
  def apply(): HealthCheckCustomConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckCustomConfig]
  }
  
  @scala.inline
  implicit class HealthCheckCustomConfigOps[Self <: HealthCheckCustomConfig] (val x: Self) extends AnyVal {
    
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
    def setFailureThreshold(value: FailureThreshold): Self = this.set("FailureThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureThreshold: Self = this.set("FailureThreshold", js.undefined)
  }
}
