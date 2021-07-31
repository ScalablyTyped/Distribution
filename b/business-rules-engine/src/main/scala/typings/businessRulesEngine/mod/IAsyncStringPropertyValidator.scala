package typings.businessRulesEngine.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAsyncStringPropertyValidator
  extends StObject
     with IAsyncPropertyValidator {
  
  def isAcceptable(s: String): Promise[Boolean]
}
object IAsyncStringPropertyValidator {
  
  @scala.inline
  def apply(isAcceptable: String => Promise[Boolean], isAsync: Boolean): IAsyncStringPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable), isAsync = isAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncStringPropertyValidator]
  }
  
  @scala.inline
  implicit class IAsyncStringPropertyValidatorMutableBuilder[Self <: IAsyncStringPropertyValidator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAcceptable(value: String => Promise[Boolean]): Self = StObject.set(x, "isAcceptable", js.Any.fromFunction1(value))
  }
}
