package typings.babelPluginMacros

import typings.babelCore.mod.NodePath
import typings.babelTraverse.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var default: js.Array[NodePath[Node]]
}

object AnonDefault {
  @scala.inline
  def apply(default: js.Array[NodePath[Node]]): AnonDefault = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefault]
  }
}

