package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.PermissionsBoundaryPolicy
import typings.awsSdk.awsSdkStrings.textSlashcsv
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SERVICE_LEVEL
  - typings.awsSdk.awsSdkStrings.ACTION_LEVEL
  - java.lang.String
*/
type AccessAdvisorUsageGranularityType = _AccessAdvisorUsageGranularityType | String

type AccessDetails = js.Array[AccessDetail]

type ActionNameListType = js.Array[ActionNameType]

type ActionNameType = String

type ArnListType = js.Array[arnType]

type BootstrapDatum = Buffer | js.typedarray.Uint8Array | Blob | String

type ColumnNumber = Double

type ContextEntryListType = js.Array[ContextEntry]

type ContextKeyNameType = String

type ContextKeyNamesResultListType = js.Array[ContextKeyNameType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.string__
  - typings.awsSdk.awsSdkStrings.stringList_
  - typings.awsSdk.awsSdkStrings.numeric_
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
type ContextKeyTypeEnum = _ContextKeyTypeEnum | String

type ContextKeyValueListType = js.Array[ContextKeyValueType]

type ContextKeyValueType = String

type DeletionTaskIdType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.NOT_STARTED
  - java.lang.String
*/
type DeletionTaskStatusType = _DeletionTaskStatusType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.User_
  - typings.awsSdk.awsSdkStrings.Role_
  - typings.awsSdk.awsSdkStrings.Group_
  - typings.awsSdk.awsSdkStrings.LocalManagedPolicy
  - typings.awsSdk.awsSdkStrings.AWSManagedPolicy
  - java.lang.String
*/
type EntityType = _EntityType | String

type EvalDecisionDetailsType = StringDictionary[PolicyEvaluationDecisionType]

type EvalDecisionSourceType = String

type EvaluationResultsListType = js.Array[EvaluationResult]

type LineNumber = Double

type ManagedPolicyDetailListType = js.Array[ManagedPolicyDetail]

type OpenIDConnectProviderListType = js.Array[OpenIDConnectProviderListEntry]

type OpenIDConnectProviderUrlType = String

type PermissionsBoundaryAttachmentType = PermissionsBoundaryPolicy | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.allowed__
  - typings.awsSdk.awsSdkStrings.explicitDeny
  - typings.awsSdk.awsSdkStrings.implicitDeny
  - java.lang.String
*/
type PolicyEvaluationDecisionType = _PolicyEvaluationDecisionType | String

type PolicyGroupListType = js.Array[PolicyGroup]

type PolicyIdentifierType = String

type PolicyRoleListType = js.Array[PolicyRole]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.user__
  - typings.awsSdk.awsSdkStrings.group__
  - typings.awsSdk.awsSdkStrings.role__
  - typings.awsSdk.awsSdkStrings.`aws-managed_`
  - typings.awsSdk.awsSdkStrings.`user-managed`
  - typings.awsSdk.awsSdkStrings.resource__
  - typings.awsSdk.awsSdkStrings.none__
  - java.lang.String
*/
type PolicySourceType = _PolicySourceType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PermissionsPolicy
  - typings.awsSdk.awsSdkStrings.PermissionsBoundary
  - java.lang.String
*/
type PolicyUsageType = _PolicyUsageType | String

type PolicyUserListType = js.Array[PolicyUser]

type ReasonType = String

type RegionNameType = String

type ReportContentType = Buffer | js.typedarray.Uint8Array | Blob | String

type ReportFormatType = textSlashcsv | String

type ReportStateDescriptionType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STARTED
  - typings.awsSdk.awsSdkStrings.INPROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - java.lang.String
*/
type ReportStateType = _ReportStateType | String

type ResourceHandlingOptionType = String

type ResourceNameListType = js.Array[ResourceNameType]

type ResourceNameType = String

type ResourceSpecificResultListType = js.Array[ResourceSpecificResult]

type RoleUsageListType = js.Array[RoleUsageType]

type SAMLMetadataDocumentType = String

type SAMLProviderListType = js.Array[SAMLProviderListEntry]

type SAMLProviderNameType = String

type SSHPublicKeyListType = js.Array[SSHPublicKeyMetadata]

type ServiceSpecificCredentialsListType = js.Array[ServiceSpecificCredentialMetadata]

type ServicesLastAccessed = js.Array[ServiceLastAccessed]

type SimulationPolicyListType = js.Array[policyDocumentType]

type StatementListType = js.Array[Statement]

type TrackedActionsLastAccessed = js.Array[TrackedActionLastAccessed]

type accessKeyIdType = String

type accessKeyMetadataListType = js.Array[AccessKeyMetadata]

type accessKeySecretType = String

type accountAliasListType = js.Array[accountAliasType]

type accountAliasType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2010-05-08`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type arnType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Assigned_
  - typings.awsSdk.awsSdkStrings.Unassigned
  - typings.awsSdk.awsSdkStrings.Any_
  - java.lang.String
*/
type assignmentStatusType = _assignmentStatusType | String

type attachedPoliciesListType = js.Array[AttachedPolicy]

type attachmentCountType = Double

type authenticationCodeType = String

type booleanObjectType = Boolean

type booleanType = Boolean

type certificateBodyType = String

type certificateChainType = String

type certificateIdType = String

type certificateListType = js.Array[SigningCertificate]

type clientIDListType = js.Array[clientIDType]

type clientIDType = String

type customSuffixType = String

type dateType = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SSH
  - typings.awsSdk.awsSdkStrings.PEM
  - java.lang.String
*/
type encodingType = _encodingType | String

type entityDetailsListType = js.Array[EntityDetails]

type entityListType = js.Array[EntityType]

type entityNameType = String

type existingUserNameType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.v1Token
  - typings.awsSdk.awsSdkStrings.v2Token
  - java.lang.String
*/
type globalEndpointTokenVersion = _globalEndpointTokenVersion | String

type groupDetailListType = js.Array[GroupDetail]

type groupListType = js.Array[Group]

type groupNameListType = js.Array[groupNameType]

type groupNameType = String

type idType = String

type instanceProfileListType = js.Array[InstanceProfile]

type instanceProfileNameType = String

type integerType = Double

type jobIDType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type jobStatusType = _jobStatusType | String

type listPolicyGrantingServiceAccessResponseListType = js.Array[ListPoliciesGrantingServiceAccessEntry]

type markerType = String

type maxItemsType = Double

type maxPasswordAgeType = Double

type mfaDeviceListType = js.Array[MFADevice]

type minimumPasswordLengthType = Double

type organizationsEntityPathType = String

type organizationsPolicyIdType = String

type passwordReusePreventionType = Double

type passwordType = String

type pathPrefixType = String

type pathType = String

type policyDescriptionType = String

type policyDetailListType = js.Array[PolicyDetail]

type policyDocumentType = String

type policyDocumentVersionListType = js.Array[PolicyVersion]

type policyGrantingServiceAccessListType = js.Array[PolicyGrantingServiceAccess]

type policyListType = js.Array[Policy]

type policyNameListType = js.Array[policyNameType]

type policyNameType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.ROLE
  - typings.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
type policyOwnerEntityType = _policyOwnerEntityType | String

type policyPathType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.All_
  - typings.awsSdk.awsSdkStrings.AWS
  - typings.awsSdk.awsSdkStrings.Local_
  - java.lang.String
*/
type policyScopeType = _policyScopeType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INLINE
  - typings.awsSdk.awsSdkStrings.MANAGED
  - java.lang.String
*/
type policyType = _policyType | String

type policyVersionIdType = String

type privateKeyType = String

type publicKeyFingerprintType = String

type publicKeyIdType = String

type publicKeyMaterialType = String

type responseMarkerType = String

type roleDescriptionType = String

type roleDetailListType = js.Array[RoleDetail]

type roleListType = js.Array[Role]

type roleMaxSessionDurationType = Double

type roleNameType = String

type serialNumberType = String

type serverCertificateMetadataListType = js.Array[ServerCertificateMetadata]

type serverCertificateNameType = String

type serviceName = String

type serviceNameType = String

type serviceNamespaceListType = js.Array[serviceNamespaceType]

type serviceNamespaceType = String

type servicePassword = String

type serviceSpecificCredentialId = String

type serviceUserName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SERVICE_NAMESPACE_ASCENDING
  - typings.awsSdk.awsSdkStrings.SERVICE_NAMESPACE_DESCENDING
  - typings.awsSdk.awsSdkStrings.LAST_AUTHENTICATED_TIME_ASCENDING
  - typings.awsSdk.awsSdkStrings.LAST_AUTHENTICATED_TIME_DESCENDING
  - java.lang.String
*/
type sortKeyType = _sortKeyType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
type statusType = _statusType | String

type stringType = String

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
type summaryKeyType = _summaryKeyType | String

type summaryMapType = StringDictionary[summaryValueType]

type summaryValueType = Double

type tagKeyListType = js.Array[tagKeyType]

type tagKeyType = String

type tagListType = js.Array[Tag]

type tagValueType = String

type thumbprintListType = js.Array[thumbprintType]

type thumbprintType = String

type userDetailListType = js.Array[UserDetail]

type userListType = js.Array[User]

type userNameType = String

type virtualMFADeviceListType = js.Array[VirtualMFADevice]

type virtualMFADeviceName = String
