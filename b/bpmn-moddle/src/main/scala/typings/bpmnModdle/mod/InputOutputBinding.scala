package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputOutputBinding extends TypeDerived {
  var inputDataRef: InputSet
  var operationRef: Operation
  var outputDataRef: OutputSet
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
}

