package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamingDestinationOutput extends StObject {
  
  /**
    * <p>The current status of the replication.</p>
    */
  var DestinationStatus: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.DestinationStatus | String
  ] = js.undefined
  
  /**
    * <p>The ARN for the specific Kinesis data stream.</p>
    */
  var StreamArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The name of the table being modified.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object KinesisStreamingDestinationOutput {
  
  inline def apply(): KinesisStreamingDestinationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisStreamingDestinationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KinesisStreamingDestinationOutput] (val x: Self) extends AnyVal {
    
    inline def setDestinationStatus(value: DestinationStatus | String): Self = StObject.set(x, "DestinationStatus", value.asInstanceOf[js.Any])
    
    inline def setDestinationStatusUndefined: Self = StObject.set(x, "DestinationStatus", js.undefined)
    
    inline def setStreamArn(value: String): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
    
    inline def setStreamArnUndefined: Self = StObject.set(x, "StreamArn", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
