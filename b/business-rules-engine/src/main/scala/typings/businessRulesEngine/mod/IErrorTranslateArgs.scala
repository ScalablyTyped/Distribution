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
  
  @scala.inline
  def apply(MessageArgs: js.Any, TranslateId: String): IErrorTranslateArgs = {
    val __obj = js.Dynamic.literal(MessageArgs = MessageArgs.asInstanceOf[js.Any], TranslateId = TranslateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorTranslateArgs]
  }
  
  @scala.inline
  implicit class IErrorTranslateArgsMutableBuilder[Self <: IErrorTranslateArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomMessage(value: (/* config */ js.Any, /* args */ js.Any) => String): Self = StObject.set(x, "CustomMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCustomMessageUndefined: Self = StObject.set(x, "CustomMessage", js.undefined)
    
    @scala.inline
    def setMessageArgs(value: js.Any): Self = StObject.set(x, "MessageArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateId(value: String): Self = StObject.set(x, "TranslateId", value.asInstanceOf[js.Any])
  }
}
