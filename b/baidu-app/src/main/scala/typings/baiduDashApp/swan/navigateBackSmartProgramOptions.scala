package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 *  返回上一个小程序(参数)
	 */
trait navigateBackSmartProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要返回给上一个小程序的数据，上一个小程序可在
  		 * App.onLaunch()，App.onShow() 中获取到这份数据。
  		 */
  var extraData: js.UndefOr[js.Any] = js.undefined
}

object navigateBackSmartProgramOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    extraData: js.Any = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): navigateBackSmartProgramOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[navigateBackSmartProgramOptions]
  }
}

