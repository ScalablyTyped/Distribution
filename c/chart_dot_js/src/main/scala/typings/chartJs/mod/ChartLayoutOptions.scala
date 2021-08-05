package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartLayoutOptions extends StObject {
  
  var padding: js.UndefOr[ChartLayoutPaddingObject | Double] = js.undefined
}
object ChartLayoutOptions {
  
  inline def apply(): ChartLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLayoutOptions]
  }
  
  extension [Self <: ChartLayoutOptions](x: Self) {
    
    inline def setPadding(value: ChartLayoutPaddingObject | Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
