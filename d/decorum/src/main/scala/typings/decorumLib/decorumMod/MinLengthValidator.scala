package typings
package decorumLib.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "MinLengthValidator")
@js.native
class MinLengthValidator protected () extends BaseValidator {
  def this(minLength: scala.Double) = this()
  def this(minLength: scala.Double, message: MessageHandler[MinLengthValidator]) = this()
  def this(minLength: scala.Double, message: java.lang.String) = this()
  var minLength: scala.Double = js.native
  def isValid(value: java.lang.String): scala.Boolean = js.native
}

