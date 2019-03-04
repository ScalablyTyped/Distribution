package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSEnumMember extends Node {
  var id: Identifier | StringLiteral
  var initializer: Expression | scala.Null
  @JSName("type")
  var type_TSEnumMember: babelDashTypesLib.babelDashTypesLibStrings.TSEnumMember
}

object TSEnumMember {
  @scala.inline
  def apply(
    end: scala.Double,
    id: Identifier | StringLiteral,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSEnumMember,
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSEnumMember = {
    val __obj = js.Dynamic.literal(end = end, id = id.asInstanceOf[js.Any], loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSEnumMember]
  }
}

