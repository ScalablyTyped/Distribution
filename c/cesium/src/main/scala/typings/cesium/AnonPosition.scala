package typings.cesium

import typings.cesium.mod.Cartesian2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var position: Cartesian2
}

object AnonPosition {
  @scala.inline
  def apply(position: Cartesian2): AnonPosition = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPosition]
  }
}

