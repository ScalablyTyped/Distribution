package typings.businessRulesEngine.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAsyncPropertyValidator extends js.Object {
  
  var customMessage: js.UndefOr[IErrorCustomMessage] = js.native
  
  def isAcceptable(s: js.Any): Promise[Boolean] = js.native
  
  var isAsync: Boolean = js.native
  
  var tagName: js.UndefOr[String] = js.native
}
object IAsyncPropertyValidator {
  
  @scala.inline
  def apply(isAcceptable: js.Any => Promise[Boolean], isAsync: Boolean): IAsyncPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable), isAsync = isAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncPropertyValidator]
  }
  
  @scala.inline
  implicit class IAsyncPropertyValidatorOps[Self <: IAsyncPropertyValidator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsAcceptable(value: js.Any => Promise[Boolean]): Self = this.set("isAcceptable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAsync(value: Boolean): Self = this.set("isAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMessage(value: (/* config */ js.Any, /* args */ js.Any) => String): Self = this.set("customMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCustomMessage: Self = this.set("customMessage", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
}
