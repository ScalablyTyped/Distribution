package typings.clownface

import typings.rdfDashJs.rdfDashJsMod.Quad_Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Graph extends js.Object {
  var graph: Quad_Graph
}

object Anon_Graph {
  @scala.inline
  def apply(graph: Quad_Graph): Anon_Graph = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Graph]
  }
}

