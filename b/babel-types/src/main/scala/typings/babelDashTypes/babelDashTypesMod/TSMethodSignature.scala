package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSMethodSignature
  extends Node
     with TSTypeElement {
  var computed: Boolean | Null
  var key: Expression
  var optional: Boolean | Null
  var parameters: (js.Array[Identifier | RestElement]) | Null
  var typeAnnotation: TSTypeAnnotation | Null
  var typeParameters: TypeParameterDeclaration | Null
  @JSName("type")
  var type_TSMethodSignature: typings.babelDashTypes.babelDashTypesStrings.TSMethodSignature
}

object TSMethodSignature {
  @scala.inline
  def apply(
    end: Double,
    key: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSMethodSignature,
    computed: js.UndefOr[Boolean] = js.undefined,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    optional: js.UndefOr[Boolean] = js.undefined,
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

