package typings
package bullLib.bullMod.BullNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CronRepeatOptions extends RepeatOptions {
  /**
       * Cron pattern specifying when the job should execute
       */
  var cron: java.lang.String
  /**
       * Start date when the repeat job should start repeating (only with cron).
       */
  var startDate: js.UndefOr[stdLib.Date | java.lang.String | scala.Double] = js.undefined
}

