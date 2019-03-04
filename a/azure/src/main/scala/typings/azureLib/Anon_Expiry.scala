package typings
package azureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expiry extends js.Object {
  var Expiry: stdLib.Date
  var Permission: js.UndefOr[java.lang.String] = js.undefined
  var Start: js.UndefOr[stdLib.Date] = js.undefined
}

object Anon_Expiry {
  @scala.inline
  def apply(Expiry: stdLib.Date, Permission: java.lang.String = null, Start: stdLib.Date = null): Anon_Expiry = {
    val __obj = js.Dynamic.literal(Expiry = Expiry)
    if (Permission != null) __obj.updateDynamic("Permission")(Permission)
    if (Start != null) __obj.updateDynamic("Start")(Start)
    __obj.asInstanceOf[Anon_Expiry]
  }
}

