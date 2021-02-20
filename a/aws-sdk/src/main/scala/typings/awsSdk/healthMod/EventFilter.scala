package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventFilter extends StObject {
  
  /**
    * A list of AWS availability zones.
    */
  var availabilityZones: js.UndefOr[typings.awsSdk.healthMod.availabilityZones] = js.native
  
  /**
    * A list of dates and times that the event ended.
    */
  var endTimes: js.UndefOr[dateTimeRangeList] = js.native
  
  /**
    * A list of entity ARNs (unique identifiers).
    */
  var entityArns: js.UndefOr[entityArnList] = js.native
  
  /**
    * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
    */
  var entityValues: js.UndefOr[entityValueList] = js.native
  
  /**
    * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
    */
  var eventArns: js.UndefOr[eventArnList] = js.native
  
  /**
    * A list of event status codes.
    */
  var eventStatusCodes: js.UndefOr[eventStatusCodeList] = js.native
  
  /**
    * A list of event type category codes (issue, scheduledChange, or accountNotification).
    */
  var eventTypeCategories: js.UndefOr[eventTypeCategoryList] = js.native
  
  /**
    * A list of unique identifiers for event types. For example, "AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED". 
    */
  var eventTypeCodes: js.UndefOr[eventTypeList] = js.native
  
  /**
    * A list of dates and times that the event was last updated.
    */
  var lastUpdatedTimes: js.UndefOr[dateTimeRangeList] = js.native
  
  /**
    * A list of AWS regions.
    */
  var regions: js.UndefOr[regionList] = js.native
  
  /**
    * The AWS services associated with the event. For example, EC2, RDS.
    */
  var services: js.UndefOr[serviceList] = js.native
  
  /**
    * A list of dates and times that the event began.
    */
  var startTimes: js.UndefOr[dateTimeRangeList] = js.native
  
  /**
    * A map of entity tags attached to the affected entity.  Currently, the tags property isn't supported. 
    */
  var tags: js.UndefOr[tagFilter] = js.native
}
object EventFilter {
  
  @scala.inline
  def apply(): EventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventFilter]
  }
  
  @scala.inline
  implicit class EventFilterMutableBuilder[Self <: EventFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: availabilityZones): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: availabilityZone*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setEndTimes(value: dateTimeRangeList): Self = StObject.set(x, "endTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimesUndefined: Self = StObject.set(x, "endTimes", js.undefined)
    
    @scala.inline
    def setEndTimesVarargs(value: DateTimeRange*): Self = StObject.set(x, "endTimes", js.Array(value :_*))
    
    @scala.inline
    def setEntityArns(value: entityArnList): Self = StObject.set(x, "entityArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityArnsUndefined: Self = StObject.set(x, "entityArns", js.undefined)
    
    @scala.inline
    def setEntityArnsVarargs(value: entityArn*): Self = StObject.set(x, "entityArns", js.Array(value :_*))
    
    @scala.inline
    def setEntityValues(value: entityValueList): Self = StObject.set(x, "entityValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityValuesUndefined: Self = StObject.set(x, "entityValues", js.undefined)
    
    @scala.inline
    def setEntityValuesVarargs(value: entityValue*): Self = StObject.set(x, "entityValues", js.Array(value :_*))
    
    @scala.inline
    def setEventArns(value: eventArnList): Self = StObject.set(x, "eventArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventArnsUndefined: Self = StObject.set(x, "eventArns", js.undefined)
    
    @scala.inline
    def setEventArnsVarargs(value: eventArn*): Self = StObject.set(x, "eventArns", js.Array(value :_*))
    
    @scala.inline
    def setEventStatusCodes(value: eventStatusCodeList): Self = StObject.set(x, "eventStatusCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventStatusCodesUndefined: Self = StObject.set(x, "eventStatusCodes", js.undefined)
    
    @scala.inline
    def setEventStatusCodesVarargs(value: eventStatusCode*): Self = StObject.set(x, "eventStatusCodes", js.Array(value :_*))
    
    @scala.inline
    def setEventTypeCategories(value: eventTypeCategoryList): Self = StObject.set(x, "eventTypeCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeCategoriesUndefined: Self = StObject.set(x, "eventTypeCategories", js.undefined)
    
    @scala.inline
    def setEventTypeCategoriesVarargs(value: eventTypeCategory*): Self = StObject.set(x, "eventTypeCategories", js.Array(value :_*))
    
    @scala.inline
    def setEventTypeCodes(value: eventTypeList): Self = StObject.set(x, "eventTypeCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeCodesUndefined: Self = StObject.set(x, "eventTypeCodes", js.undefined)
    
    @scala.inline
    def setEventTypeCodesVarargs(value: eventType*): Self = StObject.set(x, "eventTypeCodes", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdatedTimes(value: dateTimeRangeList): Self = StObject.set(x, "lastUpdatedTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimesUndefined: Self = StObject.set(x, "lastUpdatedTimes", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimesVarargs(value: DateTimeRange*): Self = StObject.set(x, "lastUpdatedTimes", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: regionList): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: region*): Self = StObject.set(x, "regions", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: serviceList): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: service*): Self = StObject.set(x, "services", js.Array(value :_*))
    
    @scala.inline
    def setStartTimes(value: dateTimeRangeList): Self = StObject.set(x, "startTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimesUndefined: Self = StObject.set(x, "startTimes", js.undefined)
    
    @scala.inline
    def setStartTimesVarargs(value: DateTimeRange*): Self = StObject.set(x, "startTimes", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: tagFilter): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: tagSet*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
