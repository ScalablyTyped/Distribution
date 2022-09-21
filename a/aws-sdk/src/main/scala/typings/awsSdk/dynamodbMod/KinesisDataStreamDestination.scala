package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisDataStreamDestination extends StObject {
  
  /**
    * The current status of replication.
    */
  var DestinationStatus: js.UndefOr[typings.awsSdk.dynamodbMod.DestinationStatus] = js.undefined
  
  /**
    * The human-readable string that corresponds to the replica status.
    */
  var DestinationStatusDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN for a specific Kinesis data stream.
    */
  var StreamArn: js.UndefOr[typings.awsSdk.dynamodbMod.StreamArn] = js.undefined
}
object KinesisDataStreamDestination {
  
  inline def apply(): KinesisDataStreamDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisDataStreamDestination]
  }
  
  extension [Self <: KinesisDataStreamDestination](x: Self) {
    
    inline def setDestinationStatus(value: DestinationStatus): Self = StObject.set(x, "DestinationStatus", value.asInstanceOf[js.Any])
    
    inline def setDestinationStatusDescription(value: String): Self = StObject.set(x, "DestinationStatusDescription", value.asInstanceOf[js.Any])
    
    inline def setDestinationStatusDescriptionUndefined: Self = StObject.set(x, "DestinationStatusDescription", js.undefined)
    
    inline def setDestinationStatusUndefined: Self = StObject.set(x, "DestinationStatus", js.undefined)
    
    inline def setStreamArn(value: StreamArn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
    
    inline def setStreamArnUndefined: Self = StObject.set(x, "StreamArn", js.undefined)
  }
}
