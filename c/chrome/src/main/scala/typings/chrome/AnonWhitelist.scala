package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWhitelist extends js.Object {
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonWhitelist {
  @scala.inline
  def apply(whitelist: js.Array[String] = null): AnonWhitelist = {
    val __obj = js.Dynamic.literal()
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWhitelist]
  }
}

