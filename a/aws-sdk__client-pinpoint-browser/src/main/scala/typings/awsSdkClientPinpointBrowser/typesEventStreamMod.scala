package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventStreamMod {
  
  trait EventStream extends StObject {
    
    /**
      * The ID of the application from which events should be published.
      */
    var ApplicationId: js.UndefOr[String] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
      *  Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME
      *  Kinesis ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
      */
    var DestinationStreamArn: js.UndefOr[String] = js.undefined
    
    /**
      * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
      */
    var ExternalId: js.UndefOr[String] = js.undefined
    
    /**
      * The date the event stream was last updated in ISO 8601 format.
      */
    var LastModifiedDate: js.UndefOr[String] = js.undefined
    
    /**
      * The IAM user who last modified the event stream.
      */
    var LastUpdatedBy: js.UndefOr[String] = js.undefined
    
    /**
      * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
      */
    var RoleArn: js.UndefOr[String] = js.undefined
  }
  object EventStream {
    
    inline def apply(): EventStream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventStream]
    }
    
    extension [Self <: EventStream](x: Self) {
      
      inline def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      inline def setDestinationStreamArn(value: String): Self = StObject.set(x, "DestinationStreamArn", value.asInstanceOf[js.Any])
      
      inline def setDestinationStreamArnUndefined: Self = StObject.set(x, "DestinationStreamArn", js.undefined)
      
      inline def setExternalId(value: String): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
      
      inline def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
      
      inline def setLastModifiedDate(value: String): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      inline def setLastUpdatedBy(value: String): Self = StObject.set(x, "LastUpdatedBy", value.asInstanceOf[js.Any])
      
      inline def setLastUpdatedByUndefined: Self = StObject.set(x, "LastUpdatedBy", js.undefined)
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    }
  }
  
  type UnmarshalledEventStream = EventStream
}
