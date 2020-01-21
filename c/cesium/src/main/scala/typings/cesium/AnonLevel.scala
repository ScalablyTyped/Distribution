package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: Double
  var x: Double
  var y: Double
}

object AnonLevel {
  @scala.inline
  def apply(level: Double, x: Double, y: Double): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLevel]
  }
}

