package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSMethodSignature
  extends TSTypeElement
     with BaseNode {
  var computed: scala.Boolean | scala.Null
  var key: Expression
  var optional: scala.Boolean | scala.Null
  var parameters: (js.Array[Identifier | RestElement]) | scala.Null
  var typeAnnotation: TSTypeAnnotation | scala.Null
  var typeParameters: TSTypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_TSMethodSignature: atBabelTypesLib.atBabelTypesLibStrings.TSMethodSignature
}

object TSMethodSignature {
  @scala.inline
  def apply(
    key: Expression,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TSMethodSignature,
    computed: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    parameters: js.Array[Identifier | RestElement] = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): TSMethodSignature = {
    val __obj = js.Dynamic.literal(key = key)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSMethodSignature]
  }
}

