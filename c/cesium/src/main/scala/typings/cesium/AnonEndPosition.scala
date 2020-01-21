package typings.cesium

import typings.cesium.mod.Cartesian2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndPosition extends js.Object {
  var endPosition: Cartesian2
  var startPosition: Cartesian2
}

object AnonEndPosition {
  @scala.inline
  def apply(endPosition: Cartesian2, startPosition: Cartesian2): AnonEndPosition = {
    val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEndPosition]
  }
}

