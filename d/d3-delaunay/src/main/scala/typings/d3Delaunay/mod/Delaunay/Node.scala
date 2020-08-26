package typings.d3Delaunay.mod.Delaunay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A point node on a convex hull (represented as a circular linked list).
  */
@js.native
trait Node extends js.Object {
  /**
    * The index of the associated point.
    */
  var i: Double = js.native
  /**
    * The next node on the hull.
    */
  var next: Node = js.native
  /**
    * The previous node on the hull.
    */
  var prev: Node = js.native
  /**
    * Whether the node has been removed from the linked list.
    */
  var removed: Boolean = js.native
  /**
    * The index of the (incoming or outgoing?) associated halfedge.
    */
  var t: Double = js.native
  /**
    * The x-coordinate of the associated point.
    */
  var x: Double = js.native
  /**
    * The y-coordinate of the associated point.
    */
  var y: Double = js.native
}

object Node {
  @scala.inline
  def apply(i: Double, next: Node, prev: Node, removed: Boolean, t: Double, x: Double, y: Double): Node = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
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
    def setI(value: Double): Self = this.set("i", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: Node): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrev(value: Node): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoved(value: Boolean): Self = this.set("removed", value.asInstanceOf[js.Any])
    @scala.inline
    def setT(value: Double): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

