package typings.babelCore.mod

import typings.babelTraverse.mod.Scope
import typings.babelTraverse.mod.TraverseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "traverse")
@js.native
object traverse extends js.Object {
  def apply(
    parent: js.Array[typings.babelTraverse.mod.Node],
    opts: TraverseOptions[typings.babelTraverse.mod.Node]
  ): Unit = js.native
  def apply(
    parent: js.Array[typings.babelTraverse.mod.Node],
    opts: TraverseOptions[typings.babelTraverse.mod.Node],
    scope: Scope
  ): Unit = js.native
  def apply(
    parent: js.Array[typings.babelTraverse.mod.Node],
    opts: TraverseOptions[typings.babelTraverse.mod.Node],
    scope: Scope,
    state: js.Any
  ): Unit = js.native
  def apply(
    parent: js.Array[typings.babelTraverse.mod.Node],
    opts: TraverseOptions[typings.babelTraverse.mod.Node],
    scope: Scope,
    state: js.Any,
    parentPath: typings.babelTraverse.mod.NodePath[typings.babelTraverse.mod.Node]
  ): Unit = js.native
  def apply(parent: typings.babelTraverse.mod.Node, opts: TraverseOptions[typings.babelTraverse.mod.Node]): Unit = js.native
  def apply(
    parent: typings.babelTraverse.mod.Node,
    opts: TraverseOptions[typings.babelTraverse.mod.Node],
    scope: Scope
  ): Unit = js.native
  def apply(
    parent: typings.babelTraverse.mod.Node,
    opts: TraverseOptions[typings.babelTraverse.mod.Node],
    scope: Scope,
    state: js.Any
  ): Unit = js.native
  def apply(
    parent: typings.babelTraverse.mod.Node,
    opts: TraverseOptions[typings.babelTraverse.mod.Node],
    scope: Scope,
    state: js.Any,
    parentPath: typings.babelTraverse.mod.NodePath[typings.babelTraverse.mod.Node]
  ): Unit = js.native
  def apply[S](
    parent: js.Array[typings.babelTraverse.mod.Node],
    opts: TraverseOptions[S],
    scope: js.UndefOr[Scope],
    state: S
  ): Unit = js.native
  def apply[S](
    parent: js.Array[typings.babelTraverse.mod.Node],
    opts: TraverseOptions[S],
    scope: js.UndefOr[Scope],
    state: S,
    parentPath: typings.babelTraverse.mod.NodePath[typings.babelTraverse.mod.Node]
  ): Unit = js.native
  def apply[S](
    parent: typings.babelTraverse.mod.Node,
    opts: TraverseOptions[S],
    scope: js.UndefOr[Scope],
    state: S
  ): Unit = js.native
  def apply[S](
    parent: typings.babelTraverse.mod.Node,
    opts: TraverseOptions[S],
    scope: js.UndefOr[Scope],
    state: S,
    parentPath: typings.babelTraverse.mod.NodePath[typings.babelTraverse.mod.Node]
  ): Unit = js.native
}

