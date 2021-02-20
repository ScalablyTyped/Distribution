package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object personalizeMod {
  
  type AccountId = java.lang.String
  
  type Arn = java.lang.String
  
  type ArnList = js.Array[typings.awsSdk.personalizeMod.Arn]
  
  type AvroSchema = java.lang.String
  
  type BatchInferenceJobs = js.Array[typings.awsSdk.personalizeMod.BatchInferenceJobSummary]
  
  type Boolean = scala.Boolean
  
  type Campaigns = js.Array[typings.awsSdk.personalizeMod.CampaignSummary]
  
  type CategoricalHyperParameterRanges = js.Array[typings.awsSdk.personalizeMod.CategoricalHyperParameterRange]
  
  type CategoricalValue = java.lang.String
  
  type CategoricalValues = js.Array[typings.awsSdk.personalizeMod.CategoricalValue]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.personalizeMod.ClientApiVersions
  
  type ContinuousHyperParameterRanges = js.Array[typings.awsSdk.personalizeMod.ContinuousHyperParameterRange]
  
  type ContinuousMaxValue = scala.Double
  
  type ContinuousMinValue = scala.Double
  
  type DatasetGroups = js.Array[typings.awsSdk.personalizeMod.DatasetGroupSummary]
  
  type DatasetImportJobs = js.Array[typings.awsSdk.personalizeMod.DatasetImportJobSummary]
  
  type DatasetType = java.lang.String
  
  type Datasets = js.Array[typings.awsSdk.personalizeMod.DatasetSummary]
  
  type Date = typings.std.Date
  
  type DefaultCategoricalHyperParameterRanges = js.Array[typings.awsSdk.personalizeMod.DefaultCategoricalHyperParameterRange]
  
  type DefaultContinuousHyperParameterRanges = js.Array[typings.awsSdk.personalizeMod.DefaultContinuousHyperParameterRange]
  
  type DefaultIntegerHyperParameterRanges = js.Array[typings.awsSdk.personalizeMod.DefaultIntegerHyperParameterRange]
  
  type Description = java.lang.String
  
  type DockerURI = java.lang.String
  
  type EventTrackers = js.Array[typings.awsSdk.personalizeMod.EventTrackerSummary]
  
  type EventType = java.lang.String
  
  type EventValueThreshold = java.lang.String
  
  type FailureReason = java.lang.String
  
  type FeatureTransformationParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.personalizeMod.ParameterValue]
  
  type FeaturizationParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.personalizeMod.ParameterValue]
  
  type FilterExpression = java.lang.String
  
  type Filters = js.Array[typings.awsSdk.personalizeMod.FilterSummary]
  
  type HPOObjectiveType = java.lang.String
  
  type HPOResource = java.lang.String
  
  type HyperParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.personalizeMod.ParameterValue]
  
  type IntegerHyperParameterRanges = js.Array[typings.awsSdk.personalizeMod.IntegerHyperParameterRange]
  
  type IntegerMaxValue = scala.Double
  
  type IntegerMinValue = scala.Double
  
  type KmsKeyArn = java.lang.String
  
  type MaxResults = scala.Double
  
  type MetricName = java.lang.String
  
  type MetricRegex = java.lang.String
  
  type MetricValue = scala.Double
  
  type Metrics = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.personalizeMod.MetricValue]
  
  type Name = java.lang.String
  
  type NextToken = java.lang.String
  
  type NumBatchResults = scala.Double
  
  type ParameterName = java.lang.String
  
  type ParameterValue = java.lang.String
  
  type PerformAutoML = scala.Boolean
  
  type PerformHPO = scala.Boolean
  
  type RecipeProvider = typings.awsSdk.awsSdkStrings.SERVICE | java.lang.String
  
  type RecipeType = java.lang.String
  
  type Recipes = js.Array[typings.awsSdk.personalizeMod.RecipeSummary]
  
  type ResourceConfig = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.personalizeMod.ParameterValue]
  
  type RoleArn = java.lang.String
  
  type S3Location = java.lang.String
  
  type Schemas = js.Array[typings.awsSdk.personalizeMod.DatasetSchemaSummary]
  
  type SolutionVersions = js.Array[typings.awsSdk.personalizeMod.SolutionVersionSummary]
  
  type Solutions = js.Array[typings.awsSdk.personalizeMod.SolutionSummary]
  
  type Status = java.lang.String
  
  type TrackingId = java.lang.String
  
  type TrainingHours = scala.Double
  
  type TrainingInputMode = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FULL
    - typings.awsSdk.awsSdkStrings.UPDATE
    - java.lang.String
  */
  type TrainingMode = typings.awsSdk.personalizeMod._TrainingMode | java.lang.String
  
  type TransactionsPerSecond = scala.Double
  
  type Tunable = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-05-22`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.personalizeMod._apiVersion | java.lang.String
}
