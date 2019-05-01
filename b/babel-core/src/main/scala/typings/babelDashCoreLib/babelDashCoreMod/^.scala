package typings
package babelDashCoreLib.babelDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: java.lang.String = js.native
  def template(code: java.lang.String): babelDashTemplateLib.babelDashTemplateMod.UseTemplate = js.native
  def template(code: java.lang.String, opts: babylonLib.babylonMod.BabylonOptions): babelDashTemplateLib.babelDashTemplateMod.UseTemplate = js.native
  def transform(code: java.lang.String): BabelFileResult = js.native
  def transform(code: java.lang.String, opts: TransformOptions): BabelFileResult = js.native
  def transformFile(
    filename: java.lang.String,
    opts: TransformOptions,
    callback: js.Function2[/* err */ js.Any, /* result */ BabelFileResult, scala.Unit]
  ): scala.Unit = js.native
  def transformFileSync(filename: java.lang.String): BabelFileResult = js.native
  def transformFileSync(filename: java.lang.String, opts: TransformOptions): BabelFileResult = js.native
  def transformFromAst(ast: Node): BabelFileResult = js.native
  def transformFromAst(ast: Node, code: java.lang.String): BabelFileResult = js.native
  def transformFromAst(ast: Node, code: java.lang.String, opts: TransformOptions): BabelFileResult = js.native
  def traverse(
    parent: babelDashTraverseLib.babelDashTraverseMod.Node,
    opts: babelDashTraverseLib.babelDashTraverseMod.TraverseOptions[babelDashTraverseLib.babelDashTraverseMod.Node]
  ): scala.Unit = js.native
  def traverse(
    parent: babelDashTraverseLib.babelDashTraverseMod.Node,
    opts: babelDashTraverseLib.babelDashTraverseMod.TraverseOptions[babelDashTraverseLib.babelDashTraverseMod.Node],
    scope: babelDashTraverseLib.babelDashTraverseMod.Scope
  ): scala.Unit = js.native
  def traverse(
    parent: babelDashTraverseLib.babelDashTraverseMod.Node,
    opts: babelDashTraverseLib.babelDashTraverseMod.TraverseOptions[babelDashTraverseLib.babelDashTraverseMod.Node],
    scope: babelDashTraverseLib.babelDashTraverseMod.Scope,
    state: js.Any
  ): scala.Unit = js.native
  def traverse(
    parent: babelDashTraverseLib.babelDashTraverseMod.Node,
    opts: babelDashTraverseLib.babelDashTraverseMod.TraverseOptions[babelDashTraverseLib.babelDashTraverseMod.Node],
    scope: babelDashTraverseLib.babelDashTraverseMod.Scope,
    state: js.Any,
    parentPath: babelDashTraverseLib.babelDashTraverseMod.NodePath[babelDashTraverseLib.babelDashTraverseMod.Node]
  ): scala.Unit = js.native
  def traverse(
    parent: js.Array[babelDashTraverseLib.babelDashTraverseMod.Node],
    opts: babelDashTraverseLib.babelDashTraverseMod.TraverseOptions[babelDashTraverseLib.babelDashTraverseMod.Node]
  ): scala.Unit = js.native
  def traverse(
    parent: js.Array[babelDashTraverseLib.babelDashTraverseMod.Node],
    opts: babelDashTraverseLib.babelDashTraverseMod.TraverseOptions[babelDashTraverseLib.babelDashTraverseMod.Node],
    scope: babelDashTraverseLib.babelDashTraverseMod.Scope
  ): scala.Unit = js.native
  def traverse(
    parent: js.Array[babelDashTraverseLib.babelDashTraverseMod.Node],
    opts: babelDashTraverseLib.babelDashTraverseMod.TraverseOptions[babelDashTraverseLib.babelDashTraverseMod.Node],
    scope: babelDashTraverseLib.babelDashTraverseMod.Scope,
    state: js.Any
  ): scala.Unit = js.native
  def traverse(
    parent: js.Array[babelDashTraverseLib.babelDashTraverseMod.Node],
    opts: babelDashTraverseLib.babelDashTraverseMod.TraverseOptions[babelDashTraverseLib.babelDashTraverseMod.Node],
    scope: babelDashTraverseLib.babelDashTraverseMod.Scope,
    state: js.Any,
    parentPath: babelDashTraverseLib.babelDashTraverseMod.NodePath[babelDashTraverseLib.babelDashTraverseMod.Node]
  ): scala.Unit = js.native
  def traverse[S](
    parent: babelDashTraverseLib.babelDashTraverseMod.Node,
    opts: babelDashTraverseLib.babelDashTraverseMod.TraverseOptions[S],
    scope: babelDashTraverseLib.babelDashTraverseMod.Scope,
    state: S
  ): scala.Unit = js.native
  def traverse[S](
    parent: babelDashTraverseLib.babelDashTraverseMod.Node,
    opts: babelDashTraverseLib.babelDashTraverseMod.TraverseOptions[S],
    scope: babelDashTraverseLib.babelDashTraverseMod.Scope,
    state: S,
    parentPath: babelDashTraverseLib.babelDashTraverseMod.NodePath[babelDashTraverseLib.babelDashTraverseMod.Node]
  ): scala.Unit = js.native
  def traverse[S](
    parent: js.Array[babelDashTraverseLib.babelDashTraverseMod.Node],
    opts: babelDashTraverseLib.babelDashTraverseMod.TraverseOptions[S],
    scope: babelDashTraverseLib.babelDashTraverseMod.Scope,
    state: S
  ): scala.Unit = js.native
  def traverse[S](
    parent: js.Array[babelDashTraverseLib.babelDashTraverseMod.Node],
    opts: babelDashTraverseLib.babelDashTraverseMod.TraverseOptions[S],
    scope: babelDashTraverseLib.babelDashTraverseMod.Scope,
    state: S,
    parentPath: babelDashTraverseLib.babelDashTraverseMod.NodePath[babelDashTraverseLib.babelDashTraverseMod.Node]
  ): scala.Unit = js.native
}

