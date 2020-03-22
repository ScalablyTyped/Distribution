package typings.cron.mod

import typings.moment.mod.Moment
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron", "job")
@js.native
object job extends js.Object {
  def apply(
    cronTime: String,
    onTick: js.Function0[Unit],
    onComplete: js.UndefOr[CronCommand | Null],
    start: js.UndefOr[Boolean],
    timeZone: js.UndefOr[String],
    context: js.UndefOr[js.Any],
    runOnInit: js.UndefOr[Boolean],
    utcOffset: js.UndefOr[Double | String],
    unrefTimeout: js.UndefOr[Boolean]
  ): CronJob = js.native
  def apply(
    cronTime: Moment,
    onTick: js.Function0[Unit],
    onComplete: js.UndefOr[CronCommand | Null],
    start: js.UndefOr[Boolean],
    timeZone: js.UndefOr[String],
    context: js.UndefOr[js.Any],
    runOnInit: js.UndefOr[Boolean],
    utcOffset: js.UndefOr[Double | String],
    unrefTimeout: js.UndefOr[Boolean]
  ): CronJob = js.native
  def apply(
    cronTime: Date,
    onTick: js.Function0[Unit],
    onComplete: js.UndefOr[CronCommand | Null],
    start: js.UndefOr[Boolean],
    timeZone: js.UndefOr[String],
    context: js.UndefOr[js.Any],
    runOnInit: js.UndefOr[Boolean],
    utcOffset: js.UndefOr[Double | String],
    unrefTimeout: js.UndefOr[Boolean]
  ): CronJob = js.native
  def apply(options: CronJobParameters): CronJob = js.native
}

