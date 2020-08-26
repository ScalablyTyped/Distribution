package typings.baseui.datepickerMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedStylePropsT extends js.Object {
  @JSName("$date")
  var $date: Date = js.native
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  @JSName("$hasRangeHighlighted")
  var $hasRangeHighlighted: Boolean = js.native
  @JSName("$hasRangeOnRight")
  var $hasRangeOnRight: Boolean = js.native
  @JSName("$hasRangeSelected")
  var $hasRangeSelected: Boolean = js.native
  @JSName("$isHeader")
  var $isHeader: Boolean = js.native
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean = js.native
  @JSName("$isHovered")
  var $isHovered: Boolean = js.native
  @JSName("$outsideMonth")
  var $outsideMonth: Boolean = js.native
  @JSName("$pseudoHighlighted")
  var $pseudoHighlighted: Boolean = js.native
  @JSName("$pseudoSelected")
  var $pseudoSelected: Boolean = js.native
  @JSName("$range")
  var $range: Boolean = js.native
  @JSName("$selected")
  var $selected: Boolean = js.native
  @JSName("$startDate")
  var $startDate: Boolean = js.native
}

object SharedStylePropsT {
  @scala.inline
  def apply(
    $date: Date,
    $disabled: Boolean,
    $hasRangeHighlighted: Boolean,
    $hasRangeOnRight: Boolean,
    $hasRangeSelected: Boolean,
    $isHeader: Boolean,
    $isHighlighted: Boolean,
    $isHovered: Boolean,
    $outsideMonth: Boolean,
    $pseudoHighlighted: Boolean,
    $pseudoSelected: Boolean,
    $range: Boolean,
    $selected: Boolean,
    $startDate: Boolean
  ): SharedStylePropsT = {
    val __obj = js.Dynamic.literal($date = $date.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $hasRangeHighlighted = $hasRangeHighlighted.asInstanceOf[js.Any], $hasRangeOnRight = $hasRangeOnRight.asInstanceOf[js.Any], $hasRangeSelected = $hasRangeSelected.asInstanceOf[js.Any], $isHeader = $isHeader.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $isHovered = $isHovered.asInstanceOf[js.Any], $outsideMonth = $outsideMonth.asInstanceOf[js.Any], $pseudoHighlighted = $pseudoHighlighted.asInstanceOf[js.Any], $pseudoSelected = $pseudoSelected.asInstanceOf[js.Any], $range = $range.asInstanceOf[js.Any], $selected = $selected.asInstanceOf[js.Any], $startDate = $startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsT]
  }
  @scala.inline
  implicit class SharedStylePropsTOps[Self <: SharedStylePropsT] (val x: Self) extends AnyVal {
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
    def set$date(value: Date): Self = this.set("$date", value.asInstanceOf[js.Any])
    @scala.inline
    def set$disabled(value: Boolean): Self = this.set("$disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def set$hasRangeHighlighted(value: Boolean): Self = this.set("$hasRangeHighlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def set$hasRangeOnRight(value: Boolean): Self = this.set("$hasRangeOnRight", value.asInstanceOf[js.Any])
    @scala.inline
    def set$hasRangeSelected(value: Boolean): Self = this.set("$hasRangeSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def set$isHeader(value: Boolean): Self = this.set("$isHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def set$isHighlighted(value: Boolean): Self = this.set("$isHighlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def set$isHovered(value: Boolean): Self = this.set("$isHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def set$outsideMonth(value: Boolean): Self = this.set("$outsideMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def set$pseudoHighlighted(value: Boolean): Self = this.set("$pseudoHighlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def set$pseudoSelected(value: Boolean): Self = this.set("$pseudoSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def set$range(value: Boolean): Self = this.set("$range", value.asInstanceOf[js.Any])
    @scala.inline
    def set$selected(value: Boolean): Self = this.set("$selected", value.asInstanceOf[js.Any])
    @scala.inline
    def set$startDate(value: Boolean): Self = this.set("$startDate", value.asInstanceOf[js.Any])
  }
  
}

