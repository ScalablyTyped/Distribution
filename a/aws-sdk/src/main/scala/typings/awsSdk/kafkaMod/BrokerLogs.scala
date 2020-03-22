package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerLogs extends js.Object {
  var CloudWatchLogs: js.UndefOr[typings.awsSdk.kafkaMod.CloudWatchLogs] = js.native
  var Firehose: js.UndefOr[typings.awsSdk.kafkaMod.Firehose] = js.native
  var S3: js.UndefOr[typings.awsSdk.kafkaMod.S3] = js.native
}

object BrokerLogs {
  @scala.inline
  def apply(CloudWatchLogs: CloudWatchLogs = null, Firehose: Firehose = null, S3: S3 = null): BrokerLogs = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogs != null) __obj.updateDynamic("CloudWatchLogs")(CloudWatchLogs.asInstanceOf[js.Any])
    if (Firehose != null) __obj.updateDynamic("Firehose")(Firehose.asInstanceOf[js.Any])
    if (S3 != null) __obj.updateDynamic("S3")(S3.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerLogs]
  }
}

