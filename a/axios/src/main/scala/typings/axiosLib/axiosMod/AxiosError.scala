package typings
package axiosLib.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosError
  extends stdLib.Error {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var config: AxiosRequestConfig
  var request: js.UndefOr[js.Any] = js.undefined
  var response: js.UndefOr[AxiosResponse[_]] = js.undefined
}

object AxiosError {
  @scala.inline
  def apply(
    config: AxiosRequestConfig,
    message: java.lang.String,
    name: java.lang.String,
    code: java.lang.String = null,
    request: js.Any = null,
    response: AxiosResponse[_] = null,
    stack: java.lang.String = null
  ): AxiosError = {
    val __obj = js.Dynamic.literal(config = config, message = message, name = name)
    if (code != null) __obj.updateDynamic("code")(code)
    if (request != null) __obj.updateDynamic("request")(request)
    if (response != null) __obj.updateDynamic("response")(response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[AxiosError]
  }
}

