package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSMappedType
  extends TSType
     with BaseNode {
  var optional: Boolean | Null
  var readonly: Boolean | Null
  var typeAnnotation: TSType | Null
  var typeParameter: TSTypeParameter
  @JSName("type")
  var type_TSMappedType: typings.atBabelTypes.atBabelTypesStrings.TSMappedType
}

object TSMappedType {
  @scala.inline
  def apply(
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSMappedType,
    typeParameter: TSTypeParameter,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSType = null
  ): TSMappedType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSMappedType]
  }
}

@JSImport("@babel/types", "tsMappedType")
@js.native
object tsMappedType extends js.Object {
  def apply(typeParameter: TSTypeParameter): TSMappedType = js.native
  def apply(typeParameter: TSTypeParameter, typeAnnotation: Null, optional: Boolean): TSMappedType = js.native
  def apply(typeParameter: TSTypeParameter, typeAnnotation: Null, optional: Boolean, readonly: Boolean): TSMappedType = js.native
  def apply(typeParameter: TSTypeParameter, typeAnnotation: Null, optional: Null, readonly: Boolean): TSMappedType = js.native
  def apply(typeParameter: TSTypeParameter, typeAnnotation: TSType): TSMappedType = js.native
  def apply(typeParameter: TSTypeParameter, typeAnnotation: TSType, optional: Boolean): TSMappedType = js.native
  def apply(typeParameter: TSTypeParameter, typeAnnotation: TSType, optional: Boolean, readonly: Boolean): TSMappedType = js.native
  def apply(typeParameter: TSTypeParameter, typeAnnotation: TSType, optional: Null, readonly: Boolean): TSMappedType = js.native
}

