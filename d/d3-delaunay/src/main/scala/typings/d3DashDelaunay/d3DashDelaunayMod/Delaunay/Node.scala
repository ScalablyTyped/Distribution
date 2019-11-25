package typings.d3DashDelaunay.d3DashDelaunayMod.Delaunay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A point node on a convex hull (represented as a circular linked list).
  */
trait Node extends js.Object {
  /**
    * The index of the associated point.
    */
  var i: Double
  /**
    * The next node on the hull.
    */
  var next: Node
  /**
    * The previous node on the hull.
    */
  var prev: Node
  /**
    * Whether the node has been removed from the linked list.
    */
  var removed: Boolean
  /**
    * The index of the (incoming or outgoing?) associated halfedge.
    */
  var t: Double
  /**
    * The x-coordinate of the associated point.
    */
  var x: Double
  /**
    * The y-coordinate of the associated point.
    */
  var y: Double
}

object Node {
  @scala.inline
  def apply(i: Double, next: Node, prev: Node, removed: Boolean, t: Double, x: Double, y: Double): Node = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Node]
  }
}

