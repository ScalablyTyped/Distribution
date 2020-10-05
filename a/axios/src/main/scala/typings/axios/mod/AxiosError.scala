package typings.axios.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxiosError[T] extends Error {
  var code: js.UndefOr[String] = js.native
  var config: AxiosRequestConfig = js.native
  var isAxiosError: Boolean = js.native
  var request: js.UndefOr[js.Any] = js.native
  var response: js.UndefOr[AxiosResponse[T]] = js.native
  def toJSON(): js.Object = js.native
}

object AxiosError {
  @scala.inline
  def apply[T](
    config: AxiosRequestConfig,
    isAxiosError: Boolean,
    message: String,
    name: String,
    toJSON: () => js.Object
  ): AxiosError[T] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], isAxiosError = isAxiosError.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[AxiosError[T]]
  }
  @scala.inline
  implicit class AxiosErrorOps[Self <: AxiosError[_], T] (val x: Self with AxiosError[T]) extends AnyVal {
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
    def setConfig(value: AxiosRequestConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAxiosError(value: Boolean): Self = this.set("isAxiosError", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Object): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setRequest(value: js.Any): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResponse(value: AxiosResponse[T]): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

