package typings.chrome.chrome.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UninstallOptions extends js.Object {
  /**
    * Optional.
    * Whether or not a confirm-uninstall dialog should prompt the user. Defaults to false for self uninstalls. If an extension uninstalls another extension, this parameter is ignored and the dialog is always shown.
    */
  var showConfirmDialog: js.UndefOr[Boolean] = js.native
}

object UninstallOptions {
  @scala.inline
  def apply(): UninstallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UninstallOptions]
  }
  @scala.inline
  implicit class UninstallOptionsOps[Self <: UninstallOptions] (val x: Self) extends AnyVal {
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
    def setShowConfirmDialog(value: Boolean): Self = this.set("showConfirmDialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowConfirmDialog: Self = this.set("showConfirmDialog", js.undefined)
  }
  
}

