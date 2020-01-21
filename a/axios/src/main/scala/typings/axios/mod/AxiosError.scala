package typings.axios.mod

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
  def toJSON(): js.Object
}

object AxiosError {
  @scala.inline
  def apply[T](
    config: AxiosRequestConfig,
    isAxiosError: Boolean,
    message: String,
    name: String,
    toJSON: () => js.Object,
    code: String = null,
    request: js.Any = null,
    response: AxiosResponse[T] = null,
    stack: String = null
  ): AxiosError[T] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], isAxiosError = isAxiosError.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxiosError[T]]
  }
}

