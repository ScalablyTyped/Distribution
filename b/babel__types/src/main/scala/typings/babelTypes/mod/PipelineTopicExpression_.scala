package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.PipelineTopicExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineTopicExpression_
  extends BaseNode
     with _Node {
  var expression: Expression
  @JSName("type")
  var type_PipelineTopicExpression_ : PipelineTopicExpression
}

object PipelineTopicExpression_ {
  @scala.inline
  def apply(
    expression: Expression,
    `type`: PipelineTopicExpression,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): PipelineTopicExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineTopicExpression_]
  }
}

