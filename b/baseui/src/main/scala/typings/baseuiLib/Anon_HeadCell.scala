package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadCell extends js.Object {
  var HeadCell: js.UndefOr[Override[_]] = js.undefined
  var SortableLabel: js.UndefOr[Override[_]] = js.undefined
}

object Anon_HeadCell {
  @scala.inline
  def apply(HeadCell: Override[_] = null, SortableLabel: Override[_] = null): Anon_HeadCell = {
    val __obj = js.Dynamic.literal()
    if (HeadCell != null) __obj.updateDynamic("HeadCell")(HeadCell.asInstanceOf[js.Any])
    if (SortableLabel != null) __obj.updateDynamic("SortableLabel")(SortableLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadCell]
  }
}

