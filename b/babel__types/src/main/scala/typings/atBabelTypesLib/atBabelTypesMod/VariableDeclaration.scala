package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait VariableDeclaration
  extends Declaration
     with BaseNode
     with Statement {
  var declarations: js.Array[VariableDeclarator]
  var declare: scala.Boolean | scala.Null
  var kind: atBabelTypesLib.atBabelTypesLibStrings.`var` | atBabelTypesLib.atBabelTypesLibStrings.let | atBabelTypesLib.atBabelTypesLibStrings.const
  @JSName("type")
  var type_VariableDeclaration: atBabelTypesLib.atBabelTypesLibStrings.VariableDeclaration
}

object VariableDeclaration {
  @scala.inline
  def apply(
    declarations: js.Array[VariableDeclarator],
    kind: atBabelTypesLib.atBabelTypesLibStrings.`var` | atBabelTypesLib.atBabelTypesLibStrings.let | atBabelTypesLib.atBabelTypesLibStrings.const,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.VariableDeclaration,
    declare: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations, kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[VariableDeclaration]
  }
}

