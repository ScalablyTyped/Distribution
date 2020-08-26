package typings.babelTraverse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversalContext extends js.Object {
  var opts: js.Any = js.native
  var parentPath: NodePath[Node] = js.native
  var scope: Scope = js.native
  var state: js.Any = js.native
}

object TraversalContext {
  @scala.inline
  def apply(opts: js.Any, parentPath: NodePath[Node], scope: Scope, state: js.Any): TraversalContext = {
    val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any], parentPath = parentPath.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraversalContext]
  }
  @scala.inline
  implicit class TraversalContextOps[Self <: TraversalContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOpts(value: js.Any): Self = this.set("opts", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentPath(value: NodePath[Node]): Self = this.set("parentPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: Scope): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

