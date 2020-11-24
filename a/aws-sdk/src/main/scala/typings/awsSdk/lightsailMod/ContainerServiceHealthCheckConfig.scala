package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerServiceHealthCheckConfig extends js.Object {
  
  /**
    * The number of consecutive health checks successes required before moving the container to the Healthy state.
    */
  var healthyThreshold: js.UndefOr[integer] = js.native
  
  /**
    * The approximate interval, in seconds, between health checks of an individual container. You may specify between 5 and 300 seconds.
    */
  var intervalSeconds: js.UndefOr[integer] = js.native
  
  /**
    * The path on the container on which to perform the health check.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The HTTP codes to use when checking for a successful response from a container. You can specify values between 200 and 499.
    */
  var successCodes: js.UndefOr[String] = js.native
  
  /**
    * The amount of time, in seconds, during which no response means a failed health check. You may specify between 2 and 60 seconds.
    */
  var timeoutSeconds: js.UndefOr[integer] = js.native
  
  /**
    * The number of consecutive health check failures required before moving the container to the Unhealthy state.
    */
  var unhealthyThreshold: js.UndefOr[integer] = js.native
}
object ContainerServiceHealthCheckConfig {
  
  @scala.inline
  def apply(): ContainerServiceHealthCheckConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceHealthCheckConfig]
  }
  
  @scala.inline
  implicit class ContainerServiceHealthCheckConfigOps[Self <: ContainerServiceHealthCheckConfig] (val x: Self) extends AnyVal {
    
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
    def setHealthyThreshold(value: integer): Self = this.set("healthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthyThreshold: Self = this.set("healthyThreshold", js.undefined)
    
    @scala.inline
    def setIntervalSeconds(value: integer): Self = this.set("intervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntervalSeconds: Self = this.set("intervalSeconds", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSuccessCodes(value: String): Self = this.set("successCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessCodes: Self = this.set("successCodes", js.undefined)
    
    @scala.inline
    def setTimeoutSeconds(value: integer): Self = this.set("timeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutSeconds: Self = this.set("timeoutSeconds", js.undefined)
    
    @scala.inline
    def setUnhealthyThreshold(value: integer): Self = this.set("unhealthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnhealthyThreshold: Self = this.set("unhealthyThreshold", js.undefined)
  }
}
