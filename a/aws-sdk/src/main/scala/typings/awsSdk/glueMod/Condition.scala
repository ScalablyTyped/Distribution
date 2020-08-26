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
    * The condition state. Currently, the values supported are SUCCEEDED, STOPPED, TIMEOUT, and FAILED.
    */
  var State: js.UndefOr[JobRunState] = js.native
}

object Condition {
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
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
    def setCrawlState(value: CrawlState): Self = this.set("CrawlState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrawlState: Self = this.set("CrawlState", js.undefined)
    @scala.inline
    def setCrawlerName(value: NameString): Self = this.set("CrawlerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrawlerName: Self = this.set("CrawlerName", js.undefined)
    @scala.inline
    def setJobName(value: NameString): Self = this.set("JobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    @scala.inline
    def setLogicalOperator(value: LogicalOperator): Self = this.set("LogicalOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogicalOperator: Self = this.set("LogicalOperator", js.undefined)
    @scala.inline
    def setState(value: JobRunState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

