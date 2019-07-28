package typings.d3DashSelection.d3DashSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientPointEvent extends js.Object {
  var clientX: Double
  var clientY: Double
}

object ClientPointEvent {
  @scala.inline
  def apply(clientX: Double, clientY: Double): ClientPointEvent = {
    val __obj = js.Dynamic.literal(clientX = clientX, clientY = clientY)
  
    __obj.asInstanceOf[ClientPointEvent]
  }
}

