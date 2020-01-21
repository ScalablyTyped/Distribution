package typings.baseui.paginationMod

import typings.baseui.AnonValue
import typings.dateFns.Locale
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/pagination", "Pagination")
@js.native
class Pagination ()
  extends Component[PaginationProps, js.Object, js.Any] {
  def constructAriaWayfinderLabel(locale: Locale, prefix: String): String = js.native
  def getMenuOptions(numPages: Double): js.Array[js.Any] = js.native
  def onMenuItemSelect(data: AnonValue): Unit = js.native
  def onNextClick(event: SyntheticEvent[_, Event_]): Unit = js.native
  def onPrevClick(event: SyntheticEvent[_, Event_]): Unit = js.native
}

