package typings
package cordovaDashPluginDashFileDashOpener2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.UndefOr[js.Function1[/* error */ CordovaPluginsFileOpener2Result, scala.Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* result */ CordovaPluginsFileOpener2Result, scala.Unit]] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(
    error: /* error */ CordovaPluginsFileOpener2Result => scala.Unit = null,
    success: /* result */ CordovaPluginsFileOpener2Result => scala.Unit = null
  ): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[Anon_Error]
  }
}

