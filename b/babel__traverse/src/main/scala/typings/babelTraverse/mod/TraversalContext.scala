package typings.babelTraverse.mod

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
    val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any], parentPath = parentPath.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TraversalContext]
  }
}

