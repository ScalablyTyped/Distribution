package typings.d3DashSankey.d3DashSankeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyGraph[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] extends js.Object {
  /**
    * Array of Sankey diagram links
    */
  var links: js.Array[SankeyLink[N, L]]
  /**
    * Array of Sankey diagram nodes
    */
  var nodes: js.Array[SankeyNode[N, L]]
}

object SankeyGraph {
  @scala.inline
  def apply[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](links: js.Array[SankeyLink[N, L]], nodes: js.Array[SankeyNode[N, L]]): SankeyGraph[N, L] = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SankeyGraph[N, L]]
  }
}

