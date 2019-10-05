package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transformoptions extends js.Object {
  var scaleX: Double
   // 水平缩放
  var scaleY: Double
   // 垂直缩放
  var skewX: Double
   // 水平倾斜
  var skewY: Double
   // 垂直倾斜
  var translateX: Double
   // 水平移动
  var translateY: Double
}

object Transformoptions {
  @scala.inline
  def apply(
    scaleX: Double,
    scaleY: Double,
    skewX: Double,
    skewY: Double,
    translateX: Double,
    translateY: Double
  ): Transformoptions = {
    val __obj = js.Dynamic.literal(scaleX = scaleX, scaleY = scaleY, skewX = skewX, skewY = skewY, translateX = translateX, translateY = translateY)
  
    __obj.asInstanceOf[Transformoptions]
  }
}

