package typings.clownface

import typings.rdfJs.mod.QuadGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGraph extends js.Object {
  var graph: QuadGraph
}

object AnonGraph {
  @scala.inline
  def apply(graph: QuadGraph): AnonGraph = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGraph]
  }
}

