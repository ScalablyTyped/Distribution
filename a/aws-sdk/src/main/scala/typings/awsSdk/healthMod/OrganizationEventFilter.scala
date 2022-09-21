package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationEventFilter extends StObject {
  
  /**
    * A list of 12-digit Amazon Web Services account numbers that contains the affected entities.
    */
  var awsAccountIds: js.UndefOr[awsAccountIdsList] = js.undefined
  
  var endTime: js.UndefOr[DateTimeRange] = js.undefined
  
  /**
    * A list of entity ARNs (unique identifiers).
    */
  var entityArns: js.UndefOr[entityArnList] = js.undefined
  
  /**
    * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
    */
  var entityValues: js.UndefOr[entityValueList] = js.undefined
  
  /**
    * A list of event status codes.
    */
  var eventStatusCodes: js.UndefOr[eventStatusCodeList] = js.undefined
  
  /**
    * A list of event type category codes. Possible values are issue, accountNotification, or scheduledChange. Currently, the investigation value isn't supported at this time.
    */
  var eventTypeCategories: js.UndefOr[eventTypeCategoryList] = js.undefined
  
  /**
    * A list of unique identifiers for event types. For example, "AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED". 
    */
  var eventTypeCodes: js.UndefOr[eventTypeList] = js.undefined
  
  var lastUpdatedTime: js.UndefOr[DateTimeRange] = js.undefined
  
  /**
    * A list of Amazon Web Services Regions.
    */
  var regions: js.UndefOr[regionList] = js.undefined
  
  /**
    * The Amazon Web Services services associated with the event. For example, EC2, RDS.
    */
  var services: js.UndefOr[serviceList] = js.undefined
  
  var startTime: js.UndefOr[DateTimeRange] = js.undefined
}
object OrganizationEventFilter {
  
  inline def apply(): OrganizationEventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationEventFilter]
  }
  
  extension [Self <: OrganizationEventFilter](x: Self) {
    
    inline def setAwsAccountIds(value: awsAccountIdsList): Self = StObject.set(x, "awsAccountIds", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdsUndefined: Self = StObject.set(x, "awsAccountIds", js.undefined)
    
    inline def setAwsAccountIdsVarargs(value: accountId*): Self = StObject.set(x, "awsAccountIds", js.Array(value*))
    
    inline def setEndTime(value: DateTimeRange): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEntityArns(value: entityArnList): Self = StObject.set(x, "entityArns", value.asInstanceOf[js.Any])
    
    inline def setEntityArnsUndefined: Self = StObject.set(x, "entityArns", js.undefined)
    
    inline def setEntityArnsVarargs(value: entityArn*): Self = StObject.set(x, "entityArns", js.Array(value*))
    
    inline def setEntityValues(value: entityValueList): Self = StObject.set(x, "entityValues", value.asInstanceOf[js.Any])
    
    inline def setEntityValuesUndefined: Self = StObject.set(x, "entityValues", js.undefined)
    
    inline def setEntityValuesVarargs(value: entityValue*): Self = StObject.set(x, "entityValues", js.Array(value*))
    
    inline def setEventStatusCodes(value: eventStatusCodeList): Self = StObject.set(x, "eventStatusCodes", value.asInstanceOf[js.Any])
    
    inline def setEventStatusCodesUndefined: Self = StObject.set(x, "eventStatusCodes", js.undefined)
    
    inline def setEventStatusCodesVarargs(value: eventStatusCode*): Self = StObject.set(x, "eventStatusCodes", js.Array(value*))
    
    inline def setEventTypeCategories(value: eventTypeCategoryList): Self = StObject.set(x, "eventTypeCategories", value.asInstanceOf[js.Any])
    
    inline def setEventTypeCategoriesUndefined: Self = StObject.set(x, "eventTypeCategories", js.undefined)
    
    inline def setEventTypeCategoriesVarargs(value: eventTypeCategory*): Self = StObject.set(x, "eventTypeCategories", js.Array(value*))
    
    inline def setEventTypeCodes(value: eventTypeList): Self = StObject.set(x, "eventTypeCodes", value.asInstanceOf[js.Any])
    
    inline def setEventTypeCodesUndefined: Self = StObject.set(x, "eventTypeCodes", js.undefined)
    
    inline def setEventTypeCodesVarargs(value: eventType*): Self = StObject.set(x, "eventTypeCodes", js.Array(value*))
    
    inline def setLastUpdatedTime(value: DateTimeRange): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setRegions(value: regionList): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: region*): Self = StObject.set(x, "regions", js.Array(value*))
    
    inline def setServices(value: serviceList): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: service*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setStartTime(value: DateTimeRange): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
