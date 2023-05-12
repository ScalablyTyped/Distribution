package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamingDestinationInput extends StObject {
  
  /**
    * The ARN for a Kinesis data stream.
    */
  var StreamArn: typings.awsSdk2Types.clientsDynamodbMod.StreamArn
  
  /**
    * The name of the DynamoDB table.
    */
  var TableName: typings.awsSdk2Types.clientsDynamodbMod.TableName
}
object KinesisStreamingDestinationInput {
  
  inline def apply(StreamArn: StreamArn, TableName: TableName): KinesisStreamingDestinationInput = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamingDestinationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KinesisStreamingDestinationInput] (val x: Self) extends AnyVal {
    
    inline def setStreamArn(value: StreamArn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
