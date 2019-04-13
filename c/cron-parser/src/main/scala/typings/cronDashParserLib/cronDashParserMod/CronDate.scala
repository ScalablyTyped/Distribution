package typings
package cronDashParserLib.cronDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CronDate extends js.Object {
  def addDay(): scala.Unit
  def addHour(): scala.Unit
  def addMinute(): scala.Unit
  def addMonth(): scala.Unit
  def addSecond(): scala.Unit
  def addYear(): scala.Unit
  def getDate(): scala.Double
  def getDay(): scala.Double
  def getFullYear(): scala.Double
  def getHours(): scala.Double
  def getMilliseconds(): scala.Double
  def getMinutes(): scala.Double
  def getMonth(): scala.Double
  def getSeconds(): scala.Double
  def getTime(): scala.Double
  def getUTCDate(): scala.Double
  def getUTCDay(): scala.Double
  def getUTCFullYear(): scala.Double
  def getUTCHours(): scala.Double
  def getUTCMinutes(): scala.Double
  def getUTCMonth(): scala.Double
  def getUTCSeconds(): scala.Double
  def setDate(d: scala.Double): scala.Unit
  def setDay(d: scala.Double): scala.Unit
  def setFullYear(y: scala.Double): scala.Unit
  def setHours(h: scala.Double): scala.Unit
  def setMilliseconds(s: scala.Double): scala.Unit
  def setMinutes(m: scala.Double): scala.Unit
  def setMonth(m: scala.Double): scala.Unit
  def setSeconds(s: scala.Double): scala.Unit
  def subtractDay(): scala.Unit
  def subtractHour(): scala.Unit
  def subtractMinute(): scala.Unit
  def subtractMonth(): scala.Unit
  def subtractSecond(): scala.Unit
  def subtractYear(): scala.Unit
  def toDate(): stdLib.Date
  def toISOString(): java.lang.String
  def toJSON(): java.lang.String
}

object CronDate {
  @scala.inline
  def apply(
    addDay: () => scala.Unit,
    addHour: () => scala.Unit,
    addMinute: () => scala.Unit,
    addMonth: () => scala.Unit,
    addSecond: () => scala.Unit,
    addYear: () => scala.Unit,
    getDate: () => scala.Double,
    getDay: () => scala.Double,
    getFullYear: () => scala.Double,
    getHours: () => scala.Double,
    getMilliseconds: () => scala.Double,
    getMinutes: () => scala.Double,
    getMonth: () => scala.Double,
    getSeconds: () => scala.Double,
    getTime: () => scala.Double,
    getUTCDate: () => scala.Double,
    getUTCDay: () => scala.Double,
    getUTCFullYear: () => scala.Double,
    getUTCHours: () => scala.Double,
    getUTCMinutes: () => scala.Double,
    getUTCMonth: () => scala.Double,
    getUTCSeconds: () => scala.Double,
    setDate: scala.Double => scala.Unit,
    setDay: scala.Double => scala.Unit,
    setFullYear: scala.Double => scala.Unit,
    setHours: scala.Double => scala.Unit,
    setMilliseconds: scala.Double => scala.Unit,
    setMinutes: scala.Double => scala.Unit,
    setMonth: scala.Double => scala.Unit,
    setSeconds: scala.Double => scala.Unit,
    subtractDay: () => scala.Unit,
    subtractHour: () => scala.Unit,
    subtractMinute: () => scala.Unit,
    subtractMonth: () => scala.Unit,
    subtractSecond: () => scala.Unit,
    subtractYear: () => scala.Unit,
    toDate: () => stdLib.Date,
    toISOString: () => java.lang.String,
    toJSON: () => java.lang.String,
    toString: () => java.lang.String
  ): CronDate = {
    val __obj = js.Dynamic.literal(addDay = js.Any.fromFunction0(addDay), addHour = js.Any.fromFunction0(addHour), addMinute = js.Any.fromFunction0(addMinute), addMonth = js.Any.fromFunction0(addMonth), addSecond = js.Any.fromFunction0(addSecond), addYear = js.Any.fromFunction0(addYear), getDate = js.Any.fromFunction0(getDate), getDay = js.Any.fromFunction0(getDay), getFullYear = js.Any.fromFunction0(getFullYear), getHours = js.Any.fromFunction0(getHours), getMilliseconds = js.Any.fromFunction0(getMilliseconds), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getUTCDate = js.Any.fromFunction0(getUTCDate), getUTCDay = js.Any.fromFunction0(getUTCDay), getUTCFullYear = js.Any.fromFunction0(getUTCFullYear), getUTCHours = js.Any.fromFunction0(getUTCHours), getUTCMinutes = js.Any.fromFunction0(getUTCMinutes), getUTCMonth = js.Any.fromFunction0(getUTCMonth), getUTCSeconds = js.Any.fromFunction0(getUTCSeconds), setDate = js.Any.fromFunction1(setDate), setDay = js.Any.fromFunction1(setDay), setFullYear = js.Any.fromFunction1(setFullYear), setHours = js.Any.fromFunction1(setHours), setMilliseconds = js.Any.fromFunction1(setMilliseconds), setMinutes = js.Any.fromFunction1(setMinutes), setMonth = js.Any.fromFunction1(setMonth), setSeconds = js.Any.fromFunction1(setSeconds), subtractDay = js.Any.fromFunction0(subtractDay), subtractHour = js.Any.fromFunction0(subtractHour), subtractMinute = js.Any.fromFunction0(subtractMinute), subtractMonth = js.Any.fromFunction0(subtractMonth), subtractSecond = js.Any.fromFunction0(subtractSecond), subtractYear = js.Any.fromFunction0(subtractYear), toDate = js.Any.fromFunction0(toDate), toISOString = js.Any.fromFunction0(toISOString), toJSON = js.Any.fromFunction0(toJSON), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[CronDate]
  }
}

