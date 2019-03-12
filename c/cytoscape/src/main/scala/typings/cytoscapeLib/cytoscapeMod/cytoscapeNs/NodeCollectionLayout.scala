package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

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
  def layoutPositions(layout: java.lang.String, options: LayoutPositionOptions, handler: ElementPositionFunction): scala.Unit
}

object NodeCollectionLayout {
  @scala.inline
  def apply(layoutPositions: (java.lang.String, LayoutPositionOptions, ElementPositionFunction) => scala.Unit): NodeCollectionLayout = {
    val __obj = js.Dynamic.literal(layoutPositions = js.Any.fromFunction3(layoutPositions))
  
    __obj.asInstanceOf[NodeCollectionLayout]
  }
}

