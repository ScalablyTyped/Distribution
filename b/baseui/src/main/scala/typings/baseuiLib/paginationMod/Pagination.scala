package typings
package baseuiLib.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/pagination", "Pagination")
@js.native
class Pagination ()
  extends reactLib.reactMod.PureComponent[PaginationProps, js.Object, js.Any] {
  def constructAriaWayfinderLabel(locale: baseuiLib.Locale, prefix: java.lang.String): java.lang.String = js.native
  def getMenuOptions(numPages: scala.Double): js.Array[js.Any] = js.native
  def onMenuItemSelect(data: baseuiLib.Anon_Value): scala.Unit = js.native
  def onNextClick(event: reactLib.reactMod.SyntheticEvent[_, reactLib.Event]): scala.Unit = js.native
  def onPrevClick(event: reactLib.reactMod.SyntheticEvent[_, reactLib.Event]): scala.Unit = js.native
}

