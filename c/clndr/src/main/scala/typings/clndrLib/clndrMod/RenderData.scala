package typings
package clndrLib.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RenderData extends js.Object {
  var days: js.Array[CalendarDay]
  var daysOfTheWeek: js.Array[java.lang.String]
  var eventsLastMonth: js.Array[_]
  var eventsNextMonth: js.Array[_]
  var eventsThisInterval: js.UndefOr[js.Array[_]] = js.undefined
  var eventsThisMonth: js.Array[_]
  var extras: js.UndefOr[js.Any] = js.undefined
  var intervalEnd: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var intervalStart: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var month: java.lang.String
  var months: js.Array[Month]
  var numberOfRows: scala.Double
  var year: scala.Double
}

