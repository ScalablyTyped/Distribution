package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArns: typings.awsSdk.elbv2Mod.ResourceArns
  
  /**
    * The tags.
    */
  var Tags: TagList
}
object AddTagsInput {
  
  @scala.inline
  def apply(ResourceArns: ResourceArns, Tags: TagList): AddTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsInput]
  }
  
  @scala.inline
  implicit class AddTagsInputMutableBuilder[Self <: AddTagsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArns(value: ResourceArns): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
