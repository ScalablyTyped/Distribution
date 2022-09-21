package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDashboardsOutput extends StObject {
  
  /**
    * The list of matching dashboards.
    */
  var DashboardEntries: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardEntries] = js.undefined
  
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.undefined
}
object ListDashboardsOutput {
  
  inline def apply(): ListDashboardsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDashboardsOutput]
  }
  
  extension [Self <: ListDashboardsOutput](x: Self) {
    
    inline def setDashboardEntries(value: DashboardEntries): Self = StObject.set(x, "DashboardEntries", value.asInstanceOf[js.Any])
    
    inline def setDashboardEntriesUndefined: Self = StObject.set(x, "DashboardEntries", js.undefined)
    
    inline def setDashboardEntriesVarargs(value: DashboardEntry*): Self = StObject.set(x, "DashboardEntries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
