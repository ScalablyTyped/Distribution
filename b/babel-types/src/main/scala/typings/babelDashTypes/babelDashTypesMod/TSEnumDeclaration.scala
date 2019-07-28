package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSEnumDeclaration
  extends Node
     with Declaration
     with Statement {
  var const: Boolean | Null
  var declare: Boolean | Null
  var id: Identifier
  var initializer: Expression | Null
  var members: js.Array[TSEnumMember]
  @JSName("type")
  var type_TSEnumDeclaration: typings.babelDashTypes.babelDashTypesStrings.TSEnumDeclaration
}

object TSEnumDeclaration {
  @scala.inline
  def apply(
    end: Double,
    id: Identifier,
    loc: SourceLocation,
    members: js.Array[TSEnumMember],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSEnumDeclaration,
    const: js.UndefOr[Boolean] = js.undefined,
    declare: js.UndefOr[Boolean] = js.undefined,
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSEnumDeclaration = {
    val __obj = js.Dynamic.literal(end = end, id = id, loc = loc, members = members, start = start)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(const)) __obj.updateDynamic("const")(const)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSEnumDeclaration]
  }
}

