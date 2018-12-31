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
  var destination: baiduDashAppLib.Anon_Latitude
  	// marker 的旋转角度
  var duration: js.UndefOr[scala.Double] = js.undefined
  var markerId: scala.Double
  	// 移动过程中是否自动旋转 marker
  var rotate: scala.Double
}

