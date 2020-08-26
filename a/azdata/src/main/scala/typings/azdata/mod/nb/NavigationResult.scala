package typings.azdata.mod.nb

import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationResult extends js.Object {
  var hasNavigation: Boolean = js.native
  var next: js.UndefOr[Uri] = js.native
  var previous: js.UndefOr[Uri] = js.native
}

object NavigationResult {
  @scala.inline
  def apply(hasNavigation: Boolean): NavigationResult = {
    val __obj = js.Dynamic.literal(hasNavigation = hasNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationResult]
  }
  @scala.inline
  implicit class NavigationResultOps[Self <: NavigationResult] (val x: Self) extends AnyVal {
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
    def setHasNavigation(value: Boolean): Self = this.set("hasNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: Uri): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setPrevious(value: Uri): Self = this.set("previous", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
  }
  
}

