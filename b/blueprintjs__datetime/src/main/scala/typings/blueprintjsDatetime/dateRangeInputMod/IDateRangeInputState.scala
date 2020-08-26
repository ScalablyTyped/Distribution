package typings.blueprintjsDatetime.dateRangeInputMod

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateRangeInputState extends js.Object {
  var boundaryToModify: js.UndefOr[Boundary] = js.native
  var endHoverString: js.UndefOr[String] = js.native
  var endInputString: js.UndefOr[String] = js.native
  var formattedMaxDateString: js.UndefOr[String] = js.native
  var formattedMinDateString: js.UndefOr[String] = js.native
  var isEndInputFocused: js.UndefOr[Boolean] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var isStartInputFocused: js.UndefOr[Boolean] = js.native
  var lastFocusedField: js.UndefOr[Boundary] = js.native
  var selectedEnd: js.UndefOr[Date] = js.native
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  var selectedStart: js.UndefOr[Date] = js.native
  var shouldSelectAfterUpdate: js.UndefOr[Boolean] = js.native
  var startHoverString: js.UndefOr[String] = js.native
  var startInputString: js.UndefOr[String] = js.native
  var wasLastFocusChangeDueToHover: js.UndefOr[Boolean] = js.native
}

object IDateRangeInputState {
  @scala.inline
  def apply(): IDateRangeInputState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateRangeInputState]
  }
  @scala.inline
  implicit class IDateRangeInputStateOps[Self <: IDateRangeInputState] (val x: Self) extends AnyVal {
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
    def setBoundaryToModify(value: Boundary): Self = this.set("boundaryToModify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundaryToModify: Self = this.set("boundaryToModify", js.undefined)
    @scala.inline
    def setEndHoverString(value: String): Self = this.set("endHoverString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndHoverString: Self = this.set("endHoverString", js.undefined)
    @scala.inline
    def setEndInputString(value: String): Self = this.set("endInputString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndInputString: Self = this.set("endInputString", js.undefined)
    @scala.inline
    def setFormattedMaxDateString(value: String): Self = this.set("formattedMaxDateString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedMaxDateString: Self = this.set("formattedMaxDateString", js.undefined)
    @scala.inline
    def setFormattedMinDateString(value: String): Self = this.set("formattedMinDateString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedMinDateString: Self = this.set("formattedMinDateString", js.undefined)
    @scala.inline
    def setIsEndInputFocused(value: Boolean): Self = this.set("isEndInputFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEndInputFocused: Self = this.set("isEndInputFocused", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setIsStartInputFocused(value: Boolean): Self = this.set("isStartInputFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStartInputFocused: Self = this.set("isStartInputFocused", js.undefined)
    @scala.inline
    def setLastFocusedField(value: Boundary): Self = this.set("lastFocusedField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastFocusedField: Self = this.set("lastFocusedField", js.undefined)
    @scala.inline
    def setSelectedEnd(value: Date): Self = this.set("selectedEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedEnd: Self = this.set("selectedEnd", js.undefined)
    @scala.inline
    def setSelectedShortcutIndex(value: Double): Self = this.set("selectedShortcutIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedShortcutIndex: Self = this.set("selectedShortcutIndex", js.undefined)
    @scala.inline
    def setSelectedStart(value: Date): Self = this.set("selectedStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedStart: Self = this.set("selectedStart", js.undefined)
    @scala.inline
    def setShouldSelectAfterUpdate(value: Boolean): Self = this.set("shouldSelectAfterUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldSelectAfterUpdate: Self = this.set("shouldSelectAfterUpdate", js.undefined)
    @scala.inline
    def setStartHoverString(value: String): Self = this.set("startHoverString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartHoverString: Self = this.set("startHoverString", js.undefined)
    @scala.inline
    def setStartInputString(value: String): Self = this.set("startInputString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartInputString: Self = this.set("startInputString", js.undefined)
    @scala.inline
    def setWasLastFocusChangeDueToHover(value: Boolean): Self = this.set("wasLastFocusChangeDueToHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWasLastFocusChangeDueToHover: Self = this.set("wasLastFocusChangeDueToHover", js.undefined)
  }
  
}

