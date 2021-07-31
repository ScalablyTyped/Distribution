package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTypeProfiles extends StObject {
  
  /**
    * Items in a field-level encryption content type-profile mapping. 
    */
  var Items: js.UndefOr[ContentTypeProfileList] = js.undefined
  
  /**
    * The number of field-level encryption content type-profile mappings. 
    */
  var Quantity: integer
}
object ContentTypeProfiles {
  
  @scala.inline
  def apply(Quantity: integer): ContentTypeProfiles = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTypeProfiles]
  }
  
  @scala.inline
  implicit class ContentTypeProfilesMutableBuilder[Self <: ContentTypeProfiles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ContentTypeProfileList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ContentTypeProfile*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
