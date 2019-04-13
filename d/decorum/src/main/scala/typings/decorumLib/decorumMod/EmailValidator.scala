package typings
package decorumLib.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "EmailValidator")
@js.native
class EmailValidator () extends PatternValidator {
  def this(message: MessageHandler[EmailValidator]) = this()
  def this(message: java.lang.String) = this()
}

/* static members */
@JSImport("decorum", "EmailValidator")
@js.native
object EmailValidator extends js.Object {
  var EmailRegex: stdLib.RegExp = js.native
}

