package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStringValidator extends IPropertyValidator {
  
  def isAcceptable(s: String): Boolean = js.native
}
object IStringValidator {
  
  @scala.inline
  def apply(isAcceptable: String => Boolean): IStringValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable))
    __obj.asInstanceOf[IStringValidator]
  }
  
  @scala.inline
  implicit class IStringValidatorMutableBuilder[Self <: IStringValidator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAcceptable(value: String => Boolean): Self = StObject.set(x, "isAcceptable", js.Any.fromFunction1(value))
  }
}
