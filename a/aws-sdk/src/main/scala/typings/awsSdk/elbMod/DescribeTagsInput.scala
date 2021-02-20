package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTagsInput extends StObject {
  
  /**
    * The names of the load balancers.
    */
  var LoadBalancerNames: LoadBalancerNamesMax20 = js.native
}
object DescribeTagsInput {
  
  @scala.inline
  def apply(LoadBalancerNames: LoadBalancerNamesMax20): DescribeTagsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerNames = LoadBalancerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsInput]
  }
  
  @scala.inline
  implicit class DescribeTagsInputMutableBuilder[Self <: DescribeTagsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerNames(value: LoadBalancerNamesMax20): Self = StObject.set(x, "LoadBalancerNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerNamesVarargs(value: AccessPointName*): Self = StObject.set(x, "LoadBalancerNames", js.Array(value :_*))
  }
}
