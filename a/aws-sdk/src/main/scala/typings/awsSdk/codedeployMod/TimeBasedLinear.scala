package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeBasedLinear extends StObject {
  
  /**
    * The number of minutes between each incremental traffic shift of a TimeBasedLinear deployment.
    */
  var linearInterval: js.UndefOr[WaitTimeInMins] = js.undefined
  
  /**
    * The percentage of traffic that is shifted at the start of each increment of a TimeBasedLinear deployment.
    */
  var linearPercentage: js.UndefOr[Percentage] = js.undefined
}
object TimeBasedLinear {
  
  inline def apply(): TimeBasedLinear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeBasedLinear]
  }
  
  extension [Self <: TimeBasedLinear](x: Self) {
    
    inline def setLinearInterval(value: WaitTimeInMins): Self = StObject.set(x, "linearInterval", value.asInstanceOf[js.Any])
    
    inline def setLinearIntervalUndefined: Self = StObject.set(x, "linearInterval", js.undefined)
    
    inline def setLinearPercentage(value: Percentage): Self = StObject.set(x, "linearPercentage", value.asInstanceOf[js.Any])
    
    inline def setLinearPercentageUndefined: Self = StObject.set(x, "linearPercentage", js.undefined)
  }
}
