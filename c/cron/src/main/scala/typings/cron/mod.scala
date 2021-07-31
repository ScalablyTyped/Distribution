package typings.cron

import typings.cron.anon.Args
import typings.moment.mod.Moment
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cron", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cron", "CronJob")
  @js.native
  class CronJob protected () extends StObject {
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
    def this(
      cronTime: String | Date | Moment,
      onTick: CronCommand,
      onComplete: js.UndefOr[CronCommand | Null],
      start: js.UndefOr[Boolean],
      timeZone: js.UndefOr[String],
      context: js.UndefOr[js.Any],
      runOnInit: js.UndefOr[Boolean],
      utcOffset: js.UndefOr[String | Double],
      unrefTimeout: js.UndefOr[Boolean]
    ) = this()
    
    /**
      * Add another ```onTick``` function.
      * @param callback Target function.
      */
    def addCallback(callback: js.Function): Unit = js.native
    
    /**
      * Function using to fire ```onTick```, default set to an inner private function. Overwrite this only if you have a really good reason to do so.
      */
    var fireOnTick: js.Function = js.native
    
    /**
      * Tells you the last execution date.
      */
    def lastDate(): Date = js.native
    
    /**
      * Tells you when a ```CronTime``` will be run.
      */
    def nextDate(): Moment = js.native
    
    /**
      * Tells you when a ```CronTime``` will be run.
      * @param i Indicate which turn of run after now. If not given return next run time.
      * @returns A `Moment` when the cronTime passed in the constructor is a `Date` or a `Moment` and an array of `Moment` when the cronTime is a string
      */
    def nextDates(): Moment | js.Array[Moment] = js.native
    def nextDates(i: Double): Moment | js.Array[Moment] = js.native
    @JSName("nextDates")
    def nextDates_Moment(): Moment = js.native
    
    /**
      * Return ```true``` if job is running.
      */
    var running: js.UndefOr[Boolean] = js.native
    
    /**
      * Change the time for the ```CronJob```.
      * @param time Target time.
      */
    def setTime(time: CronTime): Unit = js.native
    
    /**
      * Runs your job.
      */
    def start(): Unit = js.native
    
    /**
      * Stops your job.
      */
    def stop(): Unit = js.native
  }
  
  @JSImport("cron", "CronTime")
  @js.native
  class CronTime protected () extends StObject {
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
    def this(source: String, zone: String, utcOffset: String) = this()
    def this(source: String, zone: String, utcOffset: Double) = this()
    def this(source: String, zone: Unit, utcOffset: String) = this()
    def this(source: String, zone: Unit, utcOffset: Double) = this()
    def this(source: Moment, zone: String, utcOffset: String) = this()
    def this(source: Moment, zone: String, utcOffset: Double) = this()
    def this(source: Moment, zone: Unit, utcOffset: String) = this()
    def this(source: Moment, zone: Unit, utcOffset: Double) = this()
    def this(source: Date, zone: String, utcOffset: String) = this()
    def this(source: Date, zone: String, utcOffset: Double) = this()
    def this(source: Date, zone: Unit, utcOffset: String) = this()
    def this(source: Date, zone: Unit, utcOffset: Double) = this()
    
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
  
  @scala.inline
  def job(
    cronTime: String | Date | Moment,
    onTick: js.Function0[Unit],
    onComplete: js.UndefOr[CronCommand | Null],
    start: js.UndefOr[Boolean],
    timeZone: js.UndefOr[String],
    context: js.UndefOr[js.Any],
    runOnInit: js.UndefOr[Boolean],
    utcOffset: js.UndefOr[String | Double],
    unrefTimeout: js.UndefOr[Boolean]
  ): CronJob = (^.asInstanceOf[js.Dynamic].applyDynamic("job")(cronTime.asInstanceOf[js.Any], onTick.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], start.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], context.asInstanceOf[js.Any], runOnInit.asInstanceOf[js.Any], utcOffset.asInstanceOf[js.Any], unrefTimeout.asInstanceOf[js.Any])).asInstanceOf[CronJob]
  @scala.inline
  def job(options: CronJobParameters): CronJob = ^.asInstanceOf[js.Dynamic].applyDynamic("job")(options.asInstanceOf[js.Any]).asInstanceOf[CronJob]
  
  @scala.inline
  def sendAt(cronTime: String): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("sendAt")(cronTime.asInstanceOf[js.Any]).asInstanceOf[Moment]
  @scala.inline
  def sendAt(cronTime: Moment): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("sendAt")(cronTime.asInstanceOf[js.Any]).asInstanceOf[Moment]
  @scala.inline
  def sendAt(cronTime: Date): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("sendAt")(cronTime.asInstanceOf[js.Any]).asInstanceOf[Moment]
  
  @scala.inline
  def time(source: String): CronTime = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(source.asInstanceOf[js.Any]).asInstanceOf[CronTime]
  @scala.inline
  def time(source: String, zone: String): CronTime = (^.asInstanceOf[js.Dynamic].applyDynamic("time")(source.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[CronTime]
  @scala.inline
  def time(source: Moment): CronTime = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(source.asInstanceOf[js.Any]).asInstanceOf[CronTime]
  @scala.inline
  def time(source: Moment, zone: String): CronTime = (^.asInstanceOf[js.Dynamic].applyDynamic("time")(source.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[CronTime]
  @scala.inline
  def time(source: Date): CronTime = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(source.asInstanceOf[js.Any]).asInstanceOf[CronTime]
  @scala.inline
  def time(source: Date, zone: String): CronTime = (^.asInstanceOf[js.Dynamic].applyDynamic("time")(source.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[CronTime]
  
  @scala.inline
  def timeout(cronTime: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(cronTime.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def timeout(cronTime: Moment): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(cronTime.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def timeout(cronTime: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(cronTime.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type CronCommand = js.Function0[Unit] | String | Args
  
  trait CronJobParameters extends StObject {
    
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
    var onComplete: js.UndefOr[CronCommand | Null] = js.undefined
    
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
    def apply(cronTime: String | Date | Moment, onTick: CronCommand): CronJobParameters = {
      val __obj = js.Dynamic.literal(cronTime = cronTime.asInstanceOf[js.Any], onTick = onTick.asInstanceOf[js.Any])
      __obj.asInstanceOf[CronJobParameters]
    }
    
    @scala.inline
    implicit class CronJobParametersMutableBuilder[Self <: CronJobParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setCronTime(value: String | Date | Moment): Self = StObject.set(x, "cronTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnComplete(value: CronCommand): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompleteFunction0(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCompleteNull: Self = StObject.set(x, "onComplete", null)
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnTick(value: CronCommand): Self = StObject.set(x, "onTick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTickFunction0(value: () => Unit): Self = StObject.set(x, "onTick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRunOnInit(value: Boolean): Self = StObject.set(x, "runOnInit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunOnInitUndefined: Self = StObject.set(x, "runOnInit", js.undefined)
      
      @scala.inline
      def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      @scala.inline
      def setUnrefTimeout(value: Boolean): Self = StObject.set(x, "unrefTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnrefTimeoutUndefined: Self = StObject.set(x, "unrefTimeout", js.undefined)
      
      @scala.inline
      def setUtcOffset(value: String | Double): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcOffsetUndefined: Self = StObject.set(x, "utcOffset", js.undefined)
    }
  }
}
