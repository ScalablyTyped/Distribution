package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvInfo extends js.Object {
  var appKey: String
  	// 智能小程序 App Key	2.0.28
  var appName: String
  	// 智能小程序名称
  var lastAppURL: String
  	// 基础库版本
  var scheme: String
  	// 智能小程序最近一次打开的调起协议
  var sdkVersion: String
}

object EnvInfo {
  @scala.inline
  def apply(appKey: String, appName: String, lastAppURL: String, scheme: String, sdkVersion: String): EnvInfo = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], lastAppURL = lastAppURL.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvInfo]
  }
}

