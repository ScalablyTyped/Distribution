package typings.cliInteract.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cli-interact", "getNumber")
@js.native
object getNumber extends js.Object {
  def apply(promptText: String): Double = js.native
  def apply(promptText: String, opts: Boolean): Double = js.native
  def apply(promptText: String, opts: NumberOptions): Double = js.native
}

