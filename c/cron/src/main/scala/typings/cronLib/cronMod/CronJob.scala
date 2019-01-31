package typings
package cronLib.cronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron", "CronJob")
@js.native
class CronJob protected () extends js.Object {
  /**
    * Create a new ```CronJob```.
    * @param options Job parameters.
    */
  def this(options: CronJobParameters) = this()
  /**
    * Create a new ```CronJob```.
    * @param cronTime The time to fire off your job. This can be in the form of cron syntax or a JS ```Date``` object.
    * @param onTick The function to fire at the specified time.
    * @param onComplete A function that will fire when the job is complete, when it is stopped.
    * @param start Specifies whether to start the job just before exiting the constructor. By default this is set to false. If left at default you will need to call ```job.start()``` in order to start the job (assuming ```job``` is the variable you set the cronjob to). This does not immediately fire your onTick function, it just gives you more control over the behavior of your jobs.
    * @param timeZone Specify the timezone for the execution. This will modify the actual time relative to your timezone. If the timezone is invalid, an error is thrown. You can check all timezones available at [Moment Timezone Website](http://momentjs.com/timezone/).
    * @param context The context within which to execute the onTick method. This defaults to the cronjob itself allowing you to call ```this.stop()```. However, if you change this you'll have access to the functions and values within your context object.
    * @param runOnInit This will immediately fire your ```onTick``` function as soon as the requisit initialization has happened. This option is set to ```false``` by default for backwards compatibility.
    * @param utcOffset This allows you to specify the offset of your timezone rather than using the ```timeZone``` param. Probably don't use both ```timeZone``` and ```utcOffset``` together or weird things may happen.
    * @param unrefTimeout If you have code that keeps the event loop running and want to stop the node process when that finishes regardless of the state of your cronjob, you can do so making use of this parameter. This is off by default and cron will run as if it needs to control the event loop. For more information take a look at [timers#timers_timeout_unref](https://nodejs.org/api/timers.html#timers_timeout_unref) from the NodeJS docs.
    */
  def this(cronTime: java.lang.String, onTick: js.Function0[scala.Unit], onComplete: js.UndefOr[js.Function0[scala.Unit]], start: js.UndefOr[scala.Boolean], timeZone: js.UndefOr[java.lang.String], context: js.UndefOr[js.Any], runOnInit: js.UndefOr[scala.Boolean], utcOffset: js.UndefOr[scala.Double | java.lang.String], unrefTimeout: js.UndefOr[scala.Boolean]) = this()
  def this(cronTime: stdLib.Date, onTick: js.Function0[scala.Unit], onComplete: js.UndefOr[js.Function0[scala.Unit]], start: js.UndefOr[scala.Boolean], timeZone: js.UndefOr[java.lang.String], context: js.UndefOr[js.Any], runOnInit: js.UndefOr[scala.Boolean], utcOffset: js.UndefOr[scala.Double | java.lang.String], unrefTimeout: js.UndefOr[scala.Boolean]) = this()
  /**
    * Function using to fire ```onTick```, default set to an inner private function. Overwrite this only if you have a really good reason to do so.
    */
  var fireOnTick: js.Function = js.native
  /**
    * Return ```true``` if job is running.
    */
  var running: js.UndefOr[scala.Boolean] = js.native
  /**
    * Add another ```onTick``` function.
    * @param callback Target function.
    */
  def addCallback(callback: js.Function): scala.Unit = js.native
  /**
    * Tells you the last execution date.
    */
  def lastDate(): stdLib.Date = js.native
  /**
    * Tells you when a ```CronTime``` will be run.
    * @param i Indicate which turn of run after now. If not given return next run time.
    */
  def nextDates(): stdLib.Date = js.native
  def nextDates(i: scala.Double): stdLib.Date = js.native
  /**
    * Change the time for the ```CronJob```.
    * @param time Target time.
    */
  def setTime(time: CronTime): scala.Unit = js.native
  /**
    * Runs your job.
    */
  def start(): scala.Unit = js.native
  /**
    * Stops your job.
    */
  def stop(): scala.Unit = js.native
}

