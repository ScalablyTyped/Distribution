package typings.babelDashTraverse

import typings.babelDashTraverse.babelDashTraverseMod.Binding
import typings.babelDashTraverse.babelDashTraverseMod.Node
import typings.babelDashTraverse.babelDashTraverseMod.NodePath
import typings.babelDashTraverse.babelDashTraverseMod.Scope
import typings.babelDashTraverse.babelDashTraverseStrings.`var`
import typings.babelDashTraverse.babelDashTraverseStrings.const
import typings.babelDashTraverse.babelDashTraverseStrings.let
import typings.babelDashTypes.babelDashTypesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Const extends js.Object {
  var existing: Binding
  var identifier: Identifier
  var kind: `var` | let | const
  var path: NodePath[Node]
  var scope: Scope
}

object Anon_Const {
  @scala.inline
  def apply(
    existing: Binding,
    identifier: Identifier,
    kind: `var` | let | const,
    path: NodePath[Node],
    scope: Scope
  ): Anon_Const = {
    val __obj = js.Dynamic.literal(existing = existing, identifier = identifier, kind = kind.asInstanceOf[js.Any], path = path, scope = scope)
  
    __obj.asInstanceOf[Anon_Const]
  }
}

