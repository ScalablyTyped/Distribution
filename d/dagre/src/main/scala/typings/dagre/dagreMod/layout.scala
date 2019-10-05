package typings.dagre.dagreMod

import typings.dagre.dagreMod.graphlib.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre", "layout")
@js.native
object layout extends js.Object {
  def apply(graph: Graph): Unit = js.native
  def apply(graph: Graph, layout: GraphLabel with NodeConfig with EdgeConfig): Unit = js.native
}

