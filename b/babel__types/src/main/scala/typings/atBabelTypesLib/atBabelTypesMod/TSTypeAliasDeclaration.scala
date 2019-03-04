package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSTypeAliasDeclaration
  extends Declaration
     with BaseNode
     with Statement {
  var declare: scala.Boolean | scala.Null
  var id: Identifier
  var typeAnnotation: TSType
  var typeParameters: TSTypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_TSTypeAliasDeclaration: atBabelTypesLib.atBabelTypesLibStrings.TSTypeAliasDeclaration
}

object TSTypeAliasDeclaration {
  @scala.inline
  def apply(
    id: Identifier,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TSTypeAliasDeclaration,
    typeAnnotation: TSType,
    declare: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): TSTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(id = id, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSTypeAliasDeclaration]
  }
}

