package typings.cesium

import typings.cesium.mod.Cartesian2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition1 extends js.Object {
  var position1: Cartesian2
  var position2: Cartesian2
}

object AnonPosition1 {
  @scala.inline
  def apply(position1: Cartesian2, position2: Cartesian2): AnonPosition1 = {
    val __obj = js.Dynamic.literal(position1 = position1.asInstanceOf[js.Any], position2 = position2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPosition1]
  }
}

