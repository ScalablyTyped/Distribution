package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = java.lang.String

type Boolean = scala.Boolean

type DeletionProtection = scala.Boolean

type Digest = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.qldbMod.Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.KINESIS_STREAM_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.IAM_PERMISSION_REVOKED
  - java.lang.String
*/
type ErrorCause = typings.awsSdk.qldbMod._ErrorCause | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type ExportStatus = typings.awsSdk.qldbMod._ExportStatus | java.lang.String

type IonText = java.lang.String

type JournalKinesisStreamDescriptionList = js.Array[typings.awsSdk.qldbMod.JournalKinesisStreamDescription]

type JournalS3ExportList = js.Array[typings.awsSdk.qldbMod.JournalS3ExportDescription]

type LedgerList = js.Array[typings.awsSdk.qldbMod.LedgerSummary]

type LedgerName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type LedgerState = typings.awsSdk.qldbMod._LedgerState | java.lang.String

type MaxResults = scala.Double

type NextToken = java.lang.String

type PermissionsMode = typings.awsSdk.awsSdkStrings.ALLOW_ALL | java.lang.String

type S3Bucket = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SSE_KMS
  - typings.awsSdk.awsSdkStrings.SSE_S3
  - typings.awsSdk.awsSdkStrings.NO_ENCRYPTION
  - java.lang.String
*/
type S3ObjectEncryptionType = typings.awsSdk.qldbMod._S3ObjectEncryptionType | java.lang.String

type S3Prefix = java.lang.String

type StreamName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.IMPAIRED
  - java.lang.String
*/
type StreamStatus = typings.awsSdk.qldbMod._StreamStatus | java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[typings.awsSdk.qldbMod.TagKey]

type TagValue = java.lang.String

type Tags = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.qldbMod.TagValue]

type Timestamp = typings.std.Date

type UniqueId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-01-02`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.qldbMod._apiVersion | java.lang.String
