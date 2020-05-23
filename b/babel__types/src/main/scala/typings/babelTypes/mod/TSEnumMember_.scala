package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSEnumMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSEnumMember_
  extends BaseNode
     with _Node {
  var id: Identifier_ | StringLiteral_
  var initializer: Expression | Null
  @JSName("type")
  var type_TSEnumMember_ : TSEnumMember
}

object TSEnumMember_ {
  @scala.inline
  def apply(
    id: Identifier_ | StringLiteral_,
    `type`: TSEnumMember,
    end: Double = null.asInstanceOf[Double],
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TSEnumMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], initializer = initializer.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSEnumMember_]
  }
}

