package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesGetShardIteratorInputMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.AFTER_SEQUENCE_NUMBER
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.AT_SEQUENCE_NUMBER
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.AT_TIMESTAMP
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.LATEST
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.TRIM_HORIZON
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetShardIteratorInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>The shard ID of the Kinesis Data Streams shard to get the iterator for.</p>
    */
  var ShardId: String
  /**
    * <p>Determines how the shard iterator is used to start reading data records from the shard.</p> <p>The following are the valid Amazon Kinesis shard iterator types:</p> <ul> <li> <p>AT_SEQUENCE_NUMBER - Start reading from the position denoted by a specific sequence number, provided in the value <code>StartingSequenceNumber</code>.</p> </li> <li> <p>AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by a specific sequence number, provided in the value <code>StartingSequenceNumber</code>.</p> </li> <li> <p>AT_TIMESTAMP - Start reading from the position denoted by a specific time stamp, provided in the value <code>Timestamp</code>.</p> </li> <li> <p>TRIM_HORIZON - Start reading at the last untrimmed record in the shard in the system, which is the oldest data record in the shard.</p> </li> <li> <p>LATEST - Start reading just after the most recent record in the shard, so that you always read the most recent data in the shard.</p> </li> </ul>
    */
  var ShardIteratorType: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String
  /**
    * <p>The sequence number of the data record in the shard from which to start reading. Used with shard iterator type AT_SEQUENCE_NUMBER and AFTER_SEQUENCE_NUMBER.</p>
    */
  var StartingSequenceNumber: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the Amazon Kinesis data stream.</p>
    */
  var StreamName: String
  /**
    * <p>The time stamp of the data record from which to start reading. Used with shard iterator type AT_TIMESTAMP. A time stamp is the Unix epoch date with precision in milliseconds. For example, <code>2016-04-04T19:58:46.480-00:00</code> or <code>1459799926.480</code>. If a record with this exact time stamp does not exist, the iterator returned is for the next (later) record. If the time stamp is older than the current trim horizon, the iterator returned is for the oldest untrimmed data record (TRIM_HORIZON).</p>
    */
  var Timestamp: js.UndefOr[Date | String | Double] = js.undefined
}

object GetShardIteratorInput {
  @scala.inline
  def apply(
    ShardId: String,
    ShardIteratorType: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String,
    StreamName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null,
    StartingSequenceNumber: String = null,
    Timestamp: Date | String | Double = null
  ): GetShardIteratorInput = {
    val __obj = js.Dynamic.literal(ShardId = ShardId.asInstanceOf[js.Any], ShardIteratorType = ShardIteratorType.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (StartingSequenceNumber != null) __obj.updateDynamic("StartingSequenceNumber")(StartingSequenceNumber.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetShardIteratorInput]
  }
}

