package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CBoxMenu extends BaseMixin[CBoxMenu] {
  @JSName("filterDisplayed")
  var filterDisplayed_Original: IGetSet[js.Function, CBoxMenu] = js.native
  @JSName("multiple")
  var multiple_Original: IGetSet[Boolean, CBoxMenu] = js.native
  @JSName("order")
  var order_Original: IGetSet[js.Function, CBoxMenu] = js.native
  @JSName("promptText")
  var promptText_Original: IGetSet[String, CBoxMenu] = js.native
  @JSName("promptValue")
  var promptValue_Original: IGetSet[_, CBoxMenu] = js.native
  def filterDisplayed(): js.Function = js.native
  def filterDisplayed(t: js.Function): CBoxMenu = js.native
  def multiple(): Boolean = js.native
  def multiple(t: Boolean): CBoxMenu = js.native
  def order(): js.Function = js.native
  def order(t: js.Function): CBoxMenu = js.native
  def promptText(): String = js.native
  def promptText(t: String): CBoxMenu = js.native
  def promptValue(): js.Any = js.native
  def promptValue(t: js.Any): CBoxMenu = js.native
}

