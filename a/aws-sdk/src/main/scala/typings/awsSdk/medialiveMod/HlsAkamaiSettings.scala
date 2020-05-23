package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsAkamaiSettings extends js.Object {
  /**
    * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
    */
  var ConnectionRetryInterval: js.UndefOr[integerMin0] = js.native
  /**
    * Size in seconds of file cache for streaming outputs.
    */
  var FilecacheDuration: js.UndefOr[integerMin0Max600] = js.native
  /**
    * Specify whether or not to use chunked transfer encoding to Akamai. User should contact Akamai to enable this feature.
    */
  var HttpTransferMode: js.UndefOr[HlsAkamaiHttpTransferMode] = js.native
  /**
    * Number of retry attempts that will be made before the Live Event is put into an error state.
    */
  var NumRetries: js.UndefOr[integerMin0] = js.native
  /**
    * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
    */
  var RestartDelay: js.UndefOr[integerMin0Max15] = js.native
  /**
    * Salt for authenticated Akamai.
    */
  var Salt: js.UndefOr[string] = js.native
  /**
    * Token parameter for authenticated akamai. If not specified, _gda_ is used.
    */
  var Token: js.UndefOr[string] = js.native
}

object HlsAkamaiSettings {
  @scala.inline
  def apply(
    ConnectionRetryInterval: js.UndefOr[integerMin0] = js.undefined,
    FilecacheDuration: js.UndefOr[integerMin0Max600] = js.undefined,
    HttpTransferMode: HlsAkamaiHttpTransferMode = null,
    NumRetries: js.UndefOr[integerMin0] = js.undefined,
    RestartDelay: js.UndefOr[integerMin0Max15] = js.undefined,
    Salt: string = null,
    Token: string = null
  ): HlsAkamaiSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ConnectionRetryInterval)) __obj.updateDynamic("ConnectionRetryInterval")(ConnectionRetryInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FilecacheDuration)) __obj.updateDynamic("FilecacheDuration")(FilecacheDuration.get.asInstanceOf[js.Any])
    if (HttpTransferMode != null) __obj.updateDynamic("HttpTransferMode")(HttpTransferMode.asInstanceOf[js.Any])
    if (!js.isUndefined(NumRetries)) __obj.updateDynamic("NumRetries")(NumRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RestartDelay)) __obj.updateDynamic("RestartDelay")(RestartDelay.get.asInstanceOf[js.Any])
    if (Salt != null) __obj.updateDynamic("Salt")(Salt.asInstanceOf[js.Any])
    if (Token != null) __obj.updateDynamic("Token")(Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsAkamaiSettings]
  }
}

