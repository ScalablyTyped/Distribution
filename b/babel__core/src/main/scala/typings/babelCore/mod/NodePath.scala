package typings.babelCore.mod

import typings.babelTraverse.mod.Hub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "NodePath")
@js.native
class NodePath[T] protected ()
  extends typings.babelTraverse.mod.NodePath[T] {
  def this(hub: Hub, parent: typings.babelTraverse.mod.Node) = this()
}

