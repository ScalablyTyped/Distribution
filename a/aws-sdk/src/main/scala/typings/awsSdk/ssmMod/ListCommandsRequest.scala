package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCommandsRequest extends StObject {
  
  /**
    * (Optional) If provided, lists only the specified command.
    */
  var CommandId: js.UndefOr[typings.awsSdk.ssmMod.CommandId] = js.native
  
  /**
    * (Optional) One or more filters. Use a filter to return a more specific list of results. 
    */
  var Filters: js.UndefOr[CommandFilterList] = js.native
  
  /**
    * (Optional) Lists commands issued against this instance ID.  You can't specify an instance ID in the same command that you specify Status = Pending. This is because the command has not reached the instance yet. 
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.native
  
  /**
    * (Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[CommandMaxResults] = js.native
  
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object ListCommandsRequest {
  
  @scala.inline
  def apply(): ListCommandsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCommandsRequest]
  }
  
  @scala.inline
  implicit class ListCommandsRequestMutableBuilder[Self <: ListCommandsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandId(value: CommandId): Self = StObject.set(x, "CommandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandIdUndefined: Self = StObject.set(x, "CommandId", js.undefined)
    
    @scala.inline
    def setFilters(value: CommandFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: CommandFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: CommandMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
