package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopActivityStreamResponse extends StObject {
  
  /**
    * The name of the Amazon Kinesis data stream used for the database activity stream.
    */
  var KinesisStreamName: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS KMS key identifier used for encrypting messages in the database activity stream.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the database activity stream.
    */
  var Status: js.UndefOr[ActivityStreamStatus] = js.undefined
}
object StopActivityStreamResponse {
  
  @scala.inline
  def apply(): StopActivityStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopActivityStreamResponse]
  }
  
  @scala.inline
  implicit class StopActivityStreamResponseMutableBuilder[Self <: StopActivityStreamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKinesisStreamName(value: String): Self = StObject.set(x, "KinesisStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamNameUndefined: Self = StObject.set(x, "KinesisStreamName", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setStatus(value: ActivityStreamStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
