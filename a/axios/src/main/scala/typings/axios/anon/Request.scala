package typings.axios.anon

import typings.axios.mod.AxiosInterceptorManager
import typings.axios.mod.AxiosRequestConfig
import typings.axios.mod.AxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var request: AxiosInterceptorManager[AxiosRequestConfig] = js.native
  var response: AxiosInterceptorManager[AxiosResponse[_]] = js.native
}

object Request {
  @scala.inline
  def apply(
    request: AxiosInterceptorManager[AxiosRequestConfig],
    response: AxiosInterceptorManager[AxiosResponse[_]]
  ): Request = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def setRequest(value: AxiosInterceptorManager[AxiosRequestConfig]): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: AxiosInterceptorManager[AxiosResponse[_]]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

