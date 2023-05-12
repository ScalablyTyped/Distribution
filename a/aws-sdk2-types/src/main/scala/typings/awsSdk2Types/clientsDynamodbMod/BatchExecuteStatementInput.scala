package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchExecuteStatementInput extends StObject {
  
  var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ReturnConsumedCapacity] = js.undefined
  
  /**
    * The list of PartiQL statements representing the batch to run.
    */
  var Statements: PartiQLBatchRequest
}
object BatchExecuteStatementInput {
  
  inline def apply(Statements: PartiQLBatchRequest): BatchExecuteStatementInput = {
    val __obj = js.Dynamic.literal(Statements = Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchExecuteStatementInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchExecuteStatementInput] (val x: Self) extends AnyVal {
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    inline def setStatements(value: PartiQLBatchRequest): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: BatchStatementRequest*): Self = StObject.set(x, "Statements", js.Array(value*))
  }
}
