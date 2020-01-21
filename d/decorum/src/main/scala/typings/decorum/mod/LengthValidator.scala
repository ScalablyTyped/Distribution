package typings.decorum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "LengthValidator")
@js.native
class LengthValidator protected () extends BaseValidator {
  def this(length: Double) = this()
  def this(length: Double, message: String) = this()
  def this(length: Double, message: MessageHandler[LengthValidator]) = this()
  var length: Double = js.native
  def isValid(value: js.Any): Boolean = js.native
}

