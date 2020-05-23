package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ArgumentPlaceholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentPlaceholder_
  extends BaseNode
     with _Node {
  @JSName("type")
  var type_ArgumentPlaceholder_ : ArgumentPlaceholder
}

object ArgumentPlaceholder_ {
  @scala.inline
  def apply(
    `type`: ArgumentPlaceholder,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): ArgumentPlaceholder_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentPlaceholder_]
  }
}

