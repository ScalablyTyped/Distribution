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

