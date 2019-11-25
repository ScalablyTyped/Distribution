package typings.bull.bullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobInformation extends js.Object {
  var cron: String
  var endDate: js.UndefOr[Double] = js.undefined
  var every: Double
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
    every: Double,
    key: String,
    name: String,
    next: Double,
    endDate: Int | Double = null,
    id: String = null,
    tz: String = null
  ): JobInformation = {
    val __obj = js.Dynamic.literal(cron = cron.asInstanceOf[js.Any], every = every.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (tz != null) __obj.updateDynamic("tz")(tz.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobInformation]
  }
}

