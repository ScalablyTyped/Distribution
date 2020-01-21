package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogStream extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the log stream.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The creation time of the stream, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The time of the first event, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var firstEventTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The time of the most recent log event in the log stream in CloudWatch Logs. This number is expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. The lastEventTime value updates on an eventual consistency basis. It typically updates in less than an hour from ingestion, but may take longer in some rare situations.
    */
  var lastEventTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The ingestion time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var lastIngestionTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the log stream.
    */
  var logStreamName: js.UndefOr[LogStreamName] = js.native
  /**
    * The number of bytes stored.  IMPORTANT:On June 17, 2019, this parameter was deprecated for log streams, and is always reported as zero. This change applies only to log streams. The storedBytes parameter for log groups is not affected.
    */
  var storedBytes: js.UndefOr[StoredBytes] = js.native
  /**
    * The sequence token.
    */
  var uploadSequenceToken: js.UndefOr[SequenceToken] = js.native
}

object LogStream {
  @scala.inline
  def apply(
    arn: Arn = null,
    creationTime: Int | Double = null,
    firstEventTimestamp: Int | Double = null,
    lastEventTimestamp: Int | Double = null,
    lastIngestionTime: Int | Double = null,
    logStreamName: LogStreamName = null,
    storedBytes: Int | Double = null,
    uploadSequenceToken: SequenceToken = null
  ): LogStream = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (firstEventTimestamp != null) __obj.updateDynamic("firstEventTimestamp")(firstEventTimestamp.asInstanceOf[js.Any])
    if (lastEventTimestamp != null) __obj.updateDynamic("lastEventTimestamp")(lastEventTimestamp.asInstanceOf[js.Any])
    if (lastIngestionTime != null) __obj.updateDynamic("lastIngestionTime")(lastIngestionTime.asInstanceOf[js.Any])
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName.asInstanceOf[js.Any])
    if (storedBytes != null) __obj.updateDynamic("storedBytes")(storedBytes.asInstanceOf[js.Any])
    if (uploadSequenceToken != null) __obj.updateDynamic("uploadSequenceToken")(uploadSequenceToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogStream]
  }
}

