package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var lat: Double
  var lng: Double
  def equals(other: Point): Boolean
}

object Point {
  @scala.inline
  def apply(equals: Point => Boolean, lat: Double, lng: Double): Point = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

