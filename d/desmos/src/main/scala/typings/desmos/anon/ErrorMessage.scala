package typings.desmos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorMessage extends StObject {
  
  /**
    * The (localized) error message, if any
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Numeric value(s)
    */
  var evaluation: js.UndefOr[Type | Value] = js.undefined
  
  /**
    * Is evaluation information displayed in the expressions list?
    */
  var evaluationDisplayed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Does the expression result in an evaluation error?
    */
  var isError: Boolean
  
  /**
    * Does the expression represent something that can be plotted?
    */
  var isGraphable: Boolean
}
object ErrorMessage {
  
  inline def apply(isError: Boolean, isGraphable: Boolean): ErrorMessage = {
    val __obj = js.Dynamic.literal(isError = isError.asInstanceOf[js.Any], isGraphable = isGraphable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorMessage] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setEvaluation(value: Type | Value): Self = StObject.set(x, "evaluation", value.asInstanceOf[js.Any])
    
    inline def setEvaluationDisplayed(value: Boolean): Self = StObject.set(x, "evaluationDisplayed", value.asInstanceOf[js.Any])
    
    inline def setEvaluationDisplayedUndefined: Self = StObject.set(x, "evaluationDisplayed", js.undefined)
    
    inline def setEvaluationUndefined: Self = StObject.set(x, "evaluation", js.undefined)
    
    inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
    
    inline def setIsGraphable(value: Boolean): Self = StObject.set(x, "isGraphable", value.asInstanceOf[js.Any])
  }
}
