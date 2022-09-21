package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinishedWorldsSummary extends StObject {
  
  /**
    * Information about worlds that failed.
    */
  var failureSummary: js.UndefOr[FailureSummary] = js.undefined
  
  /**
    * The total number of finished worlds.
    */
  var finishedCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * A list of worlds that succeeded.
    */
  var succeededWorlds: js.UndefOr[Arns] = js.undefined
}
object FinishedWorldsSummary {
  
  inline def apply(): FinishedWorldsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishedWorldsSummary]
  }
  
  extension [Self <: FinishedWorldsSummary](x: Self) {
    
    inline def setFailureSummary(value: FailureSummary): Self = StObject.set(x, "failureSummary", value.asInstanceOf[js.Any])
    
    inline def setFailureSummaryUndefined: Self = StObject.set(x, "failureSummary", js.undefined)
    
    inline def setFinishedCount(value: Integer): Self = StObject.set(x, "finishedCount", value.asInstanceOf[js.Any])
    
    inline def setFinishedCountUndefined: Self = StObject.set(x, "finishedCount", js.undefined)
    
    inline def setSucceededWorlds(value: Arns): Self = StObject.set(x, "succeededWorlds", value.asInstanceOf[js.Any])
    
    inline def setSucceededWorldsUndefined: Self = StObject.set(x, "succeededWorlds", js.undefined)
    
    inline def setSucceededWorldsVarargs(value: Arn*): Self = StObject.set(x, "succeededWorlds", js.Array(value*))
  }
}
