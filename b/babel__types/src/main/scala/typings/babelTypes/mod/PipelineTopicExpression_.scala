package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.PipelineTopicExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineTopicExpression_
  extends BaseNode
     with _Node {
  
  var expression: Expression = js.native
  
  @JSName("type")
  var type_PipelineTopicExpression_ : PipelineTopicExpression = js.native
}
object PipelineTopicExpression_ {
  
  @scala.inline
  def apply(expression: Expression, `type`: PipelineTopicExpression): PipelineTopicExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineTopicExpression_]
  }
  
  @scala.inline
  implicit class PipelineTopicExpression_MutableBuilder[Self <: PipelineTopicExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PipelineTopicExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
