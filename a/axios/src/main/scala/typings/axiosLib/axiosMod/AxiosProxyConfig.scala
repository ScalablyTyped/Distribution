package typings
package axiosLib.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosProxyConfig extends js.Object {
  var auth: js.UndefOr[axiosLib.Anon_Password] = js.undefined
  var host: java.lang.String
  var port: scala.Double
}

object AxiosProxyConfig {
  @scala.inline
  def apply(host: java.lang.String, port: scala.Double, auth: axiosLib.Anon_Password = null): AxiosProxyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("port")(port)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    __obj.asInstanceOf[AxiosProxyConfig]
  }
}

