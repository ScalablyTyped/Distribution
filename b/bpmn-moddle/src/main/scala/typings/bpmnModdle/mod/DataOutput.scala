package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

