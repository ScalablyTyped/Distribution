package typings
package cordovaDashPluginDashFileDashOpener2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPluginsFileOpener2CallbackContext extends js.Object {
  var error: js.UndefOr[js.Function1[/* error */ CordovaPluginsFileOpener2Result, scala.Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object CordovaPluginsFileOpener2CallbackContext {
  @scala.inline
  def apply(
    error: /* error */ CordovaPluginsFileOpener2Result => scala.Unit = null,
    success: () => scala.Unit = null
  ): CordovaPluginsFileOpener2CallbackContext = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[CordovaPluginsFileOpener2CallbackContext]
  }
}

