package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSModuleDeclaration
  extends Node
     with Declaration
     with Statement {
  var body: TSModuleBlock | TSModuleDeclaration
  var declare: Boolean | Null
  var global: Boolean | Null
  var id: Identifier | StringLiteral
  @JSName("type")
  var type_TSModuleDeclaration: typings.babelDashTypes.babelDashTypesStrings.TSModuleDeclaration
}

object TSModuleDeclaration {
  @scala.inline
  def apply(
    body: TSModuleBlock | TSModuleDeclaration,
    end: Double,
    id: Identifier | StringLiteral,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSModuleDeclaration,
    declare: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end, id = id.asInstanceOf[js.Any], loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSModuleDeclaration]
  }
}

