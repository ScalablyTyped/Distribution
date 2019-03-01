package typings
package axiosLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: axiosLib.axiosMod.AxiosInterceptorManager[axiosLib.axiosMod.AxiosRequestConfig]
  var response: axiosLib.axiosMod.AxiosInterceptorManager[axiosLib.axiosMod.AxiosResponse[_]]
}

object Anon_Request {
  @scala.inline
  def apply(
    request: axiosLib.axiosMod.AxiosInterceptorManager[axiosLib.axiosMod.AxiosRequestConfig],
    response: axiosLib.axiosMod.AxiosInterceptorManager[axiosLib.axiosMod.AxiosResponse[_]]
  ): Anon_Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[Anon_Request]
  }
}

