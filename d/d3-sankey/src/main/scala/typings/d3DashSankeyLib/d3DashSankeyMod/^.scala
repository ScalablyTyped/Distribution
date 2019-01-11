package typings
package d3DashSankeyLib.d3DashSankeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-sankey", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def sankey(): d3DashSankeyLib.d3DashSankeyMod.SankeyLayout[
    d3DashSankeyLib.d3DashSankeyMod.SankeyGraph[js.Object, js.Object], 
    js.Object, 
    js.Object
  ] = js.native
  def sankeyCenter(node: d3DashSankeyLib.d3DashSankeyMod.SankeyNode[js.Object, js.Object], n: scala.Double): scala.Double = js.native
  def sankeyJustify(node: d3DashSankeyLib.d3DashSankeyMod.SankeyNode[js.Object, js.Object], n: scala.Double): scala.Double = js.native
  def sankeyLeft(node: d3DashSankeyLib.d3DashSankeyMod.SankeyNode[js.Object, js.Object], n: scala.Double): scala.Double = js.native
  def sankeyLinkHorizontal(): d3DashShapeLib.d3DashShapeMod.Link[
    _, 
    d3DashSankeyLib.d3DashSankeyMod.SankeyLink[js.Object, js.Object], 
    js.Tuple2[scala.Double, scala.Double]
  ] = js.native
  @JSName("sankeyLinkHorizontal")
  def sankeyLinkHorizontal_NSankeyExtraPropertiesLSankeyExtraProperties[N /* <: d3DashSankeyLib.d3DashSankeyMod.SankeyExtraProperties */, L /* <: d3DashSankeyLib.d3DashSankeyMod.SankeyExtraProperties */](): d3DashShapeLib.d3DashShapeMod.Link[
    _, 
    d3DashSankeyLib.d3DashSankeyMod.SankeyLink[N, L], 
    js.Tuple2[scala.Double, scala.Double]
  ] = js.native
  def sankeyRight(node: d3DashSankeyLib.d3DashSankeyMod.SankeyNode[js.Object, js.Object], n: scala.Double): scala.Double = js.native
  @JSName("sankey")
  def sankey_DataNSankeyExtraPropertiesLSankeyExtraProperties[Data, N /* <: d3DashSankeyLib.d3DashSankeyMod.SankeyExtraProperties */, L /* <: d3DashSankeyLib.d3DashSankeyMod.SankeyExtraProperties */](): d3DashSankeyLib.d3DashSankeyMod.SankeyLayout[Data, N, L] = js.native
  @JSName("sankey")
  def sankey_NSankeyExtraPropertiesLSankeyExtraProperties[N /* <: d3DashSankeyLib.d3DashSankeyMod.SankeyExtraProperties */, L /* <: d3DashSankeyLib.d3DashSankeyMod.SankeyExtraProperties */](): d3DashSankeyLib.d3DashSankeyMod.SankeyLayout[d3DashSankeyLib.d3DashSankeyMod.SankeyGraph[N, L], N, L] = js.native
}

