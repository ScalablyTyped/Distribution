package typings.baiduApp.anon

import typings.baiduApp.baiduAppStrings.easeIn
import typings.baiduApp.baiduAppStrings.easeInOut
import typings.baiduApp.baiduAppStrings.easeOut
import typings.baiduApp.baiduAppStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  // 动画变化时间，默认0，单位：毫秒
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * 动画变化方式，默认 linear
    * 值    说明
    * 有效值：
    * linear    动画从头到尾的速度是相同的。
    * easeIn    动画以低速开始
    * easeOut    动画以低速结束。
    * easeInOut    动画以低速开始和结束。
    */
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.undefined
}

object Duration {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    timingFunc: linear | easeIn | easeOut | easeInOut = null
  ): Duration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (timingFunc != null) __obj.updateDynamic("timingFunc")(timingFunc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

