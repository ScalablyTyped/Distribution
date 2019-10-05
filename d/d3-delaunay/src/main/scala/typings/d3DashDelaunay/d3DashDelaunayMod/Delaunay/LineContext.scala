package typings.d3DashDelaunay.d3DashDelaunayMod.Delaunay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for the lineTo() method of the CanvasPathMethods API.
  */
trait LineContext extends js.Object {
  /**
    * lineTo() method of the CanvasPathMethods API.
    */
  def lineTo(x: Double, y: Double): Unit
}

object LineContext {
  @scala.inline
  def apply(lineTo: (Double, Double) => Unit): LineContext = {
    val __obj = js.Dynamic.literal(lineTo = js.Any.fromFunction2(lineTo))
  
    __obj.asInstanceOf[LineContext]
  }
}

