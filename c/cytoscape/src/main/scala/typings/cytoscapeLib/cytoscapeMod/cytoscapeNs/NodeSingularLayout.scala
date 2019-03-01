package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeSingularLayout extends js.Object {
  /**
    * Returns the node width and height.
    * Meant for use in layout positioning to do overlap detection.
    * @param options The layout options object.
    */
  def layoutDimensions(options: LayoutDimensionOptions): cytoscapeLib.Anon_X
}

object NodeSingularLayout {
  @scala.inline
  def apply(layoutDimensions: js.Function1[LayoutDimensionOptions, cytoscapeLib.Anon_X]): NodeSingularLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layoutDimensions")(layoutDimensions)
    __obj.asInstanceOf[NodeSingularLayout]
  }
}

