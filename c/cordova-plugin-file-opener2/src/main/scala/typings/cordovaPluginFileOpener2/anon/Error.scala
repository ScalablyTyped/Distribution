package typings.cordovaPluginFileOpener2.anon

import typings.cordovaPluginFileOpener2.CordovaPluginsFileOpener2Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  var error: js.UndefOr[js.Function1[/* error */ CordovaPluginsFileOpener2Result, Unit]] = js.native
  var success: js.UndefOr[js.Function1[/* result */ CordovaPluginsFileOpener2Result, Unit]] = js.native
}

object Error {
  @scala.inline
  def apply(): Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: /* error */ CordovaPluginsFileOpener2Result => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ CordovaPluginsFileOpener2Result => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

