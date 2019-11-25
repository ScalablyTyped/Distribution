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
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], isAxiosError = isAxiosError.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxiosError[T]]
  }
}

