package typings.babelTypes.anon

import typings.babelTypes.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildUndefinedNode extends js.Object {
  def buildUndefinedNode(): Node
  def push(value: Id): Unit
}

object BuildUndefinedNode {
  @scala.inline
  def apply(buildUndefinedNode: () => Node, push: Id => Unit): BuildUndefinedNode = {
    val __obj = js.Dynamic.literal(buildUndefinedNode = js.Any.fromFunction0(buildUndefinedNode), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[BuildUndefinedNode]
  }
}

