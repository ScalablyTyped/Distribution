package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateMarkerOptions
  extends BaseOptions[js.Any, js.Any] {
  	// 动画持续时长，默认值1000ms，平移与旋转分别计算。
  var animationEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  	// 指定marker移动到的目标点
  var autoRotate: scala.Boolean
  	// 指定 marker
  var destination: baiduDashAppLib.Anon_LatitudeLongitude
  	// marker 的旋转角度
  var duration: js.UndefOr[scala.Double] = js.undefined
  var markerId: scala.Double
  	// 移动过程中是否自动旋转 marker
  var rotate: scala.Double
}

object TranslateMarkerOptions {
  @scala.inline
  def apply(
    autoRotate: scala.Boolean,
    destination: baiduDashAppLib.Anon_LatitudeLongitude,
    markerId: scala.Double,
    rotate: scala.Double,
    animationEnd: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    duration: scala.Int | scala.Double = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): TranslateMarkerOptions = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate, destination = destination, markerId = markerId, rotate = rotate)
    if (animationEnd != null) __obj.updateDynamic("animationEnd")(animationEnd)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[TranslateMarkerOptions]
  }
}

