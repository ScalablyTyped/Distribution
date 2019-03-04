package typings
package babelDashTraverseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Const extends js.Object {
  var existing: babelDashTraverseLib.babelDashTraverseMod.Binding
  var identifier: babelDashTypesLib.babelDashTypesMod.Identifier
  var kind: babelDashTraverseLib.babelDashTraverseLibStrings.`var` | babelDashTraverseLib.babelDashTraverseLibStrings.let | babelDashTraverseLib.babelDashTraverseLibStrings.const
  var path: babelDashTraverseLib.babelDashTraverseMod.NodePath[babelDashTraverseLib.babelDashTraverseMod.Node]
  var scope: babelDashTraverseLib.babelDashTraverseMod.Scope
}

object Anon_Const {
  @scala.inline
  def apply(
    existing: babelDashTraverseLib.babelDashTraverseMod.Binding,
    identifier: babelDashTypesLib.babelDashTypesMod.Identifier,
    kind: babelDashTraverseLib.babelDashTraverseLibStrings.`var` | babelDashTraverseLib.babelDashTraverseLibStrings.let | babelDashTraverseLib.babelDashTraverseLibStrings.const,
    path: babelDashTraverseLib.babelDashTraverseMod.NodePath[babelDashTraverseLib.babelDashTraverseMod.Node],
    scope: babelDashTraverseLib.babelDashTraverseMod.Scope
  ): Anon_Const = {
    val __obj = js.Dynamic.literal(existing = existing, identifier = identifier, kind = kind.asInstanceOf[js.Any], path = path, scope = scope)
  
    __obj.asInstanceOf[Anon_Const]
  }
}

