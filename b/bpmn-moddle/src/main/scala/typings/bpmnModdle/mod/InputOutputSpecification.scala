package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputOutputSpecification
  extends StObject
     with BaseElement {
  
  var dataInputs: js.Array[DataInput]
  
  var dataOutputs: js.Array[DataOutput]
  
  var inputSets: js.Array[InputSet]
  
  var outputSets: js.Array[OutputSet]
}
object InputOutputSpecification {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataInputs: js.Array[DataInput],
    dataOutputs: js.Array[DataOutput],
    id: String,
    inputSets: js.Array[InputSet],
    outputSets: js.Array[OutputSet]
  ): InputOutputSpecification = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataInputs = dataInputs.asInstanceOf[js.Any], dataOutputs = dataOutputs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputSets = inputSets.asInstanceOf[js.Any], outputSets = outputSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputOutputSpecification]
  }
  
  extension [Self <: InputOutputSpecification](x: Self) {
    
    inline def setDataInputs(value: js.Array[DataInput]): Self = StObject.set(x, "dataInputs", value.asInstanceOf[js.Any])
    
    inline def setDataInputsVarargs(value: DataInput*): Self = StObject.set(x, "dataInputs", js.Array(value*))
    
    inline def setDataOutputs(value: js.Array[DataOutput]): Self = StObject.set(x, "dataOutputs", value.asInstanceOf[js.Any])
    
    inline def setDataOutputsVarargs(value: DataOutput*): Self = StObject.set(x, "dataOutputs", js.Array(value*))
    
    inline def setInputSets(value: js.Array[InputSet]): Self = StObject.set(x, "inputSets", value.asInstanceOf[js.Any])
    
    inline def setInputSetsVarargs(value: InputSet*): Self = StObject.set(x, "inputSets", js.Array(value*))
    
    inline def setOutputSets(value: js.Array[OutputSet]): Self = StObject.set(x, "outputSets", value.asInstanceOf[js.Any])
    
    inline def setOutputSetsVarargs(value: OutputSet*): Self = StObject.set(x, "outputSets", js.Array(value*))
  }
}
