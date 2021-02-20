package typings.bootstrapSelect

import typings.bootstrapSelect.bootstrapSelectStrings.auto
import typings.std.ChildNode
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapSelectOptions extends StObject {
  
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
  
  var sanitize: js.UndefOr[Boolean] = js.native
  
  var sanitizeFn: js.UndefOr[
    js.Function1[/* unsafeElements */ js.Array[HTMLElement | ChildNode | Node], Unit]
  ] = js.native
  
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
  implicit class BootstrapSelectOptionsMutableBuilder[Self <: BootstrapSelectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionsBox(value: Boolean): Self = StObject.set(x, "actionsBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsBoxUndefined: Self = StObject.set(x, "actionsBox", js.undefined)
    
    @scala.inline
    def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setCountSelectedText(value: String | js.Function): Self = StObject.set(x, "countSelectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountSelectedTextUndefined: Self = StObject.set(x, "countSelectedText", js.undefined)
    
    @scala.inline
    def setDeselectAllText(value: String): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeselectAllTextUndefined: Self = StObject.set(x, "deselectAllText", js.undefined)
    
    @scala.inline
    def setDropdownAlignRight(value: String | Boolean): Self = StObject.set(x, "dropdownAlignRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownAlignRightUndefined: Self = StObject.set(x, "dropdownAlignRight", js.undefined)
    
    @scala.inline
    def setDropupAuto(value: Boolean): Self = StObject.set(x, "dropupAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropupAutoUndefined: Self = StObject.set(x, "dropupAuto", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setHideDisabled(value: Boolean): Self = StObject.set(x, "hideDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDisabledUndefined: Self = StObject.set(x, "hideDisabled", js.undefined)
    
    @scala.inline
    def setIconBase(value: String): Self = StObject.set(x, "iconBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconBaseUndefined: Self = StObject.set(x, "iconBase", js.undefined)
    
    @scala.inline
    def setLiveSearch(value: Boolean): Self = StObject.set(x, "liveSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveSearchNormalize(value: Boolean): Self = StObject.set(x, "liveSearchNormalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveSearchNormalizeUndefined: Self = StObject.set(x, "liveSearchNormalize", js.undefined)
    
    @scala.inline
    def setLiveSearchPlaceholder(value: String): Self = StObject.set(x, "liveSearchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveSearchPlaceholderUndefined: Self = StObject.set(x, "liveSearchPlaceholder", js.undefined)
    
    @scala.inline
    def setLiveSearchStyle(value: String): Self = StObject.set(x, "liveSearchStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveSearchStyleUndefined: Self = StObject.set(x, "liveSearchStyle", js.undefined)
    
    @scala.inline
    def setLiveSearchUndefined: Self = StObject.set(x, "liveSearch", js.undefined)
    
    @scala.inline
    def setMaxOptions(value: Double | Boolean): Self = StObject.set(x, "maxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxOptionsText(value: String | js.Array[_] | js.Function): Self = StObject.set(x, "maxOptionsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxOptionsTextUndefined: Self = StObject.set(x, "maxOptionsText", js.undefined)
    
    @scala.inline
    def setMaxOptionsTextVarargs(value: js.Any*): Self = StObject.set(x, "maxOptionsText", js.Array(value :_*))
    
    @scala.inline
    def setMaxOptionsUndefined: Self = StObject.set(x, "maxOptions", js.undefined)
    
    @scala.inline
    def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    @scala.inline
    def setMultipleSeparator(value: String): Self = StObject.set(x, "multipleSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleSeparatorUndefined: Self = StObject.set(x, "multipleSeparator", js.undefined)
    
    @scala.inline
    def setNoneResultsText(value: String): Self = StObject.set(x, "noneResultsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoneResultsTextUndefined: Self = StObject.set(x, "noneResultsText", js.undefined)
    
    @scala.inline
    def setNoneSelectedText(value: String): Self = StObject.set(x, "noneSelectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoneSelectedTextUndefined: Self = StObject.set(x, "noneSelectedText", js.undefined)
    
    @scala.inline
    def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSanitizeFn(value: /* unsafeElements */ js.Array[HTMLElement | ChildNode | Node] => Unit): Self = StObject.set(x, "sanitizeFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSanitizeFnUndefined: Self = StObject.set(x, "sanitizeFn", js.undefined)
    
    @scala.inline
    def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
    
    @scala.inline
    def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
    
    @scala.inline
    def setSelectOnTab(value: Boolean): Self = StObject.set(x, "selectOnTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectOnTabUndefined: Self = StObject.set(x, "selectOnTab", js.undefined)
    
    @scala.inline
    def setSelectedTextFormat(value: String): Self = StObject.set(x, "selectedTextFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedTextFormatUndefined: Self = StObject.set(x, "selectedTextFormat", js.undefined)
    
    @scala.inline
    def setShowContent(value: Boolean): Self = StObject.set(x, "showContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowContentUndefined: Self = StObject.set(x, "showContent", js.undefined)
    
    @scala.inline
    def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
    
    @scala.inline
    def setShowSubtext(value: Boolean): Self = StObject.set(x, "showSubtext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSubtextUndefined: Self = StObject.set(x, "showSubtext", js.undefined)
    
    @scala.inline
    def setShowTick(value: Boolean): Self = StObject.set(x, "showTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTickUndefined: Self = StObject.set(x, "showTick", js.undefined)
    
    @scala.inline
    def setSize(value: auto | Double | Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBase(value: String): Self = StObject.set(x, "styleBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBaseUndefined: Self = StObject.set(x, "styleBase", js.undefined)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTickIcon(value: String): Self = StObject.set(x, "tickIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickIconUndefined: Self = StObject.set(x, "tickIcon", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVirtualScroll(value: Boolean | Double): Self = StObject.set(x, "virtualScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualScrollUndefined: Self = StObject.set(x, "virtualScroll", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWindowPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "windowPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowPaddingUndefined: Self = StObject.set(x, "windowPadding", js.undefined)
    
    @scala.inline
    def setWindowPaddingVarargs(value: Double*): Self = StObject.set(x, "windowPadding", js.Array(value :_*))
  }
}
