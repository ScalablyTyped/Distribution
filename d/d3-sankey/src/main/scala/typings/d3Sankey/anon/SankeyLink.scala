package typings.d3Sankey.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined d3-sankey.d3-sankey.SankeyLink<{}, {}> */
@js.native
trait SankeyLink extends js.Object {
  /**
    * Link's zero-based index within the array of links calculated by Sankey layout generator.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Link's source node. For convenience, when initializing a Sankey layout using the default node id accessor,
    * source may be the zero-based index of the corresponding node in the nodes array
    * returned by the nodes accessor of the Sankey layout generator rather than object references. Alternatively,
    * the Sankey layout can be configured with a custom node ID accessor to resolve the source node of the link upon initialization.
    *
    * Once the Sankey generator is invoked to return the Sankey graph object,
    * the numeric index will be replaced with the corresponding source node object.
    */
  var source: Double | String | (typings.d3Sankey.mod.SankeyNode[js.Object, js.Object]) = js.native
  /**
    * Link's target node. For convenience, when initializing a Sankey layout using the default node id accessor,
    * target may be the zero-based index of the corresponding node in the nodes array
    * returned by the nodes accessor of the Sankey layout generator rather than object references. Alternatively,
    * the Sankey layout can be configured with a custom node ID accessor to resolve the target node of the link upon initialization.
    *
    * Once the Sankey generator is invoked to return the Sankey graph object,
    * the numeric index will be replaced with the corresponding target node object.
    */
  var target: Double | String | (typings.d3Sankey.mod.SankeyNode[js.Object, js.Object]) = js.native
  /**
    * Link's numeric value
    */
  var value: Double = js.native
  /**
    * Link's width (proportional to its value) calculated by Sankey layout generator.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Link's vertical starting position (at source node) calculated by Sankey layout generator.
    */
  var y0: js.UndefOr[Double] = js.native
  /**
    * Link's vertical end position (at target node) calculated by Sankey layout generator.
    */
  var y1: js.UndefOr[Double] = js.native
}

object SankeyLink {
  @scala.inline
  def apply(
    source: Double | String | (typings.d3Sankey.mod.SankeyNode[js.Object, js.Object]),
    target: Double | String | (typings.d3Sankey.mod.SankeyNode[js.Object, js.Object]),
    value: Double
  ): SankeyLink = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyLink]
  }
  @scala.inline
  implicit class SankeyLinkOps[Self <: SankeyLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSource(value: Double | String | (typings.d3Sankey.mod.SankeyNode[js.Object, js.Object])): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Double | String | (typings.d3Sankey.mod.SankeyNode[js.Object, js.Object])): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setY0(value: Double): Self = this.set("y0", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY0: Self = this.set("y0", js.undefined)
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
  }
  
}

