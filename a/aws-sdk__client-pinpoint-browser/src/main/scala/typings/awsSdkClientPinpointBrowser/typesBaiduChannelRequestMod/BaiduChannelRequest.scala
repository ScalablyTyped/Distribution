package typings.awsSdkClientPinpointBrowser.typesBaiduChannelRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaiduChannelRequest extends js.Object {
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

object BaiduChannelRequest {
  @scala.inline
  def apply(ApiKey: String = null, Enabled: js.UndefOr[Boolean] = js.undefined, SecretKey: String = null): BaiduChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (ApiKey != null) __obj.updateDynamic("ApiKey")(ApiKey.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (SecretKey != null) __obj.updateDynamic("SecretKey")(SecretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaiduChannelRequest]
  }
}

