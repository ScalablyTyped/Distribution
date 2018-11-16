package typings
package cronLib.cronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron", "CronTime")
@js.native
class CronTime protected () extends js.Object {
  /**
       * Create a new ```CronTime```.
       * @param source The time to fire off your job. This can be in the form of cron syntax or a JS ```Date``` object.
       * @param zone Timezone name. You can check all timezones available at [Moment Timezone Website](http://momentjs.com/timezone/).
       */
  def this(source: java.lang.String) = this()
  /**
       * Create a new ```CronTime```.
       * @param source The time to fire off your job. This can be in the form of cron syntax or a JS ```Date``` object.
       * @param zone Timezone name. You can check all timezones available at [Moment Timezone Website](http://momentjs.com/timezone/).
       */
  def this(source: stdLib.Date) = this()
  /**
       * Create a new ```CronTime```.
       * @param source The time to fire off your job. This can be in the form of cron syntax or a JS ```Date``` object.
       * @param zone Timezone name. You can check all timezones available at [Moment Timezone Website](http://momentjs.com/timezone/).
       */
  def this(source: java.lang.String, zone: java.lang.String) = this()
  /**
       * Create a new ```CronTime```.
       * @param source The time to fire off your job. This can be in the form of cron syntax or a JS ```Date``` object.
       * @param zone Timezone name. You can check all timezones available at [Moment Timezone Website](http://momentjs.com/timezone/).
       */
  def this(source: stdLib.Date, zone: java.lang.String) = this()
  /**
       * Get the number of milliseconds in the future at which to fire our callbacks.
       */
  def getTimeout(): scala.Double = js.native
  /**
       * Tells you when ```CronTime``` will be run.
       * @param i Indicate which turn of run after now. If not given return next run time.
       */
  def sendAt(): stdLib.Date = js.native
  /**
       * Tells you when ```CronTime``` will be run.
       * @param i Indicate which turn of run after now. If not given return next run time.
       */
  def sendAt(i: scala.Double): stdLib.Date = js.native
}

