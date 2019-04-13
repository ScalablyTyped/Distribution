package typings
package decorumLib.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "RequiredFieldValidator")
@js.native
class RequiredFieldValidator () extends BaseValidator {
  def this(message: MessageHandler[RequiredFieldValidator]) = this()
  def this(message: java.lang.String) = this()
  def isValid(value: js.Any): scala.Boolean = js.native
}

