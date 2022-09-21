package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.SERVICE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type Arn = String

type ArnList = js.Array[Arn]

type AvroSchema = String

type BatchInferenceJobs = js.Array[BatchInferenceJobSummary]

type BatchSegmentJobs = js.Array[BatchSegmentJobSummary]

type Boolean = scala.Boolean

type Campaigns = js.Array[CampaignSummary]

type CategoricalHyperParameterRanges = js.Array[CategoricalHyperParameterRange]

type CategoricalValue = String

type CategoricalValues = js.Array[CategoricalValue]

type ContinuousHyperParameterRanges = js.Array[ContinuousHyperParameterRange]

type ContinuousMaxValue = Double

type ContinuousMinValue = Double

type DatasetExportJobs = js.Array[DatasetExportJobSummary]

type DatasetGroups = js.Array[DatasetGroupSummary]

type DatasetImportJobs = js.Array[DatasetImportJobSummary]

type DatasetType = String

type Datasets = js.Array[DatasetSummary]

type Date = js.Date

type DefaultCategoricalHyperParameterRanges = js.Array[DefaultCategoricalHyperParameterRange]

type DefaultContinuousHyperParameterRanges = js.Array[DefaultContinuousHyperParameterRange]

type DefaultIntegerHyperParameterRanges = js.Array[DefaultIntegerHyperParameterRange]

type Description = String

type DockerURI = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ECOMMERCE
  - typings.awsSdk.awsSdkStrings.VIDEO_ON_DEMAND
  - java.lang.String
*/
type Domain = _Domain | String

type EventTrackers = js.Array[EventTrackerSummary]

type EventType = String

type EventValueThreshold = String

type FailureReason = String

type FeatureTransformationParameters = StringDictionary[ParameterValue]

type FeaturizationParameters = StringDictionary[ParameterValue]

type FilterExpression = String

type Filters = js.Array[FilterSummary]

type HPOObjectiveType = String

type HPOResource = String

type HyperParameters = StringDictionary[ParameterValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FULL
  - typings.awsSdk.awsSdkStrings.INCREMENTAL
  - java.lang.String
*/
type ImportMode = _ImportMode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BULK
  - typings.awsSdk.awsSdkStrings.PUT
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type IngestionMode = _IngestionMode | String

type IntegerHyperParameterRanges = js.Array[IntegerHyperParameterRange]

type IntegerMaxValue = Double

type IntegerMinValue = Double

type ItemAttribute = String

type KmsKeyArn = String

type MaxResults = Double

type MetricName = String

type MetricRegex = String

type MetricValue = Double

type Metrics = StringDictionary[MetricValue]

type Name = String

type NextToken = String

type NumBatchResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LOW
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.OFF
  - java.lang.String
*/
type ObjectiveSensitivity = _ObjectiveSensitivity | String

type ParameterName = String

type ParameterValue = String

type PerformAutoML = scala.Boolean

type PerformHPO = scala.Boolean

type RecipeProvider = SERVICE | String

type RecipeType = String

type Recipes = js.Array[RecipeSummary]

type Recommenders = js.Array[RecommenderSummary]

type ResourceConfig = StringDictionary[ParameterValue]

type RoleArn = String

type S3Location = String

type Schemas = js.Array[DatasetSchemaSummary]

type SolutionVersions = js.Array[SolutionVersionSummary]

type Solutions = js.Array[SolutionSummary]

type Status = String

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type Tags = js.Array[Tag]

type TrackingId = String

type TrainingHours = Double

type TrainingInputMode = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FULL
  - typings.awsSdk.awsSdkStrings.UPDATE
  - java.lang.String
*/
type TrainingMode = _TrainingMode | String

type TransactionsPerSecond = Double

type Tunable = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-05-22`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
