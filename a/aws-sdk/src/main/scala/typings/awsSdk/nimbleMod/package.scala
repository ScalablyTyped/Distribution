package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ADMINISTRATOR
import typings.awsSdk.awsSdkStrings.CUSTOMER_MANAGED_KEY
import typings.awsSdk.awsSdkStrings.UPLOAD
import typings.awsSdk.awsSdkStrings.USER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActiveDirectoryComputerAttributeList = js.Array[ActiveDirectoryComputerAttribute]

type ActiveDirectoryComputerAttributeName = java.lang.String

type ActiveDirectoryComputerAttributeValue = java.lang.String

type ActiveDirectoryDnsIpAddress = java.lang.String

type ActiveDirectoryDnsIpAddressList = js.Array[ActiveDirectoryDnsIpAddress]

type ActiveDirectoryOrganizationalUnitDistinguishedName = java.lang.String

type ClientToken = java.lang.String

type DirectoryId = java.lang.String

type EC2ImageId = java.lang.String

type EC2SubnetId = java.lang.String

type EC2SubnetIdList = js.Array[EC2SubnetId]

type EulaAcceptanceId = java.lang.String

type EulaAcceptanceList = js.Array[EulaAcceptance]

type EulaId = java.lang.String

type EulaIdList = js.Array[String]

type EulaList = js.Array[Eula]

type EulaName = java.lang.String

type LaunchProfileDescription = java.lang.String

type LaunchProfileId = java.lang.String

type LaunchProfileInitializationScriptList = js.Array[LaunchProfileInitializationScript]

type LaunchProfileList = js.Array[LaunchProfile]

type LaunchProfileMembershipList = js.Array[LaunchProfileMembership]

type LaunchProfileName = java.lang.String

type LaunchProfilePersona = USER | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LINUX
  - typings.awsSdk.awsSdkStrings.WINDOWS
  - java.lang.String
*/
type LaunchProfilePlatform = _LaunchProfilePlatform | java.lang.String

type LaunchProfileProtocolVersion = java.lang.String

type LaunchProfileProtocolVersionList = js.Array[LaunchProfileProtocolVersion]

