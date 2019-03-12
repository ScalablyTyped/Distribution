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
    active: () => scala.Boolean,
    height: () => scala.Double,
    outerHeight: () => scala.Double,
    outerWidth: () => scala.Double,
    renderedHeight: () => scala.Double,
    renderedOuterHeight: () => scala.Double,
    renderedOuterWidth: () => scala.Double,
    renderedWidth: () => scala.Double,
    width: () => scala.Double
  ): SingularPosition = {
    val __obj = js.Dynamic.literal(active = js.Any.fromFunction0(active), height = js.Any.fromFunction0(height), outerHeight = js.Any.fromFunction0(outerHeight), outerWidth = js.Any.fromFunction0(outerWidth), renderedHeight = js.Any.fromFunction0(renderedHeight), renderedOuterHeight = js.Any.fromFunction0(renderedOuterHeight), renderedOuterWidth = js.Any.fromFunction0(renderedOuterWidth), renderedWidth = js.Any.fromFunction0(renderedWidth), width = js.Any.fromFunction0(width))
  
    __obj.asInstanceOf[SingularPosition]
  }
}

