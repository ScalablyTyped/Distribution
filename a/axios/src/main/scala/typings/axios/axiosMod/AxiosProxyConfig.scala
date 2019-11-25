package typings.axios.axiosMod

import typings.axios.Anon_Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosProxyConfig extends js.Object {
  var auth: js.UndefOr[Anon_Password] = js.undefined
  var host: String
  var port: Double
  var protocol: js.UndefOr[String] = js.undefined
}

object AxiosProxyConfig {
  @scala.inline
  def apply(host: String, port: Double, auth: Anon_Password = null, protocol: String = null): AxiosProxyConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxiosProxyConfig]
  }
}

