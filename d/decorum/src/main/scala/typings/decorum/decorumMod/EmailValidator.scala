package typings.decorum.decorumMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "EmailValidator")
@js.native
class EmailValidator () extends PatternValidator {
  def this(message: String) = this()
  def this(message: MessageHandler[EmailValidator]) = this()
}

/* static members */
@JSImport("decorum", "EmailValidator")
@js.native
object EmailValidator extends js.Object {
  var EmailRegex: RegExp = js.native
}

