package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateResourceGroupRequest extends js.Object {
  
  /**
    * A collection of keys and an array of possible values, '[{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values":["Value3"]}]'. For example,'[{"key":"Name","values":["TestEC2Instance"]}]'.
    */
  var resourceGroupTags: ResourceGroupTags = js.native
}
object CreateResourceGroupRequest {
  
  @scala.inline
  def apply(resourceGroupTags: ResourceGroupTags): CreateResourceGroupRequest = {
    val __obj = js.Dynamic.literal(resourceGroupTags = resourceGroupTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceGroupRequest]
  }
  
  @scala.inline
  implicit class CreateResourceGroupRequestOps[Self <: CreateResourceGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setResourceGroupTagsVarargs(value: ResourceGroupTag*): Self = this.set("resourceGroupTags", js.Array(value :_*))
    
    @scala.inline
    def setResourceGroupTags(value: ResourceGroupTags): Self = this.set("resourceGroupTags", value.asInstanceOf[js.Any])
  }
}
