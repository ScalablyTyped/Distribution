package typings.d3DashHierarchy.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackCircle extends js.Object {
  /**
    * The radius of the circle.
    */
  var r: Double
  /**
    * The x-coordinate of the circle’s center.
    */
  var x: Double
  /**
    * The y-coordinate of the circle’s center.
    */
  var y: Double
}

object PackCircle {
  @scala.inline
  def apply(r: Double, x: Double, y: Double): PackCircle = {
    val __obj = js.Dynamic.literal(r = r, x = x, y = y)
  
    __obj.asInstanceOf[PackCircle]
  }
}

