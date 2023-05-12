package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchExecuteStatementInput extends StObject {
  
  /**
    * <p>Determines the level of detail about either provisioned or on-demand throughput
    *             consumption that is returned in the response:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>INDEXES</code> - The response includes the aggregate
    *                         <code>ConsumedCapacity</code> for the operation, together with
    *                         <code>ConsumedCapacity</code> for each table and secondary index that was
    *                     accessed.</p>
    *                <p>Note that some operations, such as <code>GetItem</code> and
    *                         <code>BatchGetItem</code>, do not access any indexes at all. In these cases,
    *                     specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code>
    *                     information for table(s).</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>TOTAL</code> - The response includes only the aggregate
    *                         <code>ConsumedCapacity</code> for the operation.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the
    *                     response.</p>
    *             </li>
    *          </ul>
    */
  var ReturnConsumedCapacity: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
  ] = js.undefined
  
  /**
    * <p>The list of PartiQL statements representing the batch to run.</p>
    */
  var Statements: js.UndefOr[js.Array[BatchStatementRequest]] = js.undefined
}
object BatchExecuteStatementInput {
  
  inline def apply(): BatchExecuteStatementInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchExecuteStatementInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchExecuteStatementInput] (val x: Self) extends AnyVal {
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    inline def setStatements(value: js.Array[BatchStatementRequest]): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsUndefined: Self = StObject.set(x, "Statements", js.undefined)
    
    inline def setStatementsVarargs(value: BatchStatementRequest*): Self = StObject.set(x, "Statements", js.Array(value*))
  }
}
