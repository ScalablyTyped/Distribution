package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object forecastserviceMod {
  type Arn = java.lang.String
  type ArnList = js.Array[typings.awsSdk.forecastserviceMod.Arn]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.string__
    - typings.awsSdk.awsSdkStrings.integer__
    - typings.awsSdk.awsSdkStrings.float_
    - typings.awsSdk.awsSdkStrings.timestamp_
    - java.lang.String
  */
  type AttributeType = typings.awsSdk.forecastserviceMod._AttributeType | java.lang.String
  type Boolean = scala.Boolean
  type CategoricalParameterRanges = js.Array[typings.awsSdk.forecastserviceMod.CategoricalParameterRange]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.forecastserviceMod.ClientApiVersions
  type ContinuousParameterRanges = js.Array[typings.awsSdk.forecastserviceMod.ContinuousParameterRange]
  type DatasetGroups = js.Array[typings.awsSdk.forecastserviceMod.DatasetGroupSummary]
  type DatasetImportJobs = js.Array[typings.awsSdk.forecastserviceMod.DatasetImportJobSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TARGET_TIME_SERIES
    - typings.awsSdk.awsSdkStrings.RELATED_TIME_SERIES
    - typings.awsSdk.awsSdkStrings.ITEM_METADATA
    - java.lang.String
  */
  type DatasetType = typings.awsSdk.forecastserviceMod._DatasetType | java.lang.String
  type Datasets = js.Array[typings.awsSdk.forecastserviceMod.DatasetSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RETAIL
    - typings.awsSdk.awsSdkStrings.CUSTOM
    - typings.awsSdk.awsSdkStrings.INVENTORY_PLANNING
    - typings.awsSdk.awsSdkStrings.EC2_CAPACITY
    - typings.awsSdk.awsSdkStrings.WORK_FORCE
    - typings.awsSdk.awsSdkStrings.WEB_TRAFFIC
    - typings.awsSdk.awsSdkStrings.METRICS
    - java.lang.String
  */
  type Domain = typings.awsSdk.forecastserviceMod._Domain | java.lang.String
  type Double = scala.Double
  type ErrorMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUMMARY
    - typings.awsSdk.awsSdkStrings.COMPUTED
    - java.lang.String
  */
  type EvaluationType = typings.awsSdk.forecastserviceMod._EvaluationType | java.lang.String
  type FeaturizationMethodName = typings.awsSdk.awsSdkStrings.filling | java.lang.String
  type FeaturizationMethodParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.forecastserviceMod.ParameterValue]
  type FeaturizationPipeline = js.Array[typings.awsSdk.forecastserviceMod.FeaturizationMethod]
  type Featurizations = js.Array[typings.awsSdk.forecastserviceMod.Featurization]
  type FieldStatistics = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.forecastserviceMod.Statistics]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IS
    - typings.awsSdk.awsSdkStrings.IS_NOT
    - java.lang.String
  */
  type FilterConditionString = typings.awsSdk.forecastserviceMod._FilterConditionString | java.lang.String
  type Filters = js.Array[typings.awsSdk.forecastserviceMod.Filter]
  type ForecastDimensions = js.Array[typings.awsSdk.forecastserviceMod.Name]
  type ForecastExportJobs = js.Array[typings.awsSdk.forecastserviceMod.ForecastExportJobSummary]
  type ForecastType = java.lang.String
  type ForecastTypes = js.Array[typings.awsSdk.forecastserviceMod.ForecastType]
  type Forecasts = js.Array[typings.awsSdk.forecastserviceMod.ForecastSummary]
  type Frequency = java.lang.String
  type Integer = scala.Double
  type IntegerParameterRanges = js.Array[typings.awsSdk.forecastserviceMod.IntegerParameterRange]
  type KMSKeyArn = java.lang.String
  type MaxResults = scala.Double
  type Message = java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterValue = java.lang.String
  type PredictorEvaluationResults = js.Array[typings.awsSdk.forecastserviceMod.EvaluationResult]
  type PredictorExecutions = js.Array[typings.awsSdk.forecastserviceMod.PredictorExecution]
  type Predictors = js.Array[typings.awsSdk.forecastserviceMod.PredictorSummary]
  type S3Path = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Auto_
    - typings.awsSdk.awsSdkStrings.Linear_
    - typings.awsSdk.awsSdkStrings.Logarithmic
    - typings.awsSdk.awsSdkStrings.ReverseLogarithmic
    - java.lang.String
  */
  type ScalingType = typings.awsSdk.forecastserviceMod._ScalingType | java.lang.String
  type SchemaAttributes = js.Array[typings.awsSdk.forecastserviceMod.SchemaAttribute]
  type Status = java.lang.String
  type String = java.lang.String
  type SupplementaryFeatures = js.Array[typings.awsSdk.forecastserviceMod.SupplementaryFeature]
  type TagKey = java.lang.String
  type TagKeys = js.Array[typings.awsSdk.forecastserviceMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typings.awsSdk.forecastserviceMod.Tag]
  type TestWindowDetails = js.Array[typings.awsSdk.forecastserviceMod.TestWindowSummary]
  type TestWindows = js.Array[typings.awsSdk.forecastserviceMod.WindowSummary]
  type Timestamp = typings.std.Date
  type TimestampFormat = java.lang.String
  type TrainingParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.forecastserviceMod.ParameterValue]
  type Value = java.lang.String
  type Values = js.Array[typings.awsSdk.forecastserviceMod.Value]
  type WeightedQuantileLosses = js.Array[typings.awsSdk.forecastserviceMod.WeightedQuantileLoss]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-06-26`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.forecastserviceMod._apiVersion | java.lang.String
}
