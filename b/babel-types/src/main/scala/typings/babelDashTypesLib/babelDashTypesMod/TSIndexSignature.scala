package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSIndexSignature
  extends Node
     with TSTypeElement {
  var parameters: js.Array[Identifier]
  var readonly: scala.Boolean | scala.Null
  var typeAnnotation: TSTypeAnnotation | scala.Null
  @JSName("type")
  var type_TSIndexSignature: babelDashTypesLib.babelDashTypesLibStrings.TSIndexSignature
}

object TSIndexSignature {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    parameters: js.Array[Identifier],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSIndexSignature,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null
  ): TSIndexSignature = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSIndexSignature]
  }
}

