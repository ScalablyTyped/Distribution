package typings
package baiduDashAppLib.swanNs

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

