package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSExternalModuleReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSExternalModuleReference_
  extends BaseNode
     with _Node {
  var expression: StringLiteral_
  @JSName("type")
  var type_TSExternalModuleReference_ : TSExternalModuleReference
}

object TSExternalModuleReference_ {
  @scala.inline
  def apply(
    expression: StringLiteral_,
    `type`: TSExternalModuleReference,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TSExternalModuleReference_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSExternalModuleReference_]
  }
}

