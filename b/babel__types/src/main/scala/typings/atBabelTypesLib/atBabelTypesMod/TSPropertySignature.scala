package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSPropertySignature
  extends TSTypeElement
     with BaseNode {
  var computed: scala.Boolean | scala.Null
  var initializer: Expression | scala.Null
  var key: Expression
  var optional: scala.Boolean | scala.Null
  var readonly: scala.Boolean | scala.Null
  var typeAnnotation: TSTypeAnnotation | scala.Null
  @JSName("type")
  var type_TSPropertySignature: atBabelTypesLib.atBabelTypesLibStrings.TSPropertySignature
}

object TSPropertySignature {
  @scala.inline
  def apply(
    key: Expression,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TSPropertySignature,
    computed: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null
  ): TSPropertySignature = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("key")(key)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSPropertySignature]
  }
}

