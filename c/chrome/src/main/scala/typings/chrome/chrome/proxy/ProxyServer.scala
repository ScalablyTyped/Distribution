package typings.chrome.chrome.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyServer extends js.Object {
  /** The URI of the proxy server. This must be an ASCII hostname (in Punycode format). IDNA is not supported, yet. */
  var host: String = js.native
  /** Optional. The port of the proxy server. Defaults to a port that depends on the scheme. */
  var port: js.UndefOr[Double] = js.native
  /** Optional. The scheme (protocol) of the proxy server itself. Defaults to 'http'. */
  var scheme: js.UndefOr[String] = js.native
}

object ProxyServer {
  @scala.inline
  def apply(host: String): ProxyServer = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyServer]
  }
  @scala.inline
  implicit class ProxyServerOps[Self <: ProxyServer] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
  }
  
}

