package typings.awsSdk.dynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetShardIteratorInput extends StObject {
  
  /**
    * The sequence number of a stream record in the shard from which to start reading.
    */
  var SequenceNumber: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.SequenceNumber] = js.undefined
  
  /**
    * The identifier of the shard. The iterator will be returned for this shard ID.
    */
  var ShardId: typings.awsSdk.dynamodbstreamsMod.ShardId
  
  /**
    * Determines how the shard iterator is used to start reading stream records from the shard:    AT_SEQUENCE_NUMBER - Start reading exactly from the position denoted by a specific sequence number.    AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by a specific sequence number.    TRIM_HORIZON - Start reading at the last (untrimmed) stream record, which is the oldest record in the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this limit are subject to removal (trimming) from the stream.    LATEST - Start reading just after the most recent stream record in the shard, so that you always read the most recent data in the shard.  
    */
  var ShardIteratorType: typings.awsSdk.dynamodbstreamsMod.ShardIteratorType
  
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: typings.awsSdk.dynamodbstreamsMod.StreamArn
}
object GetShardIteratorInput {
  
  @scala.inline
  def apply(ShardId: ShardId, ShardIteratorType: ShardIteratorType, StreamArn: StreamArn): GetShardIteratorInput = {
    val __obj = js.Dynamic.literal(ShardId = ShardId.asInstanceOf[js.Any], ShardIteratorType = ShardIteratorType.asInstanceOf[js.Any], StreamArn = StreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetShardIteratorInput]
  }
  
  @scala.inline
  implicit class GetShardIteratorInputMutableBuilder[Self <: GetShardIteratorInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSequenceNumber(value: SequenceNumber): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
    
    @scala.inline
    def setShardId(value: ShardId): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardIteratorType(value: ShardIteratorType): Self = StObject.set(x, "ShardIteratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamArn(value: StreamArn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
  }
}
