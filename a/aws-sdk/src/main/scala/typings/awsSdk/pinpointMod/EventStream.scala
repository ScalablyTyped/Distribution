package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStream extends StObject {
  
  /**
    * The unique identifier for the application to publish event data for.
    */
  var ApplicationId: string
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery stream to publish event data to. For a Kinesis data stream, the ARN format is: arn:aws:kinesis:region:account-id:stream/stream_name
    For a Kinesis Data Firehose delivery stream, the ARN format is: arn:aws:firehose:region:account-id:deliverystream/stream_name
    
    */
  var DestinationStreamArn: string
  
  /**
    * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon Pinpoint previously used this value to assume an IAM role when publishing event data, but we removed this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[string] = js.undefined
  
  /**
    * The date, in ISO 8601 format, when the event stream was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.undefined
  
  /**
    * The IAM user who last modified the event stream.
    */
  var LastUpdatedBy: js.UndefOr[string] = js.undefined
  
  /**
    * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to the stream in your AWS account.
    */
  var RoleArn: string
}
object EventStream {
  
  @scala.inline
  def apply(ApplicationId: string, DestinationStreamArn: string, RoleArn: string): EventStream = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], DestinationStreamArn = DestinationStreamArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventStream]
  }
  
  @scala.inline
  implicit class EventStreamMutableBuilder[Self <: EventStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationStreamArn(value: string): Self = StObject.set(x, "DestinationStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalId(value: string): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setLastUpdatedBy(value: string): Self = StObject.set(x, "LastUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedByUndefined: Self = StObject.set(x, "LastUpdatedBy", js.undefined)
    
    @scala.inline
    def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
