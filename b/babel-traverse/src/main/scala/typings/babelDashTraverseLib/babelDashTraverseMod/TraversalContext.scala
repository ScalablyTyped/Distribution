package typings
package babelDashTraverseLib.babelDashTraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversalContext extends js.Object {
  var opts: js.Any
  var parentPath: NodePath[Node]
  var scope: Scope
  var state: js.Any
}

object TraversalContext {
  @scala.inline
  def apply(opts: js.Any, parentPath: NodePath[Node], scope: Scope, state: js.Any): TraversalContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("opts")(opts)
    __obj.updateDynamic("parentPath")(parentPath)
    __obj.updateDynamic("scope")(scope)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[TraversalContext]
  }
}

