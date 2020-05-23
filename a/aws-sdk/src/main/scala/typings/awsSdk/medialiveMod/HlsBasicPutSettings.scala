package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsBasicPutSettings extends js.Object {
  /**
    * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
    */
  var ConnectionRetryInterval: js.UndefOr[integerMin0] = js.native
  /**
    * Size in seconds of file cache for streaming outputs.
    */
  var FilecacheDuration: js.UndefOr[integerMin0Max600] = js.native
  /**
    * Number of retry attempts that will be made before the Live Event is put into an error state.
    */
  var NumRetries: js.UndefOr[integerMin0] = js.native
  /**
    * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
    */
  var RestartDelay: js.UndefOr[integerMin0Max15] = js.native
}

object HlsBasicPutSettings {
  @scala.inline
  def apply(
    ConnectionRetryInterval: js.UndefOr[integerMin0] = js.undefined,
    FilecacheDuration: js.UndefOr[integerMin0Max600] = js.undefined,
    NumRetries: js.UndefOr[integerMin0] = js.undefined,
    RestartDelay: js.UndefOr[integerMin0Max15] = js.undefined
  ): HlsBasicPutSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ConnectionRetryInterval)) __obj.updateDynamic("ConnectionRetryInterval")(ConnectionRetryInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FilecacheDuration)) __obj.updateDynamic("FilecacheDuration")(FilecacheDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(NumRetries)) __obj.updateDynamic("NumRetries")(NumRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RestartDelay)) __obj.updateDynamic("RestartDelay")(RestartDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsBasicPutSettings]
  }
}

