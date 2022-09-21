package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarGaugeLegendItem
  extends StObject
     with BaseLegendItem {
  
  /**
    * The bar that the legend item represents.
    */
  var item: js.UndefOr[BarGaugeBarInfo] = js.undefined
}
object BarGaugeLegendItem {
  
  inline def apply(): BarGaugeLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarGaugeLegendItem]
  }
  
  extension [Self <: BarGaugeLegendItem](x: Self) {
    
    inline def setItem(value: BarGaugeBarInfo): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
