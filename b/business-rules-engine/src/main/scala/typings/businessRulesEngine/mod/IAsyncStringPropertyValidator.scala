package typings.businessRulesEngine.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAsyncStringPropertyValidator extends IAsyncPropertyValidator {
  
  def isAcceptable(s: String): Promise[Boolean] = js.native
}
object IAsyncStringPropertyValidator {
  
  @scala.inline
  def apply(isAcceptable: String => Promise[Boolean], isAsync: Boolean): IAsyncStringPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable), isAsync = isAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncStringPropertyValidator]
  }
  
  @scala.inline
  implicit class IAsyncStringPropertyValidatorOps[Self <: IAsyncStringPropertyValidator] (val x: Self) extends AnyVal {
    
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
    def setIsAcceptable(value: String => Promise[Boolean]): Self = this.set("isAcceptable", js.Any.fromFunction1(value))
  }
}
