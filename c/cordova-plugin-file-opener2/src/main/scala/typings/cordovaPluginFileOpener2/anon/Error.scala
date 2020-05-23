package typings.cordovaPluginFileOpener2.anon

import typings.cordovaPluginFileOpener2.CordovaPluginsFileOpener2Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.UndefOr[js.Function1[/* error */ CordovaPluginsFileOpener2Result, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* result */ CordovaPluginsFileOpener2Result, Unit]] = js.undefined
}

object Error {
  @scala.inline
  def apply(
    error: /* error */ CordovaPluginsFileOpener2Result => Unit = null,
    success: /* result */ CordovaPluginsFileOpener2Result => Unit = null
  ): Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[Error]
  }
}

