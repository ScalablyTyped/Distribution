package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTabBarItemOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 图片路径, icon 大小限制为40kb
  		 * 建议尺寸为 81px * 81px
  		 * 当 postion 为 top 时，此参数无效，不支持网络图片
  		 */
  var iconPath: js.UndefOr[java.lang.String] = js.undefined
  /** tabBar 的哪一项，从左边算起 */
  var index: scala.Double
  /**
  		 * 选中时的图片路径
  		 * icon 大小限制为40kb，建议尺寸为 81px * 81px
  		 * 当 postion 为 top
  		 */
  var selectedIconPath: js.UndefOr[java.lang.String] = js.undefined
  /** tab 上按钮文字 */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object SetTabBarItemOptions {
  @scala.inline
  def apply(
    index: scala.Double,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    iconPath: java.lang.String = null,
    selectedIconPath: java.lang.String = null,
    success: js.Function1[js.Any, scala.Unit] = null,
    text: java.lang.String = null
  ): SetTabBarItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath)
    if (selectedIconPath != null) __obj.updateDynamic("selectedIconPath")(selectedIconPath)
    if (success != null) __obj.updateDynamic("success")(success)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SetTabBarItemOptions]
  }
}

