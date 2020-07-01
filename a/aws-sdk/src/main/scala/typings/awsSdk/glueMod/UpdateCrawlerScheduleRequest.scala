package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCrawlerScheduleRequest extends js.Object {
  /**
    * The name of the crawler whose schedule to update.
    */
  var CrawlerName: NameString = js.native
  /**
    * The updated cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
    */
  var Schedule: js.UndefOr[CronExpression] = js.native
}

object UpdateCrawlerScheduleRequest {
  @scala.inline
  def apply(CrawlerName: NameString, Schedule: CronExpression = null): UpdateCrawlerScheduleRequest = {
    val __obj = js.Dynamic.literal(CrawlerName = CrawlerName.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCrawlerScheduleRequest]
  }
}

