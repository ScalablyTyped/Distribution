package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeScale
  extends StObject
     with ChartScales {
  
  var adapters: js.UndefOr[DateAdapterOptions] = js.undefined
  
  var displayFormats: js.UndefOr[TimeDisplayFormat] = js.undefined
  
  var isoWeekday: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[String] = js.undefined
  
  var min: js.UndefOr[String] = js.undefined
  
  var minUnit: js.UndefOr[TimeUnit] = js.undefined
  
  var parser: js.UndefOr[String | (js.Function1[/* arg */ js.Any, js.Any])] = js.undefined
  
  var round: js.UndefOr[TimeUnit] = js.undefined
  
  var stepSize: js.UndefOr[Double] = js.undefined
  
  var tooltipFormat: js.UndefOr[String] = js.undefined
  
  var unit: js.UndefOr[TimeUnit] = js.undefined
  
  var unitStepSize: js.UndefOr[Double] = js.undefined
}
object TimeScale {
  
  inline def apply(): TimeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeScale]
  }
  
  extension [Self <: TimeScale](x: Self) {
    
    inline def setAdapters(value: DateAdapterOptions): Self = StObject.set(x, "adapters", value.asInstanceOf[js.Any])
    
    inline def setAdaptersUndefined: Self = StObject.set(x, "adapters", js.undefined)
    
    inline def setDisplayFormats(value: TimeDisplayFormat): Self = StObject.set(x, "displayFormats", value.asInstanceOf[js.Any])
    
    inline def setDisplayFormatsUndefined: Self = StObject.set(x, "displayFormats", js.undefined)
    
    inline def setIsoWeekday(value: Boolean): Self = StObject.set(x, "isoWeekday", value.asInstanceOf[js.Any])
    
    inline def setIsoWeekdayUndefined: Self = StObject.set(x, "isoWeekday", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinUnit(value: TimeUnit): Self = StObject.set(x, "minUnit", value.asInstanceOf[js.Any])
    
    inline def setMinUnitUndefined: Self = StObject.set(x, "minUnit", js.undefined)
    
    inline def setParser(value: String | (js.Function1[/* arg */ js.Any, js.Any])): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserFunction1(value: /* arg */ js.Any => js.Any): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setRound(value: TimeUnit): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    inline def setStepSize(value: Double): Self = StObject.set(x, "stepSize", value.asInstanceOf[js.Any])
    
    inline def setStepSizeUndefined: Self = StObject.set(x, "stepSize", js.undefined)
    
    inline def setTooltipFormat(value: String): Self = StObject.set(x, "tooltipFormat", value.asInstanceOf[js.Any])
    
    inline def setTooltipFormatUndefined: Self = StObject.set(x, "tooltipFormat", js.undefined)
    
    inline def setUnit(value: TimeUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitStepSize(value: Double): Self = StObject.set(x, "unitStepSize", value.asInstanceOf[js.Any])
    
    inline def setUnitStepSizeUndefined: Self = StObject.set(x, "unitStepSize", js.undefined)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
