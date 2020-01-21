package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAngleAndHeight extends js.Object {
  var angleAndHeight: AnonEndPosition
  var distance: AnonEndPosition
}

object AnonAngleAndHeight {
  @scala.inline
  def apply(angleAndHeight: AnonEndPosition, distance: AnonEndPosition): AnonAngleAndHeight = {
    val __obj = js.Dynamic.literal(angleAndHeight = angleAndHeight.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAngleAndHeight]
  }
}

