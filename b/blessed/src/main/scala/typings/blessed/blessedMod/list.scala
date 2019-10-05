package typings.blessed.blessedMod

import typings.blessed.blessedMod.Widgets.ListElement
import typings.blessed.blessedMod.Widgets.ListElementStyle
import typings.blessed.blessedMod.Widgets.ListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "list")
@js.native
object list extends js.Object {
  def apply(): ListElement = js.native
  def apply(options: ListOptions[ListElementStyle]): ListElement = js.native
}

