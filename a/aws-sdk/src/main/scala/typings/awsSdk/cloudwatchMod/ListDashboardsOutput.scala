package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDashboardsOutput extends StObject {
  
  /**
    * The list of matching dashboards.
    */
  var DashboardEntries: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardEntries] = js.native
  
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
}
object ListDashboardsOutput {
  
  @scala.inline
  def apply(): ListDashboardsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDashboardsOutput]
  }
  
  @scala.inline
  implicit class ListDashboardsOutputMutableBuilder[Self <: ListDashboardsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardEntries(value: DashboardEntries): Self = StObject.set(x, "DashboardEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardEntriesUndefined: Self = StObject.set(x, "DashboardEntries", js.undefined)
    
    @scala.inline
    def setDashboardEntriesVarargs(value: DashboardEntry*): Self = StObject.set(x, "DashboardEntries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
