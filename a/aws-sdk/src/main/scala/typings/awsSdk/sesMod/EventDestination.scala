package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDestination extends StObject {
  
  /**
    * An object that contains the names, default values, and sources of the dimensions associated with an Amazon CloudWatch event destination.
    */
  var CloudWatchDestination: js.UndefOr[typings.awsSdk.sesMod.CloudWatchDestination] = js.undefined
  
  /**
    * Sets whether Amazon SES publishes events to this destination when you send an email with the associated configuration set. Set to true to enable publishing to this destination; set to false to prevent publishing to this destination. The default value is false.
    */
  var Enabled: js.UndefOr[typings.awsSdk.sesMod.Enabled] = js.undefined
  
  /**
    * An object that contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis Firehose event destination.
    */
  var KinesisFirehoseDestination: js.UndefOr[typings.awsSdk.sesMod.KinesisFirehoseDestination] = js.undefined
  
  /**
    * The type of email sending events to publish to the event destination.
    */
  var MatchingEventTypes: EventTypes
  
  /**
    * The name of the event destination. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 64 characters.  
    */
  var Name: EventDestinationName
  
  /**
    * An object that contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event destination.
    */
  var SNSDestination: js.UndefOr[typings.awsSdk.sesMod.SNSDestination] = js.undefined
}
object EventDestination {
  
  inline def apply(MatchingEventTypes: EventTypes, Name: EventDestinationName): EventDestination = {
    val __obj = js.Dynamic.literal(MatchingEventTypes = MatchingEventTypes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestination]
  }
  
  extension [Self <: EventDestination](x: Self) {
    
    inline def setCloudWatchDestination(value: CloudWatchDestination): Self = StObject.set(x, "CloudWatchDestination", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchDestinationUndefined: Self = StObject.set(x, "CloudWatchDestination", js.undefined)
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setKinesisFirehoseDestination(value: KinesisFirehoseDestination): Self = StObject.set(x, "KinesisFirehoseDestination", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseDestinationUndefined: Self = StObject.set(x, "KinesisFirehoseDestination", js.undefined)
    
    inline def setMatchingEventTypes(value: EventTypes): Self = StObject.set(x, "MatchingEventTypes", value.asInstanceOf[js.Any])
    
    inline def setMatchingEventTypesVarargs(value: EventType*): Self = StObject.set(x, "MatchingEventTypes", js.Array(value :_*))
    
    inline def setName(value: EventDestinationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSNSDestination(value: SNSDestination): Self = StObject.set(x, "SNSDestination", value.asInstanceOf[js.Any])
    
    inline def setSNSDestinationUndefined: Self = StObject.set(x, "SNSDestination", js.undefined)
  }
}
