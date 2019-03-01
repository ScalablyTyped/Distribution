package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 *  打开另一个小程序。(参数)
	 */
trait navigateToSmartProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 要打开的小程序App Key
  		 */
  var appKey: java.lang.String
  /**
  		 * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch()
  		 * App.onShow() 中获取到这份数据。
  		 */
  var extraData: js.UndefOr[js.Any] = js.undefined
  /**
  		 * 打开的页面路径，如果为空则打开首页 。
  		 */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object navigateToSmartProgramOptions {
  @scala.inline
  def apply(
    appKey: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    extraData: js.Any = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    path: java.lang.String = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): navigateToSmartProgramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appKey")(appKey)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (path != null) __obj.updateDynamic("path")(path)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[navigateToSmartProgramOptions]
  }
}

