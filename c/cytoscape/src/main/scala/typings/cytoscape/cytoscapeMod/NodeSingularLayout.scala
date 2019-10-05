package typings.cytoscape.cytoscapeMod

import typings.cytoscape.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeSingularLayout extends js.Object {
  /**
    * Returns the node width and height.
    * Meant for use in layout positioning to do overlap detection.
    * @param options The layout options object.
    */
  def layoutDimensions(options: LayoutDimensionOptions): Anon_X
}

object NodeSingularLayout {
  @scala.inline
  def apply(layoutDimensions: LayoutDimensionOptions => Anon_X): NodeSingularLayout = {
    val __obj = js.Dynamic.literal(layoutDimensions = js.Any.fromFunction1(layoutDimensions))
  
    __obj.asInstanceOf[NodeSingularLayout]
  }
}

