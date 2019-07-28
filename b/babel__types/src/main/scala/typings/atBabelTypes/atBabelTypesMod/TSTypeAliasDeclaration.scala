package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSTypeAliasDeclaration
  extends Declaration
     with BaseNode
     with Statement {
  var declare: Boolean | Null
  var id: Identifier
  var typeAnnotation: TSType
  var typeParameters: TSTypeParameterDeclaration | Null
  @JSName("type")
  var type_TSTypeAliasDeclaration: typings.atBabelTypes.atBabelTypesStrings.TSTypeAliasDeclaration
}

object TSTypeAliasDeclaration {
  @scala.inline
  def apply(
    id: Identifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSTypeAliasDeclaration,
    typeAnnotation: TSType,
    declare: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
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

