package typings.atAwsDashSdkTypes.buildHttpMod

import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHandlerOptions extends js.Object {
  var abortSignal: js.UndefOr[AbortSignal] = js.undefined
}

object HttpHandlerOptions {
  @scala.inline
  def apply(abortSignal: AbortSignal = null): HttpHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (abortSignal != null) __obj.updateDynamic("abortSignal")(abortSignal.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpHandlerOptions]
  }
}

