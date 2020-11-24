package typings.cron.mod

import typings.moment.mod.Moment
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CronJobParameters extends js.Object {
  
  /**
    * The context within which to execute the onTick method. This defaults to the cronjob itself allowing you to call ```this.stop()```. However, if you change this you'll have access to the functions and values within your context object.
    */
  var context: js.UndefOr[js.Any] = js.native
  
  /**
    * The time to fire off your job. This can be in the form of cron syntax or a JS ```Date``` object.
    */
  var cronTime: String | Date | Moment = js.native
  
  /**
    * A function that will fire when the job is stopped with ```job.stop()```, and may also be called by ```onTick``` at the end of each run.
    */
  var onComplete: js.UndefOr[CronCommand | Null] = js.native
  
  /**
    * The function to fire at the specified time. If an ```onComplete``` callback was provided, ```onTick``` will receive it as an argument. ```onTick``` may call ```onComplete``` when it has finished its work.
    */
  var onTick: CronCommand = js.native
  
  /**
    * This will immediately fire your ```onTick``` function as soon as the requisit initialization has happened. This option is set to ```false``` by default for backwards compatibility.
    */
  var runOnInit: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether to start the job just before exiting the constructor. By default this is set to false. If left at default you will need to call ```job.start()``` in order to start the job (assuming ```job``` is the variable you set the cronjob to). This does not immediately fire your ```onTick``` function, it just gives you more control over the behavior of your jobs.
    */
  var start: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the timezone for the execution. This will modify the actual time relative to your timezone. If the timezone is invalid, an error is thrown. You can check all timezones available at [Moment Timezone Website](http://momentjs.com/timezone/). Probably don't use both ```timeZone``` and ```utcOffset``` together or weird things may happen.
    */
  var timeZone: js.UndefOr[String] = js.native
  
  /**
    * If you have code that keeps the event loop running and want to stop the node process when that finishes regardless of the state of your cronjob, you can do so making use of this parameter. This is off by default and cron will run as if it needs to control the event loop. For more information take a look at [timers#timers_timeout_unref](https://nodejs.org/api/timers.html#timers_timeout_unref) from the NodeJS docs.
    */
  var unrefTimeout: js.UndefOr[Boolean] = js.native
  
  /**
    * This allows you to specify the offset of your timezone rather than using the ```timeZone``` param. Probably don't use both ```timeZone``` and ```utcOffset``` together or weird things may happen.
    */
  var utcOffset: js.UndefOr[String | Double] = js.native
}
object CronJobParameters {
  
  @scala.inline
  def apply(cronTime: String | Date | Moment, onTick: CronCommand): CronJobParameters = {
    val __obj = js.Dynamic.literal(cronTime = cronTime.asInstanceOf[js.Any], onTick = onTick.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronJobParameters]
  }
  
  @scala.inline
  implicit class CronJobParametersOps[Self <: CronJobParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCronTime(value: String | Date | Moment): Self = this.set("cronTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTickFunction0(value: () => Unit): Self = this.set("onTick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTick(value: CronCommand): Self = this.set("onTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setOnCompleteFunction0(value: () => Unit): Self = this.set("onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnComplete(value: CronCommand): Self = this.set("onComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setOnCompleteNull: Self = this.set("onComplete", null)
    
    @scala.inline
    def setRunOnInit(value: Boolean): Self = this.set("runOnInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunOnInit: Self = this.set("runOnInit", js.undefined)
    
    @scala.inline
    def setStart(value: Boolean): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setUnrefTimeout(value: Boolean): Self = this.set("unrefTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnrefTimeout: Self = this.set("unrefTimeout", js.undefined)
    
    @scala.inline
    def setUtcOffset(value: String | Double): Self = this.set("utcOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtcOffset: Self = this.set("utcOffset", js.undefined)
  }
}
