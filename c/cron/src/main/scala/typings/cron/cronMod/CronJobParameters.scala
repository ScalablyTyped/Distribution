package typings.cron.cronMod

import typings.moment.momentMod.Moment
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CronJobParameters extends js.Object {
  /**
    * The context within which to execute the onTick method. This defaults to the cronjob itself allowing you to call ```this.stop()```. However, if you change this you'll have access to the functions and values within your context object.
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /**
    * The time to fire off your job. This can be in the form of cron syntax or a JS ```Date``` object.
    */
  var cronTime: String | Date | Moment
  /**
    * A function that will fire when the job is stopped with ```job.stop()```, and may also be called by ```onTick``` at the end of each run.
    */
  var onComplete: js.UndefOr[CronCommand] = js.undefined
  /**
    * The function to fire at the specified time. If an ```onComplete``` callback was provided, ```onTick``` will receive it as an argument. ```onTick``` may call ```onComplete``` when it has finished its work.
    */
  var onTick: CronCommand
  /**
    * This will immediately fire your ```onTick``` function as soon as the requisit initialization has happened. This option is set to ```false``` by default for backwards compatibility.
    */
  var runOnInit: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether to start the job just before exiting the constructor. By default this is set to false. If left at default you will need to call ```job.start()``` in order to start the job (assuming ```job``` is the variable you set the cronjob to). This does not immediately fire your ```onTick``` function, it just gives you more control over the behavior of your jobs.
    */
  var start: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the timezone for the execution. This will modify the actual time relative to your timezone. If the timezone is invalid, an error is thrown. You can check all timezones available at [Moment Timezone Website](http://momentjs.com/timezone/). Probably don't use both ```timeZone``` and ```utcOffset``` together or weird things may happen.
    */
  var timeZone: js.UndefOr[String] = js.undefined
  /**
    * If you have code that keeps the event loop running and want to stop the node process when that finishes regardless of the state of your cronjob, you can do so making use of this parameter. This is off by default and cron will run as if it needs to control the event loop. For more information take a look at [timers#timers_timeout_unref](https://nodejs.org/api/timers.html#timers_timeout_unref) from the NodeJS docs.
    */
  var unrefTimeout: js.UndefOr[Boolean] = js.undefined
  /**
    * This allows you to specify the offset of your timezone rather than using the ```timeZone``` param. Probably don't use both ```timeZone``` and ```utcOffset``` together or weird things may happen.
    */
  var utcOffset: js.UndefOr[String | Double] = js.undefined
}

object CronJobParameters {
  @scala.inline
  def apply(
    cronTime: String | Date | Moment,
    onTick: CronCommand,
    context: js.Any = null,
    onComplete: CronCommand = null,
    runOnInit: js.UndefOr[Boolean] = js.undefined,
    start: js.UndefOr[Boolean] = js.undefined,
    timeZone: String = null,
    unrefTimeout: js.UndefOr[Boolean] = js.undefined,
    utcOffset: String | Double = null
  ): CronJobParameters = {
    val __obj = js.Dynamic.literal(cronTime = cronTime.asInstanceOf[js.Any], onTick = onTick.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(runOnInit)) __obj.updateDynamic("runOnInit")(runOnInit)
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (!js.isUndefined(unrefTimeout)) __obj.updateDynamic("unrefTimeout")(unrefTimeout)
    if (utcOffset != null) __obj.updateDynamic("utcOffset")(utcOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronJobParameters]
  }
}

