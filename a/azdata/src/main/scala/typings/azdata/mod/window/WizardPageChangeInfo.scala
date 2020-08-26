package typings.azdata.mod.window

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WizardPageChangeInfo extends js.Object {
  /**
    * The page number that the wizard changed from
    */
  var lastPage: Double = js.native
  /**
    * The new page number or undefined if the user is closing the wizard
    */
  var newPage: Double = js.native
}

object WizardPageChangeInfo {
  @scala.inline
  def apply(lastPage: Double, newPage: Double): WizardPageChangeInfo = {
    val __obj = js.Dynamic.literal(lastPage = lastPage.asInstanceOf[js.Any], newPage = newPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizardPageChangeInfo]
  }
  @scala.inline
  implicit class WizardPageChangeInfoOps[Self <: WizardPageChangeInfo] (val x: Self) extends AnyVal {
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
    def setLastPage(value: Double): Self = this.set("lastPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewPage(value: Double): Self = this.set("newPage", value.asInstanceOf[js.Any])
  }
  
}

