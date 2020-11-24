package typings.dagre.mod

import typings.dagre.mod.graphlib.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dagre", "layout")
@js.native
object layout extends js.Object {
  
  def apply(graph: Graph[js.Object]): Unit = js.native
  def apply(graph: Graph[js.Object], layout: GraphLabel with NodeConfig with EdgeConfig): Unit = js.native
}
