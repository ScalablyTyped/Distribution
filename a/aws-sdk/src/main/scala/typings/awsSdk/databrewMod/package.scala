package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object databrewMod {
  
  type AccountId = java.lang.String
  
  type ActionId = scala.Double
  
  type Arn = java.lang.String
  
  type AssumeControl = scala.Boolean
  
  type Attempt = scala.Double
  
  type Bucket = java.lang.String
  
  type CatalogId = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.databrewMod.ClientApiVersions
  
  type ClientSessionId = java.lang.String
  
  type ColumnName = java.lang.String
  
  type ColumnNameList = js.Array[typings.awsSdk.databrewMod.ColumnName]
  
  type ColumnRange = scala.Double
  
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
  type CompressionFormat = typings.awsSdk.databrewMod._CompressionFormat | java.lang.String
  
  type Condition = java.lang.String
  
  type ConditionExpressionList = js.Array[typings.awsSdk.databrewMod.ConditionExpression]
  
  type ConditionValue = java.lang.String
  
  type CreatedBy = java.lang.String
  
  type CronExpression = java.lang.String
  
  type DatabaseName = java.lang.String
  
  type DatasetList = js.Array[typings.awsSdk.databrewMod.Dataset]
  
  type DatasetName = java.lang.String
  
  type Date = typings.std.Date
  
  type EncryptionKeyArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`SSE-KMS`
    - typings.awsSdk.awsSdkStrings.`SSE-S3`
    - java.lang.String
  */
  type EncryptionMode = typings.awsSdk.databrewMod._EncryptionMode | java.lang.String
  
  type ErrorCode = java.lang.String
  
  type ExecutionTime = scala.Double
  
  type HiddenColumnList = js.Array[typings.awsSdk.databrewMod.ColumnName]
  
  type JobList = js.Array[typings.awsSdk.databrewMod.Job]
  
  type JobName = java.lang.String
  
  type JobNameList = js.Array[typings.awsSdk.databrewMod.JobName]
  
  type JobRunErrorMessage = java.lang.String
  
  type JobRunId = java.lang.String
  
  type JobRunList = js.Array[typings.awsSdk.databrewMod.JobRun]
  
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
  type JobRunState = typings.awsSdk.databrewMod._JobRunState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PROFILE
    - typings.awsSdk.awsSdkStrings.RECIPE
    - java.lang.String
  */
  type JobType = typings.awsSdk.databrewMod._JobType | java.lang.String
  
  type Key = java.lang.String
  
  type LastModifiedBy = java.lang.String
  
  type LogGroupName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLE
    - typings.awsSdk.awsSdkStrings.DISABLE
    - java.lang.String
  */
  type LogSubscription = typings.awsSdk.databrewMod._LogSubscription | java.lang.String
  
  type MaxCapacity = scala.Double
  
  type MaxResults100 = scala.Double
  
  type MaxRetries = scala.Double
  
  type MultiLine = scala.Boolean
  
  type NextToken = java.lang.String
  
  type OpenedBy = java.lang.String
  
  type Operation = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CSV
    - typings.awsSdk.awsSdkStrings.JSON
    - typings.awsSdk.awsSdkStrings.PARQUET
    - typings.awsSdk.awsSdkStrings.GLUEPARQUET
    - typings.awsSdk.awsSdkStrings.AVRO
    - typings.awsSdk.awsSdkStrings.ORC
    - typings.awsSdk.awsSdkStrings.XML
    - java.lang.String
  */
  type OutputFormat = typings.awsSdk.databrewMod._OutputFormat | java.lang.String
  
  type OutputList = js.Array[typings.awsSdk.databrewMod.Output]
  
  type OverwriteOutput = scala.Boolean
  
  type ParameterMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.databrewMod.ParameterValue]
  
  type ParameterName = java.lang.String
  
  type ParameterValue = java.lang.String
  
  type Preview = scala.Boolean
  
  type ProjectList = js.Array[typings.awsSdk.databrewMod.Project]
  
  type ProjectName = java.lang.String
  
  type PublishedBy = java.lang.String
  
  type RecipeDescription = java.lang.String
  
  type RecipeErrorList = js.Array[typings.awsSdk.databrewMod.RecipeVersionErrorDetail]
  
  type RecipeErrorMessage = java.lang.String
  
  type RecipeList = js.Array[typings.awsSdk.databrewMod.Recipe]
  
  type RecipeName = java.lang.String
  
  type RecipeStepList = js.Array[typings.awsSdk.databrewMod.RecipeStep]
  
  type RecipeVersion = java.lang.String
  
  type RecipeVersionList = js.Array[typings.awsSdk.databrewMod.RecipeVersion]
  
  type Result = java.lang.String
  
  type SampleSize = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FIRST_N
    - typings.awsSdk.awsSdkStrings.LAST_N
    - typings.awsSdk.awsSdkStrings.RANDOM
    - java.lang.String
  */
  type SampleType = typings.awsSdk.databrewMod._SampleType | java.lang.String
  
  type ScheduleList = js.Array[typings.awsSdk.databrewMod.Schedule]
  
  type ScheduleName = java.lang.String
  
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
  type SessionStatus = typings.awsSdk.databrewMod._SessionStatus | java.lang.String
  
  type SheetIndex = scala.Double
  
  type SheetIndexList = js.Array[typings.awsSdk.databrewMod.SheetIndex]
  
  type SheetName = java.lang.String
  
  type SheetNameList = js.Array[typings.awsSdk.databrewMod.SheetName]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.S3
    - typings.awsSdk.awsSdkStrings.`DATA-CATALOG`
    - java.lang.String
  */
  type Source = typings.awsSdk.databrewMod._Source | java.lang.String
  
  type StartColumnIndex = scala.Double
  
  type StartedBy = java.lang.String
  
  type StepIndex = scala.Double
  
  type TableName = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.databrewMod.TagKey]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.databrewMod.TagValue]
  
  type TagValue = java.lang.String
  
  type TargetColumn = java.lang.String
  
  type Timeout = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-07-25`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.databrewMod._apiVersion | java.lang.String
}
