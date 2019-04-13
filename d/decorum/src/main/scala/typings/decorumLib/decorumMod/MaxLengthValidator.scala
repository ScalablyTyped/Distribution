package typings
package decorumLib.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "MaxLengthValidator")
@js.native
class MaxLengthValidator protected () extends BaseValidator {
  def this(maxLength: scala.Double) = this()
  def this(maxLength: scala.Double, message: MessageHandler[MaxLengthValidator]) = this()
  def this(maxLength: scala.Double, message: java.lang.String) = this()
  var maxLength: scala.Double = js.native
  def isValid(value: java.lang.String): scala.Boolean = js.native
}

