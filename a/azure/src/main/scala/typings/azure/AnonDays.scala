package typings.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDays extends js.Object {
  var Days: Double
  var Enabled: Boolean
}

object AnonDays {
  @scala.inline
  def apply(Days: Double, Enabled: Boolean): AnonDays = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDays]
  }
}

