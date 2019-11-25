package typings.commonmark.commonmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeWalkingStep extends js.Object {
  /**
    * a boolean, which is true when we enter a Node from a parent or sibling, and false when we reenter it from a child
    */
  var entering: Boolean
  /**
    * The node belonging to this step
    */
  var node: Node
}

object NodeWalkingStep {
  @scala.inline
  def apply(entering: Boolean, node: Node): NodeWalkingStep = {
    val __obj = js.Dynamic.literal(entering = entering.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeWalkingStep]
  }
}

