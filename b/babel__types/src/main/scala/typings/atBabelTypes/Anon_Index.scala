package typings.atBabelTypes

import typings.atBabelTypes.atBabelTypesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var key: String
  var node: Node
}

object Anon_Index {
  @scala.inline
  def apply(key: String, node: Node, index: Int | Double = null): Anon_Index = {
    val __obj = js.Dynamic.literal(key = key, node = node.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Index]
  }
}

