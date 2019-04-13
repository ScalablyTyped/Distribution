package typings
package decorumLib.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "PatternValidator")
@js.native
class PatternValidator protected () extends BaseValidator {
  def this(pattern: stdLib.RegExp) = this()
  def this(pattern: stdLib.RegExp, message: MessageHandler[PatternValidator]) = this()
  def this(pattern: stdLib.RegExp, message: java.lang.String) = this()
  var pattern: stdLib.RegExp = js.native
  def isValid(value: js.Any): scala.Boolean = js.native
}

