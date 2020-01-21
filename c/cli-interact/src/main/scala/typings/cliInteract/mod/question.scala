package typings.cliInteract.mod

import typings.readlineSync.mod.BasicOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cli-interact", "question")
@js.native
object question extends js.Object {
  def apply(prompt: String): String = js.native
  def apply(prompt: String, options: BasicOptions): String = js.native
}

