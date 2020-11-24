package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventFilter extends js.Object {
  
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
  implicit class EventFilterOps[Self <: EventFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: availabilityZone*): Self = this.set("availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: availabilityZones): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("availabilityZones", js.undefined)
    
    @scala.inline
    def setEndTimesVarargs(value: DateTimeRange*): Self = this.set("endTimes", js.Array(value :_*))
    
    @scala.inline
    def setEndTimes(value: dateTimeRangeList): Self = this.set("endTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimes: Self = this.set("endTimes", js.undefined)
    
    @scala.inline
    def setEntityArnsVarargs(value: entityArn*): Self = this.set("entityArns", js.Array(value :_*))
    
    @scala.inline
    def setEntityArns(value: entityArnList): Self = this.set("entityArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityArns: Self = this.set("entityArns", js.undefined)
    
    @scala.inline
    def setEntityValuesVarargs(value: entityValue*): Self = this.set("entityValues", js.Array(value :_*))
    
    @scala.inline
    def setEntityValues(value: entityValueList): Self = this.set("entityValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityValues: Self = this.set("entityValues", js.undefined)
    
    @scala.inline
    def setEventArnsVarargs(value: eventArn*): Self = this.set("eventArns", js.Array(value :_*))
    
    @scala.inline
    def setEventArns(value: eventArnList): Self = this.set("eventArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventArns: Self = this.set("eventArns", js.undefined)
    
    @scala.inline
    def setEventStatusCodesVarargs(value: eventStatusCode*): Self = this.set("eventStatusCodes", js.Array(value :_*))
    
    @scala.inline
    def setEventStatusCodes(value: eventStatusCodeList): Self = this.set("eventStatusCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventStatusCodes: Self = this.set("eventStatusCodes", js.undefined)
    
    @scala.inline
    def setEventTypeCategoriesVarargs(value: eventTypeCategory*): Self = this.set("eventTypeCategories", js.Array(value :_*))
    
    @scala.inline
    def setEventTypeCategories(value: eventTypeCategoryList): Self = this.set("eventTypeCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTypeCategories: Self = this.set("eventTypeCategories", js.undefined)
    
    @scala.inline
    def setEventTypeCodesVarargs(value: eventType*): Self = this.set("eventTypeCodes", js.Array(value :_*))
    
    @scala.inline
    def setEventTypeCodes(value: eventTypeList): Self = this.set("eventTypeCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTypeCodes: Self = this.set("eventTypeCodes", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimesVarargs(value: DateTimeRange*): Self = this.set("lastUpdatedTimes", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdatedTimes(value: dateTimeRangeList): Self = this.set("lastUpdatedTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimes: Self = this.set("lastUpdatedTimes", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: region*): Self = this.set("regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: regionList): Self = this.set("regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: service*): Self = this.set("services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: serviceList): Self = this.set("services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
    
    @scala.inline
    def setStartTimesVarargs(value: DateTimeRange*): Self = this.set("startTimes", js.Array(value :_*))
    
    @scala.inline
    def setStartTimes(value: dateTimeRangeList): Self = this.set("startTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimes: Self = this.set("startTimes", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: tagSet*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: tagFilter): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
