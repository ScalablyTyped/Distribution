package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing information about the script context that sent a message or request.
  * @since Chrome 26.
  */
trait MessageSender extends js.Object {
  /**
    * The frame that opened the connection. 0 for top-level frames, positive for child frames. This will only be set when tab is set.
    * @since Chrome 41.
    */
  var frameId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** The ID of the app that opened the connection, if any. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The TLS channel ID of the page or frame that opened the connection, if requested by the app, and if available.
    * @since Chrome 32.
    */
  var tlsChannelId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL of the page or frame that opened the connection. If the sender is in an iframe, it will be iframe's URL not the URL of the page which hosts it.
    * @since Chrome 28.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object MessageSender {
  @scala.inline
  def apply(
    frameId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    id: java.lang.String = null,
    tlsChannelId: java.lang.String = null,
    url: java.lang.String = null
  ): MessageSender = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frameId)) __obj.updateDynamic("frameId")(frameId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (tlsChannelId != null) __obj.updateDynamic("tlsChannelId")(tlsChannelId)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[MessageSender]
  }
}

