package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartActivityStreamResponse extends StObject {
  
  /**
    * Indicates whether or not the database activity stream will start as soon as possible, regardless of the maintenance window for the database.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the Amazon Kinesis data stream to be used for the database activity stream.
    */
  var KinesisStreamName: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS KMS key identifier for encryption of messages in the database activity stream.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The mode of the database activity stream.
    */
  var Mode: js.UndefOr[ActivityStreamMode] = js.undefined
  
  /**
    * The status of the database activity stream.
    */
  var Status: js.UndefOr[ActivityStreamStatus] = js.undefined
}
object StartActivityStreamResponse {
  
  inline def apply(): StartActivityStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartActivityStreamResponse]
  }
  
  extension [Self <: StartActivityStreamResponse](x: Self) {
    
    inline def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    inline def setApplyImmediatelyUndefined: Self = StObject.set(x, "ApplyImmediately", js.undefined)
    
    inline def setKinesisStreamName(value: String): Self = StObject.set(x, "KinesisStreamName", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamNameUndefined: Self = StObject.set(x, "KinesisStreamName", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMode(value: ActivityStreamMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setStatus(value: ActivityStreamStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
