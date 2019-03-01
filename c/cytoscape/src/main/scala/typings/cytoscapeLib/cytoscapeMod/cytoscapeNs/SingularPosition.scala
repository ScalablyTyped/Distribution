package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/position--dimensions
  */
trait SingularPosition extends js.Object {
  /**
    * Gets whether the element is active (e.g. on user tap, grab, etc).
    * http://js.cytoscape.org/#ele.active
    */
  def active(): scala.Boolean
  /**
    * Get the height of the element.
    */
  def height(): scala.Double
  /**
    * Get the outer height of the element (includes height, padding, & border).
    */
  def outerHeight(): scala.Double
  /**
    * Get the outer width of the element (includes width, padding, & border).
    */
  def outerWidth(): scala.Double
  /**
    * Get the height of the element in rendered dimensions.
    */
  def renderedHeight(): scala.Double
  /**
    * Get the outer height of the element (includes height, padding, & border) in rendered dimensions.
    */
  def renderedOuterHeight(): scala.Double
  /**
    * Get the outer width of the element (includes width, padding, & border) in rendered dimensions.
    */
  def renderedOuterWidth(): scala.Double
  /**
    * Get the width of the element in rendered dimensions.
    */
  def renderedWidth(): scala.Double
  /**
    * Get the width of the element.
    */
  def width(): scala.Double
}

object SingularPosition {
  @scala.inline
  def apply(
    active: js.Function0[scala.Boolean],
    height: js.Function0[scala.Double],
    outerHeight: js.Function0[scala.Double],
    outerWidth: js.Function0[scala.Double],
    renderedHeight: js.Function0[scala.Double],
    renderedOuterHeight: js.Function0[scala.Double],
    renderedOuterWidth: js.Function0[scala.Double],
    renderedWidth: js.Function0[scala.Double],
    width: js.Function0[scala.Double]
  ): SingularPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("outerHeight")(outerHeight)
    __obj.updateDynamic("outerWidth")(outerWidth)
    __obj.updateDynamic("renderedHeight")(renderedHeight)
    __obj.updateDynamic("renderedOuterHeight")(renderedOuterHeight)
    __obj.updateDynamic("renderedOuterWidth")(renderedOuterWidth)
    __obj.updateDynamic("renderedWidth")(renderedWidth)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SingularPosition]
  }
}

