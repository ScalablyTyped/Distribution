package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateAnimationOptions extends js.Object {
  /** 动画持续时间，单位 ms，默认值 0 */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /** 动画持续时间，单位ms，默认值 400 */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /** 定义动画的效果，默认值"linear"，有效值："linear","ease","ease-in","ease-in-out","ease-out","step-start","step-end" */
  var timingFunction: js.UndefOr[TimingFunction] = js.undefined
  /** 设置transform-origin，默认为"50% 50% 0" */
  var transformOrigin: js.UndefOr[java.lang.String] = js.undefined
}

