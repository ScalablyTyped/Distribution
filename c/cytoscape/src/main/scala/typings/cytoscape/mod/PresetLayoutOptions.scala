package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.preset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ trait PresetLayoutOptions
  extends BaseLayoutOptions
     with AnimatedLayoutOptions {
  // whether to fit to viewport
  var fit: js.UndefOr[Boolean] = js.undefined
  @JSName("name")
  var name_PresetLayoutOptions: preset
  // padding on fit
  var padding: js.UndefOr[Double] = js.undefined
  // the pan level to set (prob want fit = false if set)
  var pan: js.UndefOr[Double] = js.undefined
  // map of (node id) => (position obj); or function(node){ return somPos; }
  var positions: js.UndefOr[NodePositionMap | NodePositionFunction] = js.undefined
  // the zoom level to set (prob want fit = false if set)
  var zoom: js.UndefOr[Double] = js.undefined
}

object PresetLayoutOptions {
  @scala.inline
  def apply(
    name: preset,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    fit: js.UndefOr[Boolean] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    pan: js.UndefOr[Double] = js.undefined,
    positions: NodePositionMap | NodePositionFunction = null,
    ready: /* e */ LayoutEventObject => Unit = null,
    stop: /* e */ LayoutEventObject => Unit = null,
    zoom: js.UndefOr[Double] = js.undefined
  ): PresetLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pan)) __obj.updateDynamic("pan")(pan.get.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetLayoutOptions]
  }
}

