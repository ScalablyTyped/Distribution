package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.RestProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestProperty_
  extends Node
     with UnaryLike {
  var argument: LVal
  @JSName("type")
  var type_RestProperty_ : RestProperty
}

object RestProperty_ {
  @scala.inline
  def apply(
    argument: LVal,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: RestProperty,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): RestProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestProperty_]
  }
}

