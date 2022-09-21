package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.AWSIoT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = java.lang.String

type Arn = java.lang.String

type BucketName = java.lang.String

type Category = AWSIoT | java.lang.String

type CertificateArn = java.lang.String

type ClientRequestToken = java.lang.String

type DisplayName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RSA
  - typings.awsSdk.awsSdkStrings.ECDSA
  - java.lang.String
*/
type EncryptionAlgorithm = _EncryptionAlgorithm | java.lang.String

type EncryptionAlgorithms = js.Array[EncryptionAlgorithm]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SHA1
  - typings.awsSdk.awsSdkStrings.SHA256
  - java.lang.String
*/
type HashAlgorithm = _HashAlgorithm | java.lang.String

type HashAlgorithms = js.Array[HashAlgorithm]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.JSON
  - typings.awsSdk.awsSdkStrings.JSONEmbedded
  - typings.awsSdk.awsSdkStrings.JSONDetached
  - java.lang.String
*/
type ImageFormat = _ImageFormat | java.lang.String

type ImageFormats = js.Array[ImageFormat]

type Integer = Double

type JobId = java.lang.String

type Key = java.lang.String

type MaxResults = Double

type MaxSizeInMB = Double

type NextToken = java.lang.String

type Permissions = js.Array[Permission]

type PlatformId = java.lang.String

type PolicySizeBytes = Double

type Prefix = java.lang.String

type ProfileName = java.lang.String

type ProfileVersion = java.lang.String

type RequestedBy = java.lang.String

type RevocationReasonString = java.lang.String

type SigningJobs = js.Array[SigningJob]

type SigningParameterKey = java.lang.String

type SigningParameterValue = java.lang.String

type SigningParameters = StringDictionary[SigningParameterValue]

type SigningPlatforms = js.Array[SigningPlatform]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Canceled_
  - typings.awsSdk.awsSdkStrings.Revoked_
  - java.lang.String
*/
type SigningProfileStatus = _SigningProfileStatus | java.lang.String

type SigningProfiles = js.Array[SigningProfile]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Succeeded_
  - java.lang.String
*/
type SigningStatus = _SigningStatus | java.lang.String

type StatusReason = java.lang.String

type Statuses = js.Array[SigningProfileStatus]

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DAYS
  - typings.awsSdk.awsSdkStrings.MONTHS
  - typings.awsSdk.awsSdkStrings.YEARS
  - java.lang.String
*/
type ValidityType = _ValidityType | java.lang.String

type Version = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-08-25`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type bool = Boolean
