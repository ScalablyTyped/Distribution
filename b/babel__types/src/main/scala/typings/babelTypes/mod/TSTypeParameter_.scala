package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameter_
  extends BaseNode
     with _Node {
  var constraint: TSType | Null
  var default: TSType | Null
  var name: String
  @JSName("type")
  var type_TSTypeParameter_ : TSTypeParameter
}

object TSTypeParameter_ {
  @scala.inline
  def apply(
    name: String,
    `type`: TSTypeParameter,
    constraint: TSType = null,
    default: TSType = null,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TSTypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], constraint = constraint.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameter_]
  }
}

