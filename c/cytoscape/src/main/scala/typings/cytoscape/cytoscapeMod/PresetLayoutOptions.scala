package typings.cytoscape.cytoscapeMod

import typings.cytoscape.cytoscapeStrings.preset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.cytoscape.cytoscapeMod.LayoutOptions because Already inherited */ trait PresetLayoutOptions
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
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    fit: js.UndefOr[Boolean] = js.undefined,
    padding: Int | Double = null,
    pan: Int | Double = null,
    positions: NodePositionMap | NodePositionFunction = null,
    ready: /* e */ LayoutEventObject => Unit = null,
    stop: /* e */ LayoutEventObject => Unit = null,
    zoom: Int | Double = null
  ): PresetLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetLayoutOptions]
  }
}

