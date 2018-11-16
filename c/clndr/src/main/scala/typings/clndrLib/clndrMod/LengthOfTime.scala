package typings
package clndrLib.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LengthOfTime extends js.Object {
  /**
       * Set to an integer if you want to render one or more days, otherwise
       * leave this null. Setting this to 14 would render a 2-week calendar.
       *
       */
  var days: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
       * This is the amount of months or days that will move forward/back when
       * paging the calendar. With days=14 and interval=7, you would have a
       * 2-week calendar that pages forward and backward 1 week at a time.
       */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
       * Set to an integer if you want to render one or more months, otherwise
       * leave this null
       */
  var months: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

