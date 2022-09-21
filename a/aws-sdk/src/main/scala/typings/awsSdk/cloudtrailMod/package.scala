package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.insight
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AdvancedEventSelectors = js.Array[AdvancedEventSelector]

type AdvancedFieldSelectors = js.Array[AdvancedFieldSelector]

type Boolean = scala.Boolean

type ByteBuffer = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type ChannelArn = java.lang.String

type ChannelName = java.lang.String

type Channels = js.Array[Channel]

type DataResourceValues = js.Array[String]

type DataResources = js.Array[DataResource]

type Date = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EVENT_DATA_STORE
  - typings.awsSdk.awsSdkStrings.AWS_SERVICE
  - java.lang.String
*/
type DestinationType = _DestinationType | java.lang.String

type Destinations = js.Array[Destination]

type ErrorMessage = java.lang.String

type EventCategory = insight | java.lang.String

type EventDataStoreArn = java.lang.String

type EventDataStoreName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.PENDING_DELETION
  - java.lang.String
*/
type EventDataStoreStatus = _EventDataStoreStatus | java.lang.String

type EventDataStores = js.Array[EventDataStore]

type EventSelectors = js.Array[EventSelector]

type EventsList = js.Array[Event]

type ExcludeManagementEventSources = js.Array[String]

type ImportDestinations = js.Array[EventDataStoreArn]

type ImportFailureList = js.Array[ImportFailureListItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.RETRY
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - java.lang.String
*/
type ImportFailureStatus = _ImportFailureStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIALIZING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type ImportStatus = _ImportStatus | java.lang.String

type ImportsList = js.Array[ImportsListItem]

type InsightSelectors = js.Array[InsightSelector]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ApiCallRateInsight
  - typings.awsSdk.awsSdkStrings.ApiErrorRateInsight
  - java.lang.String
*/
type InsightType = _InsightType | java.lang.String

type Integer = Double

type ListChannelsMaxResultsCount = Double

type ListEventDataStoresMaxResultsCount = Double

type ListImportFailuresMaxResultsCount = Double

type ListImportsMaxResultsCount = Double

type ListQueriesMaxResultsCount = Double

type Location = java.lang.String

type Long = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EventId
  - typings.awsSdk.awsSdkStrings.EventName
  - typings.awsSdk.awsSdkStrings.ReadOnly_
  - typings.awsSdk.awsSdkStrings.Username_
  - typings.awsSdk.awsSdkStrings.ResourceType
  - typings.awsSdk.awsSdkStrings.ResourceName
  - typings.awsSdk.awsSdkStrings.EventSource
  - typings.awsSdk.awsSdkStrings.AccessKeyId
  - java.lang.String
*/
type LookupAttributeKey = _LookupAttributeKey | java.lang.String

type LookupAttributesList = js.Array[LookupAttribute]

type MaxQueryResults = Double

type MaxResults = Double

type NextToken = java.lang.String

type Operator = js.Array[OperatorValue]

type OperatorValue = java.lang.String

type PaginationToken = java.lang.String

type PublicKeyList = js.Array[PublicKey]

type Queries = js.Array[Query]

type QueryResultColumn = StringDictionary[QueryResultValue]

type QueryResultKey = java.lang.String

type QueryResultRow = js.Array[QueryResultColumn]

type QueryResultRows = js.Array[QueryResultRow]

type QueryResultValue = java.lang.String

type QueryStatement = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.FINISHED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - java.lang.String
*/
type QueryStatus = _QueryStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ReadOnly_
  - typings.awsSdk.awsSdkStrings.WriteOnly
  - typings.awsSdk.awsSdkStrings.All_
  - java.lang.String
*/
type ReadWriteType = _ReadWriteType | java.lang.String

type ResourceIdList = js.Array[String]

type ResourceList = js.Array[Resource]

type ResourceTagList = js.Array[ResourceTag]

type RetentionPeriod = Double

type SelectorField = java.lang.String

type SelectorName = java.lang.String

type Source = java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagValue = java.lang.String

type TagsList = js.Array[Tag]

type TerminationProtectionEnabled = scala.Boolean

type TrailList = js.Array[Trail]

type TrailNameList = js.Array[String]

type Trails = js.Array[TrailInfo]

type UUID = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2013-11-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
