package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerServiceHealthCheckConfig extends StObject {
  
  /**
    * The number of consecutive health checks successes required before moving the container to the Healthy state.
    */
  var healthyThreshold: js.UndefOr[integer] = js.undefined
  
  /**
    * The approximate interval, in seconds, between health checks of an individual container. You may specify between 5 and 300 seconds.
    */
  var intervalSeconds: js.UndefOr[integer] = js.undefined
  
  /**
    * The path on the container on which to perform the health check.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP codes to use when checking for a successful response from a container. You can specify values between 200 and 499.
    */
  var successCodes: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of time, in seconds, during which no response means a failed health check. You may specify between 2 and 60 seconds.
    */
  var timeoutSeconds: js.UndefOr[integer] = js.undefined
  
  /**
    * The number of consecutive health check failures required before moving the container to the Unhealthy state.
    */
  var unhealthyThreshold: js.UndefOr[integer] = js.undefined
}
object ContainerServiceHealthCheckConfig {
  
  @scala.inline
  def apply(): ContainerServiceHealthCheckConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceHealthCheckConfig]
  }
  
  @scala.inline
  implicit class ContainerServiceHealthCheckConfigMutableBuilder[Self <: ContainerServiceHealthCheckConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthyThreshold(value: integer): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthyThresholdUndefined: Self = StObject.set(x, "healthyThreshold", js.undefined)
    
    @scala.inline
    def setIntervalSeconds(value: integer): Self = StObject.set(x, "intervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalSecondsUndefined: Self = StObject.set(x, "intervalSeconds", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSuccessCodes(value: String): Self = StObject.set(x, "successCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessCodesUndefined: Self = StObject.set(x, "successCodes", js.undefined)
    
    @scala.inline
    def setTimeoutSeconds(value: integer): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
    
    @scala.inline
    def setUnhealthyThreshold(value: integer): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThresholdUndefined: Self = StObject.set(x, "unhealthyThreshold", js.undefined)
  }
}
