package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputOutputBinding
  extends StObject
     with TypeDerived {
  
  var inputDataRef: InputSet
  
  var operationRef: Operation
  
  var outputDataRef: OutputSet
}
object InputOutputBinding {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    inputDataRef: InputSet,
    operationRef: Operation,
    outputDataRef: OutputSet
  ): InputOutputBinding = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], inputDataRef = inputDataRef.asInstanceOf[js.Any], operationRef = operationRef.asInstanceOf[js.Any], outputDataRef = outputDataRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputOutputBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputOutputBinding] (val x: Self) extends AnyVal {
    
    inline def setInputDataRef(value: InputSet): Self = StObject.set(x, "inputDataRef", value.asInstanceOf[js.Any])
    
    inline def setOperationRef(value: Operation): Self = StObject.set(x, "operationRef", value.asInstanceOf[js.Any])
    
    inline def setOutputDataRef(value: OutputSet): Self = StObject.set(x, "outputDataRef", value.asInstanceOf[js.Any])
  }
}
