package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.PipelineTopicExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineTopicExpression_
  extends StObject
     with BaseNode
     with _Node {
  
  var expression: Expression
  
  @JSName("type")
  var type_PipelineTopicExpression_ : PipelineTopicExpression
}
object PipelineTopicExpression_ {
  
  inline def apply(expression: Expression): PipelineTopicExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("PipelineTopicExpression")
    __obj.asInstanceOf[PipelineTopicExpression_]
  }
  
  extension [Self <: PipelineTopicExpression_](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: PipelineTopicExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
