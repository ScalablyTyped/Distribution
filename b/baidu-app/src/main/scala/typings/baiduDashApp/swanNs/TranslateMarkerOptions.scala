package typings.baiduDashApp.swanNs

import typings.baiduDashApp.Anon_LatitudeLongitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateMarkerOptions
  extends BaseOptions[js.Any, js.Any] {
  	// 动画持续时长，默认值1000ms，平移与旋转分别计算。
  var animationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  	// 指定marker移动到的目标点
  var autoRotate: Boolean
  	// 指定 marker
  var destination: Anon_LatitudeLongitude
  	// marker 的旋转角度
  var duration: js.UndefOr[Double] = js.undefined
  var markerId: Double
  	// 移动过程中是否自动旋转 marker
  var rotate: Double
}

object TranslateMarkerOptions {
  @scala.inline
  def apply(
    autoRotate: Boolean,
    destination: Anon_LatitudeLongitude,
    markerId: Double,
    rotate: Double,
    animationEnd: () => Unit = null,
    complete: /* res */ js.Any => Unit = null,
    duration: Int | Double = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): TranslateMarkerOptions = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate, destination = destination, markerId = markerId, rotate = rotate)
    if (animationEnd != null) __obj.updateDynamic("animationEnd")(js.Any.fromFunction0(animationEnd))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[TranslateMarkerOptions]
  }
}

