package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateExpressionOutput extends StObject {
  
  /**
    * The evaluated expression.
    */
  var evaluatedExpression: longString
}
object EvaluateExpressionOutput {
  
  @scala.inline
  def apply(evaluatedExpression: longString): EvaluateExpressionOutput = {
    val __obj = js.Dynamic.literal(evaluatedExpression = evaluatedExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateExpressionOutput]
  }
  
  @scala.inline
  implicit class EvaluateExpressionOutputMutableBuilder[Self <: EvaluateExpressionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluatedExpression(value: longString): Self = StObject.set(x, "evaluatedExpression", value.asInstanceOf[js.Any])
  }
}
