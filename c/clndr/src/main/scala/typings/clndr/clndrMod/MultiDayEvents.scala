package typings.clndr.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiDayEvents extends js.Object {
  var endDate: js.UndefOr[String] = js.undefined
  /**
    * If you also have single day events with a different date field,
    * use the singleDay property and point it to the date field.
    */
  var singleDay: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
}

object MultiDayEvents {
  @scala.inline
  def apply(endDate: String = null, singleDay: String = null, startDate: String = null): MultiDayEvents = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (singleDay != null) __obj.updateDynamic("singleDay")(singleDay)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[MultiDayEvents]
  }
}

