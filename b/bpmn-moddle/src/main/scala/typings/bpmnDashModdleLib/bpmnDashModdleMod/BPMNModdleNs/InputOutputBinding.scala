package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

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
  def apply($type: ElementType, inputDataRef: InputSet, operationRef: Operation, outputDataRef: OutputSet): InputOutputBinding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("inputDataRef")(inputDataRef)
    __obj.updateDynamic("operationRef")(operationRef)
    __obj.updateDynamic("outputDataRef")(outputDataRef)
    __obj.asInstanceOf[InputOutputBinding]
  }
}

