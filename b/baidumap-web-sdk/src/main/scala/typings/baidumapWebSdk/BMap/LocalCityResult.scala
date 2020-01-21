package typings.baidumapWebSdk.BMap

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
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocalCityResult]
  }
}

