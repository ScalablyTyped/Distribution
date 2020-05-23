package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinpointMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OPEN_APP
    - typings.awsSdk.awsSdkStrings.DEEP_LINK
    - typings.awsSdk.awsSdkStrings.URL
    - java.lang.String
  */
  type Action = typings.awsSdk.pinpointMod._Action | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INCLUSIVE
    - typings.awsSdk.awsSdkStrings.EXCLUSIVE
    - java.lang.String
  */
  type AttributeType = typings.awsSdk.pinpointMod._AttributeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SCHEDULED
    - typings.awsSdk.awsSdkStrings.EXECUTING
    - typings.awsSdk.awsSdkStrings.PENDING_NEXT_RUN
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.PAUSED
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type CampaignStatus = typings.awsSdk.pinpointMod._CampaignStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GCM
    - typings.awsSdk.awsSdkStrings.APNS
    - typings.awsSdk.awsSdkStrings.APNS_SANDBOX
    - typings.awsSdk.awsSdkStrings.APNS_VOIP
    - typings.awsSdk.awsSdkStrings.APNS_VOIP_SANDBOX
    - typings.awsSdk.awsSdkStrings.ADM
    - typings.awsSdk.awsSdkStrings.SMS
    - typings.awsSdk.awsSdkStrings.VOICE
    - typings.awsSdk.awsSdkStrings.EMAIL
    - typings.awsSdk.awsSdkStrings.BAIDU
    - typings.awsSdk.awsSdkStrings.CUSTOM
    - java.lang.String
  */
  type ChannelType = typings.awsSdk.pinpointMod._ChannelType | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.pinpointMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUCCESSFUL
    - typings.awsSdk.awsSdkStrings.THROTTLED
    - typings.awsSdk.awsSdkStrings.TEMPORARY_FAILURE
    - typings.awsSdk.awsSdkStrings.PERMANENT_FAILURE
    - typings.awsSdk.awsSdkStrings.UNKNOWN_FAILURE
    - typings.awsSdk.awsSdkStrings.OPT_OUT
    - typings.awsSdk.awsSdkStrings.DUPLICATE
    - java.lang.String
  */
  type DeliveryStatus = typings.awsSdk.pinpointMod._DeliveryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INCLUSIVE
    - typings.awsSdk.awsSdkStrings.EXCLUSIVE
    - java.lang.String
  */
  type DimensionType = typings.awsSdk.pinpointMod._DimensionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HR_24
    - typings.awsSdk.awsSdkStrings.DAY_7
    - typings.awsSdk.awsSdkStrings.DAY_14
    - typings.awsSdk.awsSdkStrings.DAY_30
    - java.lang.String
  */
  type Duration = typings.awsSdk.pinpointMod._Duration | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GCM
    - typings.awsSdk.awsSdkStrings.APNS
    - typings.awsSdk.awsSdkStrings.APNS_SANDBOX
    - typings.awsSdk.awsSdkStrings.APNS_VOIP
    - typings.awsSdk.awsSdkStrings.APNS_VOIP_SANDBOX
    - typings.awsSdk.awsSdkStrings.ADM
    - typings.awsSdk.awsSdkStrings.SMS
    - typings.awsSdk.awsSdkStrings.VOICE
    - typings.awsSdk.awsSdkStrings.EMAIL
    - typings.awsSdk.awsSdkStrings.BAIDU
    - typings.awsSdk.awsSdkStrings.CUSTOM
    - java.lang.String
  */
  type EndpointTypesElement = typings.awsSdk.pinpointMod._EndpointTypesElement | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SYSTEM
    - typings.awsSdk.awsSdkStrings.ENDPOINT
    - java.lang.String
  */
  type FilterType = typings.awsSdk.pinpointMod._FilterType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CSV
    - typings.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type Format = typings.awsSdk.pinpointMod._Format | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ONCE
    - typings.awsSdk.awsSdkStrings.HOURLY
    - typings.awsSdk.awsSdkStrings.DAILY
    - typings.awsSdk.awsSdkStrings.WEEKLY
    - typings.awsSdk.awsSdkStrings.MONTHLY
    - typings.awsSdk.awsSdkStrings.EVENT
    - java.lang.String
  */
  type Frequency = typings.awsSdk.pinpointMod._Frequency | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL
    - typings.awsSdk.awsSdkStrings.ANY
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type Include = typings.awsSdk.pinpointMod._Include | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATED
    - typings.awsSdk.awsSdkStrings.PREPARING_FOR_INITIALIZATION
    - typings.awsSdk.awsSdkStrings.INITIALIZING
    - typings.awsSdk.awsSdkStrings.PROCESSING
    - typings.awsSdk.awsSdkStrings.PENDING_JOB
    - typings.awsSdk.awsSdkStrings.COMPLETING
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILING
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type JobStatus = typings.awsSdk.pinpointMod._JobStatus | java.lang.String
  type ListOfActivityResponse = js.Array[typings.awsSdk.pinpointMod.ActivityResponse]
  type ListOfApplicationResponse = js.Array[typings.awsSdk.pinpointMod.ApplicationResponse]
  type ListOfCampaignResponse = js.Array[typings.awsSdk.pinpointMod.CampaignResponse]
  type ListOfEndpointBatchItem = js.Array[typings.awsSdk.pinpointMod.EndpointBatchItem]
  type ListOfEndpointResponse = js.Array[typings.awsSdk.pinpointMod.EndpointResponse]
  type ListOfEndpointTypesElement = js.Array[typings.awsSdk.pinpointMod.EndpointTypesElement]
  type ListOfExportJobResponse = js.Array[typings.awsSdk.pinpointMod.ExportJobResponse]
  type ListOfImportJobResponse = js.Array[typings.awsSdk.pinpointMod.ImportJobResponse]
  type ListOfJourneyResponse = js.Array[typings.awsSdk.pinpointMod.JourneyResponse]
  type ListOfMultiConditionalBranch = js.Array[typings.awsSdk.pinpointMod.MultiConditionalBranch]
  type ListOfRandomSplitEntry = js.Array[typings.awsSdk.pinpointMod.RandomSplitEntry]
  type ListOfRecommenderConfigurationResponse = js.Array[typings.awsSdk.pinpointMod.RecommenderConfigurationResponse]
  type ListOfResultRow = js.Array[typings.awsSdk.pinpointMod.ResultRow]
  type ListOfResultRowValue = js.Array[typings.awsSdk.pinpointMod.ResultRowValue]
  type ListOfSegmentDimensions = js.Array[typings.awsSdk.pinpointMod.SegmentDimensions]
  type ListOfSegmentGroup = js.Array[typings.awsSdk.pinpointMod.SegmentGroup]
  type ListOfSegmentReference = js.Array[typings.awsSdk.pinpointMod.SegmentReference]
  type ListOfSegmentResponse = js.Array[typings.awsSdk.pinpointMod.SegmentResponse]
  type ListOfSimpleCondition = js.Array[typings.awsSdk.pinpointMod.SimpleCondition]
  type ListOfString = js.Array[typings.awsSdk.pinpointMod.string]
  type ListOfTemplateResponse = js.Array[typings.awsSdk.pinpointMod.TemplateResponse]
  type ListOfTemplateVersionResponse = js.Array[typings.awsSdk.pinpointMod.TemplateVersionResponse]
  type ListOfTreatmentResource = js.Array[typings.awsSdk.pinpointMod.TreatmentResource]
  type ListOfWriteTreatmentResource = js.Array[typings.awsSdk.pinpointMod.WriteTreatmentResource]
  type MapOfActivity = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.Activity]
  type MapOfAddressConfiguration = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.AddressConfiguration]
  type MapOfAttributeDimension = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.AttributeDimension]
  type MapOfChannelResponse = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.ChannelResponse]
  type MapOfDouble = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.double]
  type MapOfEndpointMessageResult = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.EndpointMessageResult]
  type MapOfEndpointSendConfiguration = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.EndpointSendConfiguration]
  type MapOfEvent = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.Event]
  type MapOfEventItemResponse = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.EventItemResponse]
  type MapOfEventsBatch = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.EventsBatch]
  type MapOfInteger = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.integer]
  type MapOfItemResponse = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.ItemResponse]
  type MapOfListOfString = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.ListOfString]
  type MapOfMapOfEndpointMessageResult = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.MapOfEndpointMessageResult]
  type MapOfMessageResult = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.MessageResult]
  type MapOfMetricDimension = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.MetricDimension]
  type MapOfString = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.pinpointMod.string]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TRANSACTIONAL
    - typings.awsSdk.awsSdkStrings.PROMOTIONAL
    - java.lang.String
  */
  type MessageType = typings.awsSdk.pinpointMod._MessageType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DELIVERY
    - typings.awsSdk.awsSdkStrings.FILTER
    - java.lang.String
  */
  type Mode = typings.awsSdk.pinpointMod._Mode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL
    - typings.awsSdk.awsSdkStrings.ANY
    - java.lang.String
  */
  type Operator = typings.awsSdk.pinpointMod._Operator | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type RecencyType = typings.awsSdk.pinpointMod._RecencyType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DIMENSIONAL
    - typings.awsSdk.awsSdkStrings.IMPORT
    - java.lang.String
  */
  type SegmentType = typings.awsSdk.pinpointMod._SegmentType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL
    - typings.awsSdk.awsSdkStrings.ANY
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type SourceType = typings.awsSdk.pinpointMod._SourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DRAFT
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - typings.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type State = typings.awsSdk.pinpointMod._State | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EMAIL
    - typings.awsSdk.awsSdkStrings.SMS
    - typings.awsSdk.awsSdkStrings.VOICE
    - typings.awsSdk.awsSdkStrings.PUSH
    - java.lang.String
  */
  type TemplateType = typings.awsSdk.pinpointMod._TemplateType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL
    - typings.awsSdk.awsSdkStrings.ANY
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type Type = typings.awsSdk.pinpointMod._Type | java.lang.String
  type _Blob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.pinpointMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-12-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.pinpointMod._apiVersion | java.lang.String
  type boolean = scala.Boolean
  type double = scala.Double
  type integer = scala.Double
  type string = java.lang.String
  type timestampIso8601 = typings.std.Date
}
