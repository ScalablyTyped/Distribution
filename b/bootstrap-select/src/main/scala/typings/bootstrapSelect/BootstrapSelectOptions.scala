package typings.bootstrapSelect

import typings.bootstrapSelect.bootstrapSelectBooleans.`false`
import typings.bootstrapSelect.bootstrapSelectStrings.auto
import typings.std.ChildNode
import typings.std.HTMLElement
import typings.std.Node
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapSelectOptions extends StObject {
  
  var actionsBox: Boolean
  
  var container: String | `false`
  
  var countSelectedText: String | (js.Function2[/* numSelected */ Double, /* numTotal */ Double, String])
  
  var deselectAllText: String
  
  var dropdownAlignRight: auto | Boolean
  
  var dropupAuto: Boolean
  
  var header: String
  
  var hideDisabled: Boolean
  
  var iconBase: String
  
  var liveSearch: Boolean
  
  var liveSearchNormalize: Boolean
  
  var liveSearchPlaceholder: String | Null
  
  var liveSearchStyle: String
  
  var maxOptions: Double | `false`
  
  var maxOptionsText: String | js.Array[Any] | (js.Function2[/* numAll */ Double, /* numGroup */ Double, js.Tuple2[String, String]])
  
  var mobile: Boolean
  
  var multipleSeparator: String
  
  var noneResultsText: String
  
  var noneSelectedText: String
  
  var sanitize: Boolean
  
  var sanitizeFn: Null | (js.Function1[/* unsafeElements */ js.Array[HTMLElement | ChildNode | Node], Unit])
  
  var selectAllText: String
  
  var selectOnTab: Boolean
  
  var selectedTextFormat: String
  
  var showContent: Boolean
  
  var showIcon: Boolean
  
  var showSubtext: Boolean
  
  var showTick: Boolean
  
  var size: auto | Double | `false`
  
  var style: String | Null
  
  var styleBase: String | Null
  
  var tickIcon: String
  
  var title: String | Null
  
  var virtualScroll: Boolean | Double
  
  var whiteList: Record[String, js.Array[String]]
  
  var width: String | `false`
  
  var windowPadding: Double | (js.Tuple4[Double, Double, Double, Double])
}
object BootstrapSelectOptions {
  
