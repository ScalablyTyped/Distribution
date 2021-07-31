package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsInput extends StObject {
  
  /**
    * The Amazon EMR resource identifier from which tags will be removed. This value must be a cluster identifier.
    */
  var ResourceId: typings.awsSdk.emrMod.ResourceId
  
  /**
    * A list of tag keys to remove from a resource.
    */
  var TagKeys: StringList
}
object RemoveTagsInput {
  
  @scala.inline
  def apply(ResourceId: ResourceId, TagKeys: StringList): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsInput]
  }
  
  @scala.inline
  implicit class RemoveTagsInputMutableBuilder[Self <: RemoveTagsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: StringList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
