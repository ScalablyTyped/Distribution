package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDestination extends StObject {
  
  /**
    * An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
    */
  var CloudWatchDestination: js.UndefOr[typings.awsSdk.pinpointemailMod.CloudWatchDestination] = js.native
  
  /**
    * If true, the event destination is enabled. When the event destination is enabled, the specified event types are sent to the destinations in this EventDestinationDefinition. If false, the event destination is disabled. When the event destination is disabled, events aren't sent to the specified destinations.
    */
  var Enabled: js.UndefOr[typings.awsSdk.pinpointemailMod.Enabled] = js.native
  
  /**
    * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
    */
  var KinesisFirehoseDestination: js.UndefOr[typings.awsSdk.pinpointemailMod.KinesisFirehoseDestination] = js.native
  
  /**
    * The types of events that Amazon Pinpoint sends to the specified event destinations.
    */
  var MatchingEventTypes: EventTypes = js.native
  
  /**
    * A name that identifies the event destination.
    */
  var Name: EventDestinationName = js.native
  
  /**
    * An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events to create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for your campaigns.
    */
  var PinpointDestination: js.UndefOr[typings.awsSdk.pinpointemailMod.PinpointDestination] = js.native
  
  /**
    * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification when certain email events occur.
    */
  var SnsDestination: js.UndefOr[typings.awsSdk.pinpointemailMod.SnsDestination] = js.native
}
object EventDestination {
  
  @scala.inline
  def apply(MatchingEventTypes: EventTypes, Name: EventDestinationName): EventDestination = {
    val __obj = js.Dynamic.literal(MatchingEventTypes = MatchingEventTypes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestination]
  }
  
  @scala.inline
  implicit class EventDestinationMutableBuilder[Self <: EventDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchDestination(value: CloudWatchDestination): Self = StObject.set(x, "CloudWatchDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchDestinationUndefined: Self = StObject.set(x, "CloudWatchDestination", js.undefined)
    
    @scala.inline
    def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseDestination(value: KinesisFirehoseDestination): Self = StObject.set(x, "KinesisFirehoseDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseDestinationUndefined: Self = StObject.set(x, "KinesisFirehoseDestination", js.undefined)
    
    @scala.inline
    def setMatchingEventTypes(value: EventTypes): Self = StObject.set(x, "MatchingEventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingEventTypesVarargs(value: EventType*): Self = StObject.set(x, "MatchingEventTypes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: EventDestinationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinpointDestination(value: PinpointDestination): Self = StObject.set(x, "PinpointDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinpointDestinationUndefined: Self = StObject.set(x, "PinpointDestination", js.undefined)
    
    @scala.inline
    def setSnsDestination(value: SnsDestination): Self = StObject.set(x, "SnsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsDestinationUndefined: Self = StObject.set(x, "SnsDestination", js.undefined)
  }
}
