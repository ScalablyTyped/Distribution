package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamInput extends StObject {
  
  /**
    * The number of shards that the stream will use. The throughput of the stream is a function of the number of shards; more shards are required for greater provisioned throughput.
    */
  var ShardCount: PositiveIntegerObject
  
  /**
    * A name to identify the stream. The stream name is scoped to the AWS account used by the application that creates the stream. It is also scoped by AWS Region. That is, two streams in two different AWS accounts can have the same name. Two streams in the same AWS account but in two different Regions can also have the same name.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName
}
object CreateStreamInput {
  
  inline def apply(ShardCount: PositiveIntegerObject, StreamName: StreamName): CreateStreamInput = {
    val __obj = js.Dynamic.literal(ShardCount = ShardCount.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamInput]
  }
  
  extension [Self <: CreateStreamInput](x: Self) {
    
    inline def setShardCount(value: PositiveIntegerObject): Self = StObject.set(x, "ShardCount", value.asInstanceOf[js.Any])
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
