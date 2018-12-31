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

