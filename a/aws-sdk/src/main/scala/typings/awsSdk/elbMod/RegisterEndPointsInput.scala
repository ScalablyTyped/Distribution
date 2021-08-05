package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterEndPointsInput extends StObject {
  
  /**
    * The IDs of the instances.
    */
  var Instances: typings.awsSdk.elbMod.Instances
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}
object RegisterEndPointsInput {
  
  inline def apply(Instances: Instances, LoadBalancerName: AccessPointName): RegisterEndPointsInput = {
    val __obj = js.Dynamic.literal(Instances = Instances.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterEndPointsInput]
  }
  
  extension [Self <: RegisterEndPointsInput](x: Self) {
    
    inline def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value :_*))
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
