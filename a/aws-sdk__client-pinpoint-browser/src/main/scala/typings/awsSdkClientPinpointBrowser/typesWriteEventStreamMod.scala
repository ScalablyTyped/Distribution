package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWriteEventStreamMod {
  
  type UnmarshalledWriteEventStream = WriteEventStream
  
  @js.native
  trait WriteEventStream extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
      *  Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME
      *  Kinesis ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
      */
    var DestinationStreamArn: js.UndefOr[String] = js.native
    
    /**
      * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
      */
    var RoleArn: js.UndefOr[String] = js.native
  }
  object WriteEventStream {
    
    @scala.inline
    def apply(): WriteEventStream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteEventStream]
    }
    
    @scala.inline
    implicit class WriteEventStreamMutableBuilder[Self <: WriteEventStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationStreamArn(value: String): Self = StObject.set(x, "DestinationStreamArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationStreamArnUndefined: Self = StObject.set(x, "DestinationStreamArn", js.undefined)
      
      @scala.inline
      def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    }
  }
}
