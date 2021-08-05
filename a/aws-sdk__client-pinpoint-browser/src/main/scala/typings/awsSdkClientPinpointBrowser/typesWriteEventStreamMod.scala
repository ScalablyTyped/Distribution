package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWriteEventStreamMod {
  
  type UnmarshalledWriteEventStream = WriteEventStream
  
  trait WriteEventStream extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
      *  Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME
      *  Kinesis ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
      */
    var DestinationStreamArn: js.UndefOr[String] = js.undefined
    
    /**
      * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
      */
    var RoleArn: js.UndefOr[String] = js.undefined
  }
  object WriteEventStream {
    
    inline def apply(): WriteEventStream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteEventStream]
    }
    
    extension [Self <: WriteEventStream](x: Self) {
      
      inline def setDestinationStreamArn(value: String): Self = StObject.set(x, "DestinationStreamArn", value.asInstanceOf[js.Any])
      
      inline def setDestinationStreamArnUndefined: Self = StObject.set(x, "DestinationStreamArn", js.undefined)
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    }
  }
}
