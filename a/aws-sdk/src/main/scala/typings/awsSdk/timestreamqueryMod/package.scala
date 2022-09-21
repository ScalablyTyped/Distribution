package typings.awsSdk.timestreamqueryMod

import typings.awsSdk.awsSdkStrings.VARCHAR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceName = java.lang.String

type ClientRequestToken = java.lang.String

type ClientToken = java.lang.String

type ColumnInfoList = js.Array[ColumnInfo]

type DatumList = js.Array[Datum]

type DimensionMappingList = js.Array[DimensionMapping]

type DimensionValueType = VARCHAR | java.lang.String

type Double = scala.Double

type Endpoints = js.Array[Endpoint]

type ErrorMessage = java.lang.String

type Long = scala.Double

type MaxQueryResults = scala.Double

type MaxScheduledQueriesResults = scala.Double

type MaxTagsForResourceResult = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BIGINT
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.DOUBLE
  - typings.awsSdk.awsSdkStrings.VARCHAR
  - typings.awsSdk.awsSdkStrings.MULTI
  - java.lang.String
*/
type MeasureValueType = _MeasureValueType | java.lang.String

type MixedMeasureMappingList = js.Array[MixedMeasureMapping]

type MultiMeasureAttributeMappingList = js.Array[MultiMeasureAttributeMapping]

type NextScheduledQueriesResultsToken = java.lang.String

type NextTagsForResourceResultsToken = java.lang.String

type NullableBoolean = Boolean

type PaginationToken = java.lang.String

type ParameterMappingList = js.Array[ParameterMapping]

type QueryId = java.lang.String

type QueryString = java.lang.String

type ResourceName = java.lang.String

type RowList = js.Array[Row]

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
  - typings.awsSdk.awsSdkStrings.BIGINT
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.DOUBLE
  - typings.awsSdk.awsSdkStrings.VARCHAR
  - typings.awsSdk.awsSdkStrings.TIMESTAMP
  - java.lang.String
*/
type ScalarMeasureValueType = _ScalarMeasureValueType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VARCHAR
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.BIGINT
  - typings.awsSdk.awsSdkStrings.DOUBLE
  - typings.awsSdk.awsSdkStrings.TIMESTAMP
  - typings.awsSdk.awsSdkStrings.DATE
  - typings.awsSdk.awsSdkStrings.TIME
  - typings.awsSdk.awsSdkStrings.INTERVAL_DAY_TO_SECOND
  - typings.awsSdk.awsSdkStrings.INTERVAL_YEAR_TO_MONTH
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - typings.awsSdk.awsSdkStrings.INTEGER
  - java.lang.String
*/
type ScalarType = _ScalarType | java.lang.String

type ScalarValue = java.lang.String

type ScheduleExpression = java.lang.String

type ScheduledQueryList = js.Array[ScheduledQuery]

type ScheduledQueryName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTO_TRIGGER_SUCCESS
  - typings.awsSdk.awsSdkStrings.AUTO_TRIGGER_FAILURE
  - typings.awsSdk.awsSdkStrings.MANUAL_TRIGGER_SUCCESS
  - typings.awsSdk.awsSdkStrings.MANUAL_TRIGGER_FAILURE
  - java.lang.String
*/
type ScheduledQueryRunStatus = _ScheduledQueryRunStatus | java.lang.String

type ScheduledQueryRunSummaryList = js.Array[ScheduledQueryRunSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ScheduledQueryState = _ScheduledQueryState | java.lang.String

type SchemaName = java.lang.String

type SelectColumnList = js.Array[SelectColumn]

type String = java.lang.String

type StringValue2048 = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Time = js.Date

type TimeSeriesDataPointList = js.Array[TimeSeriesDataPoint]

type Timestamp = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-11-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
