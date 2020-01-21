package typings.brace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", "createEditSession")
@js.native
object createEditSession extends js.Object {
  def apply(text: String, mode: TextMode): IEditSession = js.native
  def apply(text: Document, mode: TextMode): IEditSession = js.native
}

