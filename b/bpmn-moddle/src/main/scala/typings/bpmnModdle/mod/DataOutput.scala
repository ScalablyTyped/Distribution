package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataOutput extends ItemAwareElement {
  
  /**
    * @default false
    */
  var isCollection: Boolean = js.native
  
  var name: String = js.native
  
  var outputSetRef: js.Array[InputSet] = js.native
  
  var outputSetWithOptional: js.Array[InputSet] = js.native
  
  var outputSetWithWhileExecuting: js.Array[InputSet] = js.native
}
object DataOutput {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataState: DataState,
    id: String,
    isCollection: Boolean,
    itemSubjectRef: ItemDefinition,
    name: String,
    outputSetRef: js.Array[InputSet],
    outputSetWithOptional: js.Array[InputSet],
    outputSetWithWhileExecuting: js.Array[InputSet]
  ): DataOutput = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCollection = isCollection.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputSetRef = outputSetRef.asInstanceOf[js.Any], outputSetWithOptional = outputSetWithOptional.asInstanceOf[js.Any], outputSetWithWhileExecuting = outputSetWithWhileExecuting.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOutput]
  }
  
  @scala.inline
  implicit class DataOutputOps[Self <: DataOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsCollection(value: Boolean): Self = this.set("isCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSetRefVarargs(value: InputSet*): Self = this.set("outputSetRef", js.Array(value :_*))
    
    @scala.inline
    def setOutputSetRef(value: js.Array[InputSet]): Self = this.set("outputSetRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSetWithOptionalVarargs(value: InputSet*): Self = this.set("outputSetWithOptional", js.Array(value :_*))
    
    @scala.inline
    def setOutputSetWithOptional(value: js.Array[InputSet]): Self = this.set("outputSetWithOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSetWithWhileExecutingVarargs(value: InputSet*): Self = this.set("outputSetWithWhileExecuting", js.Array(value :_*))
    
    @scala.inline
    def setOutputSetWithWhileExecuting(value: js.Array[InputSet]): Self = this.set("outputSetWithWhileExecuting", value.asInstanceOf[js.Any])
  }
}
