package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.PENDING
import typings.awsSdk.awsSdkStrings.`resource-type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Description = String

type ErrorCode = String

type ErrorMessage = String

type FailedResourceList = js.Array[FailedResource]

type GroupArn = String

type GroupConfigurationFailureReason = String

type GroupConfigurationList = js.Array[GroupConfigurationItem]

type GroupConfigurationParameterName = String

type GroupConfigurationParameterValue = String

type GroupConfigurationParameterValueList = js.Array[GroupConfigurationParameterValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.UPDATE_COMPLETE
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type GroupConfigurationStatus = _GroupConfigurationStatus | String

type GroupConfigurationType = String

type GroupFilterList = js.Array[GroupFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`resource-type`
  - typings.awsSdk.awsSdkStrings.`configuration-type`
  - java.lang.String
*/
type GroupFilterName = _GroupFilterName | String

type GroupFilterValue = String

type GroupFilterValues = js.Array[GroupFilterValue]

type GroupIdentifierList = js.Array[GroupIdentifier]

type GroupList = js.Array[Group]

type GroupName = String

type GroupParameterList = js.Array[GroupConfigurationParameter]

type GroupString = String

type ListGroupResourcesItemList = js.Array[ListGroupResourcesItem]

type MaxResults = Double

type NextToken = String

type PendingResourceList = js.Array[PendingResource]

type Query = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_INACTIVE
  - typings.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_NOT_EXISTING
  - java.lang.String
*/
type QueryErrorCode = _QueryErrorCode | String

type QueryErrorList = js.Array[QueryError]

type QueryErrorMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TAG_FILTERS_1_0
  - typings.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_1_0
  - java.lang.String
*/
type QueryType = _QueryType | String

type ResourceArn = String

type ResourceArnList = js.Array[ResourceArn]

type ResourceFilterList = js.Array[ResourceFilter]

type ResourceFilterName = `resource-type` | String

type ResourceFilterValue = String

type ResourceFilterValues = js.Array[ResourceFilterValue]

type ResourceIdentifierList = js.Array[ResourceIdentifier]

type ResourceStatusValue = PENDING | String

type ResourceType = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagValue = String

type Tags = StringDictionary[TagValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-11-27`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
