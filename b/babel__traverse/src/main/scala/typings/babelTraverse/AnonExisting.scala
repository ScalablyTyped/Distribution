package typings.babelTraverse

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

trait AnonExisting extends js.Object {
  var existing: Binding
  var identifier: Identifier_
  var kind: `var` | let | const
  var path: NodePath[Node]
  var scope: Scope
}

object AnonExisting {
  @scala.inline
  def apply(
    existing: Binding,
    identifier: Identifier_,
    kind: `var` | let | const,
    path: NodePath[Node],
    scope: Scope
  ): AnonExisting = {
    val __obj = js.Dynamic.literal(existing = existing.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExisting]
  }
}

