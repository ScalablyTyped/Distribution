package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.operationMod.Operation
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationsA extends StObject {
  
  var operationsA: js.Array[Operation]
  
  var operationsB: js.Array[Operation]
  
  var originalOperations: Map[Operation, Operation]
}
object OperationsA {
  
  inline def apply(
    operationsA: js.Array[Operation],
    operationsB: js.Array[Operation],
    originalOperations: Map[Operation, Operation]
  ): OperationsA = {
    val __obj = js.Dynamic.literal(operationsA = operationsA.asInstanceOf[js.Any], operationsB = operationsB.asInstanceOf[js.Any], originalOperations = originalOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationsA]
  }
  
  extension [Self <: OperationsA](x: Self) {
    
    inline def setOperationsA(value: js.Array[Operation]): Self = StObject.set(x, "operationsA", value.asInstanceOf[js.Any])
    
    inline def setOperationsAVarargs(value: Operation*): Self = StObject.set(x, "operationsA", js.Array(value*))
    
    inline def setOperationsB(value: js.Array[Operation]): Self = StObject.set(x, "operationsB", value.asInstanceOf[js.Any])
    
    inline def setOperationsBVarargs(value: Operation*): Self = StObject.set(x, "operationsB", js.Array(value*))
    
    inline def setOriginalOperations(value: Map[Operation, Operation]): Self = StObject.set(x, "originalOperations", value.asInstanceOf[js.Any])
  }
}
