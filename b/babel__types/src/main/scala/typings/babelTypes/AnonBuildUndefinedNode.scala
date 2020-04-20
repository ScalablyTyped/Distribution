package typings.babelTypes

import typings.babelTypes.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuildUndefinedNode extends js.Object {
  def buildUndefinedNode(): Node
  def push(value: AnonId): Unit
}

object AnonBuildUndefinedNode {
  @scala.inline
  def apply(buildUndefinedNode: () => Node, push: AnonId => Unit): AnonBuildUndefinedNode = {
    val __obj = js.Dynamic.literal(buildUndefinedNode = js.Any.fromFunction0(buildUndefinedNode), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[AnonBuildUndefinedNode]
  }
}

