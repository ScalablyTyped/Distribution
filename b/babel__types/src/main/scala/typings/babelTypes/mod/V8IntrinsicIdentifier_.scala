package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.V8IntrinsicIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V8IntrinsicIdentifier_
  extends BaseNode
     with _Node {
  var name: String
  @JSName("type")
  var type_V8IntrinsicIdentifier_ : V8IntrinsicIdentifier
}

object V8IntrinsicIdentifier_ {
  @scala.inline
  def apply(
    name: String,
    `type`: V8IntrinsicIdentifier,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): V8IntrinsicIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[V8IntrinsicIdentifier_]
  }
}

