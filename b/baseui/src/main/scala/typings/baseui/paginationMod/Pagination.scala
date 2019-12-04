package typings.baseui.paginationMod

import typings.baseui.Anon_Value
import typings.dateDashFns.Locale
import typings.react.reactMod.Component
import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/pagination", "Pagination")
@js.native
class Pagination ()
  extends Component[PaginationProps, js.Object, js.Any] {
  def constructAriaWayfinderLabel(locale: Locale, prefix: String): String = js.native
  def getMenuOptions(numPages: Double): js.Array[js.Any] = js.native
  def onMenuItemSelect(data: Anon_Value): Unit = js.native
  def onNextClick(event: SyntheticEvent[_, Event]): Unit = js.native
  def onPrevClick(event: SyntheticEvent[_, Event]): Unit = js.native
}

