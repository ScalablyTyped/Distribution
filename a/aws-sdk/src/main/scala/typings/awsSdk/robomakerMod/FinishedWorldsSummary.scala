package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishedWorldsSummary extends StObject {
  
  /**
    * Information about worlds that failed.
    */
  var failureSummary: js.UndefOr[FailureSummary] = js.native
  
  /**
    * The total number of finished worlds.
    */
  var finishedCount: js.UndefOr[Integer] = js.native
  
  /**
    * A list of worlds that succeeded.
    */
  var succeededWorlds: js.UndefOr[Arns] = js.native
}
object FinishedWorldsSummary {
  
  @scala.inline
  def apply(): FinishedWorldsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishedWorldsSummary]
  }
  
  @scala.inline
  implicit class FinishedWorldsSummaryMutableBuilder[Self <: FinishedWorldsSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureSummary(value: FailureSummary): Self = StObject.set(x, "failureSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureSummaryUndefined: Self = StObject.set(x, "failureSummary", js.undefined)
    
    @scala.inline
    def setFinishedCount(value: Integer): Self = StObject.set(x, "finishedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedCountUndefined: Self = StObject.set(x, "finishedCount", js.undefined)
    
    @scala.inline
    def setSucceededWorlds(value: Arns): Self = StObject.set(x, "succeededWorlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceededWorldsUndefined: Self = StObject.set(x, "succeededWorlds", js.undefined)
    
    @scala.inline
    def setSucceededWorldsVarargs(value: Arn*): Self = StObject.set(x, "succeededWorlds", js.Array(value :_*))
  }
}
