package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSMappedType
  extends Node
     with TSType {
  var optional: scala.Boolean | scala.Null
  var readonly: scala.Boolean | scala.Null
  var typeAnnotation: TSType | scala.Null
  var typeParameter: TypeParameter
  @JSName("type")
  var type_TSMappedType: babelDashTypesLib.babelDashTypesLibStrings.TSMappedType
}

object TSMappedType {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSMappedType,
    typeParameter: TypeParameter,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSType = null
  ): TSMappedType = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, typeParameter = typeParameter)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSMappedType]
  }
}

