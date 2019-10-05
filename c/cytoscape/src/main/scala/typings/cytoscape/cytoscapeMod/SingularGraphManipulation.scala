package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/graph-manipulation
  */
trait SingularGraphManipulation extends js.Object {
  /**
    * Get the core instance that owns the element.
    */
  def cy(): Core
  /**
    * Get whether the element is inside the graph (i.e. not removed).
    * http://js.cytoscape.org/#ele.inside
    */
  def inside(): Boolean
  /**
    * Get whether the element has been removed from the graph.
    * http://js.cytoscape.org/#ele.removed
    */
  def removed(): Boolean
}

object SingularGraphManipulation {
  @scala.inline
  def apply(cy: () => Core, inside: () => Boolean, removed: () => Boolean): SingularGraphManipulation = {
    val __obj = js.Dynamic.literal(cy = js.Any.fromFunction0(cy), inside = js.Any.fromFunction0(inside), removed = js.Any.fromFunction0(removed))
  
    __obj.asInstanceOf[SingularGraphManipulation]
  }
}

