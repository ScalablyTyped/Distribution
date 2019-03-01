package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageLegacy extends js.Object {
  var oAria: js.UndefOr[LanguageAriaLegacy] = js.undefined
  var oPaginate: js.UndefOr[LanguagePaginateLegacy] = js.undefined
  var sEmptyTable: js.UndefOr[java.lang.String] = js.undefined
  var sInfo: js.UndefOr[java.lang.String] = js.undefined
  var sInfoEmpty: js.UndefOr[java.lang.String] = js.undefined
  var sInfoFiltered: js.UndefOr[java.lang.String] = js.undefined
  var sInfoPostFix: js.UndefOr[java.lang.String] = js.undefined
  var sInfoThousands: js.UndefOr[java.lang.String] = js.undefined
  var sLengthMenu: js.UndefOr[java.lang.String] = js.undefined
  var sLoadingRecords: js.UndefOr[java.lang.String] = js.undefined
  var sProcessing: js.UndefOr[java.lang.String] = js.undefined
  var sSearch: js.UndefOr[java.lang.String] = js.undefined
  var sUrl: js.UndefOr[java.lang.String] = js.undefined
  var sZeroRecords: js.UndefOr[java.lang.String] = js.undefined
}

object LanguageLegacy {
  @scala.inline
  def apply(
    oAria: LanguageAriaLegacy = null,
    oPaginate: LanguagePaginateLegacy = null,
    sEmptyTable: java.lang.String = null,
    sInfo: java.lang.String = null,
    sInfoEmpty: java.lang.String = null,
    sInfoFiltered: java.lang.String = null,
    sInfoPostFix: java.lang.String = null,
    sInfoThousands: java.lang.String = null,
    sLengthMenu: java.lang.String = null,
    sLoadingRecords: java.lang.String = null,
    sProcessing: java.lang.String = null,
    sSearch: java.lang.String = null,
    sUrl: java.lang.String = null,
    sZeroRecords: java.lang.String = null
  ): LanguageLegacy = {
    val __obj = js.Dynamic.literal()
    if (oAria != null) __obj.updateDynamic("oAria")(oAria)
    if (oPaginate != null) __obj.updateDynamic("oPaginate")(oPaginate)
    if (sEmptyTable != null) __obj.updateDynamic("sEmptyTable")(sEmptyTable)
    if (sInfo != null) __obj.updateDynamic("sInfo")(sInfo)
    if (sInfoEmpty != null) __obj.updateDynamic("sInfoEmpty")(sInfoEmpty)
    if (sInfoFiltered != null) __obj.updateDynamic("sInfoFiltered")(sInfoFiltered)
    if (sInfoPostFix != null) __obj.updateDynamic("sInfoPostFix")(sInfoPostFix)
    if (sInfoThousands != null) __obj.updateDynamic("sInfoThousands")(sInfoThousands)
    if (sLengthMenu != null) __obj.updateDynamic("sLengthMenu")(sLengthMenu)
    if (sLoadingRecords != null) __obj.updateDynamic("sLoadingRecords")(sLoadingRecords)
    if (sProcessing != null) __obj.updateDynamic("sProcessing")(sProcessing)
    if (sSearch != null) __obj.updateDynamic("sSearch")(sSearch)
    if (sUrl != null) __obj.updateDynamic("sUrl")(sUrl)
    if (sZeroRecords != null) __obj.updateDynamic("sZeroRecords")(sZeroRecords)
    __obj.asInstanceOf[LanguageLegacy]
  }
}

