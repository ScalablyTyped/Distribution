package typings
package axiosLib.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosResponse[T] extends js.Object {
  var config: AxiosRequestConfig
  var data: T
  var headers: js.Any
  var request: js.UndefOr[js.Any] = js.undefined
  var status: scala.Double
  var statusText: java.lang.String
}

object AxiosResponse {
  @scala.inline
  def apply[T](
    config: AxiosRequestConfig,
    data: T,
    headers: js.Any,
    status: scala.Double,
    statusText: java.lang.String,
    request: js.Any = null
  ): AxiosResponse[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    if (request != null) __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[AxiosResponse[T]]
  }
}

