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

