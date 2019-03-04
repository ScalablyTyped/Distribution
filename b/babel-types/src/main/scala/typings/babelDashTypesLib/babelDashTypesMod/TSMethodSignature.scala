package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSMethodSignature
  extends Node
     with TSTypeElement {
  var computed: scala.Boolean | scala.Null
  var key: Expression
  var optional: scala.Boolean | scala.Null
  var parameters: (js.Array[Identifier | RestElement]) | scala.Null
  var typeAnnotation: TSTypeAnnotation | scala.Null
  var typeParameters: TypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_TSMethodSignature: babelDashTypesLib.babelDashTypesLibStrings.TSMethodSignature
}

object TSMethodSignature {
  @scala.inline
  def apply(
    end: scala.Double,
    key: Expression,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSMethodSignature,
    computed: js.UndefOr[scala.Boolean] = js.undefined,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    parameters: js.Array[Identifier | RestElement] = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null,
    typeParameters: TypeParameterDeclaration = null
  ): TSMethodSignature = {
    val __obj = js.Dynamic.literal(end = end, key = key, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSMethodSignature]
  }
}

