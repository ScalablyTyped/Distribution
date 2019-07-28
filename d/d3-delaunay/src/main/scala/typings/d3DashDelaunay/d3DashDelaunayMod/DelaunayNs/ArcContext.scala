package typings.d3DashDelaunay.d3DashDelaunayMod.DelaunayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for the arc() method of the CanvasPathMethods API.
  */
@js.native
trait ArcContext extends js.Object {
  /**
    * arc() method of the CanvasPathMethods API.
    */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
  def arc(
    x: Double,
    y: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    counterclockwise: Boolean
  ): Unit = js.native
}

