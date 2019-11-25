package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineBareFunction
  extends BaseNode
     with _Node {
  var callee: Expression
  @JSName("type")
  var type_PipelineBareFunction: typings.atBabelTypes.atBabelTypesStrings.PipelineBareFunction
}

object PipelineBareFunction {
  @scala.inline
  def apply(
    callee: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.PipelineBareFunction,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): PipelineBareFunction = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineBareFunction]
  }
}

@JSImport("@babel/types", "pipelineBareFunction")
@js.native
object pipelineBareFunction extends js.Object {
  def apply(callee: Expression): PipelineBareFunction = js.native
}

