package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSPropertySignature
  extends Node
     with TSTypeElement {
  var computed: scala.Boolean | scala.Null
  var initializer: Expression | scala.Null
  var key: Expression
  var optional: scala.Boolean | scala.Null
  var readonly: scala.Boolean | scala.Null
  var typeAnnotation: TSTypeAnnotation | scala.Null
  @JSName("type")
  var type_TSPropertySignature: babelDashTypesLib.babelDashTypesLibStrings.TSPropertySignature
}

object TSPropertySignature {
  @scala.inline
  def apply(
    end: scala.Double,
    key: Expression,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSPropertySignature,
    computed: js.UndefOr[scala.Boolean] = js.undefined,
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null
  ): TSPropertySignature = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSPropertySignature]
  }
}

