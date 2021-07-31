package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldPatterns extends StObject {
  
  /**
    * An array of the field-level encryption field patterns.
    */
  var Items: js.UndefOr[FieldPatternList] = js.undefined
  
  /**
    * The number of field-level encryption field patterns.
    */
  var Quantity: integer
}
object FieldPatterns {
  
  @scala.inline
  def apply(Quantity: integer): FieldPatterns = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldPatterns]
  }
  
  @scala.inline
  implicit class FieldPatternsMutableBuilder[Self <: FieldPatterns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: FieldPatternList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
