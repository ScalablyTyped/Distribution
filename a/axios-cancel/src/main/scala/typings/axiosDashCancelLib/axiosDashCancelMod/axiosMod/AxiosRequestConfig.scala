package typings
package axiosDashCancelLib.axiosDashCancelMod.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosRequestConfig extends js.Object {
  var requestId: js.UndefOr[java.lang.String] = js.undefined
}

object AxiosRequestConfig {
  @scala.inline
  def apply(requestId: java.lang.String = null): AxiosRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (requestId != null) __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[AxiosRequestConfig]
  }
}

