package typings.baiduApp.swan

import typings.baiduApp.AnonAppIdExtraData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region App里的onLaunch、onShow回调参数
trait LaunchOptions extends js.Object {
  /**
  		 * 打开小程序的路径
  		 */
  var path: String
  /**
  		 * 打开小程序的query
  		 */
  var query: js.Object
  /**
  		 * 当场景为由从另一个小程序或公众号或App打开时，返回此字段
  		 */
  var referrerInfo: AnonAppIdExtraData
  /**
  		 * 打开小程序的[场景值](https://smartprogram.baidu.com/docs/data/scene/)
  		 */
  var scene: Double
  /**
  		 * shareTicket，详见 获取更多[转发信息](https://smartprogram.baidu.com/docs/develop/api/open_share/)
  		 */
  var shareTicket: String
}

object LaunchOptions {
  @scala.inline
  def apply(
    path: String,
    query: js.Object,
    referrerInfo: AnonAppIdExtraData,
    scene: Double,
    shareTicket: String
  ): LaunchOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], referrerInfo = referrerInfo.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LaunchOptions]
  }
}

