package typings
package d3DashSankeyLib.d3DashSankeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-sankey", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def sankey(): SankeyLayout[SankeyGraph[js.Object, js.Object], js.Object, js.Object] = js.native
  def sankeyCenter(node: SankeyNode[js.Object, js.Object], n: scala.Double): scala.Double = js.native
  def sankeyJustify(node: SankeyNode[js.Object, js.Object], n: scala.Double): scala.Double = js.native
  def sankeyLeft(node: SankeyNode[js.Object, js.Object], n: scala.Double): scala.Double = js.native
  def sankeyLinkHorizontal(): d3DashShapeLib.d3DashShapeMod.Link[_, SankeyLink[js.Object, js.Object], js.Tuple2[scala.Double, scala.Double]] = js.native
  @JSName("sankeyLinkHorizontal")
  def sankeyLinkHorizontal_NSankeyExtraPropertiesLSankeyExtraProperties[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](): d3DashShapeLib.d3DashShapeMod.Link[_, SankeyLink[N, L], js.Tuple2[scala.Double, scala.Double]] = js.native
  def sankeyRight(node: SankeyNode[js.Object, js.Object], n: scala.Double): scala.Double = js.native
  @JSName("sankey")
  def sankey_DataNSankeyExtraPropertiesLSankeyExtraProperties[Data, N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](): SankeyLayout[Data, N, L] = js.native
  @JSName("sankey")
  def sankey_NSankeyExtraPropertiesLSankeyExtraProperties[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](): SankeyLayout[SankeyGraph[N, L], N, L] = js.native
}

