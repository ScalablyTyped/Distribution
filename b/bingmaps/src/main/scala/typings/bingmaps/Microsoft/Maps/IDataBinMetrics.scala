package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataBinMetrics extends StObject {
  
  /* The average value of the aggregation property of the pushpins in a data bin. */
  var average: js.UndefOr[Double] = js.undefined
  
  /* The number of pushpins in a data bin. */
  var count: js.UndefOr[Double] = js.undefined
  
  /* The number of pushpins in the data bin who's aggregation property has a value. */
  var countNotBlank: js.UndefOr[Double] = js.undefined
  
  /* The number of pushpins in the data bin who's aggregation property is a valid number. */
  var countNumbers: js.UndefOr[Double] = js.undefined
  
  /* The sum of the aggregation property of the pushpins in a data bin.  */
  var sum: js.UndefOr[Double] = js.undefined
}
object IDataBinMetrics {
  
  inline def apply(): IDataBinMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataBinMetrics]
  }
  
  extension [Self <: IDataBinMetrics](x: Self) {
    
    inline def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNotBlank(value: Double): Self = StObject.set(x, "countNotBlank", value.asInstanceOf[js.Any])
    
    inline def setCountNotBlankUndefined: Self = StObject.set(x, "countNotBlank", js.undefined)
    
    inline def setCountNumbers(value: Double): Self = StObject.set(x, "countNumbers", value.asInstanceOf[js.Any])
    
    inline def setCountNumbersUndefined: Self = StObject.set(x, "countNumbers", js.undefined)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
