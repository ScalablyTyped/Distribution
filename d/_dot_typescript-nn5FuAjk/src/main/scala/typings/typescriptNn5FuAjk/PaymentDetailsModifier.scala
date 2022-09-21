package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetailsModifier extends StObject {
  
  var additionalDisplayItems: js.UndefOr[Array[PaymentItem]] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var supportedMethods: java.lang.String
  
  var total: js.UndefOr[PaymentItem] = js.undefined
}
object PaymentDetailsModifier {
  
  inline def apply(supportedMethods: java.lang.String): PaymentDetailsModifier = {
    val __obj = js.Dynamic.literal(supportedMethods = supportedMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetailsModifier]
  }
  
  extension [Self <: PaymentDetailsModifier](x: Self) {
    
    inline def setAdditionalDisplayItems(value: Array[PaymentItem]): Self = StObject.set(x, "additionalDisplayItems", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDisplayItemsUndefined: Self = StObject.set(x, "additionalDisplayItems", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setSupportedMethods(value: java.lang.String): Self = StObject.set(x, "supportedMethods", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: PaymentItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
