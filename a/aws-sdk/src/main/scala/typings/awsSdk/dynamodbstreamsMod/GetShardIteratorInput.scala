package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetShardIteratorInput extends js.Object {
  
  /**
    * The sequence number of a stream record in the shard from which to start reading.
    */
  var SequenceNumber: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.SequenceNumber] = js.native
  
  /**
    * The identifier of the shard. The iterator will be returned for this shard ID.
    */
  var ShardId: typings.awsSdk.dynamodbstreamsMod.ShardId = js.native
  
  /**
    * Determines how the shard iterator is used to start reading stream records from the shard:    AT_SEQUENCE_NUMBER - Start reading exactly from the position denoted by a specific sequence number.    AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by a specific sequence number.    TRIM_HORIZON - Start reading at the last (untrimmed) stream record, which is the oldest record in the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this limit are subject to removal (trimming) from the stream.    LATEST - Start reading just after the most recent stream record in the shard, so that you always read the most recent data in the shard.  
    */
  var ShardIteratorType: typings.awsSdk.dynamodbstreamsMod.ShardIteratorType = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: typings.awsSdk.dynamodbstreamsMod.StreamArn = js.native
}
object GetShardIteratorInput {
  
  @scala.inline
  def apply(ShardId: ShardId, ShardIteratorType: ShardIteratorType, StreamArn: StreamArn): GetShardIteratorInput = {
    val __obj = js.Dynamic.literal(ShardId = ShardId.asInstanceOf[js.Any], ShardIteratorType = ShardIteratorType.asInstanceOf[js.Any], StreamArn = StreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetShardIteratorInput]
  }
  
  @scala.inline
  implicit class GetShardIteratorInputOps[Self <: GetShardIteratorInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setShardId(value: ShardId): Self = this.set("ShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardIteratorType(value: ShardIteratorType): Self = this.set("ShardIteratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamArn(value: StreamArn): Self = this.set("StreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumber(value: SequenceNumber): Self = this.set("SequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequenceNumber: Self = this.set("SequenceNumber", js.undefined)
  }
}
