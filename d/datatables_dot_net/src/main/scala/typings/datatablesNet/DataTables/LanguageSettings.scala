package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "callback-functions"
//#region "language-settings"
// these are all optional
@js.native
trait LanguageSettings extends js.Object {
  var aria: js.UndefOr[LanguageAriaSettings] = js.native
  var decimal: js.UndefOr[String] = js.native
  var emptyTable: js.UndefOr[String] = js.native
  var info: js.UndefOr[String] = js.native
  var infoEmpty: js.UndefOr[String] = js.native
  var infoFiltered: js.UndefOr[String] = js.native
  var infoPostFix: js.UndefOr[String] = js.native
  var lengthMenu: js.UndefOr[String] = js.native
  var loadingRecords: js.UndefOr[String] = js.native
  var paginate: js.UndefOr[LanguagePaginateSettings] = js.native
  var processing: js.UndefOr[String] = js.native
  var search: js.UndefOr[String] = js.native
  var searchPlaceholder: js.UndefOr[String] = js.native
  var thousands: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var zeroRecords: js.UndefOr[String] = js.native
}

object LanguageSettings {
  @scala.inline
  def apply(): LanguageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageSettings]
  }
  @scala.inline
  implicit class LanguageSettingsOps[Self <: LanguageSettings] (val x: Self) extends AnyVal {
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
    def setAria(value: LanguageAriaSettings): Self = this.set("aria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAria: Self = this.set("aria", js.undefined)
    @scala.inline
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    @scala.inline
    def setEmptyTable(value: String): Self = this.set("emptyTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyTable: Self = this.set("emptyTable", js.undefined)
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setInfoEmpty(value: String): Self = this.set("infoEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoEmpty: Self = this.set("infoEmpty", js.undefined)
    @scala.inline
    def setInfoFiltered(value: String): Self = this.set("infoFiltered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoFiltered: Self = this.set("infoFiltered", js.undefined)
    @scala.inline
    def setInfoPostFix(value: String): Self = this.set("infoPostFix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoPostFix: Self = this.set("infoPostFix", js.undefined)
    @scala.inline
    def setLengthMenu(value: String): Self = this.set("lengthMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLengthMenu: Self = this.set("lengthMenu", js.undefined)
    @scala.inline
    def setLoadingRecords(value: String): Self = this.set("loadingRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingRecords: Self = this.set("loadingRecords", js.undefined)
    @scala.inline
    def setPaginate(value: LanguagePaginateSettings): Self = this.set("paginate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginate: Self = this.set("paginate", js.undefined)
    @scala.inline
    def setProcessing(value: String): Self = this.set("processing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessing: Self = this.set("processing", js.undefined)
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setSearchPlaceholder(value: String): Self = this.set("searchPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchPlaceholder: Self = this.set("searchPlaceholder", js.undefined)
    @scala.inline
    def setThousands(value: String): Self = this.set("thousands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThousands: Self = this.set("thousands", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setZeroRecords(value: String): Self = this.set("zeroRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZeroRecords: Self = this.set("zeroRecords", js.undefined)
  }
  
}

