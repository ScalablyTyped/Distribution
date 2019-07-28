package typings.countdown.countdownNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timespan extends js.Object {
  var centuries: js.UndefOr[Double] = js.native
  var days: js.UndefOr[Double] = js.native
  var decades: js.UndefOr[Double] = js.native
  var end: js.UndefOr[Date] = js.native
  var hours: js.UndefOr[Double] = js.native
  var millennia: js.UndefOr[Double] = js.native
  var milliseconds: js.UndefOr[Double] = js.native
  var minutes: js.UndefOr[Double] = js.native
  var months: js.UndefOr[Double] = js.native
  var seconds: js.UndefOr[Double] = js.native
  var start: js.UndefOr[Date] = js.native
  var units: js.UndefOr[Double] = js.native
  var value: js.UndefOr[Double] = js.native
  var weeks: js.UndefOr[Double] = js.native
  var years: js.UndefOr[Double] = js.native
  def toHTML(): String = js.native
  def toHTML(tagName: String): String = js.native
  def toHTML(tagName: String, label: String): String = js.native
  def toString(label: String): String = js.native
}

