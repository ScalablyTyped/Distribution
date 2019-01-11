package typings
package atBabelTraverseLib.atBabelTraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/traverse", "Binding")
@js.native
class Binding protected () extends js.Object {
  def this(opts: atBabelTraverseLib.Anon_ConstExisting) = this()
  var constant: scala.Boolean = js.native
  var constantViolations: js.Array[NodePath[Node]] = js.native
  var identifier: atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  var kind: atBabelTraverseLib.atBabelTraverseLibStrings.`var` | atBabelTraverseLib.atBabelTraverseLibStrings.let | atBabelTraverseLib.atBabelTraverseLibStrings.const | atBabelTraverseLib.atBabelTraverseLibStrings.module = js.native
  var path: NodePath[Node] = js.native
  var referencePaths: js.Array[NodePath[Node]] = js.native
  var referenced: scala.Boolean = js.native
  var references: scala.Double = js.native
  var scope: Scope = js.native
}

