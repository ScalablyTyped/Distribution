package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsInput extends StObject {
  
  /**
    * The name of the load balancer. You can specify one load balancer only.
    */
  var LoadBalancerNames: typings.awsSdk.elbMod.LoadBalancerNames
  
  /**
    * The tags.
    */
  var Tags: TagList
}
object AddTagsInput {
  
  @scala.inline
  def apply(LoadBalancerNames: LoadBalancerNames, Tags: TagList): AddTagsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerNames = LoadBalancerNames.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsInput]
  }
  
  @scala.inline
  implicit class AddTagsInputMutableBuilder[Self <: AddTagsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerNames(value: LoadBalancerNames): Self = StObject.set(x, "LoadBalancerNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerNamesVarargs(value: AccessPointName*): Self = StObject.set(x, "LoadBalancerNames", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
