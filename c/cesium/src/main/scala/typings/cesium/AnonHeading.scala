package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeading extends js.Object {
  var heading: Double
  var pitch: Double
  var roll: Double
}

object AnonHeading {
  @scala.inline
  def apply(heading: Double, pitch: Double, roll: Double): AnonHeading = {
    val __obj = js.Dynamic.literal(heading = heading.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeading]
  }
}

