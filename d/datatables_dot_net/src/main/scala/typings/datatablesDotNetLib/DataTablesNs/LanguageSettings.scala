package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "callback-functions"
//#region "language-settings"
// these are all optional
trait LanguageSettings extends js.Object {
  var aria: js.UndefOr[LanguageAriaSettings] = js.undefined
  var emptyTable: js.UndefOr[java.lang.String] = js.undefined
  var info: js.UndefOr[java.lang.String] = js.undefined
  var infoEmpty: js.UndefOr[java.lang.String] = js.undefined
  var infoFiltered: js.UndefOr[java.lang.String] = js.undefined
  var infoPostFix: js.UndefOr[java.lang.String] = js.undefined
  var lengthMenu: js.UndefOr[java.lang.String] = js.undefined
  var loadingRecords: js.UndefOr[java.lang.String] = js.undefined
  var paginate: js.UndefOr[LanguagePaginateSettings] = js.undefined
  var processing: js.UndefOr[java.lang.String] = js.undefined
  var search: js.UndefOr[java.lang.String] = js.undefined
  var searchPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var thousands: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var zeroRecords: js.UndefOr[java.lang.String] = js.undefined
}

object LanguageSettings {
  @scala.inline
  def apply(
    aria: LanguageAriaSettings = null,
    emptyTable: java.lang.String = null,
    info: java.lang.String = null,
    infoEmpty: java.lang.String = null,
    infoFiltered: java.lang.String = null,
    infoPostFix: java.lang.String = null,
    lengthMenu: java.lang.String = null,
    loadingRecords: java.lang.String = null,
    paginate: LanguagePaginateSettings = null,
    processing: java.lang.String = null,
    search: java.lang.String = null,
    searchPlaceholder: java.lang.String = null,
    thousands: java.lang.String = null,
    url: java.lang.String = null,
    zeroRecords: java.lang.String = null
  ): LanguageSettings = {
    val __obj = js.Dynamic.literal()
    if (aria != null) __obj.updateDynamic("aria")(aria)
    if (emptyTable != null) __obj.updateDynamic("emptyTable")(emptyTable)
    if (info != null) __obj.updateDynamic("info")(info)
    if (infoEmpty != null) __obj.updateDynamic("infoEmpty")(infoEmpty)
    if (infoFiltered != null) __obj.updateDynamic("infoFiltered")(infoFiltered)
    if (infoPostFix != null) __obj.updateDynamic("infoPostFix")(infoPostFix)
    if (lengthMenu != null) __obj.updateDynamic("lengthMenu")(lengthMenu)
    if (loadingRecords != null) __obj.updateDynamic("loadingRecords")(loadingRecords)
    if (paginate != null) __obj.updateDynamic("paginate")(paginate)
    if (processing != null) __obj.updateDynamic("processing")(processing)
    if (search != null) __obj.updateDynamic("search")(search)
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder)
    if (thousands != null) __obj.updateDynamic("thousands")(thousands)
    if (url != null) __obj.updateDynamic("url")(url)
    if (zeroRecords != null) __obj.updateDynamic("zeroRecords")(zeroRecords)
    __obj.asInstanceOf[LanguageSettings]
  }
}

