package typings
package axiosLib.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxiosStatic extends AxiosInstance {
  var Cancel: CancelStatic = js.native
  var CancelToken: CancelTokenStatic = js.native
  def all[T](values: js.Array[T | js.Promise[T]]): js.Promise[js.Array[T]] = js.native
  def create(): AxiosInstance = js.native
  def create(config: AxiosRequestConfig): AxiosInstance = js.native
  def isCancel(value: js.Any): scala.Boolean = js.native
  def spread[T, R](callback: js.Function1[/* repeated */ T, R]): js.Function1[/* array */ js.Array[T], R] = js.native
}

