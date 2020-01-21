package typings.azure

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpiry extends js.Object {
  var Expiry: Date
  var Permission: js.UndefOr[String] = js.undefined
  var Start: js.UndefOr[Date] = js.undefined
}

object AnonExpiry {
  @scala.inline
  def apply(Expiry: Date, Permission: String = null, Start: Date = null): AnonExpiry = {
    val __obj = js.Dynamic.literal(Expiry = Expiry.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    if (Start != null) __obj.updateDynamic("Start")(Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpiry]
  }
}

