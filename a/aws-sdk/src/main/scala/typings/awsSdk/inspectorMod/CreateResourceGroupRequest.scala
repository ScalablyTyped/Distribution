package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateResourceGroupRequest extends StObject {
  
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
  implicit class CreateResourceGroupRequestMutableBuilder[Self <: CreateResourceGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceGroupTags(value: ResourceGroupTags): Self = StObject.set(x, "resourceGroupTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupTagsVarargs(value: ResourceGroupTag*): Self = StObject.set(x, "resourceGroupTags", js.Array(value :_*))
  }
}
