package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 界面API列表
trait ToastOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 提示的延迟时间，单位毫秒，默认：1500
  		 */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * 图标，只支持"success"、"loading"
  		 */
  var icon: js.UndefOr[
    baiduDashAppLib.baiduDashAppLibStrings.success | baiduDashAppLib.baiduDashAppLibStrings.loading
  ] = js.undefined
  /**
  		 * 自定义图标的本地路径，image 的优先级高于 icon
  		 */
  var image: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 是否显示透明蒙层，防止触摸穿透，默认：false
  		 */
  var mask: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * 提示的内容
  		 */
  var title: java.lang.String
}

object ToastOptions {
  @scala.inline
  def apply(
    title: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    duration: scala.Int | scala.Double = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    icon: baiduDashAppLib.baiduDashAppLibStrings.success | baiduDashAppLib.baiduDashAppLibStrings.loading = null,
    image: java.lang.String = null,
    mask: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function1[js.Any, scala.Unit] = null
  ): ToastOptions = {
    val __obj = js.Dynamic.literal(title = title)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ToastOptions]
  }
}

