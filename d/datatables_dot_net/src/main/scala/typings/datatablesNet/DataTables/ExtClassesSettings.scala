package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtClassesSettings extends js.Object {
  /**
    * Default Value:
    * dataTables_filter
    */
  var sFilter: js.UndefOr[String] = js.native
  var sFilterInput: js.UndefOr[String] = js.native
  var sFooterTH: js.UndefOr[String] = js.native
  var sHeaderTH: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_info
    */
  var sInfo: js.UndefOr[String] = js.native
  var sJUIFooter: js.UndefOr[String] = js.native
  var sJUIHeader: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_length
    */
  var sLength: js.UndefOr[String] = js.native
  var sLengthSelect: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * no-footer
    */
  var sNoFooter: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * paginate_button
    */
  var sPageButton: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * current
    */
  var sPageButtonActive: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * disabled
    */
  var sPageButtonDisabled: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_paginate paging_
    */
  var sPaging: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_processing
    */
  var sProcessing: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_empty
    */
  var sRowEmpty: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_scrollBody
    */
  var sScrollBody: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_scrollFoot
    */
  var sScrollFoot: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_scrollFootInner
    */
  var sScrollFootInner: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_scrollHead
    */
  var sScrollHead: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_scrollHeadInner
    */
  var sScrollHeadInner: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_scroll
    */
  var sScrollWrapper: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * sorting_asc
    */
  var sSortAsc: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * sorting_
    */
  var sSortColumn: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * sorting_desc
    */
  var sSortDesc: js.UndefOr[String] = js.native
  var sSortIcon: js.UndefOr[String] = js.native
  var sSortJUI: js.UndefOr[String] = js.native
  var sSortJUIAsc: js.UndefOr[String] = js.native
  var sSortJUIAscAllowed: js.UndefOr[String] = js.native
  var sSortJUIDesc: js.UndefOr[String] = js.native
  var sSortJUIDescAllowed: js.UndefOr[String] = js.native
  var sSortJUIWrapper: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * sorting
    */
  var sSortable: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * sorting_asc_disabled
    */
  var sSortableAsc: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * sorting_desc_disabled
    */
  var sSortableDesc: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * sorting_disabled
    */
  var sSortableNone: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * even
    */
  var sStripeEven: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * odd
    */
  var sStripeOdd: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTable
    */
  var sTable: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_wrapper
    */
  var sWrapper: js.UndefOr[String] = js.native
}

