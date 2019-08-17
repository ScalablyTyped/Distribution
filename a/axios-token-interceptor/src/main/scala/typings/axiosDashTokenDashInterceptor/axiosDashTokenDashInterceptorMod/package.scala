package typings.axiosDashTokenDashInterceptor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axiosDashTokenDashInterceptorMod {
  import typings.axios.axiosMod.AxiosRequestConfig

  type TokenProvider = js.Function1[/* config */ AxiosRequestConfig, js.Promise[AxiosRequestConfig]]
}
