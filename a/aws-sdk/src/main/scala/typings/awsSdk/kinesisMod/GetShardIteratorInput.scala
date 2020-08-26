package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetShardIteratorInput extends js.Object {
  /**
    * The shard ID of the Kinesis Data Streams shard to get the iterator for.
    */
  var ShardId: typings.awsSdk.kinesisMod.ShardId = js.native
  /**
    * Determines how the shard iterator is used to start reading data records from the shard. The following are the valid Amazon Kinesis shard iterator types:   AT_SEQUENCE_NUMBER - Start reading from the position denoted by a specific sequence number, provided in the value StartingSequenceNumber.   AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by a specific sequence number, provided in the value StartingSequenceNumber.   AT_TIMESTAMP - Start reading from the position denoted by a specific time stamp, provided in the value Timestamp.   TRIM_HORIZON - Start reading at the last untrimmed record in the shard in the system, which is the oldest data record in the shard.   LATEST - Start reading just after the most recent record in the shard, so that you always read the most recent data in the shard.  
    */
  var ShardIteratorType: typings.awsSdk.kinesisMod.ShardIteratorType = js.native
  /**
    * The sequence number of the data record in the shard from which to start reading. Used with shard iterator type AT_SEQUENCE_NUMBER and AFTER_SEQUENCE_NUMBER.
    */
  var StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.native
  /**
    * The name of the Amazon Kinesis data stream.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
  /**
    * The time stamp of the data record from which to start reading. Used with shard iterator type AT_TIMESTAMP. A time stamp is the Unix epoch date with precision in milliseconds. For example, 2016-04-04T19:58:46.480-00:00 or 1459799926.480. If a record with this exact time stamp does not exist, the iterator returned is for the next (later) record. If the time stamp is older than the current trim horizon, the iterator returned is for the oldest untrimmed data record (TRIM_HORIZON).
    */
  var Timestamp: js.UndefOr[typings.awsSdk.kinesisMod.Timestamp] = js.native
}

object GetShardIteratorInput {
  @scala.inline
  def apply(ShardId: ShardId, ShardIteratorType: ShardIteratorType, StreamName: StreamName): GetShardIteratorInput = {
    val __obj = js.Dynamic.literal(ShardId = ShardId.asInstanceOf[js.Any], ShardIteratorType = ShardIteratorType.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetShardIteratorInput]
  }
  @scala.inline
  implicit class GetShardIteratorInputOps[Self <: GetShardIteratorInput] (val x: Self) extends AnyVal {
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
    def setShardId(value: ShardId): Self = this.set("ShardId", value.asInstanceOf[js.Any])
    @scala.inline
    def setShardIteratorType(value: ShardIteratorType): Self = this.set("ShardIteratorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartingSequenceNumber(value: SequenceNumber): Self = this.set("StartingSequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartingSequenceNumber: Self = this.set("StartingSequenceNumber", js.undefined)
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
  
}

