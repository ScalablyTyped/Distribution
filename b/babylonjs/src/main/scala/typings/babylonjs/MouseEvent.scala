package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEvent extends js.Object {
  var mozMovementX: Double
  var mozMovementY: Double
  var msMovementX: Double
  var msMovementY: Double
  var webkitMovementX: Double
  var webkitMovementY: Double
}

object MouseEvent {
  @scala.inline
  def apply(
    mozMovementX: Double,
    mozMovementY: Double,
    msMovementX: Double,
    msMovementY: Double,
    webkitMovementX: Double,
    webkitMovementY: Double
  ): MouseEvent = {
    val __obj = js.Dynamic.literal(mozMovementX = mozMovementX.asInstanceOf[js.Any], mozMovementY = mozMovementY.asInstanceOf[js.Any], msMovementX = msMovementX.asInstanceOf[js.Any], msMovementY = msMovementY.asInstanceOf[js.Any], webkitMovementX = webkitMovementX.asInstanceOf[js.Any], webkitMovementY = webkitMovementY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MouseEvent]
  }
}

