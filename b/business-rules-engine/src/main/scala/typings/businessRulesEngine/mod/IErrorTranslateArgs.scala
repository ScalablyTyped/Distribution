package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IErrorTranslateArgs extends StObject {
  
  var CustomMessage: js.UndefOr[IErrorCustomMessage] = js.undefined
  
  var MessageArgs: js.Any
  
  var TranslateId: String
}
object IErrorTranslateArgs {
  
  inline def apply(MessageArgs: js.Any, TranslateId: String): IErrorTranslateArgs = {
    val __obj = js.Dynamic.literal(MessageArgs = MessageArgs.asInstanceOf[js.Any], TranslateId = TranslateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorTranslateArgs]
  }
  
  extension [Self <: IErrorTranslateArgs](x: Self) {
    
    inline def setCustomMessage(value: (/* config */ js.Any, /* args */ js.Any) => String): Self = StObject.set(x, "CustomMessage", js.Any.fromFunction2(value))
    
    inline def setCustomMessageUndefined: Self = StObject.set(x, "CustomMessage", js.undefined)
    
    inline def setMessageArgs(value: js.Any): Self = StObject.set(x, "MessageArgs", value.asInstanceOf[js.Any])
    
    inline def setTranslateId(value: String): Self = StObject.set(x, "TranslateId", value.asInstanceOf[js.Any])
  }
}
