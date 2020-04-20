package typings.dayzed.mod

import typings.dayzed.dayzedNumbers.`0`
import typings.dayzed.dayzedNumbers.`10`
import typings.dayzed.dayzedNumbers.`11`
import typings.dayzed.dayzedNumbers.`1`
import typings.dayzed.dayzedNumbers.`2`
import typings.dayzed.dayzedNumbers.`3`
import typings.dayzed.dayzedNumbers.`4`
import typings.dayzed.dayzedNumbers.`5`
import typings.dayzed.dayzedNumbers.`6`
import typings.dayzed.dayzedNumbers.`7`
import typings.dayzed.dayzedNumbers.`8`
import typings.dayzed.dayzedNumbers.`9`
import typings.dayzed.dayzedStrings._empty
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendar extends js.Object {
  var firstDayOfMonth: Date
  var lastDayOfMonth: Date
  var month: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`
  var weeks: js.Array[js.Array[DateObj | _empty]]
  var year: Double
}

object Calendar {
  @scala.inline
  def apply(
    firstDayOfMonth: Date,
    lastDayOfMonth: Date,
    month: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`,
    weeks: js.Array[js.Array[DateObj | _empty]],
    year: Double
  ): Calendar = {
    val __obj = js.Dynamic.literal(firstDayOfMonth = firstDayOfMonth.asInstanceOf[js.Any], lastDayOfMonth = lastDayOfMonth.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
}

