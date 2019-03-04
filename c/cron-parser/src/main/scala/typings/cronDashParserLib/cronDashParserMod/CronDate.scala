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
    addDay: js.Function0[scala.Unit],
    addHour: js.Function0[scala.Unit],
    addMinute: js.Function0[scala.Unit],
    addMonth: js.Function0[scala.Unit],
    addSecond: js.Function0[scala.Unit],
    addYear: js.Function0[scala.Unit],
    getDate: js.Function0[scala.Double],
    getDay: js.Function0[scala.Double],
    getFullYear: js.Function0[scala.Double],
    getHours: js.Function0[scala.Double],
    getMilliseconds: js.Function0[scala.Double],
    getMinutes: js.Function0[scala.Double],
    getMonth: js.Function0[scala.Double],
    getSeconds: js.Function0[scala.Double],
    getTime: js.Function0[scala.Double],
    getUTCDate: js.Function0[scala.Double],
    getUTCDay: js.Function0[scala.Double],
    getUTCFullYear: js.Function0[scala.Double],
    getUTCHours: js.Function0[scala.Double],
    getUTCMinutes: js.Function0[scala.Double],
    getUTCMonth: js.Function0[scala.Double],
    getUTCSeconds: js.Function0[scala.Double],
    setDate: js.Function1[scala.Double, scala.Unit],
    setDay: js.Function1[scala.Double, scala.Unit],
    setFullYear: js.Function1[scala.Double, scala.Unit],
    setHours: js.Function1[scala.Double, scala.Unit],
    setMilliseconds: js.Function1[scala.Double, scala.Unit],
    setMinutes: js.Function1[scala.Double, scala.Unit],
    setMonth: js.Function1[scala.Double, scala.Unit],
    setSeconds: js.Function1[scala.Double, scala.Unit],
    subtractDay: js.Function0[scala.Unit],
    subtractHour: js.Function0[scala.Unit],
    subtractMinute: js.Function0[scala.Unit],
    subtractMonth: js.Function0[scala.Unit],
    subtractSecond: js.Function0[scala.Unit],
    subtractYear: js.Function0[scala.Unit],
    toDate: js.Function0[stdLib.Date],
    toISOString: js.Function0[java.lang.String],
    toJSON: js.Function0[java.lang.String],
    toString: js.Function0[java.lang.String]
  ): CronDate = {
    val __obj = js.Dynamic.literal(addDay = addDay, addHour = addHour, addMinute = addMinute, addMonth = addMonth, addSecond = addSecond, addYear = addYear, getDate = getDate, getDay = getDay, getFullYear = getFullYear, getHours = getHours, getMilliseconds = getMilliseconds, getMinutes = getMinutes, getMonth = getMonth, getSeconds = getSeconds, getTime = getTime, getUTCDate = getUTCDate, getUTCDay = getUTCDay, getUTCFullYear = getUTCFullYear, getUTCHours = getUTCHours, getUTCMinutes = getUTCMinutes, getUTCMonth = getUTCMonth, getUTCSeconds = getUTCSeconds, setDate = setDate, setDay = setDay, setFullYear = setFullYear, setHours = setHours, setMilliseconds = setMilliseconds, setMinutes = setMinutes, setMonth = setMonth, setSeconds = setSeconds, subtractDay = subtractDay, subtractHour = subtractHour, subtractMinute = subtractMinute, subtractMonth = subtractMonth, subtractSecond = subtractSecond, subtractYear = subtractYear, toDate = toDate, toISOString = toISOString, toJSON = toJSON, toString = toString)
  
    __obj.asInstanceOf[CronDate]
  }
}

