package typings.brace.braceMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def acequire(moduleName: String): js.Any = js.native
  def createEditSession(text: String, mode: TextMode): IEditSession = js.native
  def createEditSession(text: Document, mode: TextMode): IEditSession = js.native
  def edit(el: String): Editor = js.native
  def edit(el: HTMLElement): Editor = js.native
}

