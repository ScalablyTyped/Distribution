package typings.cytoscape.mod

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
  def isLoop(): Boolean
  /**
    * Get whether the edge is simple (i.e. source different than target).
    * http://js.cytoscape.org/#edge.isSimple
    */
  def isSimple(): Boolean
}

object EdgeSingularData {
  @scala.inline
  def apply(isLoop: () => Boolean, isSimple: () => Boolean): EdgeSingularData = {
    val __obj = js.Dynamic.literal(isLoop = js.Any.fromFunction0(isLoop), isSimple = js.Any.fromFunction0(isSimple))
    __obj.asInstanceOf[EdgeSingularData]
  }
}

