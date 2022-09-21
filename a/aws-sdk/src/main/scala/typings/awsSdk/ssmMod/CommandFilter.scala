package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandFilter extends StObject {
  
  /**
    * The name of the filter.  The ExecutionStage filter can't be used with the ListCommandInvocations operation, only with ListCommands. 
    */
  var key: CommandFilterKey
  
  /**
    * The filter value. Valid values for each filter key are as follows:    InvokedAfter: Specify a timestamp to limit your results. For example, specify 2021-07-07T00:00:00Z to see a list of command executions occurring July 7, 2021, and later.    InvokedBefore: Specify a timestamp to limit your results. For example, specify 2021-07-07T00:00:00Z to see a list of command executions from before July 7, 2021.    Status: Specify a valid command status to see a list of all command executions with that status. The status choices depend on the API you call. The status values you can specify for ListCommands are:    Pending     InProgress     Success     Cancelled     Failed     TimedOut (this includes both Delivery and Execution time outs)     AccessDenied     DeliveryTimedOut     ExecutionTimedOut     Incomplete     NoInstancesInTag     LimitExceeded    The status values you can specify for ListCommandInvocations are:    Pending     InProgress     Delayed     Success     Cancelled     Failed     TimedOut (this includes both Delivery and Execution time outs)     AccessDenied     DeliveryTimedOut     ExecutionTimedOut     Undeliverable     InvalidPlatform     Terminated       DocumentName: Specify name of the Amazon Web Services Systems Manager document (SSM document) for which you want to see command execution results. For example, specify AWS-RunPatchBaseline to see command executions that used this SSM document to perform security patching operations on managed nodes.     ExecutionStage: Specify one of the following values (ListCommands operations only):    Executing: Returns a list of command executions that are currently still running.    Complete: Returns a list of command executions that have already completed.     
    */
  var value: CommandFilterValue
}
object CommandFilter {
  
  inline def apply(key: CommandFilterKey, value: CommandFilterValue): CommandFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandFilter]
  }
  
  extension [Self <: CommandFilter](x: Self) {
    
    inline def setKey(value: CommandFilterKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CommandFilterValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
