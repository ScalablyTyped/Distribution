package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var easeInCurve: js.UndefOr[java.lang.String] = js.undefined
  var easeInOutCurve: js.UndefOr[java.lang.String] = js.undefined
  var easeOutCurve: js.UndefOr[java.lang.String] = js.undefined
  var timing100: js.UndefOr[java.lang.String] = js.undefined
  var timing400: js.UndefOr[java.lang.String] = js.undefined
  var timing700: js.UndefOr[java.lang.String] = js.undefined
}

object Animation {
  @scala.inline
  def apply(
    easeInCurve: java.lang.String = null,
    easeInOutCurve: java.lang.String = null,
    easeOutCurve: java.lang.String = null,
    timing100: java.lang.String = null,
    timing400: java.lang.String = null,
    timing700: java.lang.String = null
  ): Animation = {
    val __obj = js.Dynamic.literal()
    if (easeInCurve != null) __obj.updateDynamic("easeInCurve")(easeInCurve)
    if (easeInOutCurve != null) __obj.updateDynamic("easeInOutCurve")(easeInOutCurve)
    if (easeOutCurve != null) __obj.updateDynamic("easeOutCurve")(easeOutCurve)
    if (timing100 != null) __obj.updateDynamic("timing100")(timing100)
    if (timing400 != null) __obj.updateDynamic("timing400")(timing400)
    if (timing700 != null) __obj.updateDynamic("timing700")(timing700)
    __obj.asInstanceOf[Animation]
  }
}

