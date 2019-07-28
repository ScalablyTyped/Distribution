package typings.azure

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expiry extends js.Object {
  var Expiry: Date
  var Permission: js.UndefOr[String] = js.undefined
  var Start: js.UndefOr[Date] = js.undefined
}

object Anon_Expiry {
  @scala.inline
  def apply(Expiry: Date, Permission: String = null, Start: Date = null): Anon_Expiry = {
    val __obj = js.Dynamic.literal(Expiry = Expiry)
    if (Permission != null) __obj.updateDynamic("Permission")(Permission)
    if (Start != null) __obj.updateDynamic("Start")(Start)
    __obj.asInstanceOf[Anon_Expiry]
  }
}

