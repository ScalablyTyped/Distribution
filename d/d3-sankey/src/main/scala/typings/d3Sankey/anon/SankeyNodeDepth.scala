package typings.d3Sankey.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined d3-sankey.d3-sankey.SankeyNode<{}, {}> */
trait SankeyNodeDepth extends js.Object {
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
  var sourceLinks: js.UndefOr[js.Array[typings.d3Sankey.mod.SankeyLink[js.Object, js.Object]]] = js.undefined
  /**
    * Array of incoming links which have this node as their target.
    * This property is calculated internally by the Sankey layout generator.
    */
  var targetLinks: js.UndefOr[js.Array[typings.d3Sankey.mod.SankeyLink[js.Object, js.Object]]] = js.undefined
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

object SankeyNodeDepth {
  @scala.inline
  def apply(
    depth: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    sourceLinks: js.Array[typings.d3Sankey.mod.SankeyLink[js.Object, js.Object]] = null,
    targetLinks: js.Array[typings.d3Sankey.mod.SankeyLink[js.Object, js.Object]] = null,
    value: js.UndefOr[Double] = js.undefined,
    x0: js.UndefOr[Double] = js.undefined,
    x1: js.UndefOr[Double] = js.undefined,
    y0: js.UndefOr[Double] = js.undefined,
    y1: js.UndefOr[Double] = js.undefined
  ): SankeyNodeDepth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (sourceLinks != null) __obj.updateDynamic("sourceLinks")(sourceLinks.asInstanceOf[js.Any])
    if (targetLinks != null) __obj.updateDynamic("targetLinks")(targetLinks.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x0)) __obj.updateDynamic("x0")(x0.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x1)) __obj.updateDynamic("x1")(x1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y0)) __obj.updateDynamic("y0")(y0.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y1)) __obj.updateDynamic("y1")(y1.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyNodeDepth]
  }
}

