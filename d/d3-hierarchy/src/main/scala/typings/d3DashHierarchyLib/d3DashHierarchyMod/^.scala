package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-hierarchy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val treemapResquarify: RatioSquarifyTilingFactory = js.native
  val treemapSquarify: RatioSquarifyTilingFactory = js.native
  def cluster[Datum](): ClusterLayout[Datum] = js.native
  def hierarchy[Datum](data: Datum): HierarchyNode[Datum] = js.native
  def hierarchy[Datum](data: Datum, children: js.Function1[/* d */ Datum, js.UndefOr[js.Array[Datum] | scala.Null]]): HierarchyNode[Datum] = js.native
  def pack[Datum](): PackLayout[Datum] = js.native
  def packEnclose[Datum /* <: PackCircle */](circles: js.Array[Datum]): PackCircle = js.native
  def packSiblings[Datum /* <: PackRadius */](circles: js.Array[Datum]): js.Array[Datum with PackCircle] = js.native
  def partition[Datum](): PartitionLayout[Datum] = js.native
  def stratify[Datum](): StratifyOperator[Datum] = js.native
  def tree[Datum](): TreeLayout[Datum] = js.native
  def treemap[Datum](): TreemapLayout[Datum] = js.native
  def treemapBinary(
    node: HierarchyRectangularNode[_],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): scala.Unit = js.native
  def treemapDice(
    node: HierarchyRectangularNode[_],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): scala.Unit = js.native
  def treemapSlice(
    node: HierarchyRectangularNode[_],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): scala.Unit = js.native
  def treemapSliceDice(
    node: HierarchyRectangularNode[_],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): scala.Unit = js.native
}

