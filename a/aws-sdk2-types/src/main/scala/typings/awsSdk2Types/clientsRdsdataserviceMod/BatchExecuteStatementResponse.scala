package typings.awsSdk2Types.clientsRdsdataserviceMod

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
  
  inline def apply(): BatchExecuteStatementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchExecuteStatementResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchExecuteStatementResponse] (val x: Self) extends AnyVal {
    
    inline def setUpdateResults(value: UpdateResults): Self = StObject.set(x, "updateResults", value.asInstanceOf[js.Any])
    
    inline def setUpdateResultsUndefined: Self = StObject.set(x, "updateResults", js.undefined)
    
    inline def setUpdateResultsVarargs(value: UpdateResult*): Self = StObject.set(x, "updateResults", js.Array(value*))
  }
}
