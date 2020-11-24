package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputSet extends BaseElement {
  
  var dataOutputRefs: js.Array[DataOutput] = js.native
  
  var inputSetRefs: js.Array[InputSet] = js.native
  
  var name: String = js.native
  
  var optionalOutputRefs: js.Array[DataOutput] = js.native
  
  var whileExecutingOutputREfs: js.Array[DataOutput] = js.native
}
object OutputSet {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataOutputRefs: js.Array[DataOutput],
    id: String,
    inputSetRefs: js.Array[InputSet],
    name: String,
    optionalOutputRefs: js.Array[DataOutput],
    whileExecutingOutputREfs: js.Array[DataOutput]
  ): OutputSet = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataOutputRefs = dataOutputRefs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputSetRefs = inputSetRefs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalOutputRefs = optionalOutputRefs.asInstanceOf[js.Any], whileExecutingOutputREfs = whileExecutingOutputREfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSet]
  }
  
  @scala.inline
  implicit class OutputSetOps[Self <: OutputSet] (val x: Self) extends AnyVal {
    
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
    def setDataOutputRefsVarargs(value: DataOutput*): Self = this.set("dataOutputRefs", js.Array(value :_*))
    
    @scala.inline
    def setDataOutputRefs(value: js.Array[DataOutput]): Self = this.set("dataOutputRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSetRefsVarargs(value: InputSet*): Self = this.set("inputSetRefs", js.Array(value :_*))
    
    @scala.inline
    def setInputSetRefs(value: js.Array[InputSet]): Self = this.set("inputSetRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalOutputRefsVarargs(value: DataOutput*): Self = this.set("optionalOutputRefs", js.Array(value :_*))
    
    @scala.inline
    def setOptionalOutputRefs(value: js.Array[DataOutput]): Self = this.set("optionalOutputRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhileExecutingOutputREfsVarargs(value: DataOutput*): Self = this.set("whileExecutingOutputREfs", js.Array(value :_*))
    
    @scala.inline
    def setWhileExecutingOutputREfs(value: js.Array[DataOutput]): Self = this.set("whileExecutingOutputREfs", value.asInstanceOf[js.Any])
  }
}
