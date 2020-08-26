package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/data
  */
@js.native
trait EdgeSingularData extends js.Object {
  /**
    * Get whether the edge is a loop (i.e. source same as target).
    * http://js.cytoscape.org/#edge.isLoop
    */
  def isLoop(): Boolean = js.native
  /**
    * Get whether the edge is simple (i.e. source different than target).
    * http://js.cytoscape.org/#edge.isSimple
    */
  def isSimple(): Boolean = js.native
}

object EdgeSingularData {
  @scala.inline
  def apply(isLoop: () => Boolean, isSimple: () => Boolean): EdgeSingularData = {
    val __obj = js.Dynamic.literal(isLoop = js.Any.fromFunction0(isLoop), isSimple = js.Any.fromFunction0(isSimple))
    __obj.asInstanceOf[EdgeSingularData]
  }
  @scala.inline
  implicit class EdgeSingularDataOps[Self <: EdgeSingularData] (val x: Self) extends AnyVal {
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
    def setIsLoop(value: () => Boolean): Self = this.set("isLoop", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSimple(value: () => Boolean): Self = this.set("isSimple", js.Any.fromFunction0(value))
  }
  
}

