package typings
package d3DashSelectionLib.d3DashSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientPointEvent extends js.Object {
  var clientX: scala.Double
  var clientY: scala.Double
}

object ClientPointEvent {
  @scala.inline
  def apply(clientX: scala.Double, clientY: scala.Double): ClientPointEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientX")(clientX)
    __obj.updateDynamic("clientY")(clientY)
    __obj.asInstanceOf[ClientPointEvent]
  }
}

