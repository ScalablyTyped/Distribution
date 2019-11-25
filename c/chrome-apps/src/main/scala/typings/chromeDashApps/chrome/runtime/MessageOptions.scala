package typings.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOptions extends js.Object {
  /** Whether the TLS channel ID will be passed into onMessageExternal for processes that are listening for the connection event. */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.undefined
}

object MessageOptions {
  @scala.inline
  def apply(includeTlsChannelId: js.UndefOr[Boolean] = js.undefined): MessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeTlsChannelId)) __obj.updateDynamic("includeTlsChannelId")(includeTlsChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOptions]
  }
}

