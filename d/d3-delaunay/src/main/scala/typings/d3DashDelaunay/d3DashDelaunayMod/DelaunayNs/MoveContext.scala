package typings.d3DashDelaunay.d3DashDelaunayMod.DelaunayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for the moveTo() method of the CanvasPathMethods API.
  */
trait MoveContext extends js.Object {
  /**
    * moveTo() method of the CanvasPathMethods API.
    */
  def moveTo(x: Double, y: Double): Unit
}

object MoveContext {
  @scala.inline
  def apply(moveTo: (Double, Double) => Unit): MoveContext = {
    val __obj = js.Dynamic.literal(moveTo = js.Any.fromFunction2(moveTo))
  
    __obj.asInstanceOf[MoveContext]
  }
}

