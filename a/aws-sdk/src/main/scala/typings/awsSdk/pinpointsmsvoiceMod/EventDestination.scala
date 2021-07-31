package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDestination extends StObject {
  
  var CloudWatchLogsDestination: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.CloudWatchLogsDestination] = js.undefined
  
  /**
    * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon Pinpoint sends response data to the specified event destination.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  var KinesisFirehoseDestination: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.KinesisFirehoseDestination] = js.undefined
  
  var MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined
  
  /**
    * A name that identifies the event destination configuration.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  var SnsDestination: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.SnsDestination] = js.undefined
}
object EventDestination {
  
  @scala.inline
  def apply(): EventDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDestination]
  }
  
  @scala.inline
  implicit class EventDestinationMutableBuilder[Self <: EventDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogsDestination(value: CloudWatchLogsDestination): Self = StObject.set(x, "CloudWatchLogsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogsDestinationUndefined: Self = StObject.set(x, "CloudWatchLogsDestination", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseDestination(value: KinesisFirehoseDestination): Self = StObject.set(x, "KinesisFirehoseDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseDestinationUndefined: Self = StObject.set(x, "KinesisFirehoseDestination", js.undefined)
    
    @scala.inline
    def setMatchingEventTypes(value: EventTypes): Self = StObject.set(x, "MatchingEventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingEventTypesUndefined: Self = StObject.set(x, "MatchingEventTypes", js.undefined)
    
    @scala.inline
    def setMatchingEventTypesVarargs(value: EventType*): Self = StObject.set(x, "MatchingEventTypes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSnsDestination(value: SnsDestination): Self = StObject.set(x, "SnsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsDestinationUndefined: Self = StObject.set(x, "SnsDestination", js.undefined)
  }
}
