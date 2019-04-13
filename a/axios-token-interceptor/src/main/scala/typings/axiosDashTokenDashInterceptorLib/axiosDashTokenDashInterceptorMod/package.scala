package typings
package axiosDashTokenDashInterceptorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axiosDashTokenDashInterceptorMod {
  type TokenProvider = js.Function1[
    /* config */ axiosLib.axiosMod.AxiosRequestConfig, 
    js.Promise[axiosLib.axiosMod.AxiosRequestConfig]
  ]
}
