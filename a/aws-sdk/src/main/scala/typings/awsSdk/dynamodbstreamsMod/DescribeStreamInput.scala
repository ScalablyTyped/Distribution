package typings.awsSdk.dynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamInput extends StObject {
  
  /**
    * The shard ID of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedShardId in the previous operation. 
    */
  var ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined
  
  /**
    * The maximum number of shard objects to return. The upper limit is 100.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: typings.awsSdk.dynamodbstreamsMod.StreamArn
}
object DescribeStreamInput {
  
  inline def apply(StreamArn: StreamArn): DescribeStreamInput = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamInput]
  }
  
  extension [Self <: DescribeStreamInput](x: Self) {
    
    inline def setExclusiveStartShardId(value: ShardId): Self = StObject.set(x, "ExclusiveStartShardId", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartShardIdUndefined: Self = StObject.set(x, "ExclusiveStartShardId", js.undefined)
    
    inline def setLimit(value: PositiveIntegerObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setStreamArn(value: StreamArn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
  }
}
