package typings.dagre.dagreMod

import typings.dagre.dagreMod.graphlibNs.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def layout(graph: Graph): Unit = js.native
  def layout(graph: Graph, layout: GraphLabel with NodeConfig with EdgeConfig): Unit = js.native
}

