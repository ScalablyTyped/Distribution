package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.SQL
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessControlPolicyList = js.Array[Grant]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ArchiveRetrieval
  - typings.awsSdk.awsSdkStrings.InventoryRetrieval
  - typings.awsSdk.awsSdkStrings.Select_
  - java.lang.String
*/
type ActionCode = _ActionCode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.private__
  - typings.awsSdk.awsSdkStrings.`public-read`
  - typings.awsSdk.awsSdkStrings.`public-read-write`
  - typings.awsSdk.awsSdkStrings.`aws-exec-read`
  - typings.awsSdk.awsSdkStrings.`authenticated-read`
  - typings.awsSdk.awsSdkStrings.`bucket-owner-read`
  - typings.awsSdk.awsSdkStrings.`bucket-owner-full-control`
  - java.lang.String
*/
type CannedACL = _CannedACL | String

type DataRetrievalRulesList = js.Array[DataRetrievalRule]

type DateTime = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.awsColonkms
  - typings.awsSdk.awsSdkStrings.AES256
  - java.lang.String
*/
type EncryptionType = _EncryptionType | String

type ExpressionType = SQL | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USE
  - typings.awsSdk.awsSdkStrings.IGNORE
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type FileHeaderInfo = _FileHeaderInfo | String

type JobList = js.Array[GlacierJobDescription]

type NotificationEventList = js.Array[String]

type NullableLong = Double

type PartList = js.Array[PartListElement]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FULL_CONTROL
  - typings.awsSdk.awsSdkStrings.WRITE
  - typings.awsSdk.awsSdkStrings.WRITE_ACP
  - typings.awsSdk.awsSdkStrings.READ
  - typings.awsSdk.awsSdkStrings.READ_ACP
  - java.lang.String
*/
type Permission = _Permission | String

type ProvisionedCapacityList = js.Array[ProvisionedCapacityDescription]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALWAYS
  - typings.awsSdk.awsSdkStrings.ASNEEDED
  - java.lang.String
*/
type QuoteFields = _QuoteFields | String

type Size = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Succeeded_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type StatusCode = _StatusCode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
  - typings.awsSdk.awsSdkStrings.STANDARD_IA
  - java.lang.String
*/
type StorageClass = _StorageClass | String

type Stream = Buffer | js.typedarray.Uint8Array | Blob | String | Readable

type TagKey = String

type TagKeyList = js.Array[String]

type TagMap = StringDictionary[TagValue]

type TagValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AmazonCustomerByEmail
  - typings.awsSdk.awsSdkStrings.CanonicalUser
  - typings.awsSdk.awsSdkStrings.Group_
  - java.lang.String
*/
type Type = _Type | String

type UploadsList = js.Array[UploadListElement]

type VaultList = js.Array[DescribeVaultOutput]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2012-06-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type hashmap = StringDictionary[String]

type httpstatus = Double

type long = Double
