package typings
package dayzedLib.dayzedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendar extends js.Object {
  var firstDayOfMonth: stdLib.Date
  var lastDayOfMonth: stdLib.Date
  var month: dayzedLib.dayzedLibNumbers.`0` | dayzedLib.dayzedLibNumbers.`1` | dayzedLib.dayzedLibNumbers.`2` | dayzedLib.dayzedLibNumbers.`3` | dayzedLib.dayzedLibNumbers.`4` | dayzedLib.dayzedLibNumbers.`5` | dayzedLib.dayzedLibNumbers.`6` | dayzedLib.dayzedLibNumbers.`7` | dayzedLib.dayzedLibNumbers.`8` | dayzedLib.dayzedLibNumbers.`9` | dayzedLib.dayzedLibNumbers.`10` | dayzedLib.dayzedLibNumbers.`11`
  var weeks: js.Array[js.Array[DateObj | dayzedLib.dayzedLibStrings.Empty]]
  var year: scala.Double
}

object Calendar {
  @scala.inline
  def apply(
    firstDayOfMonth: stdLib.Date,
    lastDayOfMonth: stdLib.Date,
    month: dayzedLib.dayzedLibNumbers.`0` | dayzedLib.dayzedLibNumbers.`1` | dayzedLib.dayzedLibNumbers.`2` | dayzedLib.dayzedLibNumbers.`3` | dayzedLib.dayzedLibNumbers.`4` | dayzedLib.dayzedLibNumbers.`5` | dayzedLib.dayzedLibNumbers.`6` | dayzedLib.dayzedLibNumbers.`7` | dayzedLib.dayzedLibNumbers.`8` | dayzedLib.dayzedLibNumbers.`9` | dayzedLib.dayzedLibNumbers.`10` | dayzedLib.dayzedLibNumbers.`11`,
    weeks: js.Array[js.Array[DateObj | dayzedLib.dayzedLibStrings.Empty]],
    year: scala.Double
  ): Calendar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("firstDayOfMonth")(firstDayOfMonth)
    __obj.updateDynamic("lastDayOfMonth")(lastDayOfMonth)
    __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    __obj.updateDynamic("weeks")(weeks)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[Calendar]
  }
}

