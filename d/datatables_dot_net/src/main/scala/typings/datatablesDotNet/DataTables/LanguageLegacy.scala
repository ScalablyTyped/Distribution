package typings.datatablesDotNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageLegacy extends js.Object {
  var oAria: js.UndefOr[LanguageAriaLegacy] = js.undefined
  var oPaginate: js.UndefOr[LanguagePaginateLegacy] = js.undefined
  var sEmptyTable: js.UndefOr[String] = js.undefined
  var sInfo: js.UndefOr[String] = js.undefined
  var sInfoEmpty: js.UndefOr[String] = js.undefined
  var sInfoFiltered: js.UndefOr[String] = js.undefined
  var sInfoPostFix: js.UndefOr[String] = js.undefined
  var sInfoThousands: js.UndefOr[String] = js.undefined
  var sLengthMenu: js.UndefOr[String] = js.undefined
  var sLoadingRecords: js.UndefOr[String] = js.undefined
  var sProcessing: js.UndefOr[String] = js.undefined
  var sSearch: js.UndefOr[String] = js.undefined
  var sUrl: js.UndefOr[String] = js.undefined
  var sZeroRecords: js.UndefOr[String] = js.undefined
}

object LanguageLegacy {
  @scala.inline
  def apply(
    oAria: LanguageAriaLegacy = null,
    oPaginate: LanguagePaginateLegacy = null,
    sEmptyTable: String = null,
    sInfo: String = null,
    sInfoEmpty: String = null,
    sInfoFiltered: String = null,
    sInfoPostFix: String = null,
    sInfoThousands: String = null,
    sLengthMenu: String = null,
    sLoadingRecords: String = null,
    sProcessing: String = null,
    sSearch: String = null,
    sUrl: String = null,
    sZeroRecords: String = null
  ): LanguageLegacy = {
    val __obj = js.Dynamic.literal()
    if (oAria != null) __obj.updateDynamic("oAria")(oAria.asInstanceOf[js.Any])
    if (oPaginate != null) __obj.updateDynamic("oPaginate")(oPaginate.asInstanceOf[js.Any])
    if (sEmptyTable != null) __obj.updateDynamic("sEmptyTable")(sEmptyTable.asInstanceOf[js.Any])
    if (sInfo != null) __obj.updateDynamic("sInfo")(sInfo.asInstanceOf[js.Any])
    if (sInfoEmpty != null) __obj.updateDynamic("sInfoEmpty")(sInfoEmpty.asInstanceOf[js.Any])
    if (sInfoFiltered != null) __obj.updateDynamic("sInfoFiltered")(sInfoFiltered.asInstanceOf[js.Any])
    if (sInfoPostFix != null) __obj.updateDynamic("sInfoPostFix")(sInfoPostFix.asInstanceOf[js.Any])
    if (sInfoThousands != null) __obj.updateDynamic("sInfoThousands")(sInfoThousands.asInstanceOf[js.Any])
    if (sLengthMenu != null) __obj.updateDynamic("sLengthMenu")(sLengthMenu.asInstanceOf[js.Any])
    if (sLoadingRecords != null) __obj.updateDynamic("sLoadingRecords")(sLoadingRecords.asInstanceOf[js.Any])
    if (sProcessing != null) __obj.updateDynamic("sProcessing")(sProcessing.asInstanceOf[js.Any])
    if (sSearch != null) __obj.updateDynamic("sSearch")(sSearch.asInstanceOf[js.Any])
    if (sUrl != null) __obj.updateDynamic("sUrl")(sUrl.asInstanceOf[js.Any])
    if (sZeroRecords != null) __obj.updateDynamic("sZeroRecords")(sZeroRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageLegacy]
  }
}

