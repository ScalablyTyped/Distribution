package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchExecuteStatementResponse extends StObject {
  
  /**
    * The execution results of each batch entry.
    */
  var updateResults: js.UndefOr[UpdateResults] = js.undefined
}
object BatchExecuteStatementResponse {
  
  @scala.inline
  def apply(): BatchExecuteStatementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchExecuteStatementResponse]
  }
  
  @scala.inline
  implicit class BatchExecuteStatementResponseMutableBuilder[Self <: BatchExecuteStatementResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdateResults(value: UpdateResults): Self = StObject.set(x, "updateResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateResultsUndefined: Self = StObject.set(x, "updateResults", js.undefined)
    
    @scala.inline
    def setUpdateResultsVarargs(value: UpdateResult*): Self = StObject.set(x, "updateResults", js.Array(value :_*))
  }
}
