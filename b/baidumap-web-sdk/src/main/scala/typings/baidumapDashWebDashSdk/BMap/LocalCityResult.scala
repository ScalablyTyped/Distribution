package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalCityResult extends js.Object {
  var center: Point
  var level: Double
  var name: String
}

object LocalCityResult {
  @scala.inline
  def apply(center: Point, level: Double, name: String): LocalCityResult = {
    val __obj = js.Dynamic.literal(center = center, level = level, name = name)
  
    __obj.asInstanceOf[LocalCityResult]
  }
}

