package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveTagsInput extends js.Object {
  
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
  implicit class RemoveTagsInputOps[Self <: RemoveTagsInput] (val x: Self) extends AnyVal {
    
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
    def setLoadBalancerNamesVarargs(value: AccessPointName*): Self = this.set("LoadBalancerNames", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerNames(value: LoadBalancerNames): Self = this.set("LoadBalancerNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: TagKeyOnly*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagKeyList): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
}
