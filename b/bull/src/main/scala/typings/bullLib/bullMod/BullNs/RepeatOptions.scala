package typings
package bullLib.bullMod.BullNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RepeatOptions extends js.Object {
  /**
       * End date when the repeat job should stop repeating
       */
  var endDate: js.UndefOr[stdLib.Date | java.lang.String | scala.Double] = js.undefined
  /**
       * Number of times the job should repeat at max.
       */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
       * Timezone
       */
  var tz: js.UndefOr[java.lang.String] = js.undefined
}

