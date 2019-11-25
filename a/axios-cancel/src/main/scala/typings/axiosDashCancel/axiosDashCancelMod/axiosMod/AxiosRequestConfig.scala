package typings.axiosDashCancel.axiosDashCancelMod.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosRequestConfig extends js.Object {
  var requestId: js.UndefOr[String] = js.undefined
}

object AxiosRequestConfig {
  @scala.inline
  def apply(requestId: String = null): AxiosRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxiosRequestConfig]
  }
}

