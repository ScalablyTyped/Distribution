package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDestinationDefinition extends StObject {
  
  var CloudWatchLogsDestination: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.CloudWatchLogsDestination] = js.native
  
  /**
    * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon Pinpoint sends response data to the specified event destination.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  var KinesisFirehoseDestination: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.KinesisFirehoseDestination] = js.native
  
  var MatchingEventTypes: js.UndefOr[EventTypes] = js.native
  
  var SnsDestination: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.SnsDestination] = js.native
}
object EventDestinationDefinition {
  
  @scala.inline
  def apply(): EventDestinationDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDestinationDefinition]
  }
  
  @scala.inline
  implicit class EventDestinationDefinitionMutableBuilder[Self <: EventDestinationDefinition] (val x: Self) extends AnyVal {
    
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
    def setSnsDestination(value: SnsDestination): Self = StObject.set(x, "SnsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsDestinationUndefined: Self = StObject.set(x, "SnsDestination", js.undefined)
  }
}
