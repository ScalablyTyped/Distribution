package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * The state of the crawler to which this condition applies.
    */
  var CrawlState: js.UndefOr[typings.awsSdk.glueMod.CrawlState] = js.native
  /**
    * The name of the crawler to which this condition applies.
    */
  var CrawlerName: js.UndefOr[NameString] = js.native
  /**
    * The name of the job whose JobRuns this condition applies to, and on which this trigger waits.
    */
  var JobName: js.UndefOr[NameString] = js.native
  /**
    * A logical operator.
    */
  var LogicalOperator: js.UndefOr[typings.awsSdk.glueMod.LogicalOperator] = js.native
  /**
    * The condition state. Currently, the only job states that a trigger can listen for are SUCCEEDED, STOPPED, FAILED, and TIMEOUT. The only crawler states that a trigger can listen for are SUCCEEDED, FAILED, and CANCELLED.
    */
  var State: js.UndefOr[JobRunState] = js.native
}

object Condition {
  @scala.inline
  def apply(
    CrawlState: CrawlState = null,
    CrawlerName: NameString = null,
    JobName: NameString = null,
    LogicalOperator: LogicalOperator = null,
    State: JobRunState = null
  ): Condition = {
    val __obj = js.Dynamic.literal()
    if (CrawlState != null) __obj.updateDynamic("CrawlState")(CrawlState.asInstanceOf[js.Any])
    if (CrawlerName != null) __obj.updateDynamic("CrawlerName")(CrawlerName.asInstanceOf[js.Any])
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    if (LogicalOperator != null) __obj.updateDynamic("LogicalOperator")(LogicalOperator.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

