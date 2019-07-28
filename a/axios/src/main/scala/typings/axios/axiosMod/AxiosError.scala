package typings.axios.axiosMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosError[T] extends Error {
  var code: js.UndefOr[String] = js.undefined
  var config: AxiosRequestConfig
  var isAxiosError: Boolean
  var request: js.UndefOr[js.Any] = js.undefined
  var response: js.UndefOr[AxiosResponse[T]] = js.undefined
}

object AxiosError {
  @scala.inline
  def apply[T](
    config: AxiosRequestConfig,
    isAxiosError: Boolean,
    message: String,
    name: String,
    code: String = null,
    request: js.Any = null,
    response: AxiosResponse[T] = null,
    stack: String = null
  ): AxiosError[T] = {
    val __obj = js.Dynamic.literal(config = config, isAxiosError = isAxiosError, message = message, name = name)
    if (code != null) __obj.updateDynamic("code")(code)
    if (request != null) __obj.updateDynamic("request")(request)
    if (response != null) __obj.updateDynamic("response")(response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[AxiosError[T]]
  }
}

