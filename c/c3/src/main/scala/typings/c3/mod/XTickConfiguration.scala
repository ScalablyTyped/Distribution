package typings.c3.mod

import typings.c3.anon.MaxNumber
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XTickConfiguration
  extends StObject
     with TickConfiguration {
  
  /**
    * Centerise ticks on category axis
    */
  var centered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Setting for culling ticks.
    * If `true` is set, the ticks will be culled, then only limitted tick text will be shown.
    * This option does not hide the tick lines. If `false` is set, all of ticks will be shown.
    */
  var culling: js.UndefOr[Boolean | MaxNumber] = js.undefined
  
  /**
    * Fit x axis ticks.
    * If `true` set, the ticks will be positioned nicely. If `false` set, the ticks will be positioned
    * according to x value of the data points.
    */
  var fit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function to format x-axis tick values. A format string is also supported for timeseries data.
    */
  var format: js.UndefOr[String | (js.Function1[/* x */ Double | Date, String | Double])] = js.undefined
  
  var multiline: js.UndefOr[Boolean] = js.undefined
  
  var multilineMax: js.UndefOr[Double] = js.undefined
  
  /**
    * Set width of x axis tick.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object XTickConfiguration {
  
  inline def apply(): XTickConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XTickConfiguration]
  }
  
  extension [Self <: XTickConfiguration](x: Self) {
    
    inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
    
    inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
    
    inline def setCulling(value: Boolean | MaxNumber): Self = StObject.set(x, "culling", value.asInstanceOf[js.Any])
    
    inline def setCullingUndefined: Self = StObject.set(x, "culling", js.undefined)
    
    inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setFormat(value: String | (js.Function1[/* x */ Double | Date, String | Double])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: /* x */ Double | Date => String | Double): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setMultilineMax(value: Double): Self = StObject.set(x, "multilineMax", value.asInstanceOf[js.Any])
    
    inline def setMultilineMaxUndefined: Self = StObject.set(x, "multilineMax", js.undefined)
    
    inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
