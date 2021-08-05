package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSet
  extends StObject
     with BaseElement {
  
  var dataInputRefs: js.Array[DataInput]
  
  var name: String
  
  var optionalInputRefs: js.Array[DataInput]
  
  var outputSetRefs: js.Array[OutputSet]
  
  var whileExecutingInputsRefs: js.Array[DataInput]
}
object InputSet {
  
  inline def apply(
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
  
  extension [Self <: InputSet](x: Self) {
    
    inline def setDataInputRefs(value: js.Array[DataInput]): Self = StObject.set(x, "dataInputRefs", value.asInstanceOf[js.Any])
    
    inline def setDataInputRefsVarargs(value: DataInput*): Self = StObject.set(x, "dataInputRefs", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptionalInputRefs(value: js.Array[DataInput]): Self = StObject.set(x, "optionalInputRefs", value.asInstanceOf[js.Any])
    
    inline def setOptionalInputRefsVarargs(value: DataInput*): Self = StObject.set(x, "optionalInputRefs", js.Array(value :_*))
    
    inline def setOutputSetRefs(value: js.Array[OutputSet]): Self = StObject.set(x, "outputSetRefs", value.asInstanceOf[js.Any])
    
    inline def setOutputSetRefsVarargs(value: OutputSet*): Self = StObject.set(x, "outputSetRefs", js.Array(value :_*))
    
    inline def setWhileExecutingInputsRefs(value: js.Array[DataInput]): Self = StObject.set(x, "whileExecutingInputsRefs", value.asInstanceOf[js.Any])
    
    inline def setWhileExecutingInputsRefsVarargs(value: DataInput*): Self = StObject.set(x, "whileExecutingInputsRefs", js.Array(value :_*))
  }
}
