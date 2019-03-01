package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSEnumDeclaration
  extends Declaration
     with BaseNode
     with Statement {
  var const: scala.Boolean | scala.Null
  var declare: scala.Boolean | scala.Null
  var id: Identifier
  var initializer: Expression | scala.Null
  var members: js.Array[TSEnumMember]
  @JSName("type")
  var type_TSEnumDeclaration: atBabelTypesLib.atBabelTypesLibStrings.TSEnumDeclaration
}

object TSEnumDeclaration {
  @scala.inline
  def apply(
    id: Identifier,
    members: js.Array[TSEnumMember],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TSEnumDeclaration,
    const: js.UndefOr[scala.Boolean] = js.undefined,
    declare: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSEnumDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("members")(members)
    if (!js.isUndefined(const)) __obj.updateDynamic("const")(const)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSEnumDeclaration]
  }
}

