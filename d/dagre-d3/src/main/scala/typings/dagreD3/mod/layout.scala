package typings.dagreD3.mod

import typings.dagre.mod.EdgeConfig
import typings.dagre.mod.GraphLabel
import typings.dagre.mod.NodeConfig
import typings.dagre.mod.graphlib.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-d3", "layout")
@js.native
object layout extends js.Object {
  def apply(graph: Graph[js.Object]): Unit = js.native
  def apply(graph: Graph[js.Object], layout: GraphLabel with NodeConfig with EdgeConfig): Unit = js.native
}

