package typings
package bpmnDashModdleLib.bpmnDashModdleMod

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
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, inputDataRef = inputDataRef, operationRef = operationRef, outputDataRef = outputDataRef)
  
    __obj.asInstanceOf[InputOutputBinding]
  }
}

