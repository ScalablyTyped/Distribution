package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeCollectionLayout extends js.Object {
  /**
    * Position the nodes for a discrete/synchronous layout.
    * http://js.cytoscape.org/#nodes.layoutPositions
    * @param layout The layout.
    * @param options The layout options object.
    */
  def layoutPositions(layout: String, options: LayoutPositionOptions, handler: ElementPositionFunction): Unit = js.native
}

object NodeCollectionLayout {
  @scala.inline
  def apply(layoutPositions: (String, LayoutPositionOptions, ElementPositionFunction) => Unit): NodeCollectionLayout = {
    val __obj = js.Dynamic.literal(layoutPositions = js.Any.fromFunction3(layoutPositions))
    __obj.asInstanceOf[NodeCollectionLayout]
  }
  @scala.inline
  implicit class NodeCollectionLayoutOps[Self <: NodeCollectionLayout] (val x: Self) extends AnyVal {
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
    def setLayoutPositions(value: (String, LayoutPositionOptions, ElementPositionFunction) => Unit): Self = this.set("layoutPositions", js.Any.fromFunction3(value))
  }
  
}

