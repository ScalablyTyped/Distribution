package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalCityResult extends js.Object {
  var center: Point
  var level: scala.Double
  var name: java.lang.String
}

object LocalCityResult {
  @scala.inline
  def apply(center: Point, level: scala.Double, name: java.lang.String): LocalCityResult = {
    val __obj = js.Dynamic.literal(center = center, level = level, name = name)
  
    __obj.asInstanceOf[LocalCityResult]
  }
}

