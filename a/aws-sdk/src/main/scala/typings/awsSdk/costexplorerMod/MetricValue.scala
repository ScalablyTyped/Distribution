package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricValue extends StObject {
  
  /**
    * The actual number that represents the metric.
    */
  var Amount: js.UndefOr[MetricAmount] = js.undefined
  
  /**
    * The unit that the metric is given in.
    */
  var Unit: js.UndefOr[MetricUnit] = js.undefined
}
object MetricValue {
  
  inline def apply(): MetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricValue]
  }
  
  extension [Self <: MetricValue](x: Self) {
    
    inline def setAmount(value: MetricAmount): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "Amount", js.undefined)
    
    inline def setUnit(value: MetricUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
