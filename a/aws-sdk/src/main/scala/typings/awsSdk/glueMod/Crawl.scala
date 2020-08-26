package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crawl extends js.Object {
  /**
    * The date and time on which the crawl completed.
    */
  var CompletedOn: js.UndefOr[TimestampValue] = js.native
  /**
    * The error message associated with the crawl.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.native
  /**
    * The log group associated with the crawl.
    */
  var LogGroup: js.UndefOr[typings.awsSdk.glueMod.LogGroup] = js.native
  /**
    * The log stream associated with the crawl.
    */
  var LogStream: js.UndefOr[typings.awsSdk.glueMod.LogStream] = js.native
  /**
    * The date and time on which the crawl started.
    */
  var StartedOn: js.UndefOr[TimestampValue] = js.native
  /**
    * The state of the crawler.
    */
  var State: js.UndefOr[CrawlState] = js.native
}

object Crawl {
  @scala.inline
  def apply(): Crawl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crawl]
  }
  @scala.inline
  implicit class CrawlOps[Self <: Crawl] (val x: Self) extends AnyVal {
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
    def setCompletedOn(value: TimestampValue): Self = this.set("CompletedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedOn: Self = this.set("CompletedOn", js.undefined)
    @scala.inline
    def setErrorMessage(value: DescriptionString): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setLogGroup(value: LogGroup): Self = this.set("LogGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogGroup: Self = this.set("LogGroup", js.undefined)
    @scala.inline
    def setLogStream(value: LogStream): Self = this.set("LogStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogStream: Self = this.set("LogStream", js.undefined)
    @scala.inline
    def setStartedOn(value: TimestampValue): Self = this.set("StartedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedOn: Self = this.set("StartedOn", js.undefined)
    @scala.inline
    def setState(value: CrawlState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

