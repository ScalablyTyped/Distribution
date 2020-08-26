package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.`var`
import typings.babelTraverse.babelTraverseStrings.const
import typings.babelTraverse.babelTraverseStrings.let
import typings.babelTraverse.mod.Binding
import typings.babelTraverse.mod.Node
import typings.babelTraverse.mod.NodePath
import typings.babelTraverse.mod.Scope
import typings.babelTypes.mod.Identifier_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Existing extends js.Object {
  var existing: Binding = js.native
  var identifier: Identifier_ = js.native
  var kind: `var` | let | const = js.native
  var path: NodePath[Node] = js.native
  var scope: Scope = js.native
}

object Existing {
  @scala.inline
  def apply(
    existing: Binding,
    identifier: Identifier_,
    kind: `var` | let | const,
    path: NodePath[Node],
    scope: Scope
  ): Existing = {
    val __obj = js.Dynamic.literal(existing = existing.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Existing]
  }
  @scala.inline
  implicit class ExistingOps[Self <: Existing] (val x: Self) extends AnyVal {
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
    def setExisting(value: Binding): Self = this.set("existing", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: Identifier_): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: `var` | let | const): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: NodePath[Node]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: Scope): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

