package typings.bull.bullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobInformation extends js.Object {
  var cron: String
  var endDate: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var key: String
  var name: String
  var next: Double
  var tz: js.UndefOr[String] = js.undefined
}

object JobInformation {
  @scala.inline
  def apply(
    cron: String,
    key: String,
    name: String,
    next: Double,
    endDate: Int | Double = null,
    id: String = null,
    tz: String = null
  ): JobInformation = {
    val __obj = js.Dynamic.literal(cron = cron, key = key, name = name, next = next)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (tz != null) __obj.updateDynamic("tz")(tz)
    __obj.asInstanceOf[JobInformation]
  }
}

