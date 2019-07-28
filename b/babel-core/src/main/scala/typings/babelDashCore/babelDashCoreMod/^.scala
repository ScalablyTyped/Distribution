package typings.babelDashCore.babelDashCoreMod

import typings.babelDashTemplate.babelDashTemplateMod.UseTemplate
import typings.babelDashTraverse.babelDashTraverseMod.NodePath
import typings.babelDashTraverse.babelDashTraverseMod.Scope
import typings.babelDashTraverse.babelDashTraverseMod.TraverseOptions
import typings.babylon.babylonMod.BabylonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def template(code: String): UseTemplate = js.native
  def template(code: String, opts: BabylonOptions): UseTemplate = js.native
  def transform(code: String): BabelFileResult = js.native
  def transform(code: String, opts: TransformOptions): BabelFileResult = js.native
  def transformFile(
    filename: String,
    opts: TransformOptions,
    callback: js.Function2[/* err */ js.Any, /* result */ BabelFileResult, Unit]
  ): Unit = js.native
  def transformFileSync(filename: String): BabelFileResult = js.native
  def transformFileSync(filename: String, opts: TransformOptions): BabelFileResult = js.native
  def transformFromAst(ast: Node): BabelFileResult = js.native
  def transformFromAst(ast: Node, code: String): BabelFileResult = js.native
  def transformFromAst(ast: Node, code: String, opts: TransformOptions): BabelFileResult = js.native
  def traverse(
    parent: js.Array[typings.babelDashTraverse.babelDashTraverseMod.Node],
    opts: TraverseOptions[typings.babelDashTraverse.babelDashTraverseMod.Node]
  ): Unit = js.native
  def traverse(
    parent: js.Array[typings.babelDashTraverse.babelDashTraverseMod.Node],
    opts: TraverseOptions[typings.babelDashTraverse.babelDashTraverseMod.Node],
    scope: Scope
  ): Unit = js.native
  def traverse(
    parent: js.Array[typings.babelDashTraverse.babelDashTraverseMod.Node],
    opts: TraverseOptions[typings.babelDashTraverse.babelDashTraverseMod.Node],
    scope: Scope,
    state: js.Any
  ): Unit = js.native
  def traverse(
    parent: js.Array[typings.babelDashTraverse.babelDashTraverseMod.Node],
    opts: TraverseOptions[typings.babelDashTraverse.babelDashTraverseMod.Node],
    scope: Scope,
    state: js.Any,
    parentPath: NodePath[typings.babelDashTraverse.babelDashTraverseMod.Node]
  ): Unit = js.native
  def traverse(
    parent: typings.babelDashTraverse.babelDashTraverseMod.Node,
    opts: TraverseOptions[typings.babelDashTraverse.babelDashTraverseMod.Node]
  ): Unit = js.native
  def traverse(
    parent: typings.babelDashTraverse.babelDashTraverseMod.Node,
    opts: TraverseOptions[typings.babelDashTraverse.babelDashTraverseMod.Node],
    scope: Scope
  ): Unit = js.native
  def traverse(
    parent: typings.babelDashTraverse.babelDashTraverseMod.Node,
    opts: TraverseOptions[typings.babelDashTraverse.babelDashTraverseMod.Node],
    scope: Scope,
    state: js.Any
  ): Unit = js.native
  def traverse(
    parent: typings.babelDashTraverse.babelDashTraverseMod.Node,
    opts: TraverseOptions[typings.babelDashTraverse.babelDashTraverseMod.Node],
    scope: Scope,
    state: js.Any,
    parentPath: NodePath[typings.babelDashTraverse.babelDashTraverseMod.Node]
  ): Unit = js.native
  def traverse[S](
    parent: js.Array[typings.babelDashTraverse.babelDashTraverseMod.Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S
  ): Unit = js.native
  def traverse[S](
    parent: js.Array[typings.babelDashTraverse.babelDashTraverseMod.Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S,
    parentPath: NodePath[typings.babelDashTraverse.babelDashTraverseMod.Node]
  ): Unit = js.native
  def traverse[S](
    parent: typings.babelDashTraverse.babelDashTraverseMod.Node,
    opts: TraverseOptions[S],
    scope: Scope,
    state: S
  ): Unit = js.native
  def traverse[S](
    parent: typings.babelDashTraverse.babelDashTraverseMod.Node,
    opts: TraverseOptions[S],
    scope: Scope,
    state: S,
    parentPath: NodePath[typings.babelDashTraverse.babelDashTraverseMod.Node]
  ): Unit = js.native
}

