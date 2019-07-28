package typings.countdown.countdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountdownStatic extends js.Object {
  var ALL: Double = js.native
  var CENTURIES: Double = js.native
  var DAYS: Double = js.native
  var DECADES: Double = js.native
  var DEFAULTS: Double = js.native
  var HOURS: Double = js.native
  var MILLENNIA: Double = js.native
  var MILLISECONDS: Double = js.native
  var MINUTES: Double = js.native
  var MONTHS: Double = js.native
  var SECONDS: Double = js.native
  var WEEKS: Double = js.native
  var YEARS: Double = js.native
  def apply(start: DateTime): Timespan | Double = js.native
  def apply(start: DateTime, end: DateTime): Timespan | Double = js.native
  def apply(start: DateTime, end: DateTime, units: Double): Timespan | Double = js.native
  def apply(start: DateTime, end: DateTime, units: Double, max: Double): Timespan | Double = js.native
  def apply(start: DateTime, end: DateTime, units: Double, max: Double, digits: Double): Timespan | Double = js.native
  def resetFormat(): Unit = js.native
  def resetLabels(): Unit = js.native
  def setFormat(format: Format): Unit = js.native
  def setLabels(
    singular: js.UndefOr[String],
    plural: js.UndefOr[String],
    last: js.UndefOr[String],
    delim: js.UndefOr[String],
    empty: js.UndefOr[String],
    formatNumber: js.UndefOr[js.Function1[/* value */ Double, String]],
    formatter: js.UndefOr[js.Function2[/* value */ Double, /* unit */ Double, String]]
  ): Unit = js.native
}

