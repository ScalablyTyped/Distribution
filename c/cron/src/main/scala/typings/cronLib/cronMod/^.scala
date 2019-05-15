package typings
package cronLib.cronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def job(
    cronTime: java.lang.String,
    onTick: js.Function0[scala.Unit],
    onComplete: js.UndefOr[CronCommand],
    start: js.UndefOr[scala.Boolean],
    timeZone: js.UndefOr[java.lang.String],
    context: js.UndefOr[js.Any],
    runOnInit: js.UndefOr[scala.Boolean],
    utcOffset: js.UndefOr[scala.Double | java.lang.String],
    unrefTimeout: js.UndefOr[scala.Boolean]
  ): CronJob = js.native
  def job(
    cronTime: momentLib.momentMod.Moment,
    onTick: js.Function0[scala.Unit],
    onComplete: js.UndefOr[CronCommand],
    start: js.UndefOr[scala.Boolean],
    timeZone: js.UndefOr[java.lang.String],
    context: js.UndefOr[js.Any],
    runOnInit: js.UndefOr[scala.Boolean],
    utcOffset: js.UndefOr[scala.Double | java.lang.String],
    unrefTimeout: js.UndefOr[scala.Boolean]
  ): CronJob = js.native
  def job(
    cronTime: stdLib.Date,
    onTick: js.Function0[scala.Unit],
    onComplete: js.UndefOr[CronCommand],
    start: js.UndefOr[scala.Boolean],
    timeZone: js.UndefOr[java.lang.String],
    context: js.UndefOr[js.Any],
    runOnInit: js.UndefOr[scala.Boolean],
    utcOffset: js.UndefOr[scala.Double | java.lang.String],
    unrefTimeout: js.UndefOr[scala.Boolean]
  ): CronJob = js.native
  def job(options: CronJobParameters): CronJob = js.native
  def sendAt(cronTime: java.lang.String): momentLib.momentMod.Moment = js.native
  def sendAt(cronTime: momentLib.momentMod.Moment): momentLib.momentMod.Moment = js.native
  def sendAt(cronTime: stdLib.Date): momentLib.momentMod.Moment = js.native
  def time(source: java.lang.String): CronTime = js.native
  def time(source: java.lang.String, zone: java.lang.String): CronTime = js.native
  def time(source: momentLib.momentMod.Moment): CronTime = js.native
  def time(source: momentLib.momentMod.Moment, zone: java.lang.String): CronTime = js.native
  def time(source: stdLib.Date): CronTime = js.native
  def time(source: stdLib.Date, zone: java.lang.String): CronTime = js.native
  def timeout(cronTime: java.lang.String): scala.Double = js.native
  def timeout(cronTime: momentLib.momentMod.Moment): scala.Double = js.native
  def timeout(cronTime: stdLib.Date): scala.Double = js.native
}

