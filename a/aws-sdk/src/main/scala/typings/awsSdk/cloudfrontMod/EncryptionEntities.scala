package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionEntities extends StObject {
  
  /**
    * An array of field patterns in a field-level encryption content type-profile mapping. 
    */
  var Items: js.UndefOr[EncryptionEntityList] = js.native
  
  /**
    * Number of field pattern items in a field-level encryption content type-profile mapping. 
    */
  var Quantity: integer = js.native
}
object EncryptionEntities {
  
  @scala.inline
  def apply(Quantity: integer): EncryptionEntities = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionEntities]
  }
  
  @scala.inline
  implicit class EncryptionEntitiesMutableBuilder[Self <: EncryptionEntities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: EncryptionEntityList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: EncryptionEntity*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
