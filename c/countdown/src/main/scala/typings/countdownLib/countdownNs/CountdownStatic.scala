package typings
package countdownLib.countdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountdownStatic extends js.Object {
  var ALL: scala.Double = js.native
  var CENTURIES: scala.Double = js.native
  var DAYS: scala.Double = js.native
  var DECADES: scala.Double = js.native
  var DEFAULTS: scala.Double = js.native
  var HOURS: scala.Double = js.native
  var MILLENNIA: scala.Double = js.native
  var MILLISECONDS: scala.Double = js.native
  var MINUTES: scala.Double = js.native
  var MONTHS: scala.Double = js.native
  var SECONDS: scala.Double = js.native
  var WEEKS: scala.Double = js.native
  var YEARS: scala.Double = js.native
  def apply(start: DateTime): Timespan | scala.Double = js.native
  def apply(start: DateTime, end: DateTime): Timespan | scala.Double = js.native
  def apply(start: DateTime, end: DateTime, units: scala.Double): Timespan | scala.Double = js.native
  def apply(start: DateTime, end: DateTime, units: scala.Double, max: scala.Double): Timespan | scala.Double = js.native
  def apply(start: DateTime, end: DateTime, units: scala.Double, max: scala.Double, digits: scala.Double): Timespan | scala.Double = js.native
  def resetFormat(): scala.Unit = js.native
  def resetLabels(): scala.Unit = js.native
  def setFormat(format: Format): scala.Unit = js.native
  def setLabels(
    singular: js.UndefOr[java.lang.String],
    plural: js.UndefOr[java.lang.String],
    last: js.UndefOr[java.lang.String],
    delim: js.UndefOr[java.lang.String],
    empty: js.UndefOr[java.lang.String],
    formatNumber: js.UndefOr[js.Function1[/* value */ scala.Double, java.lang.String]],
    formatter: js.UndefOr[
      js.Function2[/* value */ scala.Double, /* unit */ scala.Double, java.lang.String]
    ]
  ): scala.Unit = js.native
}

