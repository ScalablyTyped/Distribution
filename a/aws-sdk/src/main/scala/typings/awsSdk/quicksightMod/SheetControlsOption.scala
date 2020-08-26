package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetControlsOption extends js.Object {
  /**
    * Visibility state.
    */
  var VisibilityState: js.UndefOr[DashboardUIState] = js.native
}

object SheetControlsOption {
  @scala.inline
  def apply(): SheetControlsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetControlsOption]
  }
  @scala.inline
  implicit class SheetControlsOptionOps[Self <: SheetControlsOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVisibilityState(value: DashboardUIState): Self = this.set("VisibilityState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibilityState: Self = this.set("VisibilityState", js.undefined)
  }
  
}

