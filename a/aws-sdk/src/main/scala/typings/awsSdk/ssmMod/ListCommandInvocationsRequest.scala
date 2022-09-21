package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCommandInvocationsRequest extends StObject {
  
  /**
    * (Optional) The invocations for a specific command ID.
    */
  var CommandId: js.UndefOr[typings.awsSdk.ssmMod.CommandId] = js.undefined
  
  /**
    * (Optional) If set this returns the response of the command executions and any command output. The default value is false. 
    */
  var Details: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Optional) One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[CommandFilterList] = js.undefined
  
  /**
    * (Optional) The command execution details for a specific managed node ID.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.undefined
  
  /**
    * (Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[CommandMaxResults] = js.undefined
  
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object ListCommandInvocationsRequest {
  
  inline def apply(): ListCommandInvocationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCommandInvocationsRequest]
  }
  
  extension [Self <: ListCommandInvocationsRequest](x: Self) {
    
    inline def setCommandId(value: CommandId): Self = StObject.set(x, "CommandId", value.asInstanceOf[js.Any])
    
    inline def setCommandIdUndefined: Self = StObject.set(x, "CommandId", js.undefined)
    
    inline def setDetails(value: Boolean): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    inline def setFilters(value: CommandFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: CommandFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setMaxResults(value: CommandMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
