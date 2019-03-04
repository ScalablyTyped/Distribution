package typings
package atBabelTraverseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConstExisting extends js.Object {
  var existing: atBabelTraverseLib.atBabelTraverseMod.Binding
  var identifier: atBabelTypesLib.atBabelTypesMod.Identifier
  var kind: atBabelTraverseLib.atBabelTraverseLibStrings.`var` | atBabelTraverseLib.atBabelTraverseLibStrings.let | atBabelTraverseLib.atBabelTraverseLibStrings.const
  var path: atBabelTraverseLib.atBabelTraverseMod.NodePath[atBabelTraverseLib.atBabelTraverseMod.Node]
  var scope: atBabelTraverseLib.atBabelTraverseMod.Scope
}

object Anon_ConstExisting {
  @scala.inline
  def apply(
    existing: atBabelTraverseLib.atBabelTraverseMod.Binding,
    identifier: atBabelTypesLib.atBabelTypesMod.Identifier,
    kind: atBabelTraverseLib.atBabelTraverseLibStrings.`var` | atBabelTraverseLib.atBabelTraverseLibStrings.let | atBabelTraverseLib.atBabelTraverseLibStrings.const,
    path: atBabelTraverseLib.atBabelTraverseMod.NodePath[atBabelTraverseLib.atBabelTraverseMod.Node],
    scope: atBabelTraverseLib.atBabelTraverseMod.Scope
  ): Anon_ConstExisting = {
    val __obj = js.Dynamic.literal(existing = existing, identifier = identifier, kind = kind.asInstanceOf[js.Any], path = path, scope = scope)
  
    __obj.asInstanceOf[Anon_ConstExisting]
  }
}

