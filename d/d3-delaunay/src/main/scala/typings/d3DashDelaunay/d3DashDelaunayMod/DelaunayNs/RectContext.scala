package typings.d3DashDelaunay.d3DashDelaunayMod.DelaunayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for the rect() method of the CanvasPathMethods API.
  */
trait RectContext extends js.Object {
  /**
    * rect() method of the CanvasPathMethods API.
    */
  def rect(x: Double, y: Double, width: Double, height: Double): Unit
}

object RectContext {
  @scala.inline
  def apply(rect: (Double, Double, Double, Double) => Unit): RectContext = {
    val __obj = js.Dynamic.literal(rect = js.Any.fromFunction4(rect))
  
    __obj.asInstanceOf[RectContext]
  }
}

