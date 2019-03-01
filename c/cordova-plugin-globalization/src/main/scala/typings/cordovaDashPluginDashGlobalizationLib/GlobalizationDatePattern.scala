package typings
package cordovaDashPluginDashGlobalizationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Pattern to format and parse dates according to the client's user preferences.*/
trait GlobalizationDatePattern extends js.Object {
  /* The current daylight saving time offset in seconds between the client's non-daylight saving's time zone and the client's daylight saving's time zone. */
  var dst_offset: scala.Double
  /* The date and time pattern to format and parse dates. The patterns follow Unicode Technical Standard #35. */
  var pattern: java.lang.String
  /* The abbreviated name of the time zone on the client. */
  var timezone: java.lang.String
  /* The current difference in seconds between the client's time zone and coordinated universal time. */
  var utc_offset: scala.Double
}

object GlobalizationDatePattern {
  @scala.inline
  def apply(
    dst_offset: scala.Double,
    pattern: java.lang.String,
    timezone: java.lang.String,
    utc_offset: scala.Double
  ): GlobalizationDatePattern = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dst_offset")(dst_offset)
    __obj.updateDynamic("pattern")(pattern)
    __obj.updateDynamic("timezone")(timezone)
    __obj.updateDynamic("utc_offset")(utc_offset)
    __obj.asInstanceOf[GlobalizationDatePattern]
  }
}

