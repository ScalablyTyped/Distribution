package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.CHECK_ALL
import typings.awsSdk.awsSdkStrings.LAST_MODIFIED_DATE
import typings.awsSdk.awsSdkStrings.NEW_TABLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type ActionId = Double

type AllowedStatisticList = js.Array[AllowedStatistics]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLE
  - typings.awsSdk.awsSdkStrings.DISABLE
  - java.lang.String
*/
type AnalyticsMode = _AnalyticsMode | String

type Arn = String

type AssumeControl = Boolean

type Attempt = Double

type Bucket = String

type BucketOwner = String

type CatalogId = String

type ClientSessionId = String

type ColumnName = String

type ColumnNameList = js.Array[ColumnName]

type ColumnRange = Double

type ColumnSelectorList = js.Array[ColumnSelector]

type ColumnStatisticsConfigurationList = js.Array[ColumnStatisticsConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GZIP
  - typings.awsSdk.awsSdkStrings.LZ4
  - typings.awsSdk.awsSdkStrings.SNAPPY
  - typings.awsSdk.awsSdkStrings.BZIP2
  - typings.awsSdk.awsSdkStrings.DEFLATE
  - typings.awsSdk.awsSdkStrings.LZO
  - typings.awsSdk.awsSdkStrings.BROTLI
  - typings.awsSdk.awsSdkStrings.ZSTD
  - typings.awsSdk.awsSdkStrings.ZLIB
  - java.lang.String
*/
type CompressionFormat = _CompressionFormat | String

type Condition = String

type ConditionExpressionList = js.Array[ConditionExpression]

type ConditionValue = String

type CreateColumn = Boolean

type CreatedBy = String

type CronExpression = String

type DataCatalogOutputList = js.Array[DataCatalogOutput]

type DatabaseName = String

type DatabaseOutputList = js.Array[DatabaseOutput]

type DatabaseOutputMode = NEW_TABLE | String

type DatabaseTableName = String

type DatasetList = js.Array[Dataset]

type DatasetName = String

type Date = js.Date

type DatetimeFormat = String

type Delimiter = String

type Disabled = Boolean

type EncryptionKeyArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`SSE-KMS`
  - typings.awsSdk.awsSdkStrings.`SSE-S3`
  - java.lang.String
*/
type EncryptionMode = _EncryptionMode | String

type EntityType = String

type EntityTypeList = js.Array[EntityType]

type ErrorCode = String

type ExecutionTime = Double

type Expression = String

type GlueConnectionName = String

type HeaderRow = Boolean

type HiddenColumnList = js.Array[ColumnName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.JSON
  - typings.awsSdk.awsSdkStrings.PARQUET
  - typings.awsSdk.awsSdkStrings.EXCEL
  - typings.awsSdk.awsSdkStrings.ORC
  - java.lang.String
*/
type InputFormat = _InputFormat | String

type JobList = js.Array[Job]

type JobName = String

type JobNameList = js.Array[JobName]

type JobRunErrorMessage = String

type JobRunId = String

type JobRunList = js.Array[JobRun]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.TIMEOUT
  - java.lang.String
*/
type JobRunState = _JobRunState | String

type JobSize = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROFILE
  - typings.awsSdk.awsSdkStrings.RECIPE
  - java.lang.String
*/
type JobType = _JobType | String

type Key = String

type LastModifiedBy = String

type LocaleCode = String

type LogGroupName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLE
  - typings.awsSdk.awsSdkStrings.DISABLE
  - java.lang.String
*/
type LogSubscription = _LogSubscription | String

type MaxCapacity = Double

type MaxFiles = Double

type MaxOutputFiles = Double

type MaxResults100 = Double

type MaxRetries = Double

type MultiLine = Boolean

type NextToken = String

type OpenedBy = String

type Operation = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - java.lang.String
*/
type Order = _Order | String

type OrderedBy = LAST_MODIFIED_DATE | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.JSON
  - typings.awsSdk.awsSdkStrings.PARQUET
  - typings.awsSdk.awsSdkStrings.GLUEPARQUET
  - typings.awsSdk.awsSdkStrings.AVRO
  - typings.awsSdk.awsSdkStrings.ORC
  - typings.awsSdk.awsSdkStrings.XML
  - typings.awsSdk.awsSdkStrings.TABLEAUHYPER
  - java.lang.String
*/
type OutputFormat = _OutputFormat | String

type OutputList = js.Array[Output]

type OverwriteOutput = Boolean

type ParameterMap = StringDictionary[ParameterValue]

type ParameterName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Datetime__
  - typings.awsSdk.awsSdkStrings.Number_
  - typings.awsSdk.awsSdkStrings.String_
  - java.lang.String
*/
type ParameterType = _ParameterType | String

type ParameterValue = String

type PathParameterName = String

type PathParametersMap = StringDictionary[DatasetParameter]

type Preview = Boolean

type ProjectList = js.Array[Project]

type ProjectName = String

type PublishedBy = String

type QueryString = String

type RecipeDescription = String

type RecipeErrorList = js.Array[RecipeVersionErrorDetail]

type RecipeErrorMessage = String

type RecipeList = js.Array[Recipe]

type RecipeName = String

type RecipeStepList = js.Array[RecipeStep]

type RecipeVersion = String

type RecipeVersionList = js.Array[RecipeVersion]

type Result = String

type RowRange = Double

type RuleCount = Double

type RuleList = js.Array[Rule]

type RuleName = String

type RulesetDescription = String

type RulesetItemList = js.Array[RulesetItem]

type RulesetName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FULL_DATASET
  - typings.awsSdk.awsSdkStrings.CUSTOM_ROWS
  - java.lang.String
*/
type SampleMode = _SampleMode | String

type SampleSize = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FIRST_N
  - typings.awsSdk.awsSdkStrings.LAST_N
  - typings.awsSdk.awsSdkStrings.RANDOM
  - java.lang.String
*/
type SampleType = _SampleType | String

type ScheduleList = js.Array[Schedule]

type ScheduleName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASSIGNED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.INITIALIZING
  - typings.awsSdk.awsSdkStrings.PROVISIONING
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.RECYCLING
  - typings.awsSdk.awsSdkStrings.ROTATING
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - typings.awsSdk.awsSdkStrings.TERMINATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type SessionStatus = _SessionStatus | String

type SheetIndex = Double

type SheetIndexList = js.Array[SheetIndex]

type SheetName = String

type SheetNameList = js.Array[SheetName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.S3
  - typings.awsSdk.awsSdkStrings.`DATA-CATALOG`
  - typings.awsSdk.awsSdkStrings.DATABASE
  - java.lang.String
*/
type Source = _Source | String

type StartColumnIndex = Double

type StartRowIndex = Double

type StartedBy = String

type Statistic = String

type StatisticList = js.Array[Statistic]

type StatisticOverrideList = js.Array[StatisticOverride]

type StepIndex = Double

type TableName = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TargetColumn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL
  - typings.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - java.lang.String
*/
type ThresholdType = _ThresholdType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COUNT
  - typings.awsSdk.awsSdkStrings.PERCENTAGE
  - java.lang.String
*/
type ThresholdUnit = _ThresholdUnit | String

type ThresholdValue = Double

type Timeout = Double

type TimezoneOffset = String

type ValidationConfigurationList = js.Array[ValidationConfiguration]

type ValidationMode = CHECK_ALL | String

type ValueReference = String

type ValuesMap = StringDictionary[ConditionValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-07-25`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
