package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSEnumMember
  extends BaseNode
     with _Node {
  var id: Identifier | StringLiteral
  var initializer: Expression | scala.Null
  @JSName("type")
  var type_TSEnumMember: atBabelTypesLib.atBabelTypesLibStrings.TSEnumMember
}

object TSEnumMember {
  @scala.inline
  def apply(
    id: Identifier | StringLiteral,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TSEnumMember,
    end: scala.Int | scala.Double = null,
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSEnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSEnumMember]
  }
}

