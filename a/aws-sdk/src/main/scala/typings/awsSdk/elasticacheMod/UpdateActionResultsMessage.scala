package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateActionResultsMessage extends StObject {
  
  /**
    * Update actions that have been processed successfully
    */
  var ProcessedUpdateActions: js.UndefOr[ProcessedUpdateActionList] = js.native
  
  /**
    * Update actions that haven't been processed successfully
    */
  var UnprocessedUpdateActions: js.UndefOr[UnprocessedUpdateActionList] = js.native
}
object UpdateActionResultsMessage {
  
  @scala.inline
  def apply(): UpdateActionResultsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateActionResultsMessage]
  }
  
  @scala.inline
  implicit class UpdateActionResultsMessageMutableBuilder[Self <: UpdateActionResultsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessedUpdateActions(value: ProcessedUpdateActionList): Self = StObject.set(x, "ProcessedUpdateActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessedUpdateActionsUndefined: Self = StObject.set(x, "ProcessedUpdateActions", js.undefined)
    
    @scala.inline
    def setProcessedUpdateActionsVarargs(value: ProcessedUpdateAction*): Self = StObject.set(x, "ProcessedUpdateActions", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedUpdateActions(value: UnprocessedUpdateActionList): Self = StObject.set(x, "UnprocessedUpdateActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedUpdateActionsUndefined: Self = StObject.set(x, "UnprocessedUpdateActions", js.undefined)
    
    @scala.inline
    def setUnprocessedUpdateActionsVarargs(value: UnprocessedUpdateAction*): Self = StObject.set(x, "UnprocessedUpdateActions", js.Array(value :_*))
  }
}
