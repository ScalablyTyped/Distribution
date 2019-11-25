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
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientPointEvent]
  }
}

