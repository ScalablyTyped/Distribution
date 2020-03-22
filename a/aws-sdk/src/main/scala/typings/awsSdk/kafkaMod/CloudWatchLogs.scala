package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLogs extends js.Object {
  var Enabled: boolean = js.native
  var LogGroup: js.UndefOr[string] = js.native
}

object CloudWatchLogs {
  @scala.inline
  def apply(Enabled: boolean, LogGroup: string = null): CloudWatchLogs = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    if (LogGroup != null) __obj.updateDynamic("LogGroup")(LogGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogs]
  }
}

