package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveTagsInput extends StObject {
  
  /**
    * The name of the load balancer. You can specify a maximum of one load balancer name.
    */
  var LoadBalancerNames: typings.awsSdk.elbMod.LoadBalancerNames = js.native
  
  /**
    * The list of tag keys to remove.
    */
  var Tags: TagKeyList = js.native
}
object RemoveTagsInput {
  
  @scala.inline
  def apply(LoadBalancerNames: LoadBalancerNames, Tags: TagKeyList): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerNames = LoadBalancerNames.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsInput]
  }
  
  @scala.inline
  implicit class RemoveTagsInputMutableBuilder[Self <: RemoveTagsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerNames(value: LoadBalancerNames): Self = StObject.set(x, "LoadBalancerNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerNamesVarargs(value: AccessPointName*): Self = StObject.set(x, "LoadBalancerNames", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagKeyList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: TagKeyOnly*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
