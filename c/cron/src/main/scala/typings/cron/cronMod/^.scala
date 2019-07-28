package typings.cron.cronMod

import typings.moment.momentMod.Moment
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def job(
    cronTime: String,
    onTick: js.Function0[Unit],
    onComplete: js.UndefOr[CronCommand],
    start: js.UndefOr[Boolean],
    timeZone: js.UndefOr[String],
    context: js.UndefOr[js.Any],
    runOnInit: js.UndefOr[Boolean],
    utcOffset: js.UndefOr[Double | String],
    unrefTimeout: js.UndefOr[Boolean]
  ): CronJob = js.native
  def job(
    cronTime: Moment,
    onTick: js.Function0[Unit],
    onComplete: js.UndefOr[CronCommand],
    start: js.UndefOr[Boolean],
    timeZone: js.UndefOr[String],
    context: js.UndefOr[js.Any],
    runOnInit: js.UndefOr[Boolean],
    utcOffset: js.UndefOr[Double | String],
    unrefTimeout: js.UndefOr[Boolean]
  ): CronJob = js.native
  def job(
    cronTime: Date,
    onTick: js.Function0[Unit],
    onComplete: js.UndefOr[CronCommand],
    start: js.UndefOr[Boolean],
    timeZone: js.UndefOr[String],
    context: js.UndefOr[js.Any],
    runOnInit: js.UndefOr[Boolean],
    utcOffset: js.UndefOr[Double | String],
    unrefTimeout: js.UndefOr[Boolean]
  ): CronJob = js.native
  def job(options: CronJobParameters): CronJob = js.native
  def sendAt(cronTime: String): Moment = js.native
  def sendAt(cronTime: Moment): Moment = js.native
  def sendAt(cronTime: Date): Moment = js.native
  def time(source: String): CronTime = js.native
  def time(source: String, zone: String): CronTime = js.native
  def time(source: Moment): CronTime = js.native
  def time(source: Moment, zone: String): CronTime = js.native
  def time(source: Date): CronTime = js.native
  def time(source: Date, zone: String): CronTime = js.native
  def timeout(cronTime: String): Double = js.native
  def timeout(cronTime: Moment): Double = js.native
  def timeout(cronTime: Date): Double = js.native
}

