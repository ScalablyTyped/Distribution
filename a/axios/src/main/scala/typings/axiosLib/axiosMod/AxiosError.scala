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

