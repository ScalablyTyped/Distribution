package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceType = java.lang.String

type ComplianceStatus = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InternalServiceException
  - typings.awsSdk.awsSdkStrings.InvalidParameterException
  - java.lang.String
*/
type ErrorCode = typings.awsSdk.resourcegroupstaggingapiMod._ErrorCode | java.lang.String

type ErrorMessage = java.lang.String

type ExcludeCompliantResources = scala.Boolean

type FailedResourcesMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.resourcegroupstaggingapiMod.FailureInfo]

type GroupBy = js.Array[typings.awsSdk.resourcegroupstaggingapiMod.GroupByAttribute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TARGET_ID
  - typings.awsSdk.awsSdkStrings.REGION
  - typings.awsSdk.awsSdkStrings.RESOURCE_TYPE
  - java.lang.String
*/
type GroupByAttribute = typings.awsSdk.resourcegroupstaggingapiMod._GroupByAttribute | java.lang.String

type IncludeComplianceDetails = scala.Boolean

type LastUpdated = java.lang.String

type MaxResultsGetComplianceSummary = scala.Double

type NonCompliantResources = scala.Double

type PaginationToken = java.lang.String

type Region = java.lang.String

type RegionFilterList = js.Array[typings.awsSdk.resourcegroupstaggingapiMod.Region]

type ResourceARN = java.lang.String

type ResourceARNList = js.Array[typings.awsSdk.resourcegroupstaggingapiMod.ResourceARN]

type ResourceTagMappingList = js.Array[typings.awsSdk.resourcegroupstaggingapiMod.ResourceTagMapping]

type ResourceTypeFilterList = js.Array[typings.awsSdk.resourcegroupstaggingapiMod.AmazonResourceType]

type ResourcesPerPage = scala.Double

type S3Bucket = java.lang.String

type S3Location = java.lang.String

type Status = java.lang.String

type StatusCode = scala.Double

type SummaryList = js.Array[typings.awsSdk.resourcegroupstaggingapiMod.Summary]

type TagFilterList = js.Array[typings.awsSdk.resourcegroupstaggingapiMod.TagFilter]

type TagKey = java.lang.String

type TagKeyFilterList = js.Array[typings.awsSdk.resourcegroupstaggingapiMod.TagKey]

type TagKeyList = js.Array[typings.awsSdk.resourcegroupstaggingapiMod.TagKey]

type TagKeyListForUntag = js.Array[typings.awsSdk.resourcegroupstaggingapiMod.TagKey]

type TagList = js.Array[typings.awsSdk.resourcegroupstaggingapiMod.Tag]

type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.resourcegroupstaggingapiMod.TagValue]

type TagValue = java.lang.String

type TagValueList = js.Array[typings.awsSdk.resourcegroupstaggingapiMod.TagValue]

type TagValuesOutputList = js.Array[typings.awsSdk.resourcegroupstaggingapiMod.TagValue]

type TagsPerPage = scala.Double

type TargetId = java.lang.String

type TargetIdFilterList = js.Array[typings.awsSdk.resourcegroupstaggingapiMod.TargetId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCOUNT
  - typings.awsSdk.awsSdkStrings.OU
  - typings.awsSdk.awsSdkStrings.ROOT
  - java.lang.String
*/
type TargetIdType = typings.awsSdk.resourcegroupstaggingapiMod._TargetIdType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-01-26`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.resourcegroupstaggingapiMod._apiVersion | java.lang.String
