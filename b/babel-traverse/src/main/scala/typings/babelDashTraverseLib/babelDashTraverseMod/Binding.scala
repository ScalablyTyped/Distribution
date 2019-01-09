package typings
package babelDashTraverseLib.babelDashTraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-traverse", "Binding")
@js.native
class Binding protected () extends js.Object {
  def this(opts: babelDashTraverseLib.Anon_Const) = this()
  var constant: scala.Boolean = js.native
  var constantViolations: js.Array[NodePath[Node]] = js.native
  var identifier: babelDashTypesLib.babelDashTypesMod.Identifier = js.native
  var kind: babelDashTraverseLib.babelDashTraverseLibStrings.`var` | babelDashTraverseLib.babelDashTraverseLibStrings.let | babelDashTraverseLib.babelDashTraverseLibStrings.const | babelDashTraverseLib.babelDashTraverseLibStrings.module = js.native
  var path: NodePath[Node] = js.native
  var referencePaths: js.Array[NodePath[Node]] = js.native
  var referenced: scala.Boolean = js.native
  var references: scala.Double = js.native
  var scope: Scope = js.native
}

