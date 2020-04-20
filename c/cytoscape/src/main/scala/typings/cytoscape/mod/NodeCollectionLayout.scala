package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeCollectionLayout extends js.Object {
  /**
    * Position the nodes for a discrete/synchronous layout.
    * http://js.cytoscape.org/#nodes.layoutPositions
    * @param layout The layout.
    * @param options The layout options object.
    */
  def layoutPositions(layout: String, options: LayoutPositionOptions, handler: ElementPositionFunction): Unit
}

object NodeCollectionLayout {
  @scala.inline
  def apply(layoutPositions: (String, LayoutPositionOptions, ElementPositionFunction) => Unit): NodeCollectionLayout = {
    val __obj = js.Dynamic.literal(layoutPositions = js.Any.fromFunction3(layoutPositions))
    __obj.asInstanceOf[NodeCollectionLayout]
  }
}

