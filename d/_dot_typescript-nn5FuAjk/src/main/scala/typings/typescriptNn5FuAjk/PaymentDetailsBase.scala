package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetailsBase extends StObject {
  
  var displayItems: js.UndefOr[Array[PaymentItem]] = js.undefined
  
  var modifiers: js.UndefOr[Array[PaymentDetailsModifier]] = js.undefined
}
object PaymentDetailsBase {
  
  inline def apply(): PaymentDetailsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDetailsBase]
  }
  
  extension [Self <: PaymentDetailsBase](x: Self) {
    
    inline def setDisplayItems(value: Array[PaymentItem]): Self = StObject.set(x, "displayItems", value.asInstanceOf[js.Any])
    
    inline def setDisplayItemsUndefined: Self = StObject.set(x, "displayItems", js.undefined)
    
    inline def setModifiers(value: Array[PaymentDetailsModifier]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
  }
}
