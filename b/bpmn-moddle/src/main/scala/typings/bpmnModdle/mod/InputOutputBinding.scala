package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputOutputBinding extends TypeDerived {
  
  var inputDataRef: InputSet = js.native
  
  var operationRef: Operation = js.native
  
  var outputDataRef: OutputSet = js.native
}
object InputOutputBinding {
  
  @scala.inline
  def apply(
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
  implicit class InputOutputBindingMutableBuilder[Self <: InputOutputBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputDataRef(value: InputSet): Self = StObject.set(x, "inputDataRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationRef(value: Operation): Self = StObject.set(x, "operationRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDataRef(value: OutputSet): Self = StObject.set(x, "outputDataRef", value.asInstanceOf[js.Any])
  }
}
