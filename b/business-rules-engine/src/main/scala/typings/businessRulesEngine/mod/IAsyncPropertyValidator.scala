package typings.businessRulesEngine.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAsyncPropertyValidator extends StObject {
  
  var customMessage: js.UndefOr[IErrorCustomMessage] = js.undefined
  
  def isAcceptable(s: Any): Promise[Boolean]
  
  var isAsync: Boolean
  
  var tagName: js.UndefOr[String] = js.undefined
}
object IAsyncPropertyValidator {
  
  inline def apply(isAcceptable: Any => Promise[Boolean], isAsync: Boolean): IAsyncPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable), isAsync = isAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncPropertyValidator]
  }
  
  extension [Self <: IAsyncPropertyValidator](x: Self) {
    
    inline def setCustomMessage(value: (/* config */ Any, /* args */ Any) => String): Self = StObject.set(x, "customMessage", js.Any.fromFunction2(value))
    
    inline def setCustomMessageUndefined: Self = StObject.set(x, "customMessage", js.undefined)
    
    inline def setIsAcceptable(value: Any => Promise[Boolean]): Self = StObject.set(x, "isAcceptable", js.Any.fromFunction1(value))
    
    inline def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
