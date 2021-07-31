package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureHealthCheckInput extends StObject {
  
  /**
    * The configuration information.
    */
  var HealthCheck: typings.awsSdk.elbMod.HealthCheck
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}
object ConfigureHealthCheckInput {
  
  @scala.inline
  def apply(HealthCheck: HealthCheck, LoadBalancerName: AccessPointName): ConfigureHealthCheckInput = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureHealthCheckInput]
  }
  
  @scala.inline
  implicit class ConfigureHealthCheckInputMutableBuilder[Self <: ConfigureHealthCheckInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheck(value: HealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
