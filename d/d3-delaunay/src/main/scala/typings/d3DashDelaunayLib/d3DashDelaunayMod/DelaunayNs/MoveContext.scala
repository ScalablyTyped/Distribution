package typings
package d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs

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
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit
}

object MoveContext {
  @scala.inline
  def apply(moveTo: js.Function2[scala.Double, scala.Double, scala.Unit]): MoveContext = {
    val __obj = js.Dynamic.literal(moveTo = moveTo)
  
    __obj.asInstanceOf[MoveContext]
  }
}

