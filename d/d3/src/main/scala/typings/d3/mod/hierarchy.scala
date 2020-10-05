package typings.d3.mod

import typings.d3Hierarchy.mod.HierarchyNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "hierarchy")
@js.native
object hierarchy extends js.Object {
  def apply[Datum](data: Datum): HierarchyNode[Datum] = js.native
  def apply[Datum](data: Datum, children: js.Function1[/* d */ Datum, js.UndefOr[js.Array[Datum] | Null]]): HierarchyNode[Datum] = js.native
}

