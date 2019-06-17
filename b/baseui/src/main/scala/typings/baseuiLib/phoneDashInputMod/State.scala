package typings
package baseuiLib.phoneDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var country: stdLib.Readonly[Country]
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object State {
  @scala.inline
  def apply(country: stdLib.Readonly[Country], text: java.lang.String = null): State = {
    val __obj = js.Dynamic.literal(country = country)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[State]
  }
}

