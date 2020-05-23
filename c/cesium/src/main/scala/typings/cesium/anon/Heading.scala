package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heading extends js.Object {
  var heading: Double
  var pitch: Double
  var roll: Double
}

object Heading {
  @scala.inline
  def apply(heading: Double, pitch: Double, roll: Double): Heading = {
    val __obj = js.Dynamic.literal(heading = heading.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heading]
  }
}

