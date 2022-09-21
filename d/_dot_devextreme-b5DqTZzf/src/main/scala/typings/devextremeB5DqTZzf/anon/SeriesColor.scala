package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesColor extends StObject {
  
  var seriesColor: js.UndefOr[String] = js.undefined
  
  var seriesIndex: js.UndefOr[Double] = js.undefined
  
  var seriesName: js.UndefOr[Any] = js.undefined
}
object SeriesColor {
  
  inline def apply(): SeriesColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesColor]
  }
  
  extension [Self <: SeriesColor](x: Self) {
    
    inline def setSeriesColor(value: String): Self = StObject.set(x, "seriesColor", value.asInstanceOf[js.Any])
    
    inline def setSeriesColorUndefined: Self = StObject.set(x, "seriesColor", js.undefined)
    
    inline def setSeriesIndex(value: Double): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
    
    inline def setSeriesIndexUndefined: Self = StObject.set(x, "seriesIndex", js.undefined)
    
    inline def setSeriesName(value: Any): Self = StObject.set(x, "seriesName", value.asInstanceOf[js.Any])
    
    inline def setSeriesNameUndefined: Self = StObject.set(x, "seriesName", js.undefined)
  }
}
