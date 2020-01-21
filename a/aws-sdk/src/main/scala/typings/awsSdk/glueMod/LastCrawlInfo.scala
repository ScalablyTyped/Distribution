package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastCrawlInfo extends js.Object {
  /**
    * If an error occurred, the error information about the last crawl.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.native
  /**
    * The log group for the last crawl.
    */
  var LogGroup: js.UndefOr[typings.awsSdk.glueMod.LogGroup] = js.native
  /**
    * The log stream for the last crawl.
    */
  var LogStream: js.UndefOr[typings.awsSdk.glueMod.LogStream] = js.native
  /**
    * The prefix for a message about this crawl.
    */
  var MessagePrefix: js.UndefOr[typings.awsSdk.glueMod.MessagePrefix] = js.native
  /**
    * The time at which the crawl started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  /**
    * Status of the last crawl.
    */
  var Status: js.UndefOr[LastCrawlStatus] = js.native
}

object LastCrawlInfo {
  @scala.inline
  def apply(
    ErrorMessage: DescriptionString = null,
    LogGroup: LogGroup = null,
    LogStream: LogStream = null,
    MessagePrefix: MessagePrefix = null,
    StartTime: Timestamp = null,
    Status: LastCrawlStatus = null
  ): LastCrawlInfo = {
    val __obj = js.Dynamic.literal()
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (LogGroup != null) __obj.updateDynamic("LogGroup")(LogGroup.asInstanceOf[js.Any])
    if (LogStream != null) __obj.updateDynamic("LogStream")(LogStream.asInstanceOf[js.Any])
    if (MessagePrefix != null) __obj.updateDynamic("MessagePrefix")(MessagePrefix.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastCrawlInfo]
  }
}

