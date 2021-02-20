package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeElasticLoadBalancersResult extends StObject {
  
  /**
    * A list of ElasticLoadBalancer objects that describe the specified Elastic Load Balancing instances.
    */
  var ElasticLoadBalancers: js.UndefOr[typings.awsSdk.opsworksMod.ElasticLoadBalancers] = js.native
}
object DescribeElasticLoadBalancersResult {
  
  @scala.inline
  def apply(): DescribeElasticLoadBalancersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticLoadBalancersResult]
  }
  
  @scala.inline
  implicit class DescribeElasticLoadBalancersResultMutableBuilder[Self <: DescribeElasticLoadBalancersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticLoadBalancers(value: ElasticLoadBalancers): Self = StObject.set(x, "ElasticLoadBalancers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticLoadBalancersUndefined: Self = StObject.set(x, "ElasticLoadBalancers", js.undefined)
    
    @scala.inline
    def setElasticLoadBalancersVarargs(value: ElasticLoadBalancer*): Self = StObject.set(x, "ElasticLoadBalancers", js.Array(value :_*))
  }
}
