package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSEnumDeclaration
  extends Node
     with Declaration
     with Statement {
  var const: scala.Boolean | scala.Null
  var declare: scala.Boolean | scala.Null
  var id: Identifier
  var initializer: Expression | scala.Null
  var members: js.Array[TSEnumMember]
  @JSName("type")
  var type_TSEnumDeclaration: babelDashTypesLib.babelDashTypesLibStrings.TSEnumDeclaration
}

object TSEnumDeclaration {
  @scala.inline
  def apply(
    end: scala.Double,
    id: Identifier,
    loc: SourceLocation,
    members: js.Array[TSEnumMember],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSEnumDeclaration,
    const: js.UndefOr[scala.Boolean] = js.undefined,
    declare: js.UndefOr[scala.Boolean] = js.undefined,
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSEnumDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("members")(members)
    __obj.updateDynamic("start")(start)
    if (!js.isUndefined(const)) __obj.updateDynamic("const")(const)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSEnumDeclaration]
  }
}

