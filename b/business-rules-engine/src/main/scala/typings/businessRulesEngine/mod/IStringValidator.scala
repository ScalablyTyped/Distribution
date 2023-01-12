package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStringValidator
  extends StObject
     with IPropertyValidator {
  
  def isAcceptable(s: String): Boolean
}
object IStringValidator {
  
  inline def apply(isAcceptable: String => Boolean): IStringValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable))
    __obj.asInstanceOf[IStringValidator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IStringValidator] (val x: Self) extends AnyVal {
    
    inline def setIsAcceptable(value: String => Boolean): Self = StObject.set(x, "isAcceptable", js.Any.fromFunction1(value))
  }
}
