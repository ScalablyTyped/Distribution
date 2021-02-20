package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputSet extends BaseElement {
  
  var dataInputRefs: js.Array[DataInput] = js.native
  
  var name: String = js.native
  
  var optionalInputRefs: js.Array[DataInput] = js.native
  
  var outputSetRefs: js.Array[OutputSet] = js.native
  
  var whileExecutingInputsRefs: js.Array[DataInput] = js.native
}
object InputSet {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataInputRefs: js.Array[DataInput],
    id: String,
    name: String,
    optionalInputRefs: js.Array[DataInput],
    outputSetRefs: js.Array[OutputSet],
    whileExecutingInputsRefs: js.Array[DataInput]
  ): InputSet = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataInputRefs = dataInputRefs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalInputRefs = optionalInputRefs.asInstanceOf[js.Any], outputSetRefs = outputSetRefs.asInstanceOf[js.Any], whileExecutingInputsRefs = whileExecutingInputsRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSet]
  }
  
  @scala.inline
  implicit class InputSetMutableBuilder[Self <: InputSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataInputRefs(value: js.Array[DataInput]): Self = StObject.set(x, "dataInputRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataInputRefsVarargs(value: DataInput*): Self = StObject.set(x, "dataInputRefs", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalInputRefs(value: js.Array[DataInput]): Self = StObject.set(x, "optionalInputRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalInputRefsVarargs(value: DataInput*): Self = StObject.set(x, "optionalInputRefs", js.Array(value :_*))
    
    @scala.inline
    def setOutputSetRefs(value: js.Array[OutputSet]): Self = StObject.set(x, "outputSetRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSetRefsVarargs(value: OutputSet*): Self = StObject.set(x, "outputSetRefs", js.Array(value :_*))
    
    @scala.inline
    def setWhileExecutingInputsRefs(value: js.Array[DataInput]): Self = StObject.set(x, "whileExecutingInputsRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhileExecutingInputsRefsVarargs(value: DataInput*): Self = StObject.set(x, "whileExecutingInputsRefs", js.Array(value :_*))
  }
}
