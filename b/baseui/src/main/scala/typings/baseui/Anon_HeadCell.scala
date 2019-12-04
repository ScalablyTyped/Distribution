package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadCell extends js.Object {
  var HeadCell: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var SortableLabel: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object Anon_HeadCell {
  @scala.inline
  def apply(
    HeadCell: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    SortableLabel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): Anon_HeadCell = {
    val __obj = js.Dynamic.literal()
    if (HeadCell != null) __obj.updateDynamic("HeadCell")(HeadCell.asInstanceOf[js.Any])
    if (SortableLabel != null) __obj.updateDynamic("SortableLabel")(SortableLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadCell]
  }
}

