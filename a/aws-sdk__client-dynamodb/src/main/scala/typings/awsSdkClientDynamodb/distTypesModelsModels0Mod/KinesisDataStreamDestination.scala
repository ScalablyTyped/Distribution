package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisDataStreamDestination extends StObject {
  
  /**
    * <p>The current status of replication.</p>
    */
  var DestinationStatus: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.DestinationStatus | String
  ] = js.undefined
  
  /**
    * <p>The human-readable string that corresponds to the replica status.</p>
    */
  var DestinationStatusDescription: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The ARN for a specific Kinesis data stream.</p>
    */
  var StreamArn: js.UndefOr[String] = js.undefined
}
object KinesisDataStreamDestination {
  
  inline def apply(): KinesisDataStreamDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisDataStreamDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KinesisDataStreamDestination] (val x: Self) extends AnyVal {
    
    inline def setDestinationStatus(value: DestinationStatus | String): Self = StObject.set(x, "DestinationStatus", value.asInstanceOf[js.Any])
    
    inline def setDestinationStatusDescription(value: String): Self = StObject.set(x, "DestinationStatusDescription", value.asInstanceOf[js.Any])
    
    inline def setDestinationStatusDescriptionUndefined: Self = StObject.set(x, "DestinationStatusDescription", js.undefined)
    
    inline def setDestinationStatusUndefined: Self = StObject.set(x, "DestinationStatus", js.undefined)
    
    inline def setStreamArn(value: String): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
    
    inline def setStreamArnUndefined: Self = StObject.set(x, "StreamArn", js.undefined)
  }
}
