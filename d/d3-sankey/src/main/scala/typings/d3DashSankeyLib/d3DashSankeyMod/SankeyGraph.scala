package typings
package d3DashSankeyLib.d3DashSankeyMod

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

