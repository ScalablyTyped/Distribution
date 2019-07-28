package typings.d3DashSankey.d3DashSankeyMod

import typings.d3DashShape.d3DashShapeMod.Link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-sankey", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def sankey(): SankeyLayout[SankeyGraph[js.Object, js.Object], js.Object, js.Object] = js.native
  def sankeyCenter(node: SankeyNode[js.Object, js.Object], n: Double): Double = js.native
  def sankeyJustify(node: SankeyNode[js.Object, js.Object], n: Double): Double = js.native
  def sankeyLeft(node: SankeyNode[js.Object, js.Object], n: Double): Double = js.native
  def sankeyLinkHorizontal(): Link[_, SankeyLink[js.Object, js.Object], js.Tuple2[Double, Double]] = js.native
  @JSName("sankeyLinkHorizontal")
  def sankeyLinkHorizontal_N_SankeyExtraPropertiesL_SankeyExtraProperties[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](): Link[_, SankeyLink[N, L], js.Tuple2[Double, Double]] = js.native
  def sankeyRight(node: SankeyNode[js.Object, js.Object], n: Double): Double = js.native
  @JSName("sankey")
  def sankey_DataN_SankeyExtraPropertiesL_SankeyExtraProperties[Data, N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](): SankeyLayout[Data, N, L] = js.native
  @JSName("sankey")
  def sankey_N_SankeyExtraPropertiesL_SankeyExtraProperties[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](): SankeyLayout[SankeyGraph[N, L], N, L] = js.native
}

