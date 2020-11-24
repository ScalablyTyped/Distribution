package typings.cron.mod

import typings.moment.mod.Moment
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cron", "CronTime")
@js.native
class CronTime protected () extends js.Object {
  /**
    * Create a new ```CronTime```.
    * @param source The time to fire off your job. This can be in the form of cron syntax or a JS ```Date``` object.
    * @param zone Timezone name. You can check all timezones available at [Moment Timezone Website](http://momentjs.com/timezone/).
    * @param utcOffset UTC offset. Don't use both ```zone``` and ```utcOffset``` together or weird things may happen.
    */
  def this(source: String) = this()
  def this(source: Moment) = this()
  def this(source: Date) = this()
  def this(source: String, zone: String) = this()
  def this(source: Moment, zone: String) = this()
  def this(source: Date, zone: String) = this()
  def this(source: String, zone: js.UndefOr[scala.Nothing], utcOffset: String) = this()
  def this(source: String, zone: js.UndefOr[scala.Nothing], utcOffset: Double) = this()
  def this(source: String, zone: String, utcOffset: String) = this()
  def this(source: String, zone: String, utcOffset: Double) = this()
  def this(source: Moment, zone: js.UndefOr[scala.Nothing], utcOffset: String) = this()
  def this(source: Moment, zone: js.UndefOr[scala.Nothing], utcOffset: Double) = this()
  def this(source: Moment, zone: String, utcOffset: String) = this()
  def this(source: Moment, zone: String, utcOffset: Double) = this()
  def this(source: Date, zone: js.UndefOr[scala.Nothing], utcOffset: String) = this()
  def this(source: Date, zone: js.UndefOr[scala.Nothing], utcOffset: Double) = this()
  def this(source: Date, zone: String, utcOffset: String) = this()
  def this(source: Date, zone: String, utcOffset: Double) = this()
  
  /**
    * Get the number of milliseconds in the future at which to fire our callbacks.
    */
  def getTimeout(): Double = js.native
  
  /**
    * Tells you when ```CronTime``` will be run.
    * @param i Indicate which turn of run after now. If not given return next run time.
    * @returns A `Moment` when the source passed in the constructor is a `Date` or a `Moment` and an array of `Moment` when the source is a string
    */
  def sendAt(): Moment | js.Array[Moment] = js.native
  def sendAt(i: Double): Moment | js.Array[Moment] = js.native
  /**
    * Tells you when ```CronTime``` will be run.
    */
  @JSName("sendAt")
  def sendAt_Moment(): Moment = js.native
}
