package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object healthMod {
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.healthMod.ClientApiVersions
  
  type DescribeAffectedEntitiesForOrganizationFailedSet = js.Array[typings.awsSdk.healthMod.OrganizationAffectedEntitiesErrorItem]
  
  type DescribeEventDetailsFailedSet = js.Array[typings.awsSdk.healthMod.EventDetailsErrorItem]
  
  type DescribeEventDetailsForOrganizationFailedSet = js.Array[typings.awsSdk.healthMod.OrganizationEventDetailsErrorItem]
  
  type DescribeEventDetailsForOrganizationSuccessfulSet = js.Array[typings.awsSdk.healthMod.OrganizationEventDetails]
  
  type DescribeEventDetailsSuccessfulSet = js.Array[typings.awsSdk.healthMod.EventDetails]
  
  type EntityAggregateList = js.Array[typings.awsSdk.healthMod.EntityAggregate]
  
  type EntityList = js.Array[typings.awsSdk.healthMod.AffectedEntity]
  
  type EventAggregateList = js.Array[typings.awsSdk.healthMod.EventAggregate]
  
  type EventArnsList = js.Array[typings.awsSdk.healthMod.eventArn]
  
  type EventList = js.Array[typings.awsSdk.healthMod.Event]
  
  type EventTypeCategoryList_ = js.Array[typings.awsSdk.healthMod.eventTypeCategory]
  
  type EventTypeCodeList = js.Array[typings.awsSdk.healthMod.eventTypeCode]
  
  type EventTypeList_ = js.Array[typings.awsSdk.healthMod.EventType_]
  
  type OrganizationEntityFiltersList = js.Array[typings.awsSdk.healthMod.EventAccountFilter]
  
  type OrganizationEventDetailFiltersList = js.Array[typings.awsSdk.healthMod.EventAccountFilter]
  
  type OrganizationEventList = js.Array[typings.awsSdk.healthMod.OrganizationEvent]
  
  type accountId = java.lang.String
  
  type affectedAccountsList = js.Array[typings.awsSdk.healthMod.accountId]
  
  type aggregateValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-08-04`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.healthMod._apiVersion | java.lang.String
  
  type availabilityZone = java.lang.String
  
  type availabilityZones = js.Array[typings.awsSdk.healthMod.availabilityZone]
  
  type awsAccountIdsList = js.Array[typings.awsSdk.healthMod.accountId]
  
  type count = scala.Double
  
  type dateTimeRangeList = js.Array[typings.awsSdk.healthMod.DateTimeRange]
  
  type entityArn = java.lang.String
  
  type entityArnList = js.Array[typings.awsSdk.healthMod.entityArn]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IMPAIRED
    - typings.awsSdk.awsSdkStrings.UNIMPAIRED
    - typings.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type entityStatusCode = typings.awsSdk.healthMod._entityStatusCode | java.lang.String
  
  type entityStatusCodeList = js.Array[typings.awsSdk.healthMod.entityStatusCode]
  
  type entityUrl = java.lang.String
  
  type entityValue = java.lang.String
  
  type entityValueList = js.Array[typings.awsSdk.healthMod.entityValue]
  
  type eventAggregateField = typings.awsSdk.awsSdkStrings.eventTypeCategory | java.lang.String
  
  type eventArn = java.lang.String
  
  type eventArnList = js.Array[typings.awsSdk.healthMod.eventArn]
  
  type eventDescription = java.lang.String
  
  type eventMetadata = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.healthMod.metadataValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PUBLIC
    - typings.awsSdk.awsSdkStrings.ACCOUNT_SPECIFIC
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type eventScopeCode = typings.awsSdk.healthMod._eventScopeCode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.open__
    - typings.awsSdk.awsSdkStrings.closed__
    - typings.awsSdk.awsSdkStrings.upcoming
    - java.lang.String
  */
  type eventStatusCode = typings.awsSdk.healthMod._eventStatusCode | java.lang.String
  
  type eventStatusCodeList = js.Array[typings.awsSdk.healthMod.eventStatusCode]
  
  type eventType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.issue
    - typings.awsSdk.awsSdkStrings.accountNotification
    - typings.awsSdk.awsSdkStrings.scheduledChange
    - typings.awsSdk.awsSdkStrings.investigation
    - java.lang.String
  */
  type eventTypeCategory = typings.awsSdk.healthMod._eventTypeCategory | java.lang.String
  
  type eventTypeCategoryList = js.Array[typings.awsSdk.healthMod.eventTypeCategory]
  
  type eventTypeCode = java.lang.String
  
  type eventTypeList = js.Array[typings.awsSdk.healthMod.eventType]
  
  type healthServiceAccessStatusForOrganization = java.lang.String
  
  type locale = java.lang.String
  
  type maxResults = scala.Double
  
  type metadataKey = java.lang.String
  
  type metadataValue = java.lang.String
  
  type nextToken = java.lang.String
  
  type region = java.lang.String
  
  type regionList = js.Array[typings.awsSdk.healthMod.region]
  
  type service = java.lang.String
  
  type serviceList = js.Array[typings.awsSdk.healthMod.service]
  
  type tagFilter = js.Array[typings.awsSdk.healthMod.tagSet]
  
  type tagKey = java.lang.String
  
  type tagSet = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.healthMod.tagValue]
  
  type tagValue = java.lang.String
  
  type timestamp = typings.std.Date
}
