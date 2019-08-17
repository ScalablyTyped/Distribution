package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreBaiduChannelRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _BaiduChannelRequest extends js.Object {
  /**
    * Platform credential API key from Baidu.
    */
  var ApiKey: js.UndefOr[String] = js.undefined
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Platform credential Secret key from Baidu.
    */
  var SecretKey: js.UndefOr[String] = js.undefined
}

object _BaiduChannelRequest {
  @scala.inline
  def apply(ApiKey: String = null, Enabled: js.UndefOr[Boolean] = js.undefined, SecretKey: String = null): _BaiduChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (ApiKey != null) __obj.updateDynamic("ApiKey")(ApiKey)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (SecretKey != null) __obj.updateDynamic("SecretKey")(SecretKey)
    __obj.asInstanceOf[_BaiduChannelRequest]
  }
}

