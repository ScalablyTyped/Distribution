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
  
  inline def apply(Quantity: integer): ContentTypeProfiles = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTypeProfiles]
  }
  
  extension [Self <: ContentTypeProfiles](x: Self) {
    
    inline def setItems(value: ContentTypeProfileList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ContentTypeProfile*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
