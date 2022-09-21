package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamingDestinationInput extends StObject {
  
  /**
    * The ARN for a Kinesis data stream.
    */
  var StreamArn: typings.awsSdk.dynamodbMod.StreamArn
  
  /**
    * The name of the DynamoDB table.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName
}
object KinesisStreamingDestinationInput {
  
  inline def apply(StreamArn: StreamArn, TableName: TableName): KinesisStreamingDestinationInput = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamingDestinationInput]
  }
  
  extension [Self <: KinesisStreamingDestinationInput](x: Self) {
    
    inline def setStreamArn(value: StreamArn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
