package typings.atBabelTraverse.atBabelTraverseMod

import typings.atBabelTraverse.Anon_ConstExisting
import typings.atBabelTraverse.atBabelTraverseStrings.`var`
import typings.atBabelTraverse.atBabelTraverseStrings.const
import typings.atBabelTraverse.atBabelTraverseStrings.let
import typings.atBabelTraverse.atBabelTraverseStrings.module
import typings.atBabelTypes.atBabelTypesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/traverse", "Binding")
@js.native
class Binding protected () extends js.Object {
  def this(opts: Anon_ConstExisting) = this()
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

