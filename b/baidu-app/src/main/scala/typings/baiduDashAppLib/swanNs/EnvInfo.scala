package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvInfo extends js.Object {
  var appKey: java.lang.String
  	// 智能小程序 App Key	2.0.28
  var appName: java.lang.String
  	// 智能小程序名称
  var lastAppURL: java.lang.String
  	// 基础库版本
  var scheme: java.lang.String
  	// 智能小程序最近一次打开的调起协议
  var sdkVersion: java.lang.String
}

object EnvInfo {
  @scala.inline
  def apply(
    appKey: java.lang.String,
    appName: java.lang.String,
    lastAppURL: java.lang.String,
    scheme: java.lang.String,
    sdkVersion: java.lang.String
  ): EnvInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appKey")(appKey)
    __obj.updateDynamic("appName")(appName)
    __obj.updateDynamic("lastAppURL")(lastAppURL)
    __obj.updateDynamic("scheme")(scheme)
    __obj.updateDynamic("sdkVersion")(sdkVersion)
    __obj.asInstanceOf[EnvInfo]
  }
}

