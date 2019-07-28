package typings.dagreDashD3.dagreDashD3Mod

import typings.dagre.dagreMod.EdgeConfig
import typings.dagre.dagreMod.GraphLabel
import typings.dagre.dagreMod.NodeConfig
import typings.dagre.dagreMod.graphlibNs.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-d3", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def layout(graph: Graph): Unit = js.native
  def layout(graph: Graph, layout: GraphLabel with NodeConfig with EdgeConfig): Unit = js.native
}

