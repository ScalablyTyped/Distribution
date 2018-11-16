package typings
package cronLib.cronMod

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
  var cronTime: java.lang.String | stdLib.Date
  /**
       * A function that will fire when the job is complete, when it is stopped.
       */
  var onComplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * This will immediately fire your ```onTick``` function as soon as the requisit initialization has happened. This option is set to ```false``` by default for backwards compatibility.
       */
  var runOnInit: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Specifies whether to start the job just before exiting the constructor. By default this is set to false. If left at default you will need to call ```job.start()``` in order to start the job (assuming ```job``` is the variable you set the cronjob to). This does not immediately fire your onTick function, it just gives you more control over the behavior of your jobs.
       */
  var start: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Specify the timezone for the execution. This will modify the actual time relative to your timezone. If the timezone is invalid, an error is thrown. You can check all timezones available at [Moment Timezone Website](http://momentjs.com/timezone/).
       */
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The function to fire at the specified time.
       */
  def onTick(): scala.Unit
}

