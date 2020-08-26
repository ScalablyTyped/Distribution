package typings.chromeApps.chrome.sockets.tcp

import typings.chromeApps.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureOptions extends js.Object {
  /**
    * The minimum and maximum acceptable versions of TLS.
    * These will be tls1, tls1.1, or tls1.2.
    * *Note*
    * tls1.3 should be supported from Chrome 67.
    * @see[TLS Info and support table]{@link https://en.wikipedia.org/wiki/Transport_Layer_Security#TLS_1.3}
    */
  var tlsVersion: js.UndefOr[Max] = js.native
}

object SecureOptions {
  @scala.inline
  def apply(): SecureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureOptions]
  }
  @scala.inline
  implicit class SecureOptionsOps[Self <: SecureOptions] (val x: Self) extends AnyVal {
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
    def setTlsVersion(value: Max): Self = this.set("tlsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsVersion: Self = this.set("tlsVersion", js.undefined)
  }
  
}

