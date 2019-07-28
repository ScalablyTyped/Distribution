package typings.babylonDashWalk.babylonDashWalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylon-walk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ancestor(node: NodeTypes, visitors: visitors[AncestorVisitor], state: js.Any): Unit = js.native
  def recursive(node: NodeTypes, visitors: visitors[RecursiveVisitor], state: js.Any): Unit = js.native
  def simple(node: NodeTypes, visitors: visitors[SimpleVisitor], state: js.Any): Unit = js.native
}

