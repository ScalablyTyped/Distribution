package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.sgd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Algorithm = sgd | String

type AwsUserArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CreatedAt
  - typings.awsSdk.awsSdkStrings.LastUpdatedAt
  - typings.awsSdk.awsSdkStrings.Status_
  - typings.awsSdk.awsSdkStrings.Name_
  - typings.awsSdk.awsSdkStrings.IAMUser
  - typings.awsSdk.awsSdkStrings.MLModelId
  - typings.awsSdk.awsSdkStrings.DataSourceId
  - typings.awsSdk.awsSdkStrings.DataURI
  - java.lang.String
*/
type BatchPredictionFilterVariable = _BatchPredictionFilterVariable | String

type BatchPredictions = js.Array[BatchPrediction]

type ComparatorValue = String

type ComputeStatistics = Boolean

type DataRearrangement = String

type DataSchema = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CreatedAt
  - typings.awsSdk.awsSdkStrings.LastUpdatedAt
  - typings.awsSdk.awsSdkStrings.Status_
  - typings.awsSdk.awsSdkStrings.Name_
  - typings.awsSdk.awsSdkStrings.DataLocationS3
  - typings.awsSdk.awsSdkStrings.IAMUser
  - java.lang.String
*/
type DataSourceFilterVariable = _DataSourceFilterVariable | String

type DataSources = js.Array[DataSource]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PredictiveModelType
  - typings.awsSdk.awsSdkStrings.Algorithm
  - java.lang.String
*/
type DetailsAttributes = _DetailsAttributes | String

type DetailsMap = StringDictionary[DetailsValue]

type DetailsValue = String

type EDPPipelineId = String

type EDPResourceRole = String

type EDPSecurityGroupId = String

type EDPSecurityGroupIds = js.Array[EDPSecurityGroupId]

type EDPServiceRole = String

type EDPSubnetId = String

type EntityId = String

type EntityName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.INPROGRESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type EntityStatus = _EntityStatus | String

type EpochTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CreatedAt
  - typings.awsSdk.awsSdkStrings.LastUpdatedAt
  - typings.awsSdk.awsSdkStrings.Status_
  - typings.awsSdk.awsSdkStrings.Name_
  - typings.awsSdk.awsSdkStrings.IAMUser
  - typings.awsSdk.awsSdkStrings.MLModelId
  - typings.awsSdk.awsSdkStrings.DataSourceId
  - typings.awsSdk.awsSdkStrings.DataURI
  - java.lang.String
*/
type EvaluationFilterVariable = _EvaluationFilterVariable | String

type Evaluations = js.Array[Evaluation]

type IntegerType = Double

type Label = String

type LongType = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CreatedAt
  - typings.awsSdk.awsSdkStrings.LastUpdatedAt
  - typings.awsSdk.awsSdkStrings.Status_
  - typings.awsSdk.awsSdkStrings.Name_
  - typings.awsSdk.awsSdkStrings.IAMUser
  - typings.awsSdk.awsSdkStrings.TrainingDataSourceId
  - typings.awsSdk.awsSdkStrings.RealtimeEndpointStatus
  - typings.awsSdk.awsSdkStrings.MLModelType
  - typings.awsSdk.awsSdkStrings.Algorithm
  - typings.awsSdk.awsSdkStrings.TrainingDataURI
  - java.lang.String
*/
type MLModelFilterVariable = _MLModelFilterVariable | String

type MLModelName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REGRESSION
  - typings.awsSdk.awsSdkStrings.BINARY
  - typings.awsSdk.awsSdkStrings.MULTICLASS
  - java.lang.String
*/
type MLModelType = _MLModelType | String

type MLModels = js.Array[MLModel]

type Message = String

type PageLimit = Double

type PerformanceMetricsProperties = StringDictionary[PerformanceMetricsPropertyValue]

type PerformanceMetricsPropertyKey = String

type PerformanceMetricsPropertyValue = String

type PresignedS3Url = String

type RDSDatabaseName = String

type RDSDatabasePassword = String

type RDSDatabaseUsername = String

type RDSInstanceIdentifier = String

type RDSSelectSqlQuery = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type RealtimeEndpointStatus = _RealtimeEndpointStatus | String

type Recipe = String

type Record = StringDictionary[VariableValue]

type RedshiftClusterIdentifier = String

type RedshiftDatabaseName = String

type RedshiftDatabasePassword = String

type RedshiftDatabaseUsername = String

type RedshiftSelectSqlQuery = String

type RoleARN = String

type S3Url = String

type ScoreThreshold = Double

type ScoreValue = Double

type ScoreValuePerLabelMap = StringDictionary[ScoreValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.asc_
  - typings.awsSdk.awsSdkStrings.dsc
  - java.lang.String
*/
type SortOrder = _SortOrder | String

type StringType = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BatchPrediction
  - typings.awsSdk.awsSdkStrings.DataSource
  - typings.awsSdk.awsSdkStrings.Evaluation_
  - typings.awsSdk.awsSdkStrings.MLModel
  - java.lang.String
*/
type TaggableResourceType = _TaggableResourceType | String

type TrainingParameters = StringDictionary[StringType]

type VariableName = String

type VariableValue = String

type Verbose = Boolean

type VipURL = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2014-12-12`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type floatLabel = Double
