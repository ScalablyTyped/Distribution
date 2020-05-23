package typings.baiduApp.anon

import typings.baiduApp.baiduAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  characteristic  :{  characteristicId  :string,   serviceId  :string,   value  :std.ArrayBuffer}} & baidu-app.swan.ErrMsgResponse */
trait characteristiccharacteris extends js.Object {
  var characteristic: CharacteristicId
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
}

object characteristiccharacteris {
  @scala.inline
  def apply(characteristic: CharacteristicId, errMsg: ok | String): characteristiccharacteris = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[characteristiccharacteris]
  }
}