  inline def apply(
    actionsBox: Boolean,
    container: String | `false`,
    countSelectedText: String | (js.Function2[/* numSelected */ Double, /* numTotal */ Double, String]),
    deselectAllText: String,
    dropdownAlignRight: auto | Boolean,
    dropupAuto: Boolean,
    header: String,
    hideDisabled: Boolean,
    iconBase: String,
    liveSearch: Boolean,
    liveSearchNormalize: Boolean,
    liveSearchStyle: String,
    maxOptions: Double | `false`,
    maxOptionsText: String | js.Array[Any] | (js.Function2[/* numAll */ Double, /* numGroup */ Double, js.Tuple2[String, String]]),
    mobile: Boolean,
    multipleSeparator: String,
    noneResultsText: String,
    noneSelectedText: String,
    sanitize: Boolean,
    selectAllText: String,
    selectOnTab: Boolean,
    selectedTextFormat: String,
    showContent: Boolean,
    showIcon: Boolean,
    showSubtext: Boolean,
    showTick: Boolean,
    size: auto | Double | `false`,
    tickIcon: String,
    virtualScroll: Boolean | Double,
    whiteList: Record[String, js.Array[String]],
    width: String | `false`,
    windowPadding: Double | (js.Tuple4[Double, Double, Double, Double])
  ): BootstrapSelectOptions = {
    val __obj = js.Dynamic.literal(actionsBox = actionsBox.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], countSelectedText = countSelectedText.asInstanceOf[js.Any], deselectAllText = deselectAllText.asInstanceOf[js.Any], dropdownAlignRight = dropdownAlignRight.asInstanceOf[js.Any], dropupAuto = dropupAuto.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hideDisabled = hideDisabled.asInstanceOf[js.Any], iconBase = iconBase.asInstanceOf[js.Any], liveSearch = liveSearch.asInstanceOf[js.Any], liveSearchNormalize = liveSearchNormalize.asInstanceOf[js.Any], liveSearchStyle = liveSearchStyle.asInstanceOf[js.Any], maxOptions = maxOptions.asInstanceOf[js.Any], maxOptionsText = maxOptionsText.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], multipleSeparator = multipleSeparator.asInstanceOf[js.Any], noneResultsText = noneResultsText.asInstanceOf[js.Any], noneSelectedText = noneSelectedText.asInstanceOf[js.Any], sanitize = sanitize.asInstanceOf[js.Any], selectAllText = selectAllText.asInstanceOf[js.Any], selectOnTab = selectOnTab.asInstanceOf[js.Any], selectedTextFormat = selectedTextFormat.asInstanceOf[js.Any], showContent = showContent.asInstanceOf[js.Any], showIcon = showIcon.asInstanceOf[js.Any], showSubtext = showSubtext.asInstanceOf[js.Any], showTick = showTick.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tickIcon = tickIcon.asInstanceOf[js.Any], virtualScroll = virtualScroll.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], windowPadding = windowPadding.asInstanceOf[js.Any], liveSearchPlaceholder = null, sanitizeFn = null, style = null, styleBase = null, title = null)
    __obj.asInstanceOf[BootstrapSelectOptions]
  }
  
  extension [Self <: BootstrapSelectOptions](x: Self) {
    
    inline def setActionsBox(value: Boolean): Self = StObject.set(x, "actionsBox", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: String | `false`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setCountSelectedText(value: String | (js.Function2[/* numSelected */ Double, /* numTotal */ Double, String])): Self = StObject.set(x, "countSelectedText", value.asInstanceOf[js.Any])
    
    inline def setCountSelectedTextFunction2(value: (/* numSelected */ Double, /* numTotal */ Double) => String): Self = StObject.set(x, "countSelectedText", js.Any.fromFunction2(value))
    
    inline def setDeselectAllText(value: String): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
    
    inline def setDropdownAlignRight(value: auto | Boolean): Self = StObject.set(x, "dropdownAlignRight", value.asInstanceOf[js.Any])
    
    inline def setDropupAuto(value: Boolean): Self = StObject.set(x, "dropupAuto", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHideDisabled(value: Boolean): Self = StObject.set(x, "hideDisabled", value.asInstanceOf[js.Any])
    
    inline def setIconBase(value: String): Self = StObject.set(x, "iconBase", value.asInstanceOf[js.Any])
    
    inline def setLiveSearch(value: Boolean): Self = StObject.set(x, "liveSearch", value.asInstanceOf[js.Any])
    
    inline def setLiveSearchNormalize(value: Boolean): Self = StObject.set(x, "liveSearchNormalize", value.asInstanceOf[js.Any])
    
    inline def setLiveSearchPlaceholder(value: String): Self = StObject.set(x, "liveSearchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setLiveSearchPlaceholderNull: Self = StObject.set(x, "liveSearchPlaceholder", null)
    
    inline def setLiveSearchStyle(value: String): Self = StObject.set(x, "liveSearchStyle", value.asInstanceOf[js.Any])
    
    inline def setMaxOptions(value: Double | `false`): Self = StObject.set(x, "maxOptions", value.asInstanceOf[js.Any])
    
    inline def setMaxOptionsText(
      value: String | js.Array[Any] | (js.Function2[/* numAll */ Double, /* numGroup */ Double, js.Tuple2[String, String]])
    ): Self = StObject.set(x, "maxOptionsText", value.asInstanceOf[js.Any])
    
    inline def setMaxOptionsTextFunction2(value: (/* numAll */ Double, /* numGroup */ Double) => js.Tuple2[String, String]): Self = StObject.set(x, "maxOptionsText", js.Any.fromFunction2(value))
    
    inline def setMaxOptionsTextVarargs(value: Any*): Self = StObject.set(x, "maxOptionsText", js.Array(value*))
    
    inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMultipleSeparator(value: String): Self = StObject.set(x, "multipleSeparator", value.asInstanceOf[js.Any])
    
    inline def setNoneResultsText(value: String): Self = StObject.set(x, "noneResultsText", value.asInstanceOf[js.Any])
    
    inline def setNoneSelectedText(value: String): Self = StObject.set(x, "noneSelectedText", value.asInstanceOf[js.Any])
    
    inline def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
    
    inline def setSanitizeFn(value: /* unsafeElements */ js.Array[HTMLElement | ChildNode | Node] => Unit): Self = StObject.set(x, "sanitizeFn", js.Any.fromFunction1(value))
    
    inline def setSanitizeFnNull: Self = StObject.set(x, "sanitizeFn", null)
    
    inline def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    inline def setSelectOnTab(value: Boolean): Self = StObject.set(x, "selectOnTab", value.asInstanceOf[js.Any])
    
    inline def setSelectedTextFormat(value: String): Self = StObject.set(x, "selectedTextFormat", value.asInstanceOf[js.Any])
    
    inline def setShowContent(value: Boolean): Self = StObject.set(x, "showContent", value.asInstanceOf[js.Any])
    
    inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
    
    inline def setShowSubtext(value: Boolean): Self = StObject.set(x, "showSubtext", value.asInstanceOf[js.Any])
    
    inline def setShowTick(value: Boolean): Self = StObject.set(x, "showTick", value.asInstanceOf[js.Any])
    
    inline def setSize(value: auto | Double | `false`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleBase(value: String): Self = StObject.set(x, "styleBase", value.asInstanceOf[js.Any])
    
    inline def setStyleBaseNull: Self = StObject.set(x, "styleBase", null)
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setTickIcon(value: String): Self = StObject.set(x, "tickIcon", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setVirtualScroll(value: Boolean | Double): Self = StObject.set(x, "virtualScroll", value.asInstanceOf[js.Any])
    
    inline def setWhiteList(value: Record[String, js.Array[String]]): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String | `false`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWindowPadding(value: Double | (js.Tuple4[Double, Double, Double, Double])): Self = StObject.set(x, "windowPadding", value.asInstanceOf[js.Any])
  }
}
