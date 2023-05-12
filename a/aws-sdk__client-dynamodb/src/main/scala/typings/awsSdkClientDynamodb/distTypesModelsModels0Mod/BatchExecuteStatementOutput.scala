package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchExecuteStatementOutput extends StObject {
  
  /**
    * <p>The capacity units consumed by the entire operation. The values of the list are
    *             ordered according to the ordering of the statements.</p>
    */
  var ConsumedCapacity: js.UndefOr[
    js.Array[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity]
  ] = js.undefined
  
  /**
    * <p>The response to each PartiQL statement in the batch.</p>
    */
  var Responses: js.UndefOr[js.Array[BatchStatementResponse]] = js.undefined
}
object BatchExecuteStatementOutput {
  
  inline def apply(): BatchExecuteStatementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchExecuteStatementOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchExecuteStatementOutput] (val x: Self) extends AnyVal {
    
    inline def setConsumedCapacity(value: js.Array[ConsumedCapacity]): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
    
    inline def setResponses(value: js.Array[BatchStatementResponse]): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
    
    inline def setResponsesVarargs(value: BatchStatementResponse*): Self = StObject.set(x, "Responses", js.Array(value*))
  }
}
