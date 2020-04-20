package typings.axios

import typings.axios.mod.AxiosInterceptorManager
import typings.axios.mod.AxiosRequestConfig
import typings.axios.mod.AxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest extends js.Object {
  var request: AxiosInterceptorManager[AxiosRequestConfig]
  var response: AxiosInterceptorManager[AxiosResponse[_]]
}

object AnonRequest {
  @scala.inline
  def apply(
    request: AxiosInterceptorManager[AxiosRequestConfig],
    response: AxiosInterceptorManager[AxiosResponse[_]]
  ): AnonRequest = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequest]
  }
}

