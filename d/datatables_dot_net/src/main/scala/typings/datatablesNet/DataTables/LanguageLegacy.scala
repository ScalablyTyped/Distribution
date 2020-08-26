package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageLegacy extends js.Object {
  var oAria: js.UndefOr[LanguageAriaLegacy] = js.native
  var oPaginate: js.UndefOr[LanguagePaginateLegacy] = js.native
  var sEmptyTable: js.UndefOr[String] = js.native
  var sInfo: js.UndefOr[String] = js.native
  var sInfoEmpty: js.UndefOr[String] = js.native
  var sInfoFiltered: js.UndefOr[String] = js.native
  var sInfoPostFix: js.UndefOr[String] = js.native
  var sInfoThousands: js.UndefOr[String] = js.native
  var sLengthMenu: js.UndefOr[String] = js.native
  var sLoadingRecords: js.UndefOr[String] = js.native
  var sProcessing: js.UndefOr[String] = js.native
  var sSearch: js.UndefOr[String] = js.native
  var sUrl: js.UndefOr[String] = js.native
  var sZeroRecords: js.UndefOr[String] = js.native
}

object LanguageLegacy {
  @scala.inline
  def apply(): LanguageLegacy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageLegacy]
  }
  @scala.inline
  implicit class LanguageLegacyOps[Self <: LanguageLegacy] (val x: Self) extends AnyVal {
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
    def setOAria(value: LanguageAriaLegacy): Self = this.set("oAria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOAria: Self = this.set("oAria", js.undefined)
    @scala.inline
    def setOPaginate(value: LanguagePaginateLegacy): Self = this.set("oPaginate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOPaginate: Self = this.set("oPaginate", js.undefined)
    @scala.inline
    def setSEmptyTable(value: String): Self = this.set("sEmptyTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSEmptyTable: Self = this.set("sEmptyTable", js.undefined)
    @scala.inline
    def setSInfo(value: String): Self = this.set("sInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSInfo: Self = this.set("sInfo", js.undefined)
    @scala.inline
    def setSInfoEmpty(value: String): Self = this.set("sInfoEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSInfoEmpty: Self = this.set("sInfoEmpty", js.undefined)
    @scala.inline
    def setSInfoFiltered(value: String): Self = this.set("sInfoFiltered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSInfoFiltered: Self = this.set("sInfoFiltered", js.undefined)
    @scala.inline
    def setSInfoPostFix(value: String): Self = this.set("sInfoPostFix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSInfoPostFix: Self = this.set("sInfoPostFix", js.undefined)
    @scala.inline
    def setSInfoThousands(value: String): Self = this.set("sInfoThousands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSInfoThousands: Self = this.set("sInfoThousands", js.undefined)
    @scala.inline
    def setSLengthMenu(value: String): Self = this.set("sLengthMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSLengthMenu: Self = this.set("sLengthMenu", js.undefined)
    @scala.inline
    def setSLoadingRecords(value: String): Self = this.set("sLoadingRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSLoadingRecords: Self = this.set("sLoadingRecords", js.undefined)
    @scala.inline
    def setSProcessing(value: String): Self = this.set("sProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSProcessing: Self = this.set("sProcessing", js.undefined)
    @scala.inline
    def setSSearch(value: String): Self = this.set("sSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSearch: Self = this.set("sSearch", js.undefined)
    @scala.inline
    def setSUrl(value: String): Self = this.set("sUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSUrl: Self = this.set("sUrl", js.undefined)
    @scala.inline
    def setSZeroRecords(value: String): Self = this.set("sZeroRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSZeroRecords: Self = this.set("sZeroRecords", js.undefined)
  }
  
}

