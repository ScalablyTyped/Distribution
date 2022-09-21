package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamingDestinationOutput extends StObject {
  
  /**
    * The current status of the replication.
    */
  var DestinationStatus: js.UndefOr[typings.awsSdk.dynamodbMod.DestinationStatus] = js.undefined
  
  /**
    * The ARN for the specific Kinesis data stream.
    */
  var StreamArn: js.UndefOr[typings.awsSdk.dynamodbMod.StreamArn] = js.undefined
  
  /**
    * The name of the table being modified.
    */
  var TableName: js.UndefOr[typings.awsSdk.dynamodbMod.TableName] = js.undefined
}
object KinesisStreamingDestinationOutput {
  
  inline def apply(): KinesisStreamingDestinationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisStreamingDestinationOutput]
  }
  
  extension [Self <: KinesisStreamingDestinationOutput](x: Self) {
    
    inline def setDestinationStatus(value: DestinationStatus): Self = StObject.set(x, "DestinationStatus", value.asInstanceOf[js.Any])
    
    inline def setDestinationStatusUndefined: Self = StObject.set(x, "DestinationStatus", js.undefined)
    
    inline def setStreamArn(value: StreamArn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
    
    inline def setStreamArnUndefined: Self = StObject.set(x, "StreamArn", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
