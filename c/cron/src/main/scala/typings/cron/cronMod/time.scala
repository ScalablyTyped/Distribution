package typings.cron.cronMod

import typings.moment.momentMod.Moment
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron", "time")
@js.native
object time extends js.Object {
  def apply(source: String): CronTime = js.native
  def apply(source: String, zone: String): CronTime = js.native
  def apply(source: Moment): CronTime = js.native
  def apply(source: Moment, zone: String): CronTime = js.native
  def apply(source: Date): CronTime = js.native
  def apply(source: Date, zone: String): CronTime = js.native
}

