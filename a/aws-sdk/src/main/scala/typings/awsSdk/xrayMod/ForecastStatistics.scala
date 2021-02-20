package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForecastStatistics extends StObject {
  
  /**
    * The upper limit of fault counts for a service.
    */
  var FaultCountHigh: js.UndefOr[NullableLong] = js.native
  
  /**
    * The lower limit of fault counts for a service.
    */
  var FaultCountLow: js.UndefOr[NullableLong] = js.native
}
object ForecastStatistics {
  
  @scala.inline
  def apply(): ForecastStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForecastStatistics]
  }
  
  @scala.inline
  implicit class ForecastStatisticsMutableBuilder[Self <: ForecastStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFaultCountHigh(value: NullableLong): Self = StObject.set(x, "FaultCountHigh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaultCountHighUndefined: Self = StObject.set(x, "FaultCountHigh", js.undefined)
    
    @scala.inline
    def setFaultCountLow(value: NullableLong): Self = StObject.set(x, "FaultCountLow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaultCountLowUndefined: Self = StObject.set(x, "FaultCountLow", js.undefined)
  }
}
