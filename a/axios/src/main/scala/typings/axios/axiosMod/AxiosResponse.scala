package typings.axios.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosResponse[T] extends js.Object {
  var config: AxiosRequestConfig
  var data: T
  var headers: js.Any
  var request: js.UndefOr[js.Any] = js.undefined
  var status: Double
  var statusText: String
}

object AxiosResponse {
  @scala.inline
  def apply[T](
    config: AxiosRequestConfig,
    data: T,
    headers: js.Any,
    status: Double,
    statusText: String,
    request: js.Any = null
  ): AxiosResponse[T] = {
    val __obj = js.Dynamic.literal(config = config, data = data.asInstanceOf[js.Any], headers = headers, status = status, statusText = statusText)
    if (request != null) __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[AxiosResponse[T]]
  }
}

