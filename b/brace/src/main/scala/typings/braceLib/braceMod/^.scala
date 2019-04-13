package typings
package braceLib.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def acequire(moduleName: java.lang.String): js.Any = js.native
  def createEditSession(text: Document, mode: TextMode): IEditSession = js.native
  def createEditSession(text: java.lang.String, mode: TextMode): IEditSession = js.native
  def edit(el: java.lang.String): Editor = js.native
  def edit(el: stdLib.HTMLElement): Editor = js.native
}

