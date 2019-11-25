package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TypeParameter
  extends Flow
     with BaseNode {
  var bound: TypeAnnotation | Null
  var default: FlowType | Null
  var name: String | Null
  @JSName("type")
  var type_TypeParameter: typings.atBabelTypes.atBabelTypesStrings.TypeParameter
  var variance: Variance | Null
}

object TypeParameter {
  @scala.inline
  def apply(
    `type`: typings.atBabelTypes.atBabelTypesStrings.TypeParameter,
    bound: TypeAnnotation = null,
    default: FlowType = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    name: String = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    variance: Variance = null
  ): TypeParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bound != null) __obj.updateDynamic("bound")(bound.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameter]
  }
}

@JSImport("@babel/types", "typeParameter")
@js.native
object typeParameter extends js.Object {
  def apply(): TypeParameter = js.native
  def apply(bound: Null, _default: Null, variance: Null, name: String): TypeParameter = js.native
  def apply(bound: Null, _default: Null, variance: Variance): TypeParameter = js.native
  def apply(bound: Null, _default: Null, variance: Variance, name: String): TypeParameter = js.native
  def apply(bound: Null, _default: FlowType): TypeParameter = js.native
  def apply(bound: Null, _default: FlowType, variance: Null, name: String): TypeParameter = js.native
  def apply(bound: Null, _default: FlowType, variance: Variance): TypeParameter = js.native
  def apply(bound: Null, _default: FlowType, variance: Variance, name: String): TypeParameter = js.native
  def apply(bound: TypeAnnotation): TypeParameter = js.native
  def apply(bound: TypeAnnotation, _default: Null, variance: Null, name: String): TypeParameter = js.native
  def apply(bound: TypeAnnotation, _default: Null, variance: Variance): TypeParameter = js.native
  def apply(bound: TypeAnnotation, _default: Null, variance: Variance, name: String): TypeParameter = js.native
  def apply(bound: TypeAnnotation, _default: FlowType): TypeParameter = js.native
  def apply(bound: TypeAnnotation, _default: FlowType, variance: Null, name: String): TypeParameter = js.native
  def apply(bound: TypeAnnotation, _default: FlowType, variance: Variance): TypeParameter = js.native
  def apply(bound: TypeAnnotation, _default: FlowType, variance: Variance, name: String): TypeParameter = js.native
}

