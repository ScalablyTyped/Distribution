package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppIdExtraData extends js.Object {
  /* 来源小程序或公众号或App的 appId，详见下方说明 */
  var appId: String
  /* 来源小程序传过来的数据，scene=1037或1038时支持 */
  var extraData: js.Object
}

object AnonAppIdExtraData {
  @scala.inline
  def apply(appId: String, extraData: js.Object): AnonAppIdExtraData = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAppIdExtraData]
  }
}

