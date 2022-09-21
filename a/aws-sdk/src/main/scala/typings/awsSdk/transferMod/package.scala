package typings.awsSdk.transferMod

import typings.awsSdk.awsSdkStrings.HTTP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AddressAllocationId = String

type AddressAllocationIds = js.Array[AddressAllocationId]

type AgreementId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type AgreementStatusType = _AgreementStatusType | String

type Arn = String

type As2Id = String

type As2Transport = HTTP | String

type As2Transports = js.Array[As2Transport]

type CallbackToken = String

type CertDate = js.Date

type CertSerial = String

type Certificate = String

type CertificateBodyType = String

type CertificateChainType = String

type CertificateId = String

type CertificateIds = js.Array[CertificateId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.PENDING_ROTATION
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type CertificateStatusType = _CertificateStatusType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CERTIFICATE
  - typings.awsSdk.awsSdkStrings.CERTIFICATE_WITH_PRIVATE_KEY
  - java.lang.String
*/
type CertificateType = _CertificateType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SIGNING
  - typings.awsSdk.awsSdkStrings.ENCRYPTION
  - java.lang.String
*/
type CertificateUsageType = _CertificateUsageType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ZLIB
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type CompressionEnum = _CompressionEnum | String

type ConnectorId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILURE
  - java.lang.String
*/
type CustomStepStatus = _CustomStepStatus | String

type CustomStepTarget = String

type CustomStepTimeoutSeconds = Double

type DateImported = js.Date

type Description = String

type DirectoryId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.S3
  - typings.awsSdk.awsSdkStrings.EFS
  - java.lang.String
*/
type Domain = _Domain | String

type EfsFileSystemId = String

type EfsPath = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AES128_CBC
  - typings.awsSdk.awsSdkStrings.AES192_CBC
  - typings.awsSdk.awsSdkStrings.AES256_CBC
  - java.lang.String
*/
type EncryptionAlg = _EncryptionAlg | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLIC
  - typings.awsSdk.awsSdkStrings.VPC
  - typings.awsSdk.awsSdkStrings.VPC_ENDPOINT
  - java.lang.String
*/
type EndpointType = _EndpointType | String

type ExecutionErrorMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PERMISSION_DENIED
  - typings.awsSdk.awsSdkStrings.CUSTOM_STEP_FAILED
  - typings.awsSdk.awsSdkStrings.THROTTLED
  - typings.awsSdk.awsSdkStrings.ALREADY_EXISTS
  - typings.awsSdk.awsSdkStrings.NOT_FOUND
  - typings.awsSdk.awsSdkStrings.BAD_REQUEST
  - typings.awsSdk.awsSdkStrings.TIMEOUT
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVER_ERROR
  - java.lang.String
*/
type ExecutionErrorType = _ExecutionErrorType | String

type ExecutionId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.EXCEPTION
  - typings.awsSdk.awsSdkStrings.HANDLING_EXCEPTION
  - java.lang.String
*/
type ExecutionStatus = _ExecutionStatus | String

type ExecutionStepResults = js.Array[ExecutionStepResult]

type ExternalId = String

type FilePath = String

type FilePaths = js.Array[FilePath]

type Fips = Boolean

type Function = String

type HomeDirectory = String

type HomeDirectoryMappings = js.Array[HomeDirectoryMapEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PATH
  - typings.awsSdk.awsSdkStrings.LOGICAL
  - java.lang.String
*/
type HomeDirectoryType = _HomeDirectoryType | String

type HostKey = String

type HostKeyDescription = String

type HostKeyFingerprint = String

type HostKeyId = String

type HostKeyType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SERVICE_MANAGED
  - typings.awsSdk.awsSdkStrings.API_GATEWAY
  - typings.awsSdk.awsSdkStrings.AWS_DIRECTORY_SERVICE
  - typings.awsSdk.awsSdkStrings.AWS_LAMBDA
  - java.lang.String
*/
type IdentityProviderType = _IdentityProviderType | String

type ListedAccesses = js.Array[ListedAccess]

type ListedAgreements = js.Array[ListedAgreement]

type ListedCertificates = js.Array[ListedCertificate]

type ListedConnectors = js.Array[ListedConnector]

type ListedExecutions = js.Array[ListedExecution]

type ListedHostKeys = js.Array[ListedHostKey]

type ListedProfiles = js.Array[ListedProfile]

type ListedServers = js.Array[ListedServer]

type ListedUsers = js.Array[ListedUser]

type ListedWorkflows = js.Array[ListedWorkflow]

type LogGroupName = String

type MapEntry = String

type MapTarget = String

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SYNC
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type MdnResponse = _MdnResponse | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SHA256
  - typings.awsSdk.awsSdkStrings.SHA384
  - typings.awsSdk.awsSdkStrings.SHA512
  - typings.awsSdk.awsSdkStrings.SHA1
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - java.lang.String
*/
type MdnSigningAlg = _MdnSigningAlg | String

type Message = String

type MessageSubject = String

type NextToken = String

type NullableRole = String

type OnUploadWorkflowDetails = js.Array[WorkflowDetail]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRUE
  - typings.awsSdk.awsSdkStrings.FALSE
  - java.lang.String
*/
type OverwriteExisting = _OverwriteExisting | String

type PassiveIp = String

type Policy = String

type PosixId = Double

type PostAuthenticationLoginBanner = String

type PreAuthenticationLoginBanner = String

type PrivateKeyType = String

type ProfileId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LOCAL
  - typings.awsSdk.awsSdkStrings.PARTNER
  - java.lang.String
*/
type ProfileType = _ProfileType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SFTP
  - typings.awsSdk.awsSdkStrings.FTP
  - typings.awsSdk.awsSdkStrings.FTPS
  - typings.awsSdk.awsSdkStrings.AS2
  - java.lang.String
*/
type Protocol = _Protocol | String

type Protocols = js.Array[Protocol]

type Response = String

type Role = String

type S3Bucket = String

type S3Etag = String

type S3Key = String

type S3TagKey = String

type S3TagValue = String

type S3Tags = js.Array[S3Tag]

type S3VersionId = String

type SecondaryGids = js.Array[PosixId]

type SecurityGroupId = String

type SecurityGroupIds = js.Array[SecurityGroupId]

type SecurityPolicyName = String

type SecurityPolicyNames = js.Array[SecurityPolicyName]

type SecurityPolicyOption = String

type SecurityPolicyOptions = js.Array[SecurityPolicyOption]

type ServerId = String

type SessionId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.ENABLE_NO_OP
  - java.lang.String
*/
type SetStatOption = _SetStatOption | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SHA256
  - typings.awsSdk.awsSdkStrings.SHA384
  - typings.awsSdk.awsSdkStrings.SHA512
  - typings.awsSdk.awsSdkStrings.SHA1
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type SigningAlg = _SigningAlg | String

type SourceFileLocation = String

type SourceIp = String

type SshPublicKeyBody = String

type SshPublicKeyCount = Double

type SshPublicKeyId = String

type SshPublicKeys = js.Array[SshPublicKey]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFFLINE
  - typings.awsSdk.awsSdkStrings.ONLINE
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.START_FAILED
  - typings.awsSdk.awsSdkStrings.STOP_FAILED
  - java.lang.String
*/
type State = _State | String

type StatusCode = Double

type StepResultOutputsJson = String

type SubnetId = String

type SubnetIds = js.Array[SubnetId]

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type Tags = js.Array[Tag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.ENFORCED
  - java.lang.String
*/
type TlsSessionResumptionMode = _TlsSessionResumptionMode | String

type TransferId = String

type Url = String

type UserCount = Double

type UserName = String

type UserPassword = String

type VpcEndpointId = String

type VpcId = String

type WorkflowDescription = String

type WorkflowId = String

type WorkflowStepName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COPY
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - typings.awsSdk.awsSdkStrings.TAG
  - typings.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type WorkflowStepType = _WorkflowStepType | String

type WorkflowSteps = js.Array[WorkflowStep]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-11-05`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
