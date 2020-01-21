package typings.blessed.mod

import typings.blessed.mod.Widgets.ListElement
import typings.blessed.mod.Widgets.ListElementStyle
import typings.blessed.mod.Widgets.ListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "list")
@js.native
object list extends js.Object {
  def apply(): ListElement = js.native
  def apply(options: ListOptions[ListElementStyle]): ListElement = js.native
}

