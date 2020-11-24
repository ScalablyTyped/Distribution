package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ramMod {
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.ramMod.ClientApiVersions
  
  type DateTime = typings.std.Date
  
  type Integer = scala.Double
  
  type MaxResults = scala.Double
  
  type PermissionArnList = js.Array[typings.awsSdk.ramMod.String]
  
  type Policy = java.lang.String
  
  type PolicyList = js.Array[typings.awsSdk.ramMod.Policy]
  
  type PrincipalArnOrIdList = js.Array[typings.awsSdk.ramMod.String]
  
  type PrincipalList = js.Array[typings.awsSdk.ramMod.Principal]
  
  type ResourceArnList = js.Array[typings.awsSdk.ramMod.String]
  
  type ResourceList = js.Array[typings.awsSdk.ramMod.Resource]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SELF
    - typings.awsSdk.awsSdkStrings.`OTHER-ACCOUNTS`
    - java.lang.String
  */
  type ResourceOwner = typings.awsSdk.ramMod._ResourceOwner | java.lang.String
  
  type ResourceShareArnList = js.Array[typings.awsSdk.ramMod.String]
  
  type ResourceShareAssociationList = js.Array[typings.awsSdk.ramMod.ResourceShareAssociation]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASSOCIATING
    - typings.awsSdk.awsSdkStrings.ASSOCIATED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.DISASSOCIATING
    - typings.awsSdk.awsSdkStrings.DISASSOCIATED
    - java.lang.String
  */
  type ResourceShareAssociationStatus = typings.awsSdk.ramMod._ResourceShareAssociationStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PRINCIPAL
    - typings.awsSdk.awsSdkStrings.RESOURCE
    - java.lang.String
  */
  type ResourceShareAssociationType = typings.awsSdk.ramMod._ResourceShareAssociationType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATED_FROM_POLICY
    - typings.awsSdk.awsSdkStrings.PROMOTING_TO_STANDARD
    - typings.awsSdk.awsSdkStrings.STANDARD
    - java.lang.String
  */
  type ResourceShareFeatureSet = typings.awsSdk.ramMod._ResourceShareFeatureSet | java.lang.String
  
  type ResourceShareInvitationArnList = js.Array[typings.awsSdk.ramMod.String]
  
  type ResourceShareInvitationList = js.Array[typings.awsSdk.ramMod.ResourceShareInvitation]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.ACCEPTED
    - typings.awsSdk.awsSdkStrings.REJECTED
    - typings.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type ResourceShareInvitationStatus = typings.awsSdk.ramMod._ResourceShareInvitationStatus | java.lang.String
  
  type ResourceShareList = js.Array[typings.awsSdk.ramMod.ResourceShare]
  
  type ResourceSharePermissionList = js.Array[typings.awsSdk.ramMod.ResourceSharePermissionSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type ResourceShareStatus = typings.awsSdk.ramMod._ResourceShareStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.ZONAL_RESOURCE_INACCESSIBLE
    - typings.awsSdk.awsSdkStrings.LIMIT_EXCEEDED
    - typings.awsSdk.awsSdkStrings.UNAVAILABLE
    - typings.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type ResourceStatus = typings.awsSdk.ramMod._ResourceStatus | java.lang.String
  
  type ServiceNameAndResourceTypeList = js.Array[typings.awsSdk.ramMod.ServiceNameAndResourceType]
  
  type String = java.lang.String
  
  type TagFilters = js.Array[typings.awsSdk.ramMod.TagFilter]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.ramMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.ramMod.Tag]
  
  type TagValue = java.lang.String
  
  type TagValueList = js.Array[typings.awsSdk.ramMod.TagValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-01-04`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.ramMod._apiVersion | java.lang.String
}
