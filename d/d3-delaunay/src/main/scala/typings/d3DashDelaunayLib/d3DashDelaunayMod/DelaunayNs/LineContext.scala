package typings
package d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs

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
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit
}

object LineContext {
  @scala.inline
  def apply(lineTo: js.Function2[scala.Double, scala.Double, scala.Unit]): LineContext = {
    val __obj = js.Dynamic.literal(lineTo = lineTo)
  
    __obj.asInstanceOf[LineContext]
  }
}

