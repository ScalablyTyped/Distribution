package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataInput extends ItemAwareElement {
  var inputSetRef: InputSet = js.native
  var inputSetWithOptional: InputSet = js.native
  var inputSetWithWhileExecuting: InputSet = js.native
  /** @default false */
  var isCollection: Boolean = js.native
  var name: String = js.native
}

