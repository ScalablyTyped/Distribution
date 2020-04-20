package typings.baiduApp

import typings.baiduApp.baiduAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  characteristics  :std.Array<{  uuid  :string,   properties  :std.Array<{  read  :boolean,   write  :boolean,   notify  :boolean,   indicate  :boolean}>}>} & baidu-app.swan.ErrMsgResponse */
trait characteristicsArrayuuids extends js.Object {
  var characteristics: js.Array[AnonProperties]
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
}

object characteristicsArrayuuids {
  @scala.inline
  def apply(characteristics: js.Array[AnonProperties], errMsg: ok | String): characteristicsArrayuuids = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[characteristicsArrayuuids]
  }
}

