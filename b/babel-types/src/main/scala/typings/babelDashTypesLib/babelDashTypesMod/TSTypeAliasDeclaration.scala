package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeAliasDeclaration
  extends Node
     with Declaration
     with Statement {
  var declare: scala.Boolean | scala.Null
  var id: Identifier
  var typeAnnotation: TSType
  var typeParameters: TypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_TSTypeAliasDeclaration: babelDashTypesLib.babelDashTypesLibStrings.TSTypeAliasDeclaration
}

object TSTypeAliasDeclaration {
  @scala.inline
  def apply(
    end: scala.Double,
    id: Identifier,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSTypeAliasDeclaration,
    typeAnnotation: TSType,
    declare: js.UndefOr[scala.Boolean] = js.undefined,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): TSTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(end = end, id = id, loc = loc, start = start, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSTypeAliasDeclaration]
  }
}

