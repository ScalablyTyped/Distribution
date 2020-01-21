package typings.decorum.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "PatternValidator")
@js.native
class PatternValidator protected () extends BaseValidator {
  def this(pattern: RegExp) = this()
  def this(pattern: RegExp, message: String) = this()
  def this(pattern: RegExp, message: MessageHandler[PatternValidator]) = this()
  var pattern: RegExp = js.native
  def isValid(value: js.Any): Boolean = js.native
}

