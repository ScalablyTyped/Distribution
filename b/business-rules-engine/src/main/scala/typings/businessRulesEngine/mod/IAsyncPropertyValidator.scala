package typings.businessRulesEngine.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAsyncPropertyValidator extends StObject {
  
  var customMessage: js.UndefOr[IErrorCustomMessage] = js.undefined
  
  def isAcceptable(s: js.Any): Promise[Boolean]
  
  var isAsync: Boolean
  
  var tagName: js.UndefOr[String] = js.undefined
}
object IAsyncPropertyValidator {
  
  @scala.inline
  def apply(isAcceptable: js.Any => Promise[Boolean], isAsync: Boolean): IAsyncPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable), isAsync = isAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncPropertyValidator]
  }
  
  @scala.inline
  implicit class IAsyncPropertyValidatorMutableBuilder[Self <: IAsyncPropertyValidator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomMessage(value: (/* config */ js.Any, /* args */ js.Any) => String): Self = StObject.set(x, "customMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCustomMessageUndefined: Self = StObject.set(x, "customMessage", js.undefined)
    
    @scala.inline
    def setIsAcceptable(value: js.Any => Promise[Boolean]): Self = StObject.set(x, "isAcceptable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
