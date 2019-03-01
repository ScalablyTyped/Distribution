package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Whitelist extends js.Object {
  var whitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Whitelist {
  @scala.inline
  def apply(whitelist: js.Array[java.lang.String] = null): Anon_Whitelist = {
    val __obj = js.Dynamic.literal()
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[Anon_Whitelist]
  }
}

