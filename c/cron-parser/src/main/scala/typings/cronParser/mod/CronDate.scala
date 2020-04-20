package typings.cronParser.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CronDate extends js.Object {
  def addDay(): Unit
  def addHour(): Unit
  def addMinute(): Unit
  def addMonth(): Unit
  def addSecond(): Unit
  def addYear(): Unit
  def getDate(): Double
  def getDay(): Double
  def getFullYear(): Double
  def getHours(): Double
  def getMilliseconds(): Double
  def getMinutes(): Double
  def getMonth(): Double
  def getSeconds(): Double
  def getTime(): Double
  def getUTCDate(): Double
  def getUTCDay(): Double
  def getUTCFullYear(): Double
  def getUTCHours(): Double
  def getUTCMinutes(): Double
  def getUTCMonth(): Double
  def getUTCSeconds(): Double
  def setDate(d: Double): Unit
  def setDay(d: Double): Unit
  def setFullYear(y: Double): Unit
  def setHours(h: Double): Unit
  def setMilliseconds(s: Double): Unit
  def setMinutes(m: Double): Unit
  def setMonth(m: Double): Unit
  def setSeconds(s: Double): Unit
  def subtractDay(): Unit
  def subtractHour(): Unit
  def subtractMinute(): Unit
  def subtractMonth(): Unit
  def subtractSecond(): Unit
  def subtractYear(): Unit
  def toDate(): Date
  def toISOString(): String
  def toJSON(): String
}

object CronDate {
  @scala.inline
  def apply(
    addDay: () => Unit,
    addHour: () => Unit,
    addMinute: () => Unit,
    addMonth: () => Unit,
    addSecond: () => Unit,
    addYear: () => Unit,
    getDate: () => Double,
    getDay: () => Double,
    getFullYear: () => Double,
    getHours: () => Double,
    getMilliseconds: () => Double,
    getMinutes: () => Double,
    getMonth: () => Double,
    getSeconds: () => Double,
    getTime: () => Double,
    getUTCDate: () => Double,
    getUTCDay: () => Double,
    getUTCFullYear: () => Double,
    getUTCHours: () => Double,
    getUTCMinutes: () => Double,
    getUTCMonth: () => Double,
    getUTCSeconds: () => Double,
    setDate: Double => Unit,
    setDay: Double => Unit,
    setFullYear: Double => Unit,
    setHours: Double => Unit,
    setMilliseconds: Double => Unit,
    setMinutes: Double => Unit,
    setMonth: Double => Unit,
    setSeconds: Double => Unit,
    subtractDay: () => Unit,
    subtractHour: () => Unit,
    subtractMinute: () => Unit,
    subtractMonth: () => Unit,
    subtractSecond: () => Unit,
    subtractYear: () => Unit,
    toDate: () => Date,
    toISOString: () => String,
    toJSON: () => String
  ): CronDate = {
    val __obj = js.Dynamic.literal(addDay = js.Any.fromFunction0(addDay), addHour = js.Any.fromFunction0(addHour), addMinute = js.Any.fromFunction0(addMinute), addMonth = js.Any.fromFunction0(addMonth), addSecond = js.Any.fromFunction0(addSecond), addYear = js.Any.fromFunction0(addYear), getDate = js.Any.fromFunction0(getDate), getDay = js.Any.fromFunction0(getDay), getFullYear = js.Any.fromFunction0(getFullYear), getHours = js.Any.fromFunction0(getHours), getMilliseconds = js.Any.fromFunction0(getMilliseconds), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getUTCDate = js.Any.fromFunction0(getUTCDate), getUTCDay = js.Any.fromFunction0(getUTCDay), getUTCFullYear = js.Any.fromFunction0(getUTCFullYear), getUTCHours = js.Any.fromFunction0(getUTCHours), getUTCMinutes = js.Any.fromFunction0(getUTCMinutes), getUTCMonth = js.Any.fromFunction0(getUTCMonth), getUTCSeconds = js.Any.fromFunction0(getUTCSeconds), setDate = js.Any.fromFunction1(setDate), setDay = js.Any.fromFunction1(setDay), setFullYear = js.Any.fromFunction1(setFullYear), setHours = js.Any.fromFunction1(setHours), setMilliseconds = js.Any.fromFunction1(setMilliseconds), setMinutes = js.Any.fromFunction1(setMinutes), setMonth = js.Any.fromFunction1(setMonth), setSeconds = js.Any.fromFunction1(setSeconds), subtractDay = js.Any.fromFunction0(subtractDay), subtractHour = js.Any.fromFunction0(subtractHour), subtractMinute = js.Any.fromFunction0(subtractMinute), subtractMonth = js.Any.fromFunction0(subtractMonth), subtractSecond = js.Any.fromFunction0(subtractSecond), subtractYear = js.Any.fromFunction0(subtractYear), toDate = js.Any.fromFunction0(toDate), toISOString = js.Any.fromFunction0(toISOString), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[CronDate]
  }
}

