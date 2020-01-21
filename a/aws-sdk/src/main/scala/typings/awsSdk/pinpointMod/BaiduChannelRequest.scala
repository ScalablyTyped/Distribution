package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaiduChannelRequest extends js.Object {
  /**
    * The API key that you received from the Baidu Cloud Push service to communicate with the service.
    */
  var ApiKey: string = js.native
  /**
    * Specifies whether to enable the Baidu channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * The secret key that you received from the Baidu Cloud Push service to communicate with the service.
    */
  var SecretKey: string = js.native
}

object BaiduChannelRequest {
  @scala.inline
  def apply(ApiKey: string, SecretKey: string, Enabled: js.UndefOr[Boolean] = js.undefined): BaiduChannelRequest = {
    val __obj = js.Dynamic.literal(ApiKey = ApiKey.asInstanceOf[js.Any], SecretKey = SecretKey.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaiduChannelRequest]
  }
}

