package typings
package d3DashSankeyLib.d3DashSankeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyNodeMinimal[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] extends js.Object {
  /**
    * Node’s zero-based graph depth, derived from the graph topology calculated by Sankey layout generator.
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Node’s zero-based graph height, derived from the graph topology calculated by Sankey layout generator.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Node’s zero-based index within the array of nodes calculated by Sankey layout generator.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * Array of outgoing links which have this node as their source.
    * This property is calculated internally by the Sankey layout generator.
    */
  var sourceLinks: js.UndefOr[js.Array[SankeyLink[N, L]]] = js.undefined
  /**
    * Array of incoming links which have this node as their target.
    * This property is calculated internally by the Sankey layout generator.
    */
  var targetLinks: js.UndefOr[js.Array[SankeyLink[N, L]]] = js.undefined
  /**
    * Node's value calculated by Sankey layout Generator;
    * the sum of link.value for the node’s incoming links.
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /**
    * Node's minimum horizontal position (derived from the node.depth) calculated by Sankey layout generator.
    */
  var x0: js.UndefOr[scala.Double] = js.undefined
  /**
    * Node’s maximum horizontal position (node.x0 + sankey.nodeWidth) calculated by Sankey layout generator.
    */
  var x1: js.UndefOr[scala.Double] = js.undefined
  /**
    * Node's minimum vertical position calculated by Sankey layout generator.
    */
  var y0: js.UndefOr[scala.Double] = js.undefined
  /**
    * Node's maximum vertical position (node.y1 - node.y0 is proportional to node.value) calculated by Sankey layout generator.
    */
  var y1: js.UndefOr[scala.Double] = js.undefined
}

