package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetUserInfoOptions
  extends BaseOptions[js.Any, js.Any] {
   // 是否带上登录态信息
  var lang: js.UndefOr[java.lang.String] = js.undefined
   // 指定返回用户信息的语言，zh_CN 简体中文，zh_TW 繁体中文，en 英文。默认为en。
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetUserInfoOptions: js.UndefOr[js.Function1[/* res */ UserInfoResponse, scala.Unit]] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

