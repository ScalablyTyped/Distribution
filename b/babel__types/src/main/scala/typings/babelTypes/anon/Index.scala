package typings.babelTypes.anon

import typings.babelTypes.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var key: String
  var node: Node
}

object Index {
  @scala.inline
  def apply(key: String, node: Node, index: js.UndefOr[Double] = js.undefined): Index = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

