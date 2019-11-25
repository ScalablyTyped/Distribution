package typings.d3DashSankey.d3DashSankeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyNodeMinimal[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] extends js.Object {
  /**
    * Node’s zero-based graph depth, derived from the graph topology calculated by Sankey layout generator.
    */
  var depth: js.UndefOr[Double] = js.undefined
  /**
    * Node’s zero-based graph height, derived from the graph topology calculated by Sankey layout generator.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Node’s zero-based index within the array of nodes calculated by Sankey layout generator.
    */
  var index: js.UndefOr[Double] = js.undefined
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
  var value: js.UndefOr[Double] = js.undefined
  /**
    * Node's minimum horizontal position (derived from the node.depth) calculated by Sankey layout generator.
    */
  var x0: js.UndefOr[Double] = js.undefined
  /**
    * Node’s maximum horizontal position (node.x0 + sankey.nodeWidth) calculated by Sankey layout generator.
    */
  var x1: js.UndefOr[Double] = js.undefined
  /**
    * Node's minimum vertical position calculated by Sankey layout generator.
    */
  var y0: js.UndefOr[Double] = js.undefined
  /**
    * Node's maximum vertical position (node.y1 - node.y0 is proportional to node.value) calculated by Sankey layout generator.
    */
  var y1: js.UndefOr[Double] = js.undefined
}

object SankeyNodeMinimal {
  @scala.inline
  def apply[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](
    depth: Int | Double = null,
    height: Int | Double = null,
    index: Int | Double = null,
    sourceLinks: js.Array[SankeyLink[N, L]] = null,
    targetLinks: js.Array[SankeyLink[N, L]] = null,
    value: Int | Double = null,
    x0: Int | Double = null,
    x1: Int | Double = null,
    y0: Int | Double = null,
    y1: Int | Double = null
  ): SankeyNodeMinimal[N, L] = {
    val __obj = js.Dynamic.literal()
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (sourceLinks != null) __obj.updateDynamic("sourceLinks")(sourceLinks.asInstanceOf[js.Any])
    if (targetLinks != null) __obj.updateDynamic("targetLinks")(targetLinks.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (x0 != null) __obj.updateDynamic("x0")(x0.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyNodeMinimal[N, L]]
  }
}

