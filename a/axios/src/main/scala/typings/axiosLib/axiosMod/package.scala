package typings
package axiosLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axiosMod {
  type AxiosAdapter = js.Function1[/* config */ AxiosRequestConfig, AxiosPromise[js.Any]]
  type AxiosPromise[T] = js.Promise[AxiosResponse[T]]
  type AxiosTransformer = js.Function2[/* data */ js.Any, /* headers */ js.UndefOr[js.Any], js.Any]
  type Canceler = js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit]
}
