package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DirectiveLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectiveLiteral_
  extends BaseNode
     with _Node {
  @JSName("type")
  var type_DirectiveLiteral_ : DirectiveLiteral
  var value: String
}

object DirectiveLiteral_ {
  @scala.inline
  def apply(
    `type`: DirectiveLiteral,
    value: String,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): DirectiveLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveLiteral_]
  }
}

