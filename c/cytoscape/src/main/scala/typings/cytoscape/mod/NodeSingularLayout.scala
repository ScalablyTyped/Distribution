package typings.cytoscape.mod

import typings.cytoscape.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeSingularLayout extends js.Object {
  /**
    * Returns the node width and height.
    * Meant for use in layout positioning to do overlap detection.
    * @param options The layout options object.
    */
  def layoutDimensions(options: LayoutDimensionOptions): AnonX
}

object NodeSingularLayout {
  @scala.inline
  def apply(layoutDimensions: LayoutDimensionOptions => AnonX): NodeSingularLayout = {
    val __obj = js.Dynamic.literal(layoutDimensions = js.Any.fromFunction1(layoutDimensions))
    __obj.asInstanceOf[NodeSingularLayout]
  }
}