type LaunchProfileSecurityGroupIdList = js.Array[SecurityGroupId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type LaunchProfileState = _LaunchProfileState | java.lang.String

type LaunchProfileStateList = js.Array[LaunchProfileState]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LAUNCH_PROFILE_CREATED
  - typings.awsSdk.awsSdkStrings.LAUNCH_PROFILE_UPDATED
  - typings.awsSdk.awsSdkStrings.LAUNCH_PROFILE_DELETED
  - typings.awsSdk.awsSdkStrings.LAUNCH_PROFILE_CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.LAUNCH_PROFILE_UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.LAUNCH_PROFILE_DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.STREAMING_IMAGE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.STREAMING_IMAGE_NOT_READY
  - typings.awsSdk.awsSdkStrings.LAUNCH_PROFILE_WITH_STREAM_SESSIONS_NOT_DELETED
  - typings.awsSdk.awsSdkStrings.ENCRYPTION_KEY_ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.ENCRYPTION_KEY_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.INVALID_SUBNETS_PROVIDED
  - typings.awsSdk.awsSdkStrings.INVALID_INSTANCE_TYPES_PROVIDED
  - typings.awsSdk.awsSdkStrings.INVALID_SUBNETS_COMBINATION
  - java.lang.String
*/
type LaunchProfileStatusCode = _LaunchProfileStatusCode | java.lang.String

type LaunchProfileStudioComponentIdList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VALIDATION_NOT_STARTED
  - typings.awsSdk.awsSdkStrings.VALIDATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.VALIDATION_SUCCESS
  - typings.awsSdk.awsSdkStrings.VALIDATION_FAILED
  - typings.awsSdk.awsSdkStrings.VALIDATION_FAILED_INTERNAL_SERVER_ERROR
  - java.lang.String
*/
type LaunchProfileValidationState = _LaunchProfileValidationState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VALIDATION_NOT_STARTED
  - typings.awsSdk.awsSdkStrings.VALIDATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.VALIDATION_SUCCESS
  - typings.awsSdk.awsSdkStrings.VALIDATION_FAILED_INVALID_SUBNET_ROUTE_TABLE_ASSOCIATION
  - typings.awsSdk.awsSdkStrings.VALIDATION_FAILED_SUBNET_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.VALIDATION_FAILED_INVALID_SECURITY_GROUP_ASSOCIATION
  - typings.awsSdk.awsSdkStrings.VALIDATION_FAILED_INVALID_ACTIVE_DIRECTORY
  - typings.awsSdk.awsSdkStrings.VALIDATION_FAILED_UNAUTHORIZED
  - typings.awsSdk.awsSdkStrings.VALIDATION_FAILED_INTERNAL_SERVER_ERROR
  - java.lang.String
*/
type LaunchProfileValidationStatusCode = _LaunchProfileValidationStatusCode | java.lang.String

type LaunchProfileValidationStatusMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VALIDATE_ACTIVE_DIRECTORY_STUDIO_COMPONENT
  - typings.awsSdk.awsSdkStrings.VALIDATE_SUBNET_ASSOCIATION
  - typings.awsSdk.awsSdkStrings.VALIDATE_NETWORK_ACL_ASSOCIATION
  - typings.awsSdk.awsSdkStrings.VALIDATE_SECURITY_GROUP_ASSOCIATION
  - java.lang.String
*/
type LaunchProfileValidationType = _LaunchProfileValidationType | java.lang.String

type LaunchPurpose = java.lang.String

type LinuxMountPoint = java.lang.String

type MaxResults = Double

type NewLaunchProfileMemberList = js.Array[NewLaunchProfileMember]

type NewStudioMemberList = js.Array[NewStudioMember]

type Region = java.lang.String

type RoleArn = java.lang.String

type ScriptParameterKey = java.lang.String

type ScriptParameterValue = java.lang.String

type SecurityGroupId = java.lang.String

type SensitiveString = java.lang.String

type StreamConfigurationMaxSessionLengthInMinutes = Double

type StreamConfigurationMaxStoppedSessionLengthInMinutes = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type StreamingClipboardMode = _StreamingClipboardMode | java.lang.String

type StreamingImageDescription = java.lang.String

type StreamingImageEncryptionConfigurationKeyArn = java.lang.String

type StreamingImageEncryptionConfigurationKeyType = CUSTOMER_MANAGED_KEY | java.lang.String

type StreamingImageId = java.lang.String

type StreamingImageIdList = js.Array[StreamingImageId]

type StreamingImageList = js.Array[StreamingImage]

type StreamingImageName = java.lang.String

type StreamingImageOwner = java.lang.String

type StreamingImagePlatform = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type StreamingImageState = _StreamingImageState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STREAMING_IMAGE_CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STREAMING_IMAGE_READY
  - typings.awsSdk.awsSdkStrings.STREAMING_IMAGE_DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STREAMING_IMAGE_DELETED
  - typings.awsSdk.awsSdkStrings.STREAMING_IMAGE_UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - java.lang.String
*/
type StreamingImageStatusCode = _StreamingImageStatusCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.g4dnDotxlarge
  - typings.awsSdk.awsSdkStrings.g4dnDot2xlarge
  - typings.awsSdk.awsSdkStrings.g4dnDot4xlarge
  - typings.awsSdk.awsSdkStrings.g4dnDot8xlarge
  - typings.awsSdk.awsSdkStrings.g4dnDot12xlarge
  - typings.awsSdk.awsSdkStrings.g4dnDot16xlarge
  - typings.awsSdk.awsSdkStrings.g3Dot4xlarge
  - typings.awsSdk.awsSdkStrings.g3sDotxlarge
  - typings.awsSdk.awsSdkStrings.g5Dotxlarge
  - typings.awsSdk.awsSdkStrings.g5Dot2xlarge
  - typings.awsSdk.awsSdkStrings.g5Dot4xlarge
  - typings.awsSdk.awsSdkStrings.g5Dot8xlarge
  - typings.awsSdk.awsSdkStrings.g5Dot16xlarge
  - java.lang.String
*/
type StreamingInstanceType = _StreamingInstanceType | java.lang.String

type StreamingInstanceTypeList = js.Array[StreamingInstanceType]

type StreamingSessionId = java.lang.String

type StreamingSessionList = js.Array[StreamingSession]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.STOP_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.START_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.STOP_FAILED
  - typings.awsSdk.awsSdkStrings.START_FAILED
  - java.lang.String
*/
type StreamingSessionState = _StreamingSessionState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STREAMING_SESSION_READY
  - typings.awsSdk.awsSdkStrings.STREAMING_SESSION_DELETED
  - typings.awsSdk.awsSdkStrings.STREAMING_SESSION_CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STREAMING_SESSION_DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.INSUFFICIENT_CAPACITY
  - typings.awsSdk.awsSdkStrings.ACTIVE_DIRECTORY_DOMAIN_JOIN_ERROR
  - typings.awsSdk.awsSdkStrings.NETWORK_CONNECTION_ERROR
  - typings.awsSdk.awsSdkStrings.INITIALIZATION_SCRIPT_ERROR
  - typings.awsSdk.awsSdkStrings.DECRYPT_STREAMING_IMAGE_ERROR
  - typings.awsSdk.awsSdkStrings.NETWORK_INTERFACE_ERROR
  - typings.awsSdk.awsSdkStrings.STREAMING_SESSION_STOPPED
  - typings.awsSdk.awsSdkStrings.STREAMING_SESSION_STARTED
  - typings.awsSdk.awsSdkStrings.STREAMING_SESSION_STOP_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STREAMING_SESSION_START_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.AMI_VALIDATION_ERROR
  - java.lang.String
*/
type StreamingSessionStatusCode = _StreamingSessionStatusCode | java.lang.String

type StreamingSessionStorageMode = UPLOAD | java.lang.String

type StreamingSessionStorageModeList = js.Array[StreamingSessionStorageMode]

type StreamingSessionStorageRootPathLinux = java.lang.String

type StreamingSessionStorageRootPathWindows = java.lang.String

type StreamingSessionStreamExpirationInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type StreamingSessionStreamState = _StreamingSessionStreamState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STREAM_CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STREAM_READY
  - typings.awsSdk.awsSdkStrings.STREAM_DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STREAM_DELETED
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.NETWORK_CONNECTION_ERROR
  - java.lang.String
*/
type StreamingSessionStreamStatusCode = _StreamingSessionStreamStatusCode | java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type StudioComponentDescription = java.lang.String

type StudioComponentId = java.lang.String

type StudioComponentInitializationScriptContent = java.lang.String

type StudioComponentInitializationScriptList = js.Array[StudioComponentInitializationScript]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SYSTEM_INITIALIZATION
  - typings.awsSdk.awsSdkStrings.USER_INITIALIZATION
  - java.lang.String
*/
type StudioComponentInitializationScriptRunContext = _StudioComponentInitializationScriptRunContext | java.lang.String

type StudioComponentList = js.Array[StudioComponent]

type StudioComponentName = java.lang.String

type StudioComponentScriptParameterKeyValueList = js.Array[ScriptParameterKeyValue]

type StudioComponentSecurityGroupIdList = js.Array[SecurityGroupId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type StudioComponentState = _StudioComponentState | java.lang.String

type StudioComponentStateList = js.Array[StudioComponentState]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE_DIRECTORY_ALREADY_EXISTS
  - typings.awsSdk.awsSdkStrings.STUDIO_COMPONENT_CREATED
  - typings.awsSdk.awsSdkStrings.STUDIO_COMPONENT_UPDATED
  - typings.awsSdk.awsSdkStrings.STUDIO_COMPONENT_DELETED
  - typings.awsSdk.awsSdkStrings.ENCRYPTION_KEY_ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.ENCRYPTION_KEY_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.STUDIO_COMPONENT_CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STUDIO_COMPONENT_UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STUDIO_COMPONENT_DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - java.lang.String
*/
type StudioComponentStatusCode = _StudioComponentStatusCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_MANAGED_MICROSOFT_AD
  - typings.awsSdk.awsSdkStrings.AMAZON_FSX_FOR_WINDOWS
  - typings.awsSdk.awsSdkStrings.AMAZON_FSX_FOR_LUSTRE
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type StudioComponentSubtype = _StudioComponentSubtype | java.lang.String

type StudioComponentSummaryList = js.Array[StudioComponentSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE_DIRECTORY
  - typings.awsSdk.awsSdkStrings.SHARED_FILE_SYSTEM
  - typings.awsSdk.awsSdkStrings.COMPUTE_FARM
  - typings.awsSdk.awsSdkStrings.LICENSE_SERVICE
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type StudioComponentType = _StudioComponentType | java.lang.String

type StudioComponentTypeList = js.Array[StudioComponentType]

type StudioDisplayName = java.lang.String

type StudioEncryptionConfigurationKeyArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_OWNED_KEY
  - typings.awsSdk.awsSdkStrings.CUSTOMER_MANAGED_KEY
  - java.lang.String
*/
type StudioEncryptionConfigurationKeyType = _StudioEncryptionConfigurationKeyType | java.lang.String

type StudioList = js.Array[Studio]

type StudioMembershipList = js.Array[StudioMembership]

type StudioName = java.lang.String

type StudioPersona = ADMINISTRATOR | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type StudioState = _StudioState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STUDIO_CREATED
  - typings.awsSdk.awsSdkStrings.STUDIO_DELETED
  - typings.awsSdk.awsSdkStrings.STUDIO_UPDATED
  - typings.awsSdk.awsSdkStrings.STUDIO_CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STUDIO_UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STUDIO_DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STUDIO_WITH_LAUNCH_PROFILES_NOT_DELETED
  - typings.awsSdk.awsSdkStrings.STUDIO_WITH_STUDIO_COMPONENTS_NOT_DELETED
  - typings.awsSdk.awsSdkStrings.STUDIO_WITH_STREAMING_IMAGES_NOT_DELETED
  - typings.awsSdk.awsSdkStrings.AWS_SSO_NOT_ENABLED
  - typings.awsSdk.awsSdkStrings.AWS_SSO_ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.ROLE_NOT_OWNED_BY_STUDIO_OWNER
  - typings.awsSdk.awsSdkStrings.ROLE_COULD_NOT_BE_ASSUMED
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.ENCRYPTION_KEY_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.ENCRYPTION_KEY_ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.AWS_SSO_CONFIGURATION_REPAIRED
  - typings.awsSdk.awsSdkStrings.AWS_SSO_CONFIGURATION_REPAIR_IN_PROGRESS
  - java.lang.String
*/
type StudioStatusCode = _StudioStatusCode | java.lang.String

type Tags = StringDictionary[String]

type Timestamp = js.Date

type ValidationResults = js.Array[ValidationResult]

type WindowsMountDrive = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-08-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
