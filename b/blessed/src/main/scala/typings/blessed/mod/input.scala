package typings.blessed.mod

import typings.blessed.mod.Widgets.InputElement
import typings.blessed.mod.Widgets.InputOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "input")
@js.native
object input extends js.Object {
  def apply(): InputElement = js.native
  def apply(options: InputOptions): InputElement = js.native
}

