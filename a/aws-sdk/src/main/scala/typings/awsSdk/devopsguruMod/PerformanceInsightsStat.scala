package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceInsightsStat extends StObject {
  
  /**
    * The statistic type.
    */
  var Type: js.UndefOr[PerformanceInsightsStatType] = js.undefined
  
  /**
    * The value of the statistic.
    */
  var Value: js.UndefOr[PerformanceInsightsValueDouble] = js.undefined
}
object PerformanceInsightsStat {
  
  inline def apply(): PerformanceInsightsStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceInsightsStat]
  }
  
  extension [Self <: PerformanceInsightsStat](x: Self) {
    
    inline def setType(value: PerformanceInsightsStatType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: PerformanceInsightsValueDouble): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
