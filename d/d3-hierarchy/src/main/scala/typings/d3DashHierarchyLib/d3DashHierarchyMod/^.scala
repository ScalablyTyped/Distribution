package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-hierarchy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val treemapResquarify: d3DashHierarchyLib.d3DashHierarchyMod.RatioSquarifyTilingFactory = js.native
  val treemapSquarify: d3DashHierarchyLib.d3DashHierarchyMod.RatioSquarifyTilingFactory = js.native
  def cluster[Datum](): d3DashHierarchyLib.d3DashHierarchyMod.ClusterLayout[Datum] = js.native
  def hierarchy[Datum](data: Datum): d3DashHierarchyLib.d3DashHierarchyMod.HierarchyNode[Datum] = js.native
  def hierarchy[Datum](data: Datum, children: js.Function1[/* d */ Datum, js.UndefOr[js.Array[Datum] | scala.Null]]): d3DashHierarchyLib.d3DashHierarchyMod.HierarchyNode[Datum] = js.native
  def pack[Datum](): d3DashHierarchyLib.d3DashHierarchyMod.PackLayout[Datum] = js.native
  def packEnclose[Datum /* <: d3DashHierarchyLib.d3DashHierarchyMod.PackCircle */](circles: js.Array[Datum]): d3DashHierarchyLib.d3DashHierarchyMod.PackCircle = js.native
  def packSiblings[Datum /* <: d3DashHierarchyLib.d3DashHierarchyMod.PackRadius */](circles: js.Array[Datum]): js.Array[Datum with d3DashHierarchyLib.d3DashHierarchyMod.PackCircle] = js.native
  def partition[Datum](): d3DashHierarchyLib.d3DashHierarchyMod.PartitionLayout[Datum] = js.native
  def stratify[Datum](): d3DashHierarchyLib.d3DashHierarchyMod.StratifyOperator[Datum] = js.native
  def tree[Datum](): d3DashHierarchyLib.d3DashHierarchyMod.TreeLayout[Datum] = js.native
  def treemap[Datum](): d3DashHierarchyLib.d3DashHierarchyMod.TreemapLayout[Datum] = js.native
  def treemapBinary(
    node: d3DashHierarchyLib.d3DashHierarchyMod.HierarchyRectangularNode[_],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): scala.Unit = js.native
  def treemapDice(
    node: d3DashHierarchyLib.d3DashHierarchyMod.HierarchyRectangularNode[_],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): scala.Unit = js.native
  def treemapSlice(
    node: d3DashHierarchyLib.d3DashHierarchyMod.HierarchyRectangularNode[_],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): scala.Unit = js.native
  def treemapSliceDice(
    node: d3DashHierarchyLib.d3DashHierarchyMod.HierarchyRectangularNode[_],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): scala.Unit = js.native
}

