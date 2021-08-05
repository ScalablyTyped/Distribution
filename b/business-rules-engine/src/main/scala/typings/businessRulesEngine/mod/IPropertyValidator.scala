package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValidator extends StObject {
  
  var customMessage: js.UndefOr[IErrorCustomMessage] = js.undefined
  
  def isAcceptable(s: js.Any): Boolean
  
  var tagName: js.UndefOr[String] = js.undefined
}
object IPropertyValidator {
  
  inline def apply(isAcceptable: js.Any => Boolean): IPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable))
    __obj.asInstanceOf[IPropertyValidator]
  }
  
  extension [Self <: IPropertyValidator](x: Self) {
    
    inline def setCustomMessage(value: (/* config */ js.Any, /* args */ js.Any) => String): Self = StObject.set(x, "customMessage", js.Any.fromFunction2(value))
    
    inline def setCustomMessageUndefined: Self = StObject.set(x, "customMessage", js.undefined)
    
    inline def setIsAcceptable(value: js.Any => Boolean): Self = StObject.set(x, "isAcceptable", js.Any.fromFunction1(value))
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
