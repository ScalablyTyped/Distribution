package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.EndValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseGaugeRangeContainer extends StObject {
  
  /**
    * Specifies a range container&apos;s background color.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the offset of the range container from an invisible scale line in pixels.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the palette to be used for colorizing ranges in the range container.
    */
  var palette: js.UndefOr[js.Array[String] | PaletteType] = js.undefined
  
  /**
    * Specifies what to do with colors in the palette when their number is less than the number of ranges in the range container.
    */
  var paletteExtensionMode: js.UndefOr[PaletteExtensionModeType] = js.undefined
  
  /**
    * An array of objects representing ranges contained in the range container.
    */
  var ranges: js.UndefOr[js.Array[EndValue]] = js.undefined
}
object BaseGaugeRangeContainer {
  
  inline def apply(): BaseGaugeRangeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeRangeContainer]
  }
  
  extension [Self <: BaseGaugeRangeContainer](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPalette(value: js.Array[String] | PaletteType): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionMode(value: PaletteExtensionModeType): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value*))
    
    inline def setRanges(value: js.Array[EndValue]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: EndValue*): Self = StObject.set(x, "ranges", js.Array(value*))
  }
}
