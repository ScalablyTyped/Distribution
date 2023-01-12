package typings.bootstrapSelect

import typings.bootstrapSelect.bootstrapSelectBooleans.`false`
import typings.bootstrapSelect.bootstrapSelectStrings.auto
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapSelectDefaults
  extends StObject
     with BootstrapSelectOptions {
  
  var allowClear: Boolean
  
  var chunkSize: Double
  
  var display: Boolean
  
  var doneButton: Boolean
  
  var doneButtonText: String
  
  var placeholder: Null
  
  var source: js.Object
  
  var template: js.Object
}
object BootstrapSelectDefaults {
  
  inline def apply(
    actionsBox: Boolean,
    allowClear: Boolean,
    chunkSize: Double,
    container: String | `false`,
    countSelectedText: String | (js.Function2[/* numSelected */ Double, /* numTotal */ Double, String]),
    deselectAllText: String,
    display: Boolean,
    doneButton: Boolean,
    doneButtonText: String,
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
    placeholder: Null,
    sanitize: Boolean,
    selectAllText: String,
    selectOnTab: Boolean,
    selectedTextFormat: String,
    showContent: Boolean,
    showIcon: Boolean,
    showSubtext: Boolean,
    showTick: Boolean,
    size: auto | Double | `false`,
    source: js.Object,
    template: js.Object,
    tickIcon: String,
    virtualScroll: Boolean | Double,
    whiteList: Record[String, js.Array[String]],
    width: String | `false`,
    windowPadding: Double | (js.Tuple4[Double, Double, Double, Double])
  ): BootstrapSelectDefaults = {
    val __obj = js.Dynamic.literal(actionsBox = actionsBox.asInstanceOf[js.Any], allowClear = allowClear.asInstanceOf[js.Any], chunkSize = chunkSize.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], countSelectedText = countSelectedText.asInstanceOf[js.Any], deselectAllText = deselectAllText.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], doneButton = doneButton.asInstanceOf[js.Any], doneButtonText = doneButtonText.asInstanceOf[js.Any], dropdownAlignRight = dropdownAlignRight.asInstanceOf[js.Any], dropupAuto = dropupAuto.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hideDisabled = hideDisabled.asInstanceOf[js.Any], iconBase = iconBase.asInstanceOf[js.Any], liveSearch = liveSearch.asInstanceOf[js.Any], liveSearchNormalize = liveSearchNormalize.asInstanceOf[js.Any], liveSearchStyle = liveSearchStyle.asInstanceOf[js.Any], maxOptions = maxOptions.asInstanceOf[js.Any], maxOptionsText = maxOptionsText.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], multipleSeparator = multipleSeparator.asInstanceOf[js.Any], noneResultsText = noneResultsText.asInstanceOf[js.Any], noneSelectedText = noneSelectedText.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], sanitize = sanitize.asInstanceOf[js.Any], selectAllText = selectAllText.asInstanceOf[js.Any], selectOnTab = selectOnTab.asInstanceOf[js.Any], selectedTextFormat = selectedTextFormat.asInstanceOf[js.Any], showContent = showContent.asInstanceOf[js.Any], showIcon = showIcon.asInstanceOf[js.Any], showSubtext = showSubtext.asInstanceOf[js.Any], showTick = showTick.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], tickIcon = tickIcon.asInstanceOf[js.Any], virtualScroll = virtualScroll.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], windowPadding = windowPadding.asInstanceOf[js.Any], liveSearchPlaceholder = null, sanitizeFn = null, style = null, styleBase = null, title = null)
    __obj.asInstanceOf[BootstrapSelectDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapSelectDefaults] (val x: Self) extends AnyVal {
    
    inline def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDoneButton(value: Boolean): Self = StObject.set(x, "doneButton", value.asInstanceOf[js.Any])
    
    inline def setDoneButtonText(value: String): Self = StObject.set(x, "doneButtonText", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: Null): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setSource(value: js.Object): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: js.Object): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
