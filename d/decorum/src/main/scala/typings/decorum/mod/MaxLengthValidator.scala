package typings.decorum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "MaxLengthValidator")
@js.native
class MaxLengthValidator protected () extends BaseValidator {
  def this(maxLength: Double) = this()
  def this(maxLength: Double, message: String) = this()
  def this(maxLength: Double, message: MessageHandler[MaxLengthValidator]) = this()
  var maxLength: Double = js.native
  def isValid(value: String): Boolean = js.native
}

