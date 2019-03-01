package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transformoptions extends js.Object {
  var scaleX: scala.Double
   // 水平缩放
  var scaleY: scala.Double
   // 垂直缩放
  var skewX: scala.Double
   // 水平倾斜
  var skewY: scala.Double
   // 垂直倾斜
  var translateX: scala.Double
   // 水平移动
  var translateY: scala.Double
}

object Transformoptions {
  @scala.inline
  def apply(
    scaleX: scala.Double,
    scaleY: scala.Double,
    skewX: scala.Double,
    skewY: scala.Double,
    translateX: scala.Double,
    translateY: scala.Double
  ): Transformoptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scaleX")(scaleX)
    __obj.updateDynamic("scaleY")(scaleY)
    __obj.updateDynamic("skewX")(skewX)
    __obj.updateDynamic("skewY")(skewY)
    __obj.updateDynamic("translateX")(translateX)
    __obj.updateDynamic("translateY")(translateY)
    __obj.asInstanceOf[Transformoptions]
  }
}

