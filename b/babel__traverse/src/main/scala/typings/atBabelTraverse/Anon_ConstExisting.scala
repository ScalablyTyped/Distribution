package typings.atBabelTraverse

import typings.atBabelTraverse.atBabelTraverseMod.Binding
import typings.atBabelTraverse.atBabelTraverseMod.Node
import typings.atBabelTraverse.atBabelTraverseMod.NodePath
import typings.atBabelTraverse.atBabelTraverseMod.Scope
import typings.atBabelTraverse.atBabelTraverseStrings.`var`
import typings.atBabelTraverse.atBabelTraverseStrings.const
import typings.atBabelTraverse.atBabelTraverseStrings.let
import typings.atBabelTypes.atBabelTypesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConstExisting extends js.Object {
  var existing: Binding
  var identifier: Identifier
  var kind: `var` | let | const
  var path: NodePath[Node]
  var scope: Scope
}

object Anon_ConstExisting {
  @scala.inline
  def apply(
    existing: Binding,
    identifier: Identifier,
    kind: `var` | let | const,
    path: NodePath[Node],
    scope: Scope
  ): Anon_ConstExisting = {
    val __obj = js.Dynamic.literal(existing = existing, identifier = identifier, kind = kind.asInstanceOf[js.Any], path = path, scope = scope)
  
    __obj.asInstanceOf[Anon_ConstExisting]
  }
}

