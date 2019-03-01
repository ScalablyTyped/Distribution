package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEvent extends js.Object {
  var mozMovementX: scala.Double
  var mozMovementY: scala.Double
  var msMovementX: scala.Double
  var msMovementY: scala.Double
  var webkitMovementX: scala.Double
  var webkitMovementY: scala.Double
}

object MouseEvent {
  @scala.inline
  def apply(
    mozMovementX: scala.Double,
    mozMovementY: scala.Double,
    msMovementX: scala.Double,
    msMovementY: scala.Double,
    webkitMovementX: scala.Double,
    webkitMovementY: scala.Double
  ): MouseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mozMovementX")(mozMovementX)
    __obj.updateDynamic("mozMovementY")(mozMovementY)
    __obj.updateDynamic("msMovementX")(msMovementX)
    __obj.updateDynamic("msMovementY")(msMovementY)
    __obj.updateDynamic("webkitMovementX")(webkitMovementX)
    __obj.updateDynamic("webkitMovementY")(webkitMovementY)
    __obj.asInstanceOf[MouseEvent]
  }
}

