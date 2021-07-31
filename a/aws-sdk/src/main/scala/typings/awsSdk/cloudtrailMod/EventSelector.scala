package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSelector extends StObject {
  
  /**
    * CloudTrail supports data event logging for Amazon S3 objects and AWS Lambda functions. You can specify up to 250 resources for an individual event selector, but the total number of data resources cannot exceed 250 across all event selectors in a trail. This limit does not apply if you configure resource logging for all data events.  For more information, see Data Events and Limits in AWS CloudTrail in the AWS CloudTrail User Guide.
    */
  var DataResources: js.UndefOr[typings.awsSdk.cloudtrailMod.DataResources] = js.undefined
  
  /**
    * An optional list of service event sources from which you do not want management events to be logged on your trail. In this release, the list can be empty (disables the filter), or it can filter out AWS Key Management Service events by containing "kms.amazonaws.com". By default, ExcludeManagementEventSources is empty, and AWS KMS events are included in events that are logged to your trail. 
    */
  var ExcludeManagementEventSources: js.UndefOr[typings.awsSdk.cloudtrailMod.ExcludeManagementEventSources] = js.undefined
  
  /**
    * Specify if you want your event selector to include management events for your trail.  For more information, see Management Events in the AWS CloudTrail User Guide. By default, the value is true.
    */
  var IncludeManagementEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2 GetConsoleOutput is a read-only API operation and RunInstances is a write-only API operation.  By default, the value is All.
    */
  var ReadWriteType: js.UndefOr[typings.awsSdk.cloudtrailMod.ReadWriteType] = js.undefined
}
object EventSelector {
  
  @scala.inline
  def apply(): EventSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSelector]
  }
  
  @scala.inline
  implicit class EventSelectorMutableBuilder[Self <: EventSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataResources(value: DataResources): Self = StObject.set(x, "DataResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataResourcesUndefined: Self = StObject.set(x, "DataResources", js.undefined)
    
    @scala.inline
    def setDataResourcesVarargs(value: DataResource*): Self = StObject.set(x, "DataResources", js.Array(value :_*))
    
    @scala.inline
    def setExcludeManagementEventSources(value: ExcludeManagementEventSources): Self = StObject.set(x, "ExcludeManagementEventSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeManagementEventSourcesUndefined: Self = StObject.set(x, "ExcludeManagementEventSources", js.undefined)
    
    @scala.inline
    def setExcludeManagementEventSourcesVarargs(value: String*): Self = StObject.set(x, "ExcludeManagementEventSources", js.Array(value :_*))
    
    @scala.inline
    def setIncludeManagementEvents(value: Boolean): Self = StObject.set(x, "IncludeManagementEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeManagementEventsUndefined: Self = StObject.set(x, "IncludeManagementEvents", js.undefined)
    
    @scala.inline
    def setReadWriteType(value: ReadWriteType): Self = StObject.set(x, "ReadWriteType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadWriteTypeUndefined: Self = StObject.set(x, "ReadWriteType", js.undefined)
  }
}
