package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region 位置API
trait PageScrollToOptions extends js.Object {
  /** 滚动动画的时长，默认300ms，单位 ms */
  var duration: js.UndefOr[Double] = js.undefined
  /** 滚动到页面的目标位置（单位px */
  var scrollTop: Double
}

object PageScrollToOptions {
  @scala.inline
  def apply(scrollTop: Double, duration: js.UndefOr[Double] = js.undefined): PageScrollToOptions = {
    val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageScrollToOptions]
  }
}

