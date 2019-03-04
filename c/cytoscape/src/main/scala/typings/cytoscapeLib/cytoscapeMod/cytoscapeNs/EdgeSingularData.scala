package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/data
  */
trait EdgeSingularData extends js.Object {
  /**
    * Get whether the edge is a loop (i.e. source same as target).
    * http://js.cytoscape.org/#edge.isLoop
    */
  def isLoop(): scala.Boolean
  /**
    * Get whether the edge is simple (i.e. source different than target).
    * http://js.cytoscape.org/#edge.isSimple
    */
  def isSimple(): scala.Boolean
}

object EdgeSingularData {
  @scala.inline
  def apply(isLoop: js.Function0[scala.Boolean], isSimple: js.Function0[scala.Boolean]): EdgeSingularData = {
    val __obj = js.Dynamic.literal(isLoop = isLoop, isSimple = isSimple)
  
    __obj.asInstanceOf[EdgeSingularData]
  }
}

