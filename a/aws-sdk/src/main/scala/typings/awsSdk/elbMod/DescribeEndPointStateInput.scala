package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndPointStateInput extends StObject {
  
  /**
    * The IDs of the instances.
    */
  var Instances: js.UndefOr[typings.awsSdk.elbMod.Instances] = js.undefined
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}
object DescribeEndPointStateInput {
  
  @scala.inline
  def apply(LoadBalancerName: AccessPointName): DescribeEndPointStateInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndPointStateInput]
  }
  
  @scala.inline
  implicit class DescribeEndPointStateInputMutableBuilder[Self <: DescribeEndPointStateInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
