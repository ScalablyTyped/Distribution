package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  var altitude: js.UndefOr[scala.Boolean] = js.undefined
   // 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度
  /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
  @JSName("success")
  var success_GetLocationOptions: js.UndefOr[js.Function1[/* res */ LocationData, scala.Unit]] = js.undefined
  /** 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于swan.openLocation的坐标 */
  var `type`: js.UndefOr[
    baiduDashAppLib.baiduDashAppLibStrings.wgs84 | baiduDashAppLib.baiduDashAppLibStrings.gcj02
  ] = js.undefined
}

