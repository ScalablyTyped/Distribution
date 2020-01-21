package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchedLogStream extends js.Object {
  /**
    * The name of the log stream.
    */
  var logStreamName: js.UndefOr[LogStreamName] = js.native
  /**
    * Indicates whether all the events in this log stream were searched.
    */
  var searchedCompletely: js.UndefOr[LogStreamSearchedCompletely] = js.native
}

object SearchedLogStream {
  @scala.inline
  def apply(logStreamName: LogStreamName = null, searchedCompletely: js.UndefOr[Boolean] = js.undefined): SearchedLogStream = {
    val __obj = js.Dynamic.literal()
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName.asInstanceOf[js.Any])
    if (!js.isUndefined(searchedCompletely)) __obj.updateDynamic("searchedCompletely")(searchedCompletely.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchedLogStream]
  }
}

