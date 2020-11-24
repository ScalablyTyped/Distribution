package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object iamMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SERVICE_LEVEL
    - typings.awsSdk.awsSdkStrings.ACTION_LEVEL
    - java.lang.String
  */
  type AccessAdvisorUsageGranularityType = typings.awsSdk.iamMod._AccessAdvisorUsageGranularityType | java.lang.String
  
  type AccessDetails = js.Array[typings.awsSdk.iamMod.AccessDetail]
  
  type ActionNameListType = js.Array[typings.awsSdk.iamMod.ActionNameType]
  
  type ActionNameType = java.lang.String
  
  type ArnListType = js.Array[typings.awsSdk.iamMod.arnType]
  
  type BootstrapDatum = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.iamMod.Blob | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.iamMod.ClientApiVersions
  
  type ColumnNumber = scala.Double
  
  type ContextEntryListType = js.Array[typings.awsSdk.iamMod.ContextEntry]
  
  type ContextKeyNameType = java.lang.String
  
  type ContextKeyNamesResultListType = js.Array[typings.awsSdk.iamMod.ContextKeyNameType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.string__
    - typings.awsSdk.awsSdkStrings.stringList_
    - typings.awsSdk.awsSdkStrings.numeric
    - typings.awsSdk.awsSdkStrings.numericList
    - typings.awsSdk.awsSdkStrings.boolean__
    - typings.awsSdk.awsSdkStrings.booleanList
    - typings.awsSdk.awsSdkStrings.ip_
    - typings.awsSdk.awsSdkStrings.ipList
    - typings.awsSdk.awsSdkStrings.binary__
    - typings.awsSdk.awsSdkStrings.binaryList
    - typings.awsSdk.awsSdkStrings.date_
    - typings.awsSdk.awsSdkStrings.dateList
    - java.lang.String
  */
  type ContextKeyTypeEnum = typings.awsSdk.iamMod._ContextKeyTypeEnum | java.lang.String
  
  type ContextKeyValueListType = js.Array[typings.awsSdk.iamMod.ContextKeyValueType]
  
  type ContextKeyValueType = java.lang.String
  
  type DeletionTaskIdType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.NOT_STARTED
    - java.lang.String
  */
  type DeletionTaskStatusType = typings.awsSdk.iamMod._DeletionTaskStatusType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.User_
    - typings.awsSdk.awsSdkStrings.Role_
    - typings.awsSdk.awsSdkStrings.Group_
    - typings.awsSdk.awsSdkStrings.LocalManagedPolicy
    - typings.awsSdk.awsSdkStrings.AWSManagedPolicy
    - java.lang.String
  */
  type EntityType = typings.awsSdk.iamMod._EntityType | java.lang.String
  
  type EvalDecisionDetailsType = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iamMod.PolicyEvaluationDecisionType]
  
  type EvalDecisionSourceType = java.lang.String
  
  type EvaluationResultsListType = js.Array[typings.awsSdk.iamMod.EvaluationResult]
  
  type LineNumber = scala.Double
  
  type ManagedPolicyDetailListType = js.Array[typings.awsSdk.iamMod.ManagedPolicyDetail]
  
  type OpenIDConnectProviderListType = js.Array[typings.awsSdk.iamMod.OpenIDConnectProviderListEntry]
  
  type OpenIDConnectProviderUrlType = java.lang.String
  
  type PermissionsBoundaryAttachmentType = typings.awsSdk.awsSdkStrings.PermissionsBoundaryPolicy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.allowed__
    - typings.awsSdk.awsSdkStrings.explicitDeny
    - typings.awsSdk.awsSdkStrings.implicitDeny
    - java.lang.String
  */
  type PolicyEvaluationDecisionType = typings.awsSdk.iamMod._PolicyEvaluationDecisionType | java.lang.String
  
  type PolicyGroupListType = js.Array[typings.awsSdk.iamMod.PolicyGroup]
  
  type PolicyIdentifierType = java.lang.String
  
  type PolicyRoleListType = js.Array[typings.awsSdk.iamMod.PolicyRole]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.user__
    - typings.awsSdk.awsSdkStrings.group__
    - typings.awsSdk.awsSdkStrings.role__
    - typings.awsSdk.awsSdkStrings.`aws-managed`
    - typings.awsSdk.awsSdkStrings.`user-managed`
    - typings.awsSdk.awsSdkStrings.resource__
    - typings.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type PolicySourceType = typings.awsSdk.iamMod._PolicySourceType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PermissionsPolicy
    - typings.awsSdk.awsSdkStrings.PermissionsBoundary
    - java.lang.String
  */
  type PolicyUsageType = typings.awsSdk.iamMod._PolicyUsageType | java.lang.String
  
  type PolicyUserListType = js.Array[typings.awsSdk.iamMod.PolicyUser]
  
  type ReasonType = java.lang.String
  
  type RegionNameType = java.lang.String
  
  type ReportContentType = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.iamMod.Blob | java.lang.String
  
  type ReportFormatType = typings.awsSdk.awsSdkStrings.textSlashcsv | java.lang.String
  
  type ReportStateDescriptionType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STARTED
    - typings.awsSdk.awsSdkStrings.INPROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETE
    - java.lang.String
  */
  type ReportStateType = typings.awsSdk.iamMod._ReportStateType | java.lang.String
  
  type ResourceHandlingOptionType = java.lang.String
  
  type ResourceNameListType = js.Array[typings.awsSdk.iamMod.ResourceNameType]
  
  type ResourceNameType = java.lang.String
  
  type ResourceSpecificResultListType = js.Array[typings.awsSdk.iamMod.ResourceSpecificResult]
  
  type RoleUsageListType = js.Array[typings.awsSdk.iamMod.RoleUsageType]
  
  type SAMLMetadataDocumentType = java.lang.String
  
  type SAMLProviderListType = js.Array[typings.awsSdk.iamMod.SAMLProviderListEntry]
  
  type SAMLProviderNameType = java.lang.String
  
  type SSHPublicKeyListType = js.Array[typings.awsSdk.iamMod.SSHPublicKeyMetadata]
  
  type ServiceSpecificCredentialsListType = js.Array[typings.awsSdk.iamMod.ServiceSpecificCredentialMetadata]
  
  type ServicesLastAccessed = js.Array[typings.awsSdk.iamMod.ServiceLastAccessed]
  
  type SimulationPolicyListType = js.Array[typings.awsSdk.iamMod.policyDocumentType]
  
  type StatementListType = js.Array[typings.awsSdk.iamMod.Statement]
  
  type TrackedActionsLastAccessed = js.Array[typings.awsSdk.iamMod.TrackedActionLastAccessed]
  
  type accessKeyIdType = java.lang.String
  
  type accessKeyMetadataListType = js.Array[typings.awsSdk.iamMod.AccessKeyMetadata]
  
  type accessKeySecretType = java.lang.String
  
  type accountAliasListType = js.Array[typings.awsSdk.iamMod.accountAliasType]
  
  type accountAliasType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2010-05-08`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.iamMod._apiVersion | java.lang.String
  
  type arnType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Assigned_
    - typings.awsSdk.awsSdkStrings.Unassigned
    - typings.awsSdk.awsSdkStrings.Any_
    - java.lang.String
  */
  type assignmentStatusType = typings.awsSdk.iamMod._assignmentStatusType | java.lang.String
  
  type attachedPoliciesListType = js.Array[typings.awsSdk.iamMod.AttachedPolicy]
  
  type attachmentCountType = scala.Double
  
  type authenticationCodeType = java.lang.String
  
  type booleanObjectType = scala.Boolean
  
  type booleanType = scala.Boolean
  
  type certificateBodyType = java.lang.String
  
  type certificateChainType = java.lang.String
  
  type certificateIdType = java.lang.String
  
  type certificateListType = js.Array[typings.awsSdk.iamMod.SigningCertificate]
  
  type clientIDListType = js.Array[typings.awsSdk.iamMod.clientIDType]
  
  type clientIDType = java.lang.String
  
  type customSuffixType = java.lang.String
  
  type dateType = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SSH
    - typings.awsSdk.awsSdkStrings.PEM
    - java.lang.String
  */
  type encodingType = typings.awsSdk.iamMod._encodingType | java.lang.String
  
  type entityDetailsListType = js.Array[typings.awsSdk.iamMod.EntityDetails]
  
  type entityListType = js.Array[typings.awsSdk.iamMod.EntityType]
  
  type entityNameType = java.lang.String
  
  type existingUserNameType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.v1Token
    - typings.awsSdk.awsSdkStrings.v2Token
    - java.lang.String
  */
  type globalEndpointTokenVersion = typings.awsSdk.iamMod._globalEndpointTokenVersion | java.lang.String
  
  type groupDetailListType = js.Array[typings.awsSdk.iamMod.GroupDetail]
  
  type groupListType = js.Array[typings.awsSdk.iamMod.Group]
  
  type groupNameListType = js.Array[typings.awsSdk.iamMod.groupNameType]
  
  type groupNameType = java.lang.String
  
  type idType = java.lang.String
  
  type instanceProfileListType = js.Array[typings.awsSdk.iamMod.InstanceProfile]
  
  type instanceProfileNameType = java.lang.String
  
  type integerType = scala.Double
  
  type jobIDType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type jobStatusType = typings.awsSdk.iamMod._jobStatusType | java.lang.String
  
  type listPolicyGrantingServiceAccessResponseListType = js.Array[typings.awsSdk.iamMod.ListPoliciesGrantingServiceAccessEntry]
  
  type markerType = java.lang.String
  
  type maxItemsType = scala.Double
  
  type maxPasswordAgeType = scala.Double
  
  type mfaDeviceListType = js.Array[typings.awsSdk.iamMod.MFADevice]
  
  type minimumPasswordLengthType = scala.Double
  
  type organizationsEntityPathType = java.lang.String
  
  type organizationsPolicyIdType = java.lang.String
  
  type passwordReusePreventionType = scala.Double
  
  type passwordType = java.lang.String
  
  type pathPrefixType = java.lang.String
  
  type pathType = java.lang.String
  
  type policyDescriptionType = java.lang.String
  
  type policyDetailListType = js.Array[typings.awsSdk.iamMod.PolicyDetail]
  
  type policyDocumentType = java.lang.String
  
  type policyDocumentVersionListType = js.Array[typings.awsSdk.iamMod.PolicyVersion]
  
  type policyGrantingServiceAccessListType = js.Array[typings.awsSdk.iamMod.PolicyGrantingServiceAccess]
  
  type policyListType = js.Array[typings.awsSdk.iamMod.Policy]
  
  type policyNameListType = js.Array[typings.awsSdk.iamMod.policyNameType]
  
  type policyNameType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USER
    - typings.awsSdk.awsSdkStrings.ROLE
    - typings.awsSdk.awsSdkStrings.GROUP
    - java.lang.String
  */
  type policyOwnerEntityType = typings.awsSdk.iamMod._policyOwnerEntityType | java.lang.String
  
  type policyPathType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.All_
    - typings.awsSdk.awsSdkStrings.AWS
    - typings.awsSdk.awsSdkStrings.Local_
    - java.lang.String
  */
  type policyScopeType = typings.awsSdk.iamMod._policyScopeType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INLINE
    - typings.awsSdk.awsSdkStrings.MANAGED
    - java.lang.String
  */
  type policyType = typings.awsSdk.iamMod._policyType | java.lang.String
  
  type policyVersionIdType = java.lang.String
  
  type privateKeyType = java.lang.String
  
  type publicKeyFingerprintType = java.lang.String
  
  type publicKeyIdType = java.lang.String
  
  type publicKeyMaterialType = java.lang.String
  
  type responseMarkerType = java.lang.String
  
  type roleDescriptionType = java.lang.String
  
  type roleDetailListType = js.Array[typings.awsSdk.iamMod.RoleDetail]
  
  type roleListType = js.Array[typings.awsSdk.iamMod.Role]
  
  type roleMaxSessionDurationType = scala.Double
  
  type roleNameType = java.lang.String
  
  type serialNumberType = java.lang.String
  
  type serverCertificateMetadataListType = js.Array[typings.awsSdk.iamMod.ServerCertificateMetadata]
  
  type serverCertificateNameType = java.lang.String
  
  type serviceName = java.lang.String
  
  type serviceNameType = java.lang.String
  
  type serviceNamespaceListType = js.Array[typings.awsSdk.iamMod.serviceNamespaceType]
  
  type serviceNamespaceType = java.lang.String
  
  type servicePassword = java.lang.String
  
  type serviceSpecificCredentialId = java.lang.String
  
  type serviceUserName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SERVICE_NAMESPACE_ASCENDING
    - typings.awsSdk.awsSdkStrings.SERVICE_NAMESPACE_DESCENDING
    - typings.awsSdk.awsSdkStrings.LAST_AUTHENTICATED_TIME_ASCENDING
    - typings.awsSdk.awsSdkStrings.LAST_AUTHENTICATED_TIME_DESCENDING
    - java.lang.String
  */
  type sortKeyType = typings.awsSdk.iamMod._sortKeyType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Active_
    - typings.awsSdk.awsSdkStrings.Inactive_
    - java.lang.String
  */
  type statusType = typings.awsSdk.iamMod._statusType | java.lang.String
  
  type stringType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Users
    - typings.awsSdk.awsSdkStrings.UsersQuota
    - typings.awsSdk.awsSdkStrings.Groups
    - typings.awsSdk.awsSdkStrings.GroupsQuota
    - typings.awsSdk.awsSdkStrings.ServerCertificates
    - typings.awsSdk.awsSdkStrings.ServerCertificatesQuota
    - typings.awsSdk.awsSdkStrings.UserPolicySizeQuota
    - typings.awsSdk.awsSdkStrings.GroupPolicySizeQuota
    - typings.awsSdk.awsSdkStrings.GroupsPerUserQuota
    - typings.awsSdk.awsSdkStrings.SigningCertificatesPerUserQuota
    - typings.awsSdk.awsSdkStrings.AccessKeysPerUserQuota
    - typings.awsSdk.awsSdkStrings.MFADevices
    - typings.awsSdk.awsSdkStrings.MFADevicesInUse
    - typings.awsSdk.awsSdkStrings.AccountMFAEnabled
    - typings.awsSdk.awsSdkStrings.AccountAccessKeysPresent
    - typings.awsSdk.awsSdkStrings.AccountSigningCertificatesPresent
    - typings.awsSdk.awsSdkStrings.AttachedPoliciesPerGroupQuota
    - typings.awsSdk.awsSdkStrings.AttachedPoliciesPerRoleQuota
    - typings.awsSdk.awsSdkStrings.AttachedPoliciesPerUserQuota
    - typings.awsSdk.awsSdkStrings.Policies
    - typings.awsSdk.awsSdkStrings.PoliciesQuota
    - typings.awsSdk.awsSdkStrings.PolicySizeQuota
    - typings.awsSdk.awsSdkStrings.PolicyVersionsInUse
    - typings.awsSdk.awsSdkStrings.PolicyVersionsInUseQuota
    - typings.awsSdk.awsSdkStrings.VersionsPerPolicyQuota
    - typings.awsSdk.awsSdkStrings.GlobalEndpointTokenVersion
    - java.lang.String
  */
  type summaryKeyType = typings.awsSdk.iamMod._summaryKeyType | java.lang.String
  
  type summaryMapType = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iamMod.summaryValueType]
  
  type summaryValueType = scala.Double
  
  type tagKeyListType = js.Array[typings.awsSdk.iamMod.tagKeyType]
  
  type tagKeyType = java.lang.String
  
  type tagListType = js.Array[typings.awsSdk.iamMod.Tag]
  
  type tagValueType = java.lang.String
  
  type thumbprintListType = js.Array[typings.awsSdk.iamMod.thumbprintType]
  
  type thumbprintType = java.lang.String
  
  type userDetailListType = js.Array[typings.awsSdk.iamMod.UserDetail]
  
  type userListType = js.Array[typings.awsSdk.iamMod.User]
  
  type userNameType = java.lang.String
  
  type virtualMFADeviceListType = js.Array[typings.awsSdk.iamMod.VirtualMFADevice]
  
  type virtualMFADeviceName = java.lang.String
}
