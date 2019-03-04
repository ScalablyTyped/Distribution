package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Core
  * These properties affect UI global to the graph, and apply only to the core.
  * You can use the special core selector string to set these properties.
  * http://js.cytoscape.org/#style/core
  */
trait Core extends js.Object {
  /**
    * Indicator:
    */
  /**
    * The colour of the indicator shown when the background is grabbed by the user.
    */
  var `active-bg-color`: Colour
  /**
    * The opacity of the active background indicator.
    */
  var `active-bg-opacity`: scala.Double
  /**
    * The size of the active background indicator.
    */
  var `active-bg-size`: scala.Double
  /**
    * Texture during viewport gestures:
    */
  /**
    * The colour of the area outside the viewport texture when initOptions.textureOnViewport === true.
    */
  var `outside-texture-bg-color`: Colour
  /**
    * The opacity of the area outside the viewport texture.
    */
  var `outside-texture-bg-opacity`: scala.Double
  /**
    * The colour of the border on the selection box.
    */
  var `selection-box-border-color`: Colour
  /**
    * The size of the border on the selection box.
    */
  var `selection-box-border-width`: scala.Double
  /**
    * Selection box:
    */
  /**
    * The background colour of the selection box used for drag selection.
    */
  var `selection-box-color`: Colour
  /**
    * The opacity of the selection box.
    */
  var `selection-box-opacity`: scala.Double
}

object Core {
  @scala.inline
  def apply(
    `active-bg-color`: Colour,
    `active-bg-opacity`: scala.Double,
    `active-bg-size`: scala.Double,
    `outside-texture-bg-color`: Colour,
    `outside-texture-bg-opacity`: scala.Double,
    `selection-box-border-color`: Colour,
    `selection-box-border-width`: scala.Double,
    `selection-box-color`: Colour,
    `selection-box-opacity`: scala.Double
  ): Core = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active-bg-color")(`active-bg-color`)
    __obj.updateDynamic("active-bg-opacity")(`active-bg-opacity`)
    __obj.updateDynamic("active-bg-size")(`active-bg-size`)
    __obj.updateDynamic("outside-texture-bg-color")(`outside-texture-bg-color`)
    __obj.updateDynamic("outside-texture-bg-opacity")(`outside-texture-bg-opacity`)
    __obj.updateDynamic("selection-box-border-color")(`selection-box-border-color`)
    __obj.updateDynamic("selection-box-border-width")(`selection-box-border-width`)
    __obj.updateDynamic("selection-box-color")(`selection-box-color`)
    __obj.updateDynamic("selection-box-opacity")(`selection-box-opacity`)
    __obj.asInstanceOf[Core]
  }
}

