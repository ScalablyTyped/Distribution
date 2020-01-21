package typings.axios

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AxiosAdapter = js.Function1[
    /* config */ typings.axios.mod.AxiosRequestConfig, 
    typings.axios.mod.AxiosPromise[js.Any]
  ]
  type AxiosPromise[T] = js.Promise[typings.axios.mod.AxiosResponse[T]]
  type AxiosTransformer = js.Function2[/* data */ js.Any, /* headers */ js.UndefOr[js.Any], js.Any]
  type Canceler = js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit]
}
