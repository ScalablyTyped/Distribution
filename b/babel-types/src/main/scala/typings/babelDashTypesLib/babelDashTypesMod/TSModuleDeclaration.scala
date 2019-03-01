package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSModuleDeclaration
  extends Node
     with Declaration
     with Statement {
  var body: TSModuleBlock | TSModuleDeclaration
  var declare: scala.Boolean | scala.Null
  var global: scala.Boolean | scala.Null
  var id: Identifier | StringLiteral
  @JSName("type")
  var type_TSModuleDeclaration: babelDashTypesLib.babelDashTypesLibStrings.TSModuleDeclaration
}

object TSModuleDeclaration {
  @scala.inline
  def apply(
    body: TSModuleBlock | TSModuleDeclaration,
    end: scala.Double,
    id: Identifier | StringLiteral,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSModuleDeclaration,
    declare: js.UndefOr[scala.Boolean] = js.undefined,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSModuleDeclaration]
  }
}

