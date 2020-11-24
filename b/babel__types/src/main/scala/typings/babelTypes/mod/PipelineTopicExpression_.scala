package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.PipelineTopicExpression
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
  implicit class PipelineTopicExpression_Ops[Self <: PipelineTopicExpression_] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PipelineTopicExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
