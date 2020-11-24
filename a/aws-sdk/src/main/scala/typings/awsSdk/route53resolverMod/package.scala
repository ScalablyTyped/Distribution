package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object route53resolverMod {
  
  type AccountId = java.lang.String
  
  type Arn = java.lang.String
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.route53resolverMod.ClientApiVersions
  
  type Count = scala.Double
  
  type CreatorRequestId = java.lang.String
  
  type DestinationArn = java.lang.String
  
  type DomainName = java.lang.String
  
  type FilterName = java.lang.String
  
  type FilterValue = java.lang.String
  
  type FilterValues = js.Array[typings.awsSdk.route53resolverMod.FilterValue]
  
  type Filters = js.Array[typings.awsSdk.route53resolverMod.Filter]
  
  type Ip = java.lang.String
  
  type IpAddressCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.FAILED_CREATION
    - typings.awsSdk.awsSdkStrings.ATTACHING
    - typings.awsSdk.awsSdkStrings.ATTACHED
    - typings.awsSdk.awsSdkStrings.REMAP_DETACHING
    - typings.awsSdk.awsSdkStrings.REMAP_ATTACHING
    - typings.awsSdk.awsSdkStrings.DETACHING
    - typings.awsSdk.awsSdkStrings.FAILED_RESOURCE_GONE
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.DELETE_FAILED_FAS_EXPIRED
    - java.lang.String
  */
  type IpAddressStatus = typings.awsSdk.route53resolverMod._IpAddressStatus | java.lang.String
  
  type IpAddressesRequest = js.Array[typings.awsSdk.route53resolverMod.IpAddressRequest]
  
  type IpAddressesResponse = js.Array[typings.awsSdk.route53resolverMod.IpAddressResponse]
  
  type MaxResults = scala.Double
  
  type Name = java.lang.String
  
  type NextToken = java.lang.String
  
  type Port = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INBOUND
    - typings.awsSdk.awsSdkStrings.OUTBOUND
    - java.lang.String
  */
  type ResolverEndpointDirection = typings.awsSdk.route53resolverMod._ResolverEndpointDirection | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.OPERATIONAL
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.AUTO_RECOVERING
    - typings.awsSdk.awsSdkStrings.ACTION_NEEDED
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ResolverEndpointStatus = typings.awsSdk.route53resolverMod._ResolverEndpointStatus | java.lang.String
  
  type ResolverEndpoints = js.Array[typings.awsSdk.route53resolverMod.ResolverEndpoint]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.DESTINATION_NOT_FOUND
    - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typings.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type ResolverQueryLogConfigAssociationError = typings.awsSdk.route53resolverMod._ResolverQueryLogConfigAssociationError | java.lang.String
  
  type ResolverQueryLogConfigAssociationErrorMessage = java.lang.String
  
  type ResolverQueryLogConfigAssociationList = js.Array[typings.awsSdk.route53resolverMod.ResolverQueryLogConfigAssociation]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.ACTION_NEEDED
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ResolverQueryLogConfigAssociationStatus = typings.awsSdk.route53resolverMod._ResolverQueryLogConfigAssociationStatus | java.lang.String
  
  type ResolverQueryLogConfigList = js.Array[typings.awsSdk.route53resolverMod.ResolverQueryLogConfig]
  
  type ResolverQueryLogConfigName = java.lang.String
  
  type ResolverQueryLogConfigPolicy = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.CREATED
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ResolverQueryLogConfigStatus = typings.awsSdk.route53resolverMod._ResolverQueryLogConfigStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.COMPLETE
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.OVERRIDDEN
    - java.lang.String
  */
  type ResolverRuleAssociationStatus = typings.awsSdk.route53resolverMod._ResolverRuleAssociationStatus | java.lang.String
  
  type ResolverRuleAssociations = js.Array[typings.awsSdk.route53resolverMod.ResolverRuleAssociation]
  
  type ResolverRulePolicy = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COMPLETE
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ResolverRuleStatus = typings.awsSdk.route53resolverMod._ResolverRuleStatus | java.lang.String
  
  type ResolverRules = js.Array[typings.awsSdk.route53resolverMod.ResolverRule]
  
  type ResourceId = java.lang.String
  
  type Rfc3339TimeString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FORWARD
    - typings.awsSdk.awsSdkStrings.SYSTEM
    - typings.awsSdk.awsSdkStrings.RECURSIVE
    - java.lang.String
  */
  type RuleTypeOption = typings.awsSdk.route53resolverMod._RuleTypeOption | java.lang.String
  
  type SecurityGroupIds = js.Array[typings.awsSdk.route53resolverMod.ResourceId]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NOT_SHARED
    - typings.awsSdk.awsSdkStrings.SHARED_WITH_ME
    - typings.awsSdk.awsSdkStrings.SHARED_BY_ME
    - java.lang.String
  */
  type ShareStatus = typings.awsSdk.route53resolverMod._ShareStatus | java.lang.String
  
  type SortByKey = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASCENDING
    - typings.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrder = typings.awsSdk.route53resolverMod._SortOrder | java.lang.String
  
  type StatusMessage = java.lang.String
  
  type SubnetId = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.route53resolverMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.route53resolverMod.Tag]
  
  type TagValue = java.lang.String
  
  type TargetList = js.Array[typings.awsSdk.route53resolverMod.TargetAddress]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-04-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.route53resolverMod._apiVersion | java.lang.String
}
