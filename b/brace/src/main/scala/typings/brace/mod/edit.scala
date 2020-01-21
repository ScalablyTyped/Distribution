package typings.brace.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", "edit")
@js.native
object edit extends js.Object {
  def apply(el: String): Editor = js.native
  def apply(el: HTMLElement): Editor = js.native
}

