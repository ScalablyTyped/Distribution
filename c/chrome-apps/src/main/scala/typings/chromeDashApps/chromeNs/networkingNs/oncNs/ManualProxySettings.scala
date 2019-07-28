package typings.chromeDashApps.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualProxySettings[M, P] extends js.Object {
  /** Settings for FTP proxy. */
  var FTPProxy: js.UndefOr[P] = js.undefined
  /** Settings for HTTP proxy. */
  var HTTPProxy: js.UndefOr[P] = js.undefined
  /** Settings for SOCKS proxy. */
  var SOCKS: js.UndefOr[P] = js.undefined
  /** Settings for secure HTTP proxy. */
  var SecureHTTPProxy: js.UndefOr[P] = js.undefined
}

object ManualProxySettings {
  @scala.inline
  def apply[M, P](FTPProxy: P = null, HTTPProxy: P = null, SOCKS: P = null, SecureHTTPProxy: P = null): ManualProxySettings[M, P] = {
    val __obj = js.Dynamic.literal()
    if (FTPProxy != null) __obj.updateDynamic("FTPProxy")(FTPProxy.asInstanceOf[js.Any])
    if (HTTPProxy != null) __obj.updateDynamic("HTTPProxy")(HTTPProxy.asInstanceOf[js.Any])
    if (SOCKS != null) __obj.updateDynamic("SOCKS")(SOCKS.asInstanceOf[js.Any])
    if (SecureHTTPProxy != null) __obj.updateDynamic("SecureHTTPProxy")(SecureHTTPProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualProxySettings[M, P]]
  }
}

