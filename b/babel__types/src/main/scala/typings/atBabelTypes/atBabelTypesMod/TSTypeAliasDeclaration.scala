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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeAliasDeclaration]
  }
}

@JSImport("@babel/types", "tsTypeAliasDeclaration")
@js.native
object tsTypeAliasDeclaration extends js.Object {
  def apply(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    typeAnnotation: TSType,
    declare: Boolean
  ): TSTypeAliasDeclaration = js.native
  def apply(id: Identifier, typeParameters: Null, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def apply(id: Identifier, typeParameters: Null, typeAnnotation: TSType, declare: Boolean): TSTypeAliasDeclaration = js.native
  def apply(id: Identifier, typeParameters: TSTypeParameterDeclaration, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    typeAnnotation: TSType,
    declare: Boolean
  ): TSTypeAliasDeclaration = js.native
}

