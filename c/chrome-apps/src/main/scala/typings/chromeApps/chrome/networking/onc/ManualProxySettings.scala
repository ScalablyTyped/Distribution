package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManualProxySettings[M, P] extends js.Object {
  /** Settings for FTP proxy. */
  var FTPProxy: js.UndefOr[P] = js.native
  /** Settings for HTTP proxy. */
  var HTTPProxy: js.UndefOr[P] = js.native
  /** Settings for SOCKS proxy. */
  var SOCKS: js.UndefOr[P] = js.native
  /** Settings for secure HTTP proxy. */
  var SecureHTTPProxy: js.UndefOr[P] = js.native
}

object ManualProxySettings {
  @scala.inline
  def apply[M, P](): ManualProxySettings[M, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManualProxySettings[M, P]]
  }
  @scala.inline
  implicit class ManualProxySettingsOps[Self <: ManualProxySettings[_, _], M, P] (val x: Self with (ManualProxySettings[M, P])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFTPProxy(value: P): Self = this.set("FTPProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFTPProxy: Self = this.set("FTPProxy", js.undefined)
    @scala.inline
    def setHTTPProxy(value: P): Self = this.set("HTTPProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHTTPProxy: Self = this.set("HTTPProxy", js.undefined)
    @scala.inline
    def setSOCKS(value: P): Self = this.set("SOCKS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSOCKS: Self = this.set("SOCKS", js.undefined)
    @scala.inline
    def setSecureHTTPProxy(value: P): Self = this.set("SecureHTTPProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureHTTPProxy: Self = this.set("SecureHTTPProxy", js.undefined)
  }
  
}

