package typings
package axiosLib.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosProxyConfig extends js.Object {
  var auth: js.UndefOr[axiosLib.Anon_Password] = js.undefined
  var host: java.lang.String
  var port: scala.Double
  var protocol: js.UndefOr[java.lang.String] = js.undefined
}

object AxiosProxyConfig {
  @scala.inline
  def apply(
    host: java.lang.String,
    port: scala.Double,
    auth: axiosLib.Anon_Password = null,
    protocol: java.lang.String = null
  ): AxiosProxyConfig = {
    val __obj = js.Dynamic.literal(host = host, port = port)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[AxiosProxyConfig]
  }
}

