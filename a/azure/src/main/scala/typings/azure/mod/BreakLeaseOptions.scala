package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakLeaseOptions
  extends StObject
     with AccessConditionsOptions {
  
  var leaseBreakPeriod: js.UndefOr[Double] = js.undefined
}
object BreakLeaseOptions {
  
  inline def apply(): BreakLeaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreakLeaseOptions]
  }
  
  extension [Self <: BreakLeaseOptions](x: Self) {
    
    inline def setLeaseBreakPeriod(value: Double): Self = StObject.set(x, "leaseBreakPeriod", value.asInstanceOf[js.Any])
    
    inline def setLeaseBreakPeriodUndefined: Self = StObject.set(x, "leaseBreakPeriod", js.undefined)
  }
}
