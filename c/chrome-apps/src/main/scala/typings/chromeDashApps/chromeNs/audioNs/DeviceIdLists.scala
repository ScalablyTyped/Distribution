package typings.chromeDashApps.chromeNs.audioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceIdLists extends js.Object {
  /**
    * List of input devices specified by their ID.
    * To indicate input devices should be unaffected, leave this property unset.
    */
  var input: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of output devices specified by their ID.
    * To indicate output devices should be unaffected, leave this property unset.
    */
  var output: js.UndefOr[js.Array[String]] = js.undefined
}

object DeviceIdLists {
  @scala.inline
  def apply(input: js.Array[String] = null, output: js.Array[String] = null): DeviceIdLists = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[DeviceIdLists]
  }
}

