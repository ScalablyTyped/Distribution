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

object anon {
  
  trait BootstrapVersion extends StObject {
    
    var BootstrapVersion: String
    
    val DEFAULTS: BootstrapSelectDefaults
    
    val VERSION: String
  }
  object BootstrapVersion {
    
    inline def apply(BootstrapVersion: String, DEFAULTS: BootstrapSelectDefaults, VERSION: String): BootstrapVersion = {
      val __obj = js.Dynamic.literal(BootstrapVersion = BootstrapVersion.asInstanceOf[js.Any], DEFAULTS = DEFAULTS.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootstrapVersion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BootstrapVersion] (val x: Self) extends AnyVal {
      
      inline def setBootstrapVersion(value: String): Self = StObject.set(x, "BootstrapVersion", value.asInstanceOf[js.Any])
      
      inline def setDEFAULTS(value: BootstrapSelectDefaults): Self = StObject.set(x, "DEFAULTS", value.asInstanceOf[js.Any])
      
      inline def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<bootstrap-select.BootstrapSelectOptions> */
  trait PartialBootstrapSelectOpt extends StObject {
    
    var actionsBox: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[String | `false`] = js.undefined
    
    var countSelectedText: js.UndefOr[String | (js.Function2[/* numSelected */ Double, /* numTotal */ Double, String])] = js.undefined
    
    var deselectAllText: js.UndefOr[String] = js.undefined
    
    var dropdownAlignRight: js.UndefOr[auto | Boolean] = js.undefined
    
    var dropupAuto: js.UndefOr[Boolean] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var hideDisabled: js.UndefOr[Boolean] = js.undefined
    
    var iconBase: js.UndefOr[String] = js.undefined
    
    var liveSearch: js.UndefOr[Boolean] = js.undefined
    
    var liveSearchNormalize: js.UndefOr[Boolean] = js.undefined
    
    var liveSearchPlaceholder: js.UndefOr[String | Null] = js.undefined
    
    var liveSearchStyle: js.UndefOr[String] = js.undefined
    
    var maxOptions: js.UndefOr[Double | `false`] = js.undefined
    
    var maxOptionsText: js.UndefOr[
        String | js.Array[Any] | (js.Function2[/* numAll */ Double, /* numGroup */ Double, js.Tuple2[String, String]])
      ] = js.undefined
    
    var mobile: js.UndefOr[Boolean] = js.undefined
    
    var multipleSeparator: js.UndefOr[String] = js.undefined
    
    var noneResultsText: js.UndefOr[String] = js.undefined
    
    var noneSelectedText: js.UndefOr[String] = js.undefined
    
    var sanitize: js.UndefOr[Boolean] = js.undefined
    
    var sanitizeFn: js.UndefOr[
        Null | (js.Function1[/* unsafeElements */ js.Array[HTMLElement | ChildNode | Node], Unit])
      ] = js.undefined
    
    var selectAllText: js.UndefOr[String] = js.undefined
    
    var selectOnTab: js.UndefOr[Boolean] = js.undefined
    
    var selectedTextFormat: js.UndefOr[String] = js.undefined
    
    var showContent: js.UndefOr[Boolean] = js.undefined
    
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var showSubtext: js.UndefOr[Boolean] = js.undefined
    
    var showTick: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[auto | Double | `false`] = js.undefined
    
    var style: js.UndefOr[String | Null] = js.undefined
    
    var styleBase: js.UndefOr[String | Null] = js.undefined
    
    var tickIcon: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String | Null] = js.undefined
    
    var virtualScroll: js.UndefOr[Boolean | Double] = js.undefined
    
    var whiteList: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
    
    var width: js.UndefOr[String | `false`] = js.undefined
    
    var windowPadding: js.UndefOr[Double | (js.Tuple4[Double, Double, Double, Double])] = js.undefined
  }
  object PartialBootstrapSelectOpt {
    
    inline def apply(): PartialBootstrapSelectOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBootstrapSelectOpt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialBootstrapSelectOpt] (val x: Self) extends AnyVal {
      
      inline def setActionsBox(value: Boolean): Self = StObject.set(x, "actionsBox", value.asInstanceOf[js.Any])
      
      inline def setActionsBoxUndefined: Self = StObject.set(x, "actionsBox", js.undefined)
      
      inline def setContainer(value: String | `false`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setCountSelectedText(value: String | (js.Function2[/* numSelected */ Double, /* numTotal */ Double, String])): Self = StObject.set(x, "countSelectedText", value.asInstanceOf[js.Any])
      
      inline def setCountSelectedTextFunction2(value: (/* numSelected */ Double, /* numTotal */ Double) => String): Self = StObject.set(x, "countSelectedText", js.Any.fromFunction2(value))
      
      inline def setCountSelectedTextUndefined: Self = StObject.set(x, "countSelectedText", js.undefined)
      
      inline def setDeselectAllText(value: String): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
      
      inline def setDeselectAllTextUndefined: Self = StObject.set(x, "deselectAllText", js.undefined)
      
      inline def setDropdownAlignRight(value: auto | Boolean): Self = StObject.set(x, "dropdownAlignRight", value.asInstanceOf[js.Any])
      
      inline def setDropdownAlignRightUndefined: Self = StObject.set(x, "dropdownAlignRight", js.undefined)
      
      inline def setDropupAuto(value: Boolean): Self = StObject.set(x, "dropupAuto", value.asInstanceOf[js.Any])
      
      inline def setDropupAutoUndefined: Self = StObject.set(x, "dropupAuto", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHideDisabled(value: Boolean): Self = StObject.set(x, "hideDisabled", value.asInstanceOf[js.Any])
      
      inline def setHideDisabledUndefined: Self = StObject.set(x, "hideDisabled", js.undefined)
      
      inline def setIconBase(value: String): Self = StObject.set(x, "iconBase", value.asInstanceOf[js.Any])
      
      inline def setIconBaseUndefined: Self = StObject.set(x, "iconBase", js.undefined)
      
      inline def setLiveSearch(value: Boolean): Self = StObject.set(x, "liveSearch", value.asInstanceOf[js.Any])
      
      inline def setLiveSearchNormalize(value: Boolean): Self = StObject.set(x, "liveSearchNormalize", value.asInstanceOf[js.Any])
      
      inline def setLiveSearchNormalizeUndefined: Self = StObject.set(x, "liveSearchNormalize", js.undefined)
      
      inline def setLiveSearchPlaceholder(value: String): Self = StObject.set(x, "liveSearchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setLiveSearchPlaceholderNull: Self = StObject.set(x, "liveSearchPlaceholder", null)
      
      inline def setLiveSearchPlaceholderUndefined: Self = StObject.set(x, "liveSearchPlaceholder", js.undefined)
      
      inline def setLiveSearchStyle(value: String): Self = StObject.set(x, "liveSearchStyle", value.asInstanceOf[js.Any])
      
      inline def setLiveSearchStyleUndefined: Self = StObject.set(x, "liveSearchStyle", js.undefined)
      
      inline def setLiveSearchUndefined: Self = StObject.set(x, "liveSearch", js.undefined)
      
      inline def setMaxOptions(value: Double | `false`): Self = StObject.set(x, "maxOptions", value.asInstanceOf[js.Any])
      
      inline def setMaxOptionsText(
        value: String | js.Array[Any] | (js.Function2[/* numAll */ Double, /* numGroup */ Double, js.Tuple2[String, String]])
      ): Self = StObject.set(x, "maxOptionsText", value.asInstanceOf[js.Any])
      
      inline def setMaxOptionsTextFunction2(value: (/* numAll */ Double, /* numGroup */ Double) => js.Tuple2[String, String]): Self = StObject.set(x, "maxOptionsText", js.Any.fromFunction2(value))
      
      inline def setMaxOptionsTextUndefined: Self = StObject.set(x, "maxOptionsText", js.undefined)
      
      inline def setMaxOptionsTextVarargs(value: Any*): Self = StObject.set(x, "maxOptionsText", js.Array(value*))
      
      inline def setMaxOptionsUndefined: Self = StObject.set(x, "maxOptions", js.undefined)
      
      inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      inline def setMultipleSeparator(value: String): Self = StObject.set(x, "multipleSeparator", value.asInstanceOf[js.Any])
      
      inline def setMultipleSeparatorUndefined: Self = StObject.set(x, "multipleSeparator", js.undefined)
      
      inline def setNoneResultsText(value: String): Self = StObject.set(x, "noneResultsText", value.asInstanceOf[js.Any])
      
      inline def setNoneResultsTextUndefined: Self = StObject.set(x, "noneResultsText", js.undefined)
      
      inline def setNoneSelectedText(value: String): Self = StObject.set(x, "noneSelectedText", value.asInstanceOf[js.Any])
      
      inline def setNoneSelectedTextUndefined: Self = StObject.set(x, "noneSelectedText", js.undefined)
      
      inline def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
      
      inline def setSanitizeFn(value: /* unsafeElements */ js.Array[HTMLElement | ChildNode | Node] => Unit): Self = StObject.set(x, "sanitizeFn", js.Any.fromFunction1(value))
      
      inline def setSanitizeFnNull: Self = StObject.set(x, "sanitizeFn", null)
      
      inline def setSanitizeFnUndefined: Self = StObject.set(x, "sanitizeFn", js.undefined)
      
      inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      inline def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
      
      inline def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
      
      inline def setSelectOnTab(value: Boolean): Self = StObject.set(x, "selectOnTab", value.asInstanceOf[js.Any])
      
      inline def setSelectOnTabUndefined: Self = StObject.set(x, "selectOnTab", js.undefined)
      
      inline def setSelectedTextFormat(value: String): Self = StObject.set(x, "selectedTextFormat", value.asInstanceOf[js.Any])
      
      inline def setSelectedTextFormatUndefined: Self = StObject.set(x, "selectedTextFormat", js.undefined)
      
      inline def setShowContent(value: Boolean): Self = StObject.set(x, "showContent", value.asInstanceOf[js.Any])
      
      inline def setShowContentUndefined: Self = StObject.set(x, "showContent", js.undefined)
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setShowSubtext(value: Boolean): Self = StObject.set(x, "showSubtext", value.asInstanceOf[js.Any])
      
      inline def setShowSubtextUndefined: Self = StObject.set(x, "showSubtext", js.undefined)
      
      inline def setShowTick(value: Boolean): Self = StObject.set(x, "showTick", value.asInstanceOf[js.Any])
      
      inline def setShowTickUndefined: Self = StObject.set(x, "showTick", js.undefined)
      
      inline def setSize(value: auto | Double | `false`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleBase(value: String): Self = StObject.set(x, "styleBase", value.asInstanceOf[js.Any])
      
      inline def setStyleBaseNull: Self = StObject.set(x, "styleBase", null)
      
      inline def setStyleBaseUndefined: Self = StObject.set(x, "styleBase", js.undefined)
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTickIcon(value: String): Self = StObject.set(x, "tickIcon", value.asInstanceOf[js.Any])
      
      inline def setTickIconUndefined: Self = StObject.set(x, "tickIcon", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVirtualScroll(value: Boolean | Double): Self = StObject.set(x, "virtualScroll", value.asInstanceOf[js.Any])
      
      inline def setVirtualScrollUndefined: Self = StObject.set(x, "virtualScroll", js.undefined)
      
      inline def setWhiteList(value: Record[String, js.Array[String]]): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
      
      inline def setWhiteListUndefined: Self = StObject.set(x, "whiteList", js.undefined)
      
      inline def setWidth(value: String | `false`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWindowPadding(value: Double | (js.Tuple4[Double, Double, Double, Double])): Self = StObject.set(x, "windowPadding", value.asInstanceOf[js.Any])
      
      inline def setWindowPaddingUndefined: Self = StObject.set(x, "windowPadding", js.undefined)
    }
  }
}