object ExtClassesSettings {
  @scala.inline
  def apply(): ExtClassesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtClassesSettings]
  }
  @scala.inline
  implicit class ExtClassesSettingsOps[Self <: ExtClassesSettings] (val x: Self) extends AnyVal {
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
    def setSFilter(value: String): Self = this.set("sFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSFilter: Self = this.set("sFilter", js.undefined)
    @scala.inline
    def setSFilterInput(value: String): Self = this.set("sFilterInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSFilterInput: Self = this.set("sFilterInput", js.undefined)
    @scala.inline
    def setSFooterTH(value: String): Self = this.set("sFooterTH", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSFooterTH: Self = this.set("sFooterTH", js.undefined)
    @scala.inline
    def setSHeaderTH(value: String): Self = this.set("sHeaderTH", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSHeaderTH: Self = this.set("sHeaderTH", js.undefined)
    @scala.inline
    def setSInfo(value: String): Self = this.set("sInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSInfo: Self = this.set("sInfo", js.undefined)
    @scala.inline
    def setSJUIFooter(value: String): Self = this.set("sJUIFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSJUIFooter: Self = this.set("sJUIFooter", js.undefined)
    @scala.inline
    def setSJUIHeader(value: String): Self = this.set("sJUIHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSJUIHeader: Self = this.set("sJUIHeader", js.undefined)
    @scala.inline
    def setSLength(value: String): Self = this.set("sLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSLength: Self = this.set("sLength", js.undefined)
    @scala.inline
    def setSLengthSelect(value: String): Self = this.set("sLengthSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSLengthSelect: Self = this.set("sLengthSelect", js.undefined)
    @scala.inline
    def setSNoFooter(value: String): Self = this.set("sNoFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSNoFooter: Self = this.set("sNoFooter", js.undefined)
    @scala.inline
    def setSPageButton(value: String): Self = this.set("sPageButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSPageButton: Self = this.set("sPageButton", js.undefined)
    @scala.inline
    def setSPageButtonActive(value: String): Self = this.set("sPageButtonActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSPageButtonActive: Self = this.set("sPageButtonActive", js.undefined)
    @scala.inline
    def setSPageButtonDisabled(value: String): Self = this.set("sPageButtonDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSPageButtonDisabled: Self = this.set("sPageButtonDisabled", js.undefined)
    @scala.inline
    def setSPaging(value: String): Self = this.set("sPaging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSPaging: Self = this.set("sPaging", js.undefined)
    @scala.inline
    def setSProcessing(value: String): Self = this.set("sProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSProcessing: Self = this.set("sProcessing", js.undefined)
    @scala.inline
    def setSRowEmpty(value: String): Self = this.set("sRowEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSRowEmpty: Self = this.set("sRowEmpty", js.undefined)
    @scala.inline
    def setSScrollBody(value: String): Self = this.set("sScrollBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSScrollBody: Self = this.set("sScrollBody", js.undefined)
    @scala.inline
    def setSScrollFoot(value: String): Self = this.set("sScrollFoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSScrollFoot: Self = this.set("sScrollFoot", js.undefined)
    @scala.inline
    def setSScrollFootInner(value: String): Self = this.set("sScrollFootInner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSScrollFootInner: Self = this.set("sScrollFootInner", js.undefined)
    @scala.inline
    def setSScrollHead(value: String): Self = this.set("sScrollHead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSScrollHead: Self = this.set("sScrollHead", js.undefined)
    @scala.inline
    def setSScrollHeadInner(value: String): Self = this.set("sScrollHeadInner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSScrollHeadInner: Self = this.set("sScrollHeadInner", js.undefined)
    @scala.inline
    def setSScrollWrapper(value: String): Self = this.set("sScrollWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSScrollWrapper: Self = this.set("sScrollWrapper", js.undefined)
    @scala.inline
    def setSSortAsc(value: String): Self = this.set("sSortAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortAsc: Self = this.set("sSortAsc", js.undefined)
    @scala.inline
    def setSSortColumn(value: String): Self = this.set("sSortColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortColumn: Self = this.set("sSortColumn", js.undefined)
    @scala.inline
    def setSSortDesc(value: String): Self = this.set("sSortDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortDesc: Self = this.set("sSortDesc", js.undefined)
    @scala.inline
    def setSSortIcon(value: String): Self = this.set("sSortIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortIcon: Self = this.set("sSortIcon", js.undefined)
    @scala.inline
    def setSSortJUI(value: String): Self = this.set("sSortJUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortJUI: Self = this.set("sSortJUI", js.undefined)
    @scala.inline
    def setSSortJUIAsc(value: String): Self = this.set("sSortJUIAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortJUIAsc: Self = this.set("sSortJUIAsc", js.undefined)
    @scala.inline
    def setSSortJUIAscAllowed(value: String): Self = this.set("sSortJUIAscAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortJUIAscAllowed: Self = this.set("sSortJUIAscAllowed", js.undefined)
    @scala.inline
    def setSSortJUIDesc(value: String): Self = this.set("sSortJUIDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortJUIDesc: Self = this.set("sSortJUIDesc", js.undefined)
    @scala.inline
    def setSSortJUIDescAllowed(value: String): Self = this.set("sSortJUIDescAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortJUIDescAllowed: Self = this.set("sSortJUIDescAllowed", js.undefined)
    @scala.inline
    def setSSortJUIWrapper(value: String): Self = this.set("sSortJUIWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortJUIWrapper: Self = this.set("sSortJUIWrapper", js.undefined)
    @scala.inline
    def setSSortable(value: String): Self = this.set("sSortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortable: Self = this.set("sSortable", js.undefined)
    @scala.inline
    def setSSortableAsc(value: String): Self = this.set("sSortableAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortableAsc: Self = this.set("sSortableAsc", js.undefined)
    @scala.inline
    def setSSortableDesc(value: String): Self = this.set("sSortableDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortableDesc: Self = this.set("sSortableDesc", js.undefined)
    @scala.inline
    def setSSortableNone(value: String): Self = this.set("sSortableNone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortableNone: Self = this.set("sSortableNone", js.undefined)
    @scala.inline
    def setSStripeEven(value: String): Self = this.set("sStripeEven", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSStripeEven: Self = this.set("sStripeEven", js.undefined)
    @scala.inline
    def setSStripeOdd(value: String): Self = this.set("sStripeOdd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSStripeOdd: Self = this.set("sStripeOdd", js.undefined)
    @scala.inline
    def setSTable(value: String): Self = this.set("sTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSTable: Self = this.set("sTable", js.undefined)
    @scala.inline
    def setSWrapper(value: String): Self = this.set("sWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSWrapper: Self = this.set("sWrapper", js.undefined)
  }
  
}

