package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/graph-manipulation
  */
@js.native
trait SingularGraphManipulation extends js.Object {
  /**
    * Get the core instance that owns the element.
    */
  def cy(): Core = js.native
  /**
    * Get whether the element is inside the graph (i.e. not removed).
    * http://js.cytoscape.org/#ele.inside
    */
  def inside(): Boolean = js.native
  /**
    * Get whether the element has been removed from the graph.
    * http://js.cytoscape.org/#ele.removed
    */
  def removed(): Boolean = js.native
}

object SingularGraphManipulation {
  @scala.inline
  def apply(cy: () => Core, inside: () => Boolean, removed: () => Boolean): SingularGraphManipulation = {
    val __obj = js.Dynamic.literal(cy = js.Any.fromFunction0(cy), inside = js.Any.fromFunction0(inside), removed = js.Any.fromFunction0(removed))
    __obj.asInstanceOf[SingularGraphManipulation]
  }
  @scala.inline
  implicit class SingularGraphManipulationOps[Self <: SingularGraphManipulation] (val x: Self) extends AnyVal {
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
    def setCy(value: () => Core): Self = this.set("cy", js.Any.fromFunction0(value))
    @scala.inline
    def setInside(value: () => Boolean): Self = this.set("inside", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoved(value: () => Boolean): Self = this.set("removed", js.Any.fromFunction0(value))
  }
  
}

