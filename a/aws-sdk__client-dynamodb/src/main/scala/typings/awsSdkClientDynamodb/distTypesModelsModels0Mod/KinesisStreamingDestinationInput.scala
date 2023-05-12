package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamingDestinationInput extends StObject {
  
  /**
    * <p>The ARN for a Kinesis data stream.</p>
    */
  var StreamArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The name of the DynamoDB table.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object KinesisStreamingDestinationInput {
  
  inline def apply(): KinesisStreamingDestinationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisStreamingDestinationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KinesisStreamingDestinationInput] (val x: Self) extends AnyVal {
    
    inline def setStreamArn(value: String): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
    
    inline def setStreamArnUndefined: Self = StObject.set(x, "StreamArn", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
