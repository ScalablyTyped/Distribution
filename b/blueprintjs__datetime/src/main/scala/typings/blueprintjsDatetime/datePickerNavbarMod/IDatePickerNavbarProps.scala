package typings.blueprintjsDatetime.datePickerNavbarMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavbarElementProps * / any */ trait IDatePickerNavbarProps extends js.Object {
  var hideLeftNavButton: js.UndefOr[Boolean] = js.undefined
  var hideRightNavButton: js.UndefOr[Boolean] = js.undefined
  var maxDate: Date
  var minDate: Date
}

object IDatePickerNavbarProps {
  @scala.inline
  def apply(
    maxDate: Date,
    minDate: Date,
    hideLeftNavButton: js.UndefOr[Boolean] = js.undefined,
    hideRightNavButton: js.UndefOr[Boolean] = js.undefined
  ): IDatePickerNavbarProps = {
    val __obj = js.Dynamic.literal(maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLeftNavButton)) __obj.updateDynamic("hideLeftNavButton")(hideLeftNavButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hideRightNavButton)) __obj.updateDynamic("hideRightNavButton")(hideRightNavButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerNavbarProps]
  }
}

