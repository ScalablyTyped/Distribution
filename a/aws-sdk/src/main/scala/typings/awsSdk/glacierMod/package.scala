package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessControlPolicyList = js.Array[typings.awsSdk.glacierMod.Grant]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ArchiveRetrieval
  - typings.awsSdk.awsSdkStrings.InventoryRetrieval
  - typings.awsSdk.awsSdkStrings.Select_
  - java.lang.String
*/
type ActionCode = typings.awsSdk.glacierMod._ActionCode | java.lang.String

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
type CannedACL = typings.awsSdk.glacierMod._CannedACL | java.lang.String

type DataRetrievalRulesList = js.Array[typings.awsSdk.glacierMod.DataRetrievalRule]

type DateTime = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.awsColonkms
  - typings.awsSdk.awsSdkStrings.AES256
  - java.lang.String
*/
type EncryptionType = typings.awsSdk.glacierMod._EncryptionType | java.lang.String

type ExpressionType = typings.awsSdk.awsSdkStrings.SQL | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USE
  - typings.awsSdk.awsSdkStrings.IGNORE
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type FileHeaderInfo = typings.awsSdk.glacierMod._FileHeaderInfo | java.lang.String

type JobList = js.Array[typings.awsSdk.glacierMod.GlacierJobDescription]

type NotificationEventList = js.Array[java.lang.String]

type NullableLong = scala.Double

type PartList = js.Array[typings.awsSdk.glacierMod.PartListElement]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FULL_CONTROL
  - typings.awsSdk.awsSdkStrings.WRITE
  - typings.awsSdk.awsSdkStrings.WRITE_ACP
  - typings.awsSdk.awsSdkStrings.READ
  - typings.awsSdk.awsSdkStrings.READ_ACP
  - java.lang.String
*/
type Permission = typings.awsSdk.glacierMod._Permission | java.lang.String

type ProvisionedCapacityList = js.Array[typings.awsSdk.glacierMod.ProvisionedCapacityDescription]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALWAYS
  - typings.awsSdk.awsSdkStrings.ASNEEDED
  - java.lang.String
*/
type QuoteFields = typings.awsSdk.glacierMod._QuoteFields | java.lang.String

type Size = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Succeeded_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type StatusCode = typings.awsSdk.glacierMod._StatusCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
  - typings.awsSdk.awsSdkStrings.STANDARD_IA
  - java.lang.String
*/
type StorageClass = typings.awsSdk.glacierMod._StorageClass | java.lang.String

type Stream = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.glacierMod.Blob | java.lang.String | typings.node.streamMod.Readable

type TagKey = java.lang.String

type TagKeyList = js.Array[java.lang.String]

type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.glacierMod.TagValue]

type TagValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AmazonCustomerByEmail
  - typings.awsSdk.awsSdkStrings.CanonicalUser
  - typings.awsSdk.awsSdkStrings.Group_
  - java.lang.String
*/
type Type = typings.awsSdk.glacierMod._Type | java.lang.String

type UploadsList = js.Array[typings.awsSdk.glacierMod.UploadListElement]

type VaultList = js.Array[typings.awsSdk.glacierMod.DescribeVaultOutput]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2012-06-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.glacierMod._apiVersion | java.lang.String

type hashmap = org.scalablytyped.runtime.StringDictionary[java.lang.String]

type httpstatus = scala.Double

type long = scala.Double
