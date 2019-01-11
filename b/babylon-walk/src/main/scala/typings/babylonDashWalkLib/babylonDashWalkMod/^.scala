package typings
package babylonDashWalkLib.babylonDashWalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylon-walk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ancestor(
    node: babylonDashWalkLib.babylonDashWalkMod.NodeTypes,
    visitors: babylonDashWalkLib.babylonDashWalkMod.visitors[babylonDashWalkLib.babylonDashWalkMod.AncestorVisitor],
    state: js.Any
  ): scala.Unit = js.native
  def recursive(
    node: babylonDashWalkLib.babylonDashWalkMod.NodeTypes,
    visitors: babylonDashWalkLib.babylonDashWalkMod.visitors[babylonDashWalkLib.babylonDashWalkMod.RecursiveVisitor],
    state: js.Any
  ): scala.Unit = js.native
  def simple(
    node: babylonDashWalkLib.babylonDashWalkMod.NodeTypes,
    visitors: babylonDashWalkLib.babylonDashWalkMod.visitors[babylonDashWalkLib.babylonDashWalkMod.SimpleVisitor],
    state: js.Any
  ): scala.Unit = js.native
}

