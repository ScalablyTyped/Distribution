package typings.awsSdk.clientsTimestreamwriteMod

import typings.awsSdk.awsSdkStrings.CSV
import typings.awsSdk.awsSdkStrings.VARCHAR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceName = java.lang.String

type BatchLoadDataFormat = CSV | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.PROGRESS_STOPPED
  - typings.awsSdk.awsSdkStrings.PENDING_RESUME
  - java.lang.String
*/
type BatchLoadStatus = _BatchLoadStatus | java.lang.String

type BatchLoadTaskId = java.lang.String

type BatchLoadTaskList = js.Array[BatchLoadTask]

type Boolean = scala.Boolean

type ClientRequestToken = java.lang.String

type DatabaseList = js.Array[Database]

type Date = js.Date

type DimensionMappings = js.Array[DimensionMapping]

type DimensionValueType = VARCHAR | java.lang.String

type Dimensions = js.Array[Dimension]

type Endpoints = js.Array[Endpoint]

type Integer = Double

type Long = Double

type MagneticStoreRetentionPeriodInDays = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DOUBLE
  - typings.awsSdk.awsSdkStrings.BIGINT
  - typings.awsSdk.awsSdkStrings.VARCHAR
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.TIMESTAMP
  - typings.awsSdk.awsSdkStrings.MULTI
  - java.lang.String
*/
type MeasureValueType = _MeasureValueType | java.lang.String

type MeasureValues = js.Array[MeasureValue]

type MemoryStoreRetentionPeriodInHours = Double

type MixedMeasureMappingList = js.Array[MixedMeasureMapping]

type MultiMeasureAttributeMappingList = js.Array[MultiMeasureAttributeMapping]

type PageLimit = Double

type PaginationLimit = Double

type RecordVersion = Double

type Records = js.Array[Record]

type ResourceCreateAPIName = java.lang.String

type ResourceName = java.lang.String

type S3BucketName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SSE_S3
  - typings.awsSdk.awsSdkStrings.SSE_KMS
  - java.lang.String
*/
type S3EncryptionOption = _S3EncryptionOption | java.lang.String

type S3ObjectKey = java.lang.String

type S3ObjectKeyPrefix = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DOUBLE
  - typings.awsSdk.awsSdkStrings.BIGINT
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.VARCHAR
  - typings.awsSdk.awsSdkStrings.TIMESTAMP
  - java.lang.String
*/
type ScalarMeasureValueType = _ScalarMeasureValueType | java.lang.String

type SchemaName = java.lang.String

type SchemaValue = java.lang.String

type String = java.lang.String

type StringValue1 = java.lang.String

type StringValue2048 = java.lang.String

type StringValue256 = java.lang.String

type TableList = js.Array[Table]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.RESTORING
  - java.lang.String
*/
type TableStatus = _TableStatus | java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MILLISECONDS
  - typings.awsSdk.awsSdkStrings.SECONDS
  - typings.awsSdk.awsSdkStrings.MICROSECONDS
  - typings.awsSdk.awsSdkStrings.NANOSECONDS
  - java.lang.String
*/
type TimeUnit = _TimeUnit | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-11-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
