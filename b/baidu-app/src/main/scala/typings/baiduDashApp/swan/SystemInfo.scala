package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 设备API列表
// 设备-----系统信息
trait SystemInfo extends js.Object {
  /** 客户端基础库版本 */
  var SDKVersion: String
  /** 手机品牌 */
  var brand: String
  /** 用户字体大小设置。以“我-设置-通用-字体大小”中的设置为准，单位 px。 */
  var fontSizeSetting: Double
  /** 微信设置的语言 */
  var language: String
  /** 手机型号 */
  var model: String
  /** 设备像素比 */
  var pixelRatio: Double
  /** 客户端平台 */
  var platform: String
  /** 屏幕高度 */
  var screenHeight: Double
  /** 屏幕宽度 */
  var screenWidth: Double
  /** 状态栏的高度 */
  var statusBarHeight: Double
  /** 操作系统版本 */
  var system: String
  /** 微信版本号 */
  var version: String
  /** 窗口高度 */
  var windowHeight: Double
  /** 窗口宽度 */
  var windowWidth: Double
}

object SystemInfo {
  @scala.inline
  def apply(
    SDKVersion: String,
    brand: String,
    fontSizeSetting: Double,
    language: String,
    model: String,
    pixelRatio: Double,
    platform: String,
    screenHeight: Double,
    screenWidth: Double,
    statusBarHeight: Double,
    system: String,
    version: String,
    windowHeight: Double,
    windowWidth: Double
  ): SystemInfo = {
    val __obj = js.Dynamic.literal(SDKVersion = SDKVersion.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], fontSizeSetting = fontSizeSetting.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SystemInfo]
  }
}

