package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseNode extends js.Object {
  var end: Double | Null
  var innerComments: js.Array[Comment] | Null
  var leadingComments: js.Array[Comment] | Null
  var loc: SourceLocation | Null
  var start: Double | Null
  var trailingComments: js.Array[Comment] | Null
  var `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 237 */ js.Any
}

object BaseNode {
  @scala.inline
  def apply(
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 237 */ js.Any,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): BaseNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
}

