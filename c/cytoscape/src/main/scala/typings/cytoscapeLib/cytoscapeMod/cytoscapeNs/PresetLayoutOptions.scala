package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- cytoscapeLib.cytoscapeMod.cytoscapeNs.LayoutOptions because Already inherited */ trait PresetLayoutOptions
  extends BaseLayoutOptions
     with AnimatedLayoutOptions {
  // whether to fit to viewport
  var fit: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("name")
  var name_PresetLayoutOptions: cytoscapeLib.cytoscapeLibStrings.preset
  // padding on fit
  var padding: js.UndefOr[scala.Double] = js.undefined
  // the pan level to set (prob want fit = false if set)
  var pan: js.UndefOr[scala.Double] = js.undefined
  // map of (node id) => (position obj); or function(node){ return somPos; }
  var positions: js.UndefOr[NodePositionMap | NodePositionFunction] = js.undefined
  // the zoom level to set (prob want fit = false if set)
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object PresetLayoutOptions {
  @scala.inline
  def apply(
    name: cytoscapeLib.cytoscapeLibStrings.preset,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: js.UndefOr[scala.Boolean] = js.undefined,
    fit: js.UndefOr[scala.Boolean] = js.undefined,
    padding: scala.Int | scala.Double = null,
    pan: scala.Int | scala.Double = null,
    positions: NodePositionMap | NodePositionFunction = null,
    ready: LayoutHandler = null,
    stop: LayoutHandler = null,
    zoom: scala.Int | scala.Double = null
  ): PresetLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing)
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetLayoutOptions]
  }
}

