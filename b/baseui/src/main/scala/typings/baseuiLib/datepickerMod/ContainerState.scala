package typings
package baseuiLib.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerState extends js.Object {
  var value: js.UndefOr[stdLib.Date | js.Array[stdLib.Date]] = js.undefined
}

object ContainerState {
  @scala.inline
  def apply(value: stdLib.Date | js.Array[stdLib.Date] = null): ContainerState = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerState]
  }
}

