package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/random
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- cytoscapeLib.cytoscapeMod.cytoscapeNs.LayoutOptions because Already inherited */ trait RandomLayoutOptions
  extends BaseLayoutOptions
     with AnimatedLayoutOptions {
  // constrain layout bounds
  var boundingBox: js.UndefOr[BoundingBox12 | BoundingBoxWH]
  // whether to fit to viewport
  var fit: scala.Boolean
  @JSName("name")
  var name_RandomLayoutOptions: cytoscapeLib.cytoscapeLibStrings.random
  // fit padding
  var padding: js.UndefOr[scala.Double] = js.undefined
}

object RandomLayoutOptions {
  @scala.inline
  def apply(
    fit: scala.Boolean,
    name: cytoscapeLib.cytoscapeLibStrings.random,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: js.UndefOr[scala.Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    padding: scala.Int | scala.Double = null,
    ready: LayoutHandler = null,
    stop: LayoutHandler = null
  ): RandomLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fit")(fit)
    __obj.updateDynamic("name")(name)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing)
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[RandomLayoutOptions]
  }
}

