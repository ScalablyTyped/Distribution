package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ClientRequestToken = java.lang.String

type CreatedTimestamp = typings.std.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BASIC
  - typings.awsSdk.awsSdkStrings.FULL
  - java.lang.String
*/
type DetailType = typings.awsSdk.codestarnotificationsMod._DetailType | java.lang.String

type EventTypeBatch = js.Array[typings.awsSdk.codestarnotificationsMod.EventTypeSummary]

type EventTypeId = java.lang.String

type EventTypeIds = js.Array[typings.awsSdk.codestarnotificationsMod.EventTypeId]

type EventTypeName = java.lang.String

type ForceUnsubscribeAll = scala.Boolean

type LastModifiedTimestamp = typings.std.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RESOURCE_TYPE
  - typings.awsSdk.awsSdkStrings.SERVICE_NAME
  - java.lang.String
*/
type ListEventTypesFilterName = typings.awsSdk.codestarnotificationsMod._ListEventTypesFilterName | java.lang.String

type ListEventTypesFilterValue = java.lang.String

type ListEventTypesFilters = js.Array[typings.awsSdk.codestarnotificationsMod.ListEventTypesFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EVENT_TYPE_ID
  - typings.awsSdk.awsSdkStrings.CREATED_BY
  - typings.awsSdk.awsSdkStrings.RESOURCE
  - typings.awsSdk.awsSdkStrings.TARGET_ADDRESS
  - java.lang.String
*/
type ListNotificationRulesFilterName = typings.awsSdk.codestarnotificationsMod._ListNotificationRulesFilterName | java.lang.String

type ListNotificationRulesFilterValue = java.lang.String

type ListNotificationRulesFilters = js.Array[typings.awsSdk.codestarnotificationsMod.ListNotificationRulesFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TARGET_TYPE
  - typings.awsSdk.awsSdkStrings.TARGET_ADDRESS
  - typings.awsSdk.awsSdkStrings.TARGET_STATUS
  - java.lang.String
*/
type ListTargetsFilterName = typings.awsSdk.codestarnotificationsMod._ListTargetsFilterName | java.lang.String

type ListTargetsFilterValue = java.lang.String

type ListTargetsFilters = js.Array[typings.awsSdk.codestarnotificationsMod.ListTargetsFilter]

type MaxResults = scala.Double

type NextToken = java.lang.String

type NotificationRuleArn = java.lang.String

type NotificationRuleBatch = js.Array[typings.awsSdk.codestarnotificationsMod.NotificationRuleSummary]

type NotificationRuleCreatedBy = java.lang.String

type NotificationRuleId = java.lang.String

type NotificationRuleName = java.lang.String

type NotificationRuleResource = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type NotificationRuleStatus = typings.awsSdk.codestarnotificationsMod._NotificationRuleStatus | java.lang.String

type ResourceType = java.lang.String

type ServiceName = java.lang.String

type TagKey = java.lang.String

type TagKeys = js.Array[typings.awsSdk.codestarnotificationsMod.TagKey]

type TagValue = java.lang.String

type Tags = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codestarnotificationsMod.TagValue]

type TargetAddress = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UNREACHABLE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.DEACTIVATED
  - java.lang.String
*/
type TargetStatus = typings.awsSdk.codestarnotificationsMod._TargetStatus | java.lang.String

type TargetType = java.lang.String

type Targets = js.Array[typings.awsSdk.codestarnotificationsMod.Target]

type TargetsBatch = js.Array[typings.awsSdk.codestarnotificationsMod.TargetSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-10-15`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.codestarnotificationsMod._apiVersion | java.lang.String
