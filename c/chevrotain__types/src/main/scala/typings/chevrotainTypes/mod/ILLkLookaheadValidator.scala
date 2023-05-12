package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILLkLookaheadValidator extends StObject {
  
  def validateAmbiguousAlternationAlternatives(rules: js.Array[Rule], maxLookahead: Double): js.Array[ILookaheadValidationError]
  
  def validateEmptyOrAlternatives(rules: js.Array[Rule]): js.Array[ILookaheadValidationError]
  
  def validateNoLeftRecursion(rules: js.Array[Rule]): js.Array[ILookaheadValidationError]
  
  def validateSomeNonEmptyLookaheadPath(rules: js.Array[Rule], maxLookahead: Double): js.Array[ILookaheadValidationError]
}
object ILLkLookaheadValidator {
  
  inline def apply(
    validateAmbiguousAlternationAlternatives: (js.Array[Rule], Double) => js.Array[ILookaheadValidationError],
    validateEmptyOrAlternatives: js.Array[Rule] => js.Array[ILookaheadValidationError],
    validateNoLeftRecursion: js.Array[Rule] => js.Array[ILookaheadValidationError],
    validateSomeNonEmptyLookaheadPath: (js.Array[Rule], Double) => js.Array[ILookaheadValidationError]
  ): ILLkLookaheadValidator = {
    val __obj = js.Dynamic.literal(validateAmbiguousAlternationAlternatives = js.Any.fromFunction2(validateAmbiguousAlternationAlternatives), validateEmptyOrAlternatives = js.Any.fromFunction1(validateEmptyOrAlternatives), validateNoLeftRecursion = js.Any.fromFunction1(validateNoLeftRecursion), validateSomeNonEmptyLookaheadPath = js.Any.fromFunction2(validateSomeNonEmptyLookaheadPath))
    __obj.asInstanceOf[ILLkLookaheadValidator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILLkLookaheadValidator] (val x: Self) extends AnyVal {
    
    inline def setValidateAmbiguousAlternationAlternatives(value: (js.Array[Rule], Double) => js.Array[ILookaheadValidationError]): Self = StObject.set(x, "validateAmbiguousAlternationAlternatives", js.Any.fromFunction2(value))
    
    inline def setValidateEmptyOrAlternatives(value: js.Array[Rule] => js.Array[ILookaheadValidationError]): Self = StObject.set(x, "validateEmptyOrAlternatives", js.Any.fromFunction1(value))
    
    inline def setValidateNoLeftRecursion(value: js.Array[Rule] => js.Array[ILookaheadValidationError]): Self = StObject.set(x, "validateNoLeftRecursion", js.Any.fromFunction1(value))
    
    inline def setValidateSomeNonEmptyLookaheadPath(value: (js.Array[Rule], Double) => js.Array[ILookaheadValidationError]): Self = StObject.set(x, "validateSomeNonEmptyLookaheadPath", js.Any.fromFunction2(value))
  }
}
