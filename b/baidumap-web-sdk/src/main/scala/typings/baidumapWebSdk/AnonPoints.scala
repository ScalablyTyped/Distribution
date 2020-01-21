package typings.baidumapWebSdk

import typings.baidumapWebSdk.BMap.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPoints extends js.Object {
  var points: js.Array[Point]
  var status: Double
}

object AnonPoints {
  @scala.inline
  def apply(points: js.Array[Point], status: Double): AnonPoints = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPoints]
  }
}

