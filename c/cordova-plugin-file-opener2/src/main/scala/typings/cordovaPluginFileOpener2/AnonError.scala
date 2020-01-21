package typings.cordovaPluginFileOpener2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.UndefOr[js.Function1[/* error */ CordovaPluginsFileOpener2Result, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* result */ CordovaPluginsFileOpener2Result, Unit]] = js.undefined
}

object AnonError {
  @scala.inline
  def apply(
    error: /* error */ CordovaPluginsFileOpener2Result => Unit = null,
    success: /* result */ CordovaPluginsFileOpener2Result => Unit = null
  ): AnonError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AnonError]
  }
}

