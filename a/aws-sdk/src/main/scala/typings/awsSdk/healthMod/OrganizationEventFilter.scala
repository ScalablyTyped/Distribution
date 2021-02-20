package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationEventFilter extends StObject {
  
  /**
    * A list of 12-digit AWS account numbers that contains the affected entities.
    */
  var awsAccountIds: js.UndefOr[awsAccountIdsList] = js.native
  
  var endTime: js.UndefOr[DateTimeRange] = js.native
  
  /**
    * A list of entity ARNs (unique identifiers).
    */
  var entityArns: js.UndefOr[entityArnList] = js.native
  
  /**
    * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
    */
  var entityValues: js.UndefOr[entityValueList] = js.native
  
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
  
  var lastUpdatedTime: js.UndefOr[DateTimeRange] = js.native
  
  /**
    * A list of AWS Regions.
    */
  var regions: js.UndefOr[regionList] = js.native
  
  /**
    * The AWS services associated with the event. For example, EC2, RDS.
    */
  var services: js.UndefOr[serviceList] = js.native
  
  var startTime: js.UndefOr[DateTimeRange] = js.native
}
object OrganizationEventFilter {
  
  @scala.inline
  def apply(): OrganizationEventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationEventFilter]
  }
  
  @scala.inline
  implicit class OrganizationEventFilterMutableBuilder[Self <: OrganizationEventFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountIds(value: awsAccountIdsList): Self = StObject.set(x, "awsAccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountIdsUndefined: Self = StObject.set(x, "awsAccountIds", js.undefined)
    
    @scala.inline
    def setAwsAccountIdsVarargs(value: accountId*): Self = StObject.set(x, "awsAccountIds", js.Array(value :_*))
    
    @scala.inline
    def setEndTime(value: DateTimeRange): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
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
    def setLastUpdatedTime(value: DateTimeRange): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
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
    def setStartTime(value: DateTimeRange): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
