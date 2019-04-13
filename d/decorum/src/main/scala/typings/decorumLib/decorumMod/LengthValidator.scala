package typings
package decorumLib.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "LengthValidator")
@js.native
class LengthValidator protected () extends BaseValidator {
  def this(length: scala.Double) = this()
  def this(length: scala.Double, message: MessageHandler[LengthValidator]) = this()
  def this(length: scala.Double, message: java.lang.String) = this()
  var length: scala.Double = js.native
  def isValid(value: js.Any): scala.Boolean = js.native
}

