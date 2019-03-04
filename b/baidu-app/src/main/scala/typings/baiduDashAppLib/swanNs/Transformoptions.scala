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
    val __obj = js.Dynamic.literal(scaleX = scaleX, scaleY = scaleY, skewX = skewX, skewY = skewY, translateX = translateX, translateY = translateY)
  
    __obj.asInstanceOf[Transformoptions]
  }
}

