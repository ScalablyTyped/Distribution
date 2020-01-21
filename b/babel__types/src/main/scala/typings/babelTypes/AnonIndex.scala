package typings.babelTypes

import typings.babelTypes.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var key: String
  var node: Node
}

object AnonIndex {
  @scala.inline
  def apply(key: String, node: Node, index: Int | Double = null): AnonIndex = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex]
  }
}

