package typings.cytoscape.mod.Css

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
  var `active-bg-color`: PropertyValueCore[Colour]
  /**
    * The opacity of the active background indicator.
    */
  var `active-bg-opacity`: PropertyValueCore[Double]
  /**
    * The size of the active background indicator.
    */
  var `active-bg-size`: PropertyValueCore[Double]
  /**
    * Texture during viewport gestures:
    */
  /**
    * The colour of the area outside the viewport texture when initOptions.textureOnViewport === true.
    */
  var `outside-texture-bg-color`: PropertyValueCore[Colour]
  /**
    * The opacity of the area outside the viewport texture.
    */
  var `outside-texture-bg-opacity`: PropertyValueCore[Double]
  /**
    * The colour of the border on the selection box.
    */
  var `selection-box-border-color`: PropertyValueCore[Colour]
  /**
    * The size of the border on the selection box.
    */
  var `selection-box-border-width`: PropertyValueCore[Double]
  /**
    * Selection box:
    */
  /**
    * The background colour of the selection box used for drag selection.
    */
  var `selection-box-color`: PropertyValueCore[Colour]
  /**
    * The opacity of the selection box.
    */
  var `selection-box-opacity`: PropertyValueCore[Double]
}

object Core {
  @scala.inline
  def apply(
    `active-bg-color`: PropertyValueCore[Colour],
    `active-bg-opacity`: PropertyValueCore[Double],
    `active-bg-size`: PropertyValueCore[Double],
    `outside-texture-bg-color`: PropertyValueCore[Colour],
    `outside-texture-bg-opacity`: PropertyValueCore[Double],
    `selection-box-border-color`: PropertyValueCore[Colour],
    `selection-box-border-width`: PropertyValueCore[Double],
    `selection-box-color`: PropertyValueCore[Colour],
    `selection-box-opacity`: PropertyValueCore[Double]
  ): Core = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active-bg-color")(`active-bg-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("active-bg-opacity")(`active-bg-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("active-bg-size")(`active-bg-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("outside-texture-bg-color")(`outside-texture-bg-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("outside-texture-bg-opacity")(`outside-texture-bg-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-box-border-color")(`selection-box-border-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-box-border-width")(`selection-box-border-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-box-color")(`selection-box-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-box-opacity")(`selection-box-opacity`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Core]
  }
}

