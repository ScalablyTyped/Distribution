package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLabelRequest extends StObject {
  
  /**
    * The label description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.undefined
  
  /**
    * The label name.
    */
  var name: identifier
  
  /**
    * 
    */
  var tags: js.UndefOr[tagList] = js.undefined
}
object PutLabelRequest {
  
  @scala.inline
  def apply(name: identifier): PutLabelRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLabelRequest]
  }
  
  @scala.inline
  implicit class PutLabelRequestMutableBuilder[Self <: PutLabelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
