package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSMappedType
  extends Node
     with TSType {
  var optional: Boolean | Null
  var readonly: Boolean | Null
  var typeAnnotation: TSType | Null
  var typeParameter: TypeParameter
  @JSName("type")
  var type_TSMappedType: typings.babelDashTypes.babelDashTypesStrings.TSMappedType
}

object TSMappedType {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSMappedType,
    typeParameter: TypeParameter,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
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

