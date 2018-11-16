package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectMenu extends BaseMixin[SelectMenu] {
  @JSName("filterDisplayed")
  var filterDisplayed_Original: IGetSet[
    js.Function2[/* a */ dcLib.Anon_Key, /* index */ scala.Double, scala.Boolean], 
    SelectMenu
  ] = js.native
  @JSName("multiple")
  var multiple_Original: IGetSet[scala.Boolean, SelectMenu] = js.native
  @JSName("numberVisible")
  var numberVisible_Original: IGetSet[scala.Double, SelectMenu] = js.native
  @JSName("order")
  var order_Original: IGetSet[js.Function2[/* a */ _, /* b */ _, scala.Double], SelectMenu] = js.native
  @JSName("promptText")
  var promptText_Original: IGetSet[java.lang.String, SelectMenu] = js.native
  @JSName("promptValue")
  var promptValue_Original: IGetSet[_, SelectMenu] = js.native
  def filterDisplayed(): js.Function2[/* a */ dcLib.Anon_Key, /* index */ scala.Double, scala.Boolean] = js.native
  def filterDisplayed(t: js.Function2[/* a */ dcLib.Anon_Key, /* index */ scala.Double, scala.Boolean]): SelectMenu = js.native
  def multiple(): scala.Boolean = js.native
  def multiple(t: scala.Boolean): SelectMenu = js.native
  def numberVisible(): scala.Double = js.native
  def numberVisible(t: scala.Double): SelectMenu = js.native
  def order(): js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double] = js.native
  def order(t: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]): SelectMenu = js.native
  def promptText(): java.lang.String = js.native
  def promptText(t: java.lang.String): SelectMenu = js.native
  def promptValue(): js.Any = js.native
  def promptValue(t: js.Any): SelectMenu = js.native
}

