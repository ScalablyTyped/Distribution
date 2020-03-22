package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassValue extends js.Object {
  /** If provided, will remove all gridlines with this class. */
  var `class`: js.UndefOr[String] = js.undefined
  /** If provided, will remove all gridlines at this value. */
  var value: js.UndefOr[Double | String] = js.undefined
}

object AnonClassValue {
  @scala.inline
  def apply(`class`: String = null, value: Double | String = null): AnonClassValue = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassValue]
  }
}

