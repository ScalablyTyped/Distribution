package typings
package bullLib.bullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobInformation extends js.Object {
  var cron: java.lang.String
  var endDate: js.UndefOr[scala.Double] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var key: java.lang.String
  var name: java.lang.String
  var next: scala.Double
  var tz: js.UndefOr[java.lang.String] = js.undefined
}

object JobInformation {
  @scala.inline
  def apply(
    cron: java.lang.String,
    key: java.lang.String,
    name: java.lang.String,
    next: scala.Double,
    endDate: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    tz: java.lang.String = null
  ): JobInformation = {
    val __obj = js.Dynamic.literal(cron = cron, key = key, name = name, next = next)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (tz != null) __obj.updateDynamic("tz")(tz)
    __obj.asInstanceOf[JobInformation]
  }
}

