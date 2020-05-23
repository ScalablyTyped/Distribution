package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.PipelineBareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineBareFunction_
  extends BaseNode
     with _Node {
  var callee: Expression
  @JSName("type")
  var type_PipelineBareFunction_ : PipelineBareFunction
}

object PipelineBareFunction_ {
  @scala.inline
  def apply(
    callee: Expression,
    `type`: PipelineBareFunction,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): PipelineBareFunction_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineBareFunction_]
  }
}

