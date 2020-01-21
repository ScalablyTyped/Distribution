package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resourcegroupsMod {
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.resourcegroupsMod.ClientApiVersions
  type GroupArn = java.lang.String
  type GroupDescription = java.lang.String
  type GroupFilterList = js.Array[typings.awsSdk.resourcegroupsMod.GroupFilter]
  type GroupFilterName = typings.awsSdk.awsSdkStrings.`resource-type` | java.lang.String
  type GroupFilterValue = java.lang.String
  type GroupFilterValues = js.Array[typings.awsSdk.resourcegroupsMod.GroupFilterValue]
  type GroupIdentifierList = js.Array[typings.awsSdk.resourcegroupsMod.GroupIdentifier]
  type GroupList = js.Array[typings.awsSdk.resourcegroupsMod.Group]
  type GroupName = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type Query = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_INACTIVE
    - typings.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_NOT_EXISTING
    - java.lang.String
  */
  type QueryErrorCode = typings.awsSdk.resourcegroupsMod._QueryErrorCode | java.lang.String
  type QueryErrorList = js.Array[typings.awsSdk.resourcegroupsMod.QueryError]
  type QueryErrorMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TAG_FILTERS_1_0
    - typings.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_1_0
    - java.lang.String
  */
  type QueryType = typings.awsSdk.resourcegroupsMod._QueryType | java.lang.String
  type ResourceArn = java.lang.String
  type ResourceFilterList = js.Array[typings.awsSdk.resourcegroupsMod.ResourceFilter]
  type ResourceFilterName = typings.awsSdk.awsSdkStrings.`resource-type` | java.lang.String
  type ResourceFilterValue = java.lang.String
  type ResourceFilterValues = js.Array[typings.awsSdk.resourcegroupsMod.ResourceFilterValue]
  type ResourceIdentifierList = js.Array[typings.awsSdk.resourcegroupsMod.ResourceIdentifier]
  type ResourceType = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.resourcegroupsMod.TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.resourcegroupsMod.TagValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-11-27`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.resourcegroupsMod._apiVersion | java.lang.String
}
