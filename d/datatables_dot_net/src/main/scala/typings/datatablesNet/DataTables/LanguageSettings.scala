package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "callback-functions"
//#region "language-settings"
// these are all optional
trait LanguageSettings extends js.Object {
  var aria: js.UndefOr[LanguageAriaSettings] = js.undefined
  var decimal: js.UndefOr[String] = js.undefined
  var emptyTable: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[String] = js.undefined
  var infoEmpty: js.UndefOr[String] = js.undefined
  var infoFiltered: js.UndefOr[String] = js.undefined
  var infoPostFix: js.UndefOr[String] = js.undefined
  var lengthMenu: js.UndefOr[String] = js.undefined
  var loadingRecords: js.UndefOr[String] = js.undefined
  var paginate: js.UndefOr[LanguagePaginateSettings] = js.undefined
  var processing: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  var thousands: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var zeroRecords: js.UndefOr[String] = js.undefined
}

object LanguageSettings {
  @scala.inline
  def apply(
    aria: LanguageAriaSettings = null,
    decimal: String = null,
    emptyTable: String = null,
    info: String = null,
    infoEmpty: String = null,
    infoFiltered: String = null,
    infoPostFix: String = null,
    lengthMenu: String = null,
    loadingRecords: String = null,
    paginate: LanguagePaginateSettings = null,
    processing: String = null,
    search: String = null,
    searchPlaceholder: String = null,
    thousands: String = null,
    url: String = null,
    zeroRecords: String = null
  ): LanguageSettings = {
    val __obj = js.Dynamic.literal()
    if (aria != null) __obj.updateDynamic("aria")(aria.asInstanceOf[js.Any])
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (emptyTable != null) __obj.updateDynamic("emptyTable")(emptyTable.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (infoEmpty != null) __obj.updateDynamic("infoEmpty")(infoEmpty.asInstanceOf[js.Any])
    if (infoFiltered != null) __obj.updateDynamic("infoFiltered")(infoFiltered.asInstanceOf[js.Any])
    if (infoPostFix != null) __obj.updateDynamic("infoPostFix")(infoPostFix.asInstanceOf[js.Any])
    if (lengthMenu != null) __obj.updateDynamic("lengthMenu")(lengthMenu.asInstanceOf[js.Any])
    if (loadingRecords != null) __obj.updateDynamic("loadingRecords")(loadingRecords.asInstanceOf[js.Any])
    if (paginate != null) __obj.updateDynamic("paginate")(paginate.asInstanceOf[js.Any])
    if (processing != null) __obj.updateDynamic("processing")(processing.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (thousands != null) __obj.updateDynamic("thousands")(thousands.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (zeroRecords != null) __obj.updateDynamic("zeroRecords")(zeroRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageSettings]
  }
}

