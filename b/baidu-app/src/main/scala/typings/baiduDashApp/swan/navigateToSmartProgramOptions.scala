package typings.baiduDashApp.swan

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
  var appKey: String
  /**
  		 * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch()
  		 * App.onShow() 中获取到这份数据。
  		 */
  var extraData: js.UndefOr[js.Any] = js.undefined
  /**
  		 * 打开的页面路径，如果为空则打开首页 。
  		 */
  var path: js.UndefOr[String] = js.undefined
}

object navigateToSmartProgramOptions {
  @scala.inline
  def apply(
    appKey: String,
    complete: /* res */ js.Any => Unit = null,
    extraData: js.Any = null,
    fail: js.Any => Unit = null,
    path: String = null,
    success: js.Any => Unit = null
  ): navigateToSmartProgramOptions = {
    val __obj = js.Dynamic.literal(appKey = appKey)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (path != null) __obj.updateDynamic("path")(path)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[navigateToSmartProgramOptions]
  }
}

