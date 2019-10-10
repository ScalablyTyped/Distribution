package typings.atBabelTypes

import typings.atBabelTypes.atBabelTypesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BuildUndefinedNode extends js.Object {
  def buildUndefinedNode(): Node
  def push(value: Anon_Id): Unit
}

object Anon_BuildUndefinedNode {
  @scala.inline
  def apply(buildUndefinedNode: () => Node, push: Anon_Id => Unit): Anon_BuildUndefinedNode = {
    val __obj = js.Dynamic.literal(buildUndefinedNode = js.Any.fromFunction0(buildUndefinedNode), push = js.Any.fromFunction1(push))
  
    __obj.asInstanceOf[Anon_BuildUndefinedNode]
  }
}

