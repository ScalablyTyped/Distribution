package typings.babelDashTraverse.babelDashTraverseMod

import typings.babelDashTraverse.Anon_Const
import typings.babelDashTraverse.babelDashTraverseStrings.`var`
import typings.babelDashTraverse.babelDashTraverseStrings.const
import typings.babelDashTraverse.babelDashTraverseStrings.let
import typings.babelDashTraverse.babelDashTraverseStrings.module
import typings.babelDashTypes.babelDashTypesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-traverse", "Binding")
@js.native
class Binding protected () extends js.Object {
  def this(opts: Anon_Const) = this()
  var constant: Boolean = js.native
  var constantViolations: js.Array[NodePath[Node]] = js.native
  var identifier: Identifier = js.native
  var kind: `var` | let | const | module = js.native
  var path: NodePath[Node] = js.native
  var referencePaths: js.Array[NodePath[Node]] = js.native
  var referenced: Boolean = js.native
  var references: Double = js.native
  var scope: Scope = js.native
}

