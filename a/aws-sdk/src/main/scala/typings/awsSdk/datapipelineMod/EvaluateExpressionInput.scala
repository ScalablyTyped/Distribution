package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateExpressionInput extends StObject {
  
  /**
    * The expression to evaluate.
    */
  var expression: longString
  
  /**
    * The ID of the object.
    */
  var objectId: id
  
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
}
object EvaluateExpressionInput {
  
  @scala.inline
  def apply(expression: longString, objectId: id, pipelineId: id): EvaluateExpressionInput = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateExpressionInput]
  }
  
  @scala.inline
  implicit class EvaluateExpressionInputMutableBuilder[Self <: EvaluateExpressionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: longString): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectId(value: id): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
  }
}
