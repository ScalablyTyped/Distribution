package typings
package dayzedLib.dayzedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: js.UndefOr[dayzedLib.RenderFn] = js.undefined
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var firstDayOfWeek: js.UndefOr[
    dayzedLib.dayzedLibNumbers.`0` | dayzedLib.dayzedLibNumbers.`1` | dayzedLib.dayzedLibNumbers.`2` | dayzedLib.dayzedLibNumbers.`3` | dayzedLib.dayzedLibNumbers.`4` | dayzedLib.dayzedLibNumbers.`5` | dayzedLib.dayzedLibNumbers.`6`
  ] = js.undefined
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  var monthsToDisplay: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var onOffsetChanged: js.UndefOr[js.Function1[/* offset */ scala.Double, scala.Unit]] = js.undefined
  var render: js.UndefOr[dayzedLib.RenderFn] = js.undefined
  var selected: js.UndefOr[stdLib.Date | js.Array[stdLib.Date]] = js.undefined
  var showOutsideDays: js.UndefOr[scala.Boolean] = js.undefined
  def onDateSelected(selectedDate: DateObj): scala.Unit
}

