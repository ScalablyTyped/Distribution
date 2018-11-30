package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavigateBackMiniProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  var extraData: js.UndefOr[js.Any] = js.undefined
   // 需要返回给上一个小程序的数据，上一个小程序可在 App.onShow() 中获取到这份数据。详情
  @JSName("success")
  var success_NavigateBackMiniProgramOptions: js.UndefOr[js.Function1[/* res */ baiduDashAppLib.Anon_ErrMsg, scala.Unit]] = js.undefined
}

