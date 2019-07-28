package typings.axiosDashTokenDashInterceptor

import typings.axios.axiosMod.AxiosRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axiosDashTokenDashInterceptorMod {
  type TokenProvider = js.Function1[/* config */ AxiosRequestConfig, js.Promise[AxiosRequestConfig]]
}
