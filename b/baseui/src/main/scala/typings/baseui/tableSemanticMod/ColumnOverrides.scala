package typings.baseui.tableSemanticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnOverrides extends js.Object {
  var SortAscIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var SortDescIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var SortNoneIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var TableBodyCell: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var TableHeadCell: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var TableHeadCellSortable: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object ColumnOverrides {
  @scala.inline
  def apply(
    SortAscIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    SortDescIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    SortNoneIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    TableBodyCell: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    TableHeadCell: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    TableHeadCellSortable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): ColumnOverrides = {
    val __obj = js.Dynamic.literal()
    if (SortAscIcon != null) __obj.updateDynamic("SortAscIcon")(SortAscIcon.asInstanceOf[js.Any])
    if (SortDescIcon != null) __obj.updateDynamic("SortDescIcon")(SortDescIcon.asInstanceOf[js.Any])
    if (SortNoneIcon != null) __obj.updateDynamic("SortNoneIcon")(SortNoneIcon.asInstanceOf[js.Any])
    if (TableBodyCell != null) __obj.updateDynamic("TableBodyCell")(TableBodyCell.asInstanceOf[js.Any])
    if (TableHeadCell != null) __obj.updateDynamic("TableHeadCell")(TableHeadCell.asInstanceOf[js.Any])
    if (TableHeadCellSortable != null) __obj.updateDynamic("TableHeadCellSortable")(TableHeadCellSortable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnOverrides]
  }
}

