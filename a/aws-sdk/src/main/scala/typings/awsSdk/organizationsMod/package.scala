package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object organizationsMod {
  type AccountArn = java.lang.String
  type AccountId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INVITED
    - typings.awsSdk.awsSdkStrings.CREATED
    - java.lang.String
  */
  type AccountJoinedMethod = typings.awsSdk.organizationsMod._AccountJoinedMethod | java.lang.String
  type AccountName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.SUSPENDED
    - java.lang.String
  */
  type AccountStatus = typings.awsSdk.organizationsMod._AccountStatus | java.lang.String
  type Accounts = js.Array[typings.awsSdk.organizationsMod.Account]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INVITE
    - typings.awsSdk.awsSdkStrings.ENABLE_ALL_FEATURES
    - typings.awsSdk.awsSdkStrings.APPROVE_ALL_FEATURES
    - typings.awsSdk.awsSdkStrings.ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE
    - java.lang.String
  */
  type ActionType = typings.awsSdk.organizationsMod._ActionType | java.lang.String
  type AwsManagedPolicy = scala.Boolean
  type ChildId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACCOUNT
    - typings.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
    - java.lang.String
  */
  type ChildType = typings.awsSdk.organizationsMod._ChildType | java.lang.String
  type Children = js.Array[typings.awsSdk.organizationsMod.Child]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.organizationsMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACCOUNT_LIMIT_EXCEEDED
    - typings.awsSdk.awsSdkStrings.EMAIL_ALREADY_EXISTS
    - typings.awsSdk.awsSdkStrings.INVALID_ADDRESS
    - typings.awsSdk.awsSdkStrings.INVALID_EMAIL
    - typings.awsSdk.awsSdkStrings.CONCURRENT_ACCOUNT_MODIFICATION
    - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
    - typings.awsSdk.awsSdkStrings.GOVCLOUD_ACCOUNT_ALREADY_EXISTS
    - java.lang.String
  */
  type CreateAccountFailureReason = typings.awsSdk.organizationsMod._CreateAccountFailureReason | java.lang.String
  type CreateAccountRequestId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CreateAccountState = typings.awsSdk.organizationsMod._CreateAccountState | java.lang.String
  type CreateAccountStates = js.Array[typings.awsSdk.organizationsMod.CreateAccountState]
  type CreateAccountStatuses = js.Array[typings.awsSdk.organizationsMod.CreateAccountStatus]
  type DelegatedAdministrators = js.Array[typings.awsSdk.organizationsMod.DelegatedAdministrator]
  type DelegatedServices = js.Array[typings.awsSdk.organizationsMod.DelegatedService]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TAG_POLICY
    - typings.awsSdk.awsSdkStrings.BACKUP_POLICY
    - java.lang.String
  */
  type EffectivePolicyType = typings.awsSdk.organizationsMod._EffectivePolicyType | java.lang.String
  type Email = java.lang.String
  type EnabledServicePrincipals = js.Array[typings.awsSdk.organizationsMod.EnabledServicePrincipal]
  type GenericArn = java.lang.String
  type HandshakeArn = java.lang.String
  type HandshakeId = java.lang.String
  type HandshakeNotes = java.lang.String
  type HandshakeParties = js.Array[typings.awsSdk.organizationsMod.HandshakeParty]
  type HandshakePartyId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACCOUNT
    - typings.awsSdk.awsSdkStrings.ORGANIZATION
    - typings.awsSdk.awsSdkStrings.EMAIL
    - java.lang.String
  */
  type HandshakePartyType = typings.awsSdk.organizationsMod._HandshakePartyType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACCOUNT
    - typings.awsSdk.awsSdkStrings.ORGANIZATION
    - typings.awsSdk.awsSdkStrings.ORGANIZATION_FEATURE_SET
    - typings.awsSdk.awsSdkStrings.EMAIL
    - typings.awsSdk.awsSdkStrings.MASTER_EMAIL
    - typings.awsSdk.awsSdkStrings.MASTER_NAME
    - typings.awsSdk.awsSdkStrings.NOTES
    - typings.awsSdk.awsSdkStrings.PARENT_HANDSHAKE
    - java.lang.String
  */
  type HandshakeResourceType = typings.awsSdk.organizationsMod._HandshakeResourceType | java.lang.String
  type HandshakeResourceValue = java.lang.String
  type HandshakeResources = js.Array[typings.awsSdk.organizationsMod.HandshakeResource]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.REQUESTED
    - typings.awsSdk.awsSdkStrings.OPEN
    - typings.awsSdk.awsSdkStrings.CANCELED
    - typings.awsSdk.awsSdkStrings.ACCEPTED
    - typings.awsSdk.awsSdkStrings.DECLINED
    - typings.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type HandshakeState = typings.awsSdk.organizationsMod._HandshakeState | java.lang.String
  type Handshakes = js.Array[typings.awsSdk.organizationsMod.Handshake]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALLOW
    - typings.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type IAMUserAccessToBilling = typings.awsSdk.organizationsMod._IAMUserAccessToBilling | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type OrganizationArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL
    - typings.awsSdk.awsSdkStrings.CONSOLIDATED_BILLING
    - java.lang.String
  */
  type OrganizationFeatureSet = typings.awsSdk.organizationsMod._OrganizationFeatureSet | java.lang.String
  type OrganizationId = java.lang.String
  type OrganizationalUnitArn = java.lang.String
  type OrganizationalUnitId = java.lang.String
  type OrganizationalUnitName = java.lang.String
  type OrganizationalUnits = js.Array[typings.awsSdk.organizationsMod.OrganizationalUnit]
  type ParentId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ROOT
    - typings.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
    - java.lang.String
  */
  type ParentType = typings.awsSdk.organizationsMod._ParentType | java.lang.String
  type Parents = js.Array[typings.awsSdk.organizationsMod.Parent]
  type Policies = js.Array[typings.awsSdk.organizationsMod.PolicySummary]
  type PolicyArn = java.lang.String
  type PolicyContent = java.lang.String
  type PolicyDescription = java.lang.String
  type PolicyId = java.lang.String
  type PolicyName = java.lang.String
  type PolicyTargetId = java.lang.String
  type PolicyTargets = js.Array[typings.awsSdk.organizationsMod.PolicyTargetSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SERVICE_CONTROL_POLICY
    - typings.awsSdk.awsSdkStrings.TAG_POLICY
    - typings.awsSdk.awsSdkStrings.BACKUP_POLICY
    - java.lang.String
  */
  type PolicyType = typings.awsSdk.organizationsMod._PolicyType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.PENDING_ENABLE
    - typings.awsSdk.awsSdkStrings.PENDING_DISABLE
    - java.lang.String
  */
  type PolicyTypeStatus = typings.awsSdk.organizationsMod._PolicyTypeStatus | java.lang.String
  type PolicyTypes = js.Array[typings.awsSdk.organizationsMod.PolicyTypeSummary]
  type RoleName = java.lang.String
  type RootArn = java.lang.String
  type RootId = java.lang.String
  type RootName = java.lang.String
  type Roots = js.Array[typings.awsSdk.organizationsMod.Root]
  type ServicePrincipal = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[typings.awsSdk.organizationsMod.TagKey]
  type TagValue = java.lang.String
  type TaggableResourceId = java.lang.String
  type Tags = js.Array[typings.awsSdk.organizationsMod.Tag]
  type TargetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACCOUNT
    - typings.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
    - typings.awsSdk.awsSdkStrings.ROOT
    - java.lang.String
  */
  type TargetType = typings.awsSdk.organizationsMod._TargetType | java.lang.String
  type Timestamp = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-11-28`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.organizationsMod._apiVersion | java.lang.String
}
