package typings
package d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs

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
  var i: scala.Double
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
  var removed: scala.Boolean
  /**
    * The index of the (incoming or outgoing?) associated halfedge.
    */
  var t: scala.Double
  /**
    * The x-coordinate of the associated point.
    */
  var x: scala.Double
  /**
    * The y-coordinate of the associated point.
    */
  var y: scala.Double
}

object Node {
  @scala.inline
  def apply(
    i: scala.Double,
    next: Node,
    prev: Node,
    removed: scala.Boolean,
    t: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("i")(i)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("prev")(prev)
    __obj.updateDynamic("removed")(removed)
    __obj.updateDynamic("t")(t)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Node]
  }
}

