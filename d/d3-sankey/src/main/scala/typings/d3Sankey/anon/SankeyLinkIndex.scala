package typings.d3Sankey.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined d3-sankey.d3-sankey.SankeyLink<{}, {}> */
trait SankeyLinkIndex extends js.Object {
  /**
    * Link's zero-based index within the array of links calculated by Sankey layout generator.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Link's source node. For convenience, when initializing a Sankey layout using the default node id accessor,
    * source may be the zero-based index of the corresponding node in the nodes array
    * returned by the nodes accessor of the Sankey layout generator rather than object references. Alternatively,
    * the Sankey layout can be configured with a custom node ID accessor to resolve the source node of the link upon initialization.
    *
    * Once the Sankey generator is invoked to return the Sankey graph object,
    * the numeric index will be replaced with the corresponding source node object.
    */
  var source: Double | String | SankeyNodeDepth
  /**
    * Link's target node. For convenience, when initializing a Sankey layout using the default node id accessor,
    * target may be the zero-based index of the corresponding node in the nodes array
    * returned by the nodes accessor of the Sankey layout generator rather than object references. Alternatively,
    * the Sankey layout can be configured with a custom node ID accessor to resolve the target node of the link upon initialization.
    *
    * Once the Sankey generator is invoked to return the Sankey graph object,
    * the numeric index will be replaced with the corresponding target node object.
    */
  var target: Double | String | SankeyNodeDepth
  /**
    * Link's numeric value
    */
  var value: Double
  /**
    * Link's width (proportional to its value) calculated by Sankey layout generator.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * Link's vertical starting position (at source node) calculated by Sankey layout generator.
    */
  var y0: js.UndefOr[Double] = js.undefined
  /**
    * Link's vertical end position (at target node) calculated by Sankey layout generator.
    */
  var y1: js.UndefOr[Double] = js.undefined
}

object SankeyLinkIndex {
  @scala.inline
  def apply(
    source: Double | String | SankeyNodeDepth,
    target: Double | String | SankeyNodeDepth,
    value: Double,
    index: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    y0: js.UndefOr[Double] = js.undefined,
    y1: js.UndefOr[Double] = js.undefined
  ): SankeyLinkIndex = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y0)) __obj.updateDynamic("y0")(y0.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y1)) __obj.updateDynamic("y1")(y1.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyLinkIndex]
  }
}

