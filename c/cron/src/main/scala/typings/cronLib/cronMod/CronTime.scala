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
    * @param utcOffset UTC offset. Don't use both ```zone``` and ```utcOffset``` together or weird things may happen.
    */
  def this(source: java.lang.String) = this()
  def this(source: momentLib.momentMod.momentNs.Moment) = this()
  def this(source: stdLib.Date) = this()
  def this(source: java.lang.String, zone: java.lang.String) = this()
  def this(source: momentLib.momentMod.momentNs.Moment, zone: java.lang.String) = this()
  def this(source: stdLib.Date, zone: java.lang.String) = this()
  def this(source: java.lang.String, zone: java.lang.String, utcOffset: java.lang.String) = this()
  def this(source: java.lang.String, zone: java.lang.String, utcOffset: scala.Double) = this()
  def this(source: momentLib.momentMod.momentNs.Moment, zone: java.lang.String, utcOffset: java.lang.String) = this()
  def this(source: momentLib.momentMod.momentNs.Moment, zone: java.lang.String, utcOffset: scala.Double) = this()
  def this(source: stdLib.Date, zone: java.lang.String, utcOffset: java.lang.String) = this()
  def this(source: stdLib.Date, zone: java.lang.String, utcOffset: scala.Double) = this()
  /**
    * Get the number of milliseconds in the future at which to fire our callbacks.
    */
  def getTimeout(): scala.Double = js.native
  /**
    * Tells you when ```CronTime``` will be run.
    */
  def sendAt(): momentLib.momentMod.momentNs.Moment = js.native
  def sendAt(i: scala.Double): momentLib.momentMod.momentNs.Moment | js.Array[momentLib.momentMod.momentNs.Moment] = js.native
  /**
    * Tells you when ```CronTime``` will be run.
    * @param i Indicate which turn of run after now. If not given return next run time.
    * @returns A `Moment` when the source passed in the constructor is a `Date` or a `Moment` and an array of `Moment` when the source is a string
    */
  @JSName("sendAt")
  def `sendAt_<union>`(): momentLib.momentMod.momentNs.Moment | js.Array[momentLib.momentMod.momentNs.Moment] = js.native
}

