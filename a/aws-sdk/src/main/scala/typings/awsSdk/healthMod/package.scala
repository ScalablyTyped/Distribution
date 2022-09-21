package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DescribeAffectedEntitiesForOrganizationFailedSet = js.Array[OrganizationAffectedEntitiesErrorItem]

type DescribeEventDetailsFailedSet = js.Array[EventDetailsErrorItem]

type DescribeEventDetailsForOrganizationFailedSet = js.Array[OrganizationEventDetailsErrorItem]

type DescribeEventDetailsForOrganizationSuccessfulSet = js.Array[OrganizationEventDetails]

type DescribeEventDetailsSuccessfulSet = js.Array[EventDetails]

type EntityAggregateList = js.Array[EntityAggregate]

type EntityList = js.Array[AffectedEntity]

type EventAggregateList = js.Array[EventAggregate]

type EventArnsList = js.Array[eventArn]

type EventList = js.Array[Event]

type EventTypeCategoryList_ = js.Array[eventTypeCategory]

type EventTypeCodeList = js.Array[eventTypeCode]

type EventTypeList_ = js.Array[EventType_]

type OrganizationEntityFiltersList = js.Array[EventAccountFilter]

type OrganizationEventDetailFiltersList = js.Array[EventAccountFilter]

type OrganizationEventList = js.Array[OrganizationEvent]

type accountId = String

type affectedAccountsList = js.Array[accountId]

type aggregateValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-08-04`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type availabilityZone = String

type availabilityZones = js.Array[availabilityZone]

type awsAccountIdsList = js.Array[accountId]

type count = Double

type dateTimeRangeList = js.Array[DateTimeRange]

type entityArn = String

type entityArnList = js.Array[entityArn]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IMPAIRED
  - typings.awsSdk.awsSdkStrings.UNIMPAIRED
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type entityStatusCode = _entityStatusCode | String

type entityStatusCodeList = js.Array[entityStatusCode]

type entityUrl = String

type entityValue = String

type entityValueList = js.Array[entityValue]

type eventAggregateField = typings.awsSdk.awsSdkStrings.eventTypeCategory | String

type eventArn = String

type eventArnList = js.Array[eventArn]

type eventDescription = String

type eventMetadata = StringDictionary[metadataValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLIC
  - typings.awsSdk.awsSdkStrings.ACCOUNT_SPECIFIC
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type eventScopeCode = _eventScopeCode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.open__
  - typings.awsSdk.awsSdkStrings.closed__
  - typings.awsSdk.awsSdkStrings.upcoming
  - java.lang.String
*/
type eventStatusCode = _eventStatusCode | String

type eventStatusCodeList = js.Array[eventStatusCode]

type eventType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.issue
  - typings.awsSdk.awsSdkStrings.accountNotification
  - typings.awsSdk.awsSdkStrings.scheduledChange
  - typings.awsSdk.awsSdkStrings.investigation
  - java.lang.String
*/
type eventTypeCategory = _eventTypeCategory | String

type eventTypeCategoryList = js.Array[eventTypeCategory]

type eventTypeCode = String

type eventTypeList = js.Array[eventType]

type healthServiceAccessStatusForOrganization = String

type locale = String

type maxResults = Double

type maxResultsLowerRange = Double

type metadataKey = String

type metadataValue = String

type nextToken = String

type region = String

type regionList = js.Array[region]

type service = String

type serviceList = js.Array[service]

type tagFilter = js.Array[tagSet]

type tagKey = String

type tagSet = StringDictionary[tagValue]

type tagValue = String

type timestamp = js.Date
