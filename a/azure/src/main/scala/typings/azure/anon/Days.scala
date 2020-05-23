package typings.azure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Days extends js.Object {
  var Days: Double
  var Enabled: Boolean
}

object Days {
  @scala.inline
  def apply(Days: Double, Enabled: Boolean): Days = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Days]
  }
}

