package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class InputOutputBindingOps[Self <: InputOutputBinding] (val x: Self) extends AnyVal {
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
    def setInputDataRef(value: InputSet): Self = this.set("inputDataRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationRef(value: Operation): Self = this.set("operationRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputDataRef(value: OutputSet): Self = this.set("outputDataRef", value.asInstanceOf[js.Any])
  }
  
}

