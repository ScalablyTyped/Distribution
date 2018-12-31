package typings
package axiosLib.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosResponse[T] extends js.Object {
  var config: AxiosRequestConfig
  var data: T
  var headers: js.Any
  var request: js.UndefOr[js.Any] = js.undefined
  var status: scala.Double
  var statusText: java.lang.String
}

