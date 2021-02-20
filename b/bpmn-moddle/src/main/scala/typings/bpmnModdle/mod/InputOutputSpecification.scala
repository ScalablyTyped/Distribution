package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputOutputSpecification extends BaseElement {
  
  var dataInputs: js.Array[DataInput] = js.native
  
  var dataOutputs: js.Array[DataOutput] = js.native
  
  var inputSets: js.Array[InputSet] = js.native
  
  var outputSets: js.Array[OutputSet] = js.native
}
object InputOutputSpecification {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class InputOutputSpecificationMutableBuilder[Self <: InputOutputSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataInputs(value: js.Array[DataInput]): Self = StObject.set(x, "dataInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataInputsVarargs(value: DataInput*): Self = StObject.set(x, "dataInputs", js.Array(value :_*))
    
    @scala.inline
    def setDataOutputs(value: js.Array[DataOutput]): Self = StObject.set(x, "dataOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataOutputsVarargs(value: DataOutput*): Self = StObject.set(x, "dataOutputs", js.Array(value :_*))
    
    @scala.inline
    def setInputSets(value: js.Array[InputSet]): Self = StObject.set(x, "inputSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSetsVarargs(value: InputSet*): Self = StObject.set(x, "inputSets", js.Array(value :_*))
    
    @scala.inline
    def setOutputSets(value: js.Array[OutputSet]): Self = StObject.set(x, "outputSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSetsVarargs(value: OutputSet*): Self = StObject.set(x, "outputSets", js.Array(value :_*))
  }
}
