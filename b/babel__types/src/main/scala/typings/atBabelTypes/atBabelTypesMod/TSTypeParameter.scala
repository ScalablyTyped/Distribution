package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameter
  extends BaseNode
     with _Node {
  var constraint: TSType | Null
  var default: TSType | Null
  var name: String
  @JSName("type")
  var type_TSTypeParameter: typings.atBabelTypes.atBabelTypesStrings.TSTypeParameter
}

object TSTypeParameter {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSTypeParameter,
    constraint: TSType = null,
    default: TSType = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameter]
  }
}

@JSImport("@babel/types", "tsTypeParameter")
@js.native
object tsTypeParameter extends js.Object {
  def apply(constraint: js.UndefOr[scala.Nothing], _default: js.UndefOr[scala.Nothing], name: String): TSTypeParameter = js.native
  def apply(constraint: js.UndefOr[scala.Nothing], _default: Null, name: String): TSTypeParameter = js.native
  def apply(constraint: js.UndefOr[scala.Nothing], _default: TSType, name: String): TSTypeParameter = js.native
  def apply(constraint: Null, _default: js.UndefOr[scala.Nothing], name: String): TSTypeParameter = js.native
  def apply(constraint: Null, _default: Null, name: String): TSTypeParameter = js.native
  def apply(constraint: Null, _default: TSType, name: String): TSTypeParameter = js.native
  def apply(constraint: TSType, _default: js.UndefOr[scala.Nothing], name: String): TSTypeParameter = js.native
  def apply(constraint: TSType, _default: Null, name: String): TSTypeParameter = js.native
  def apply(constraint: TSType, _default: TSType, name: String): TSTypeParameter = js.native
}

