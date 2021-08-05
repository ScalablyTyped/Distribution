package typings.chartJs.mod

import typings.chartJs.chartJsStrings.linear
import typings.chartJs.chartJsStrings.series
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartXAxe
  extends StObject
     with CommonAxe {
  
  var distribution: js.UndefOr[linear | series] = js.undefined
}
object ChartXAxe {
  
  inline def apply(): ChartXAxe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartXAxe]
  }
  
  extension [Self <: ChartXAxe](x: Self) {
    
    inline def setDistribution(value: linear | series): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
  }
}
