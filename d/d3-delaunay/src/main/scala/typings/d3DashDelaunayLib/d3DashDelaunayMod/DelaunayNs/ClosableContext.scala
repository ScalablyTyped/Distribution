package typings
package d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for the closePath() method of the CanvasPathMethods API.
  */
trait ClosableContext extends js.Object {
  /**
    * closePath() method of the CanvasPathMethods API.
    */
  def closePath(): scala.Unit
}

object ClosableContext {
  @scala.inline
  def apply(closePath: js.Function0[scala.Unit]): ClosableContext = {
    val __obj = js.Dynamic.literal(closePath = closePath)
  
    __obj.asInstanceOf[ClosableContext]
  }
}

