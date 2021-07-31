package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTagsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource whose tags you want to delete.
    */
  var ResourceArn: typings.awsSdk.sagemakerMod.ResourceArn
  
  /**
    * An array or one or more tag keys to delete.
    */
  var TagKeys: TagKeyList
}
object DeleteTagsInput {
  
  @scala.inline
  def apply(ResourceArn: ResourceArn, TagKeys: TagKeyList): DeleteTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsInput]
  }
  
  @scala.inline
  implicit class DeleteTagsInputMutableBuilder[Self <: DeleteTagsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
