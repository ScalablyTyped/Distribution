package typings.cytoscape.mod

import typings.cytoscape.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeSingularLayout extends js.Object {
  /**
    * Returns the node width and height.
    * Meant for use in layout positioning to do overlap detection.
    * @param options The layout options object.
    */
  def layoutDimensions(options: LayoutDimensionOptions): X = js.native
}

object NodeSingularLayout {
  @scala.inline
  def apply(layoutDimensions: LayoutDimensionOptions => X): NodeSingularLayout = {
    val __obj = js.Dynamic.literal(layoutDimensions = js.Any.fromFunction1(layoutDimensions))
    __obj.asInstanceOf[NodeSingularLayout]
  }
  @scala.inline
  implicit class NodeSingularLayoutOps[Self <: NodeSingularLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLayoutDimensions(value: LayoutDimensionOptions => X): Self = this.set("layoutDimensions", js.Any.fromFunction1(value))
  }
  
}

