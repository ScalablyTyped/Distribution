package typings.decorum.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "MinLengthValidator")
@js.native
class MinLengthValidator protected () extends BaseValidator {
  def this(minLength: Double) = this()
  def this(minLength: Double, message: String) = this()
  def this(minLength: Double, message: MessageHandler[MinLengthValidator]) = this()
  var minLength: Double = js.native
  def isValid(value: String): Boolean = js.native
}

