package typings.cliInteract.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cli-interact", "getChar")
@js.native
object getChar extends js.Object {
  def apply(promptText: String, allowedCharsAsString: String): String = js.native
  def apply(promptText: String, allowedCharsAsString: String, flagAllowNoAnswer: Boolean): String = js.native
}

