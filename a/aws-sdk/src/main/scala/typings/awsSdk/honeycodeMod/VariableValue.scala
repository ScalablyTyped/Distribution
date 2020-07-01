package typings.awsSdk.honeycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableValue extends js.Object {
  /**
    * Raw value of the variable.
    */
  var rawValue: RawValue = js.native
}

object VariableValue {
  @scala.inline
  def apply(rawValue: RawValue): VariableValue = {
    val __obj = js.Dynamic.literal(rawValue = rawValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValue]
  }
}

