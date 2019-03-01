package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region App里的onLaunch、onShow回调参数
trait LaunchOptions extends js.Object {
  /**
  		 * 打开小程序的路径
  		 */
  var path: java.lang.String
  /**
  		 * 打开小程序的query
  		 */
  var query: js.Object
  /**
  		 * 当场景为由从另一个小程序或公众号或App打开时，返回此字段
  		 */
  var referrerInfo: baiduDashAppLib.Anon_AppIdExtraData
  /**
  		 * 打开小程序的[场景值](https://smartprogram.baidu.com/docs/data/scene/)
  		 */
  var scene: scala.Double
  /**
  		 * shareTicket，详见 获取更多[转发信息](https://smartprogram.baidu.com/docs/develop/api/open_share/)
  		 */
  var shareTicket: java.lang.String
}

object LaunchOptions {
  @scala.inline
  def apply(
    path: java.lang.String,
    query: js.Object,
    referrerInfo: baiduDashAppLib.Anon_AppIdExtraData,
    scene: scala.Double,
    shareTicket: java.lang.String
  ): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("referrerInfo")(referrerInfo)
    __obj.updateDynamic("scene")(scene)
    __obj.updateDynamic("shareTicket")(shareTicket)
    __obj.asInstanceOf[LaunchOptions]
  }
}

