package typings
package delaunatorLib.delaunatorMod.DelaunatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var i: scala.Double
  var next: Node | scala.Null
  var prev: Node | scala.Null
  var removed: scala.Boolean
  var t: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Node {
  @scala.inline
  def apply(
    i: scala.Double,
    removed: scala.Boolean,
    t: scala.Double,
    x: scala.Double,
    y: scala.Double,
    next: Node = null,
    prev: Node = null
  ): Node = {
    val __obj = js.Dynamic.literal(i = i, removed = removed, t = t, x = x, y = y)
    if (next != null) __obj.updateDynamic("next")(next)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Node]
  }
}

