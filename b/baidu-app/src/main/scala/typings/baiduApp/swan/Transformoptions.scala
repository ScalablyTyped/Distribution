package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transformoptions extends js.Object {
  var scaleX: Double = js.native
   // 水平缩放
  var scaleY: Double = js.native
   // 垂直缩放
  var skewX: Double = js.native
   // 水平倾斜
  var skewY: Double = js.native
   // 垂直倾斜
  var translateX: Double = js.native
   // 水平移动
  var translateY: Double = js.native
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
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformoptions]
  }
  @scala.inline
  implicit class TransformoptionsOps[Self <: Transformoptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkewX(value: Double): Self = this.set("skewX", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkewY(value: Double): Self = this.set("skewY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslateX(value: Double): Self = this.set("translateX", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslateY(value: Double): Self = this.set("translateY", value.asInstanceOf[js.Any])
  }
  
}

