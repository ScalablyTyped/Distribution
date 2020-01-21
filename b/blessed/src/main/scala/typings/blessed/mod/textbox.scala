package typings.blessed.mod

import typings.blessed.mod.Widgets.TextboxElement
import typings.blessed.mod.Widgets.TextboxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "textbox")
@js.native
object textbox extends js.Object {
  def apply(): TextboxElement = js.native
  def apply(options: TextboxOptions): TextboxElement = js.native
}

