package typings
package baseuiLib.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationOverrides extends js.Object {
  var DropdownContainer: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var MaxLabel: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var NextButton: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var PrevButton: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Select: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object PaginationOverrides {
  @scala.inline
  def apply(
    DropdownContainer: baseuiLib.Override[_] = null,
    MaxLabel: baseuiLib.Override[_] = null,
    NextButton: baseuiLib.Override[_] = null,
    PrevButton: baseuiLib.Override[_] = null,
    Root: baseuiLib.Override[_] = null,
    Select: baseuiLib.Override[_] = null
  ): PaginationOverrides = {
    val __obj = js.Dynamic.literal()
    if (DropdownContainer != null) __obj.updateDynamic("DropdownContainer")(DropdownContainer.asInstanceOf[js.Any])
    if (MaxLabel != null) __obj.updateDynamic("MaxLabel")(MaxLabel.asInstanceOf[js.Any])
    if (NextButton != null) __obj.updateDynamic("NextButton")(NextButton.asInstanceOf[js.Any])
    if (PrevButton != null) __obj.updateDynamic("PrevButton")(PrevButton.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (Select != null) __obj.updateDynamic("Select")(Select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOverrides]
  }
}

