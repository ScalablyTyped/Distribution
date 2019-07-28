package typings.axios

import typings.axios.axiosMod.AxiosInterceptorManager
import typings.axios.axiosMod.AxiosRequestConfig
import typings.axios.axiosMod.AxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: AxiosInterceptorManager[AxiosRequestConfig]
  var response: AxiosInterceptorManager[AxiosResponse[_]]
}

object Anon_Request {
  @scala.inline
  def apply(
    request: AxiosInterceptorManager[AxiosRequestConfig],
    response: AxiosInterceptorManager[AxiosResponse[_]]
  ): Anon_Request = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[Anon_Request]
  }
}

