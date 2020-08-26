package typings.bootstrapSelect

import typings.bootstrapSelect.bootstrapSelectStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapSelectOptions extends js.Object {
  var actionsBox: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String | Boolean] = js.native
  var countSelectedText: js.UndefOr[String | js.Function] = js.native
  var deselectAllText: js.UndefOr[String] = js.native
  var dropdownAlignRight: js.UndefOr[String | Boolean] = js.native
  var dropupAuto: js.UndefOr[Boolean] = js.native
  var header: js.UndefOr[String] = js.native
  var hideDisabled: js.UndefOr[Boolean] = js.native
  var iconBase: js.UndefOr[String] = js.native
  var liveSearch: js.UndefOr[Boolean] = js.native
  var liveSearchNormalize: js.UndefOr[Boolean] = js.native
  var liveSearchPlaceholder: js.UndefOr[String] = js.native
  var liveSearchStyle: js.UndefOr[String] = js.native
  var maxOptions: js.UndefOr[Double | Boolean] = js.native
  var maxOptionsText: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  var mobile: js.UndefOr[Boolean] = js.native
  var multipleSeparator: js.UndefOr[String] = js.native
  var noneResultsText: js.UndefOr[String] = js.native
  var noneSelectedText: js.UndefOr[String] = js.native
  var selectAllText: js.UndefOr[String] = js.native
  var selectOnTab: js.UndefOr[Boolean] = js.native
  var selectedTextFormat: js.UndefOr[String] = js.native
  var showContent: js.UndefOr[Boolean] = js.native
  var showIcon: js.UndefOr[Boolean] = js.native
  var showSubtext: js.UndefOr[Boolean] = js.native
  var showTick: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[auto | Double | Boolean] = js.native
  var style: js.UndefOr[String] = js.native
  var styleBase: js.UndefOr[String] = js.native
  var tickIcon: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var virtualScroll: js.UndefOr[Boolean | Double] = js.native
  var width: js.UndefOr[String | Boolean] = js.native
  var windowPadding: js.UndefOr[Double | js.Array[Double]] = js.native
}

object BootstrapSelectOptions {
  @scala.inline
  def apply(): BootstrapSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapSelectOptions]
  }
  @scala.inline
  implicit class BootstrapSelectOptionsOps[Self <: BootstrapSelectOptions] (val x: Self) extends AnyVal {
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
    def setActionsBox(value: Boolean): Self = this.set("actionsBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionsBox: Self = this.set("actionsBox", js.undefined)
    @scala.inline
    def setContainer(value: String | Boolean): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCountSelectedText(value: String | js.Function): Self = this.set("countSelectedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountSelectedText: Self = this.set("countSelectedText", js.undefined)
    @scala.inline
    def setDeselectAllText(value: String): Self = this.set("deselectAllText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeselectAllText: Self = this.set("deselectAllText", js.undefined)
    @scala.inline
    def setDropdownAlignRight(value: String | Boolean): Self = this.set("dropdownAlignRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownAlignRight: Self = this.set("dropdownAlignRight", js.undefined)
    @scala.inline
    def setDropupAuto(value: Boolean): Self = this.set("dropupAuto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropupAuto: Self = this.set("dropupAuto", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHideDisabled(value: Boolean): Self = this.set("hideDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDisabled: Self = this.set("hideDisabled", js.undefined)
    @scala.inline
    def setIconBase(value: String): Self = this.set("iconBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconBase: Self = this.set("iconBase", js.undefined)
    @scala.inline
    def setLiveSearch(value: Boolean): Self = this.set("liveSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveSearch: Self = this.set("liveSearch", js.undefined)
    @scala.inline
    def setLiveSearchNormalize(value: Boolean): Self = this.set("liveSearchNormalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveSearchNormalize: Self = this.set("liveSearchNormalize", js.undefined)
    @scala.inline
    def setLiveSearchPlaceholder(value: String): Self = this.set("liveSearchPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveSearchPlaceholder: Self = this.set("liveSearchPlaceholder", js.undefined)
    @scala.inline
    def setLiveSearchStyle(value: String): Self = this.set("liveSearchStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveSearchStyle: Self = this.set("liveSearchStyle", js.undefined)
    @scala.inline
    def setMaxOptions(value: Double | Boolean): Self = this.set("maxOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxOptions: Self = this.set("maxOptions", js.undefined)
    @scala.inline
    def setMaxOptionsTextVarargs(value: js.Any*): Self = this.set("maxOptionsText", js.Array(value :_*))
    @scala.inline
    def setMaxOptionsText(value: String | js.Array[_] | js.Function): Self = this.set("maxOptionsText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxOptionsText: Self = this.set("maxOptionsText", js.undefined)
    @scala.inline
    def setMobile(value: Boolean): Self = this.set("mobile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    @scala.inline
    def setMultipleSeparator(value: String): Self = this.set("multipleSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleSeparator: Self = this.set("multipleSeparator", js.undefined)
    @scala.inline
    def setNoneResultsText(value: String): Self = this.set("noneResultsText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoneResultsText: Self = this.set("noneResultsText", js.undefined)
    @scala.inline
    def setNoneSelectedText(value: String): Self = this.set("noneSelectedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoneSelectedText: Self = this.set("noneSelectedText", js.undefined)
    @scala.inline
    def setSelectAllText(value: String): Self = this.set("selectAllText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllText: Self = this.set("selectAllText", js.undefined)
    @scala.inline
    def setSelectOnTab(value: Boolean): Self = this.set("selectOnTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectOnTab: Self = this.set("selectOnTab", js.undefined)
    @scala.inline
    def setSelectedTextFormat(value: String): Self = this.set("selectedTextFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedTextFormat: Self = this.set("selectedTextFormat", js.undefined)
    @scala.inline
    def setShowContent(value: Boolean): Self = this.set("showContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowContent: Self = this.set("showContent", js.undefined)
    @scala.inline
    def setShowIcon(value: Boolean): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowIcon: Self = this.set("showIcon", js.undefined)
    @scala.inline
    def setShowSubtext(value: Boolean): Self = this.set("showSubtext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSubtext: Self = this.set("showSubtext", js.undefined)
    @scala.inline
    def setShowTick(value: Boolean): Self = this.set("showTick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTick: Self = this.set("showTick", js.undefined)
    @scala.inline
    def setSize(value: auto | Double | Boolean): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleBase(value: String): Self = this.set("styleBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleBase: Self = this.set("styleBase", js.undefined)
    @scala.inline
    def setTickIcon(value: String): Self = this.set("tickIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickIcon: Self = this.set("tickIcon", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVirtualScroll(value: Boolean | Double): Self = this.set("virtualScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualScroll: Self = this.set("virtualScroll", js.undefined)
    @scala.inline
    def setWidth(value: String | Boolean): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWindowPaddingVarargs(value: Double*): Self = this.set("windowPadding", js.Array(value :_*))
    @scala.inline
    def setWindowPadding(value: Double | js.Array[Double]): Self = this.set("windowPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowPadding: Self = this.set("windowPadding", js.undefined)
  }
  
}

