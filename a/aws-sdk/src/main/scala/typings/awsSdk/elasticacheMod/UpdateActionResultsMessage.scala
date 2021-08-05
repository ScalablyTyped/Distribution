package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateActionResultsMessage extends StObject {
  
  /**
    * Update actions that have been processed successfully
    */
  var ProcessedUpdateActions: js.UndefOr[ProcessedUpdateActionList] = js.undefined
  
  /**
    * Update actions that haven't been processed successfully
    */
  var UnprocessedUpdateActions: js.UndefOr[UnprocessedUpdateActionList] = js.undefined
}
object UpdateActionResultsMessage {
  
  inline def apply(): UpdateActionResultsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateActionResultsMessage]
  }
  
  extension [Self <: UpdateActionResultsMessage](x: Self) {
    
    inline def setProcessedUpdateActions(value: ProcessedUpdateActionList): Self = StObject.set(x, "ProcessedUpdateActions", value.asInstanceOf[js.Any])
    
    inline def setProcessedUpdateActionsUndefined: Self = StObject.set(x, "ProcessedUpdateActions", js.undefined)
    
    inline def setProcessedUpdateActionsVarargs(value: ProcessedUpdateAction*): Self = StObject.set(x, "ProcessedUpdateActions", js.Array(value :_*))
    
    inline def setUnprocessedUpdateActions(value: UnprocessedUpdateActionList): Self = StObject.set(x, "UnprocessedUpdateActions", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedUpdateActionsUndefined: Self = StObject.set(x, "UnprocessedUpdateActions", js.undefined)
    
    inline def setUnprocessedUpdateActionsVarargs(value: UnprocessedUpdateAction*): Self = StObject.set(x, "UnprocessedUpdateActions", js.Array(value :_*))
  }
}
