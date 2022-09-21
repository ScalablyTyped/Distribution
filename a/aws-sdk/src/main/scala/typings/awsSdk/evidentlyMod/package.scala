package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.BayesianInference
import typings.awsSdk.awsSdkStrings.Mean_
import typings.awsSdk.awsSdkStrings.awsDotevidentlyDotonlineab
import typings.awsSdk.awsSdkStrings.awsDotevidentlyDotsplits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AppConfigResourceId = java.lang.String

type Arn = java.lang.String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INCREASE
  - typings.awsSdk.awsSdkStrings.DECREASE
  - java.lang.String
*/
type ChangeDirectionEnum = _ChangeDirectionEnum | java.lang.String

type CwDimensionSafeName = java.lang.String

type CwLogGroupSafeName = java.lang.String

type Description = java.lang.String

type Double = scala.Double

type DoubleValueList = js.Array[Double]

type EntityId = java.lang.String

type EntityOverrideMap = StringDictionary[VariationName]

type ErrorCodeEnum = java.lang.String

type ErrorMessage = java.lang.String

type EvaluationRequestsList = js.Array[EvaluationRequest]

type EvaluationResultsList = js.Array[EvaluationResult]

type EvaluationRulesList = js.Array[EvaluationRule]

type EventList = js.Array[Event]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.awsDotevidentlyDotevaluation
  - typings.awsSdk.awsSdkStrings.awsDotevidentlyDotcustom
  - java.lang.String
*/
type EventType = _EventType | java.lang.String

type ExperimentArn = java.lang.String

type ExperimentBaseStat = Mean_ | java.lang.String

type ExperimentList = js.Array[Experiment]

type ExperimentName = java.lang.String

type ExperimentReportList = js.Array[ExperimentReport]

type ExperimentReportName = BayesianInference | java.lang.String

type ExperimentReportNameList = js.Array[ExperimentReportName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BaseStat
  - typings.awsSdk.awsSdkStrings.TreatmentEffect
  - typings.awsSdk.awsSdkStrings.ConfidenceInterval
  - typings.awsSdk.awsSdkStrings.PValue
  - java.lang.String
*/
type ExperimentResultRequestType = _ExperimentResultRequestType | java.lang.String

type ExperimentResultRequestTypeList = js.Array[ExperimentResultRequestType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Mean_
  - typings.awsSdk.awsSdkStrings.TreatmentEffect
  - typings.awsSdk.awsSdkStrings.ConfidenceIntervalUpperBound
  - typings.awsSdk.awsSdkStrings.ConfidenceIntervalLowerBound
  - typings.awsSdk.awsSdkStrings.PValue
  - java.lang.String
*/
type ExperimentResultResponseType = _ExperimentResultResponseType | java.lang.String

type ExperimentResultsDataList = js.Array[ExperimentResultsData]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type ExperimentStatus = _ExperimentStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type ExperimentStopDesiredState = _ExperimentStopDesiredState | java.lang.String

type ExperimentType = awsDotevidentlyDotonlineab | java.lang.String

type FeatureArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL_RULES
  - typings.awsSdk.awsSdkStrings.DEFAULT_VARIATION
  - java.lang.String
*/
type FeatureEvaluationStrategy = _FeatureEvaluationStrategy | java.lang.String

type FeatureName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type FeatureStatus = _FeatureStatus | java.lang.String

type FeatureSummariesList = js.Array[FeatureSummary]

type FeatureToVariationMap = StringDictionary[VariationName]

type GroupName = java.lang.String

type GroupToWeightMap = StringDictionary[SplitWeight]

type Integer = scala.Double

type JsonPath = java.lang.String

type JsonValue = java.lang.String

type LaunchArn = java.lang.String

type LaunchGroupConfigList = js.Array[LaunchGroupConfig]

type LaunchGroupList = js.Array[LaunchGroup]

type LaunchName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type LaunchStatus = _LaunchStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type LaunchStopDesiredState = _LaunchStopDesiredState | java.lang.String

type LaunchType = awsDotevidentlyDotsplits | java.lang.String

type LaunchesList = js.Array[Launch]

type Long = scala.Double

type MaxExperiments = scala.Double

type MaxFeatures = scala.Double

type MaxLaunches = scala.Double

type MaxProjects = scala.Double

type MaxReferences = scala.Double

type MaxSegments = scala.Double

type MetricDefinitionConfigEventPatternString = java.lang.String

type MetricGoalConfigList = js.Array[MetricGoalConfig]

type MetricGoalsList = js.Array[MetricGoal]

type MetricMonitorConfigList = js.Array[MetricMonitorConfig]

type MetricMonitorList = js.Array[MetricMonitor]

type MetricNameList = js.Array[CwDimensionSafeName]

type MetricUnitLabel = java.lang.String

type NextToken = java.lang.String

type PrimitiveBoolean = scala.Boolean

type ProjectArn = java.lang.String

type ProjectName = java.lang.String

type ProjectRef = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type ProjectStatus = _ProjectStatus | java.lang.String

type ProjectSummariesList = js.Array[ProjectSummary]

type PutProjectEventsResultEntryList = js.Array[PutProjectEventsResultEntry]

type RandomizationSalt = java.lang.String

type RefResourceList = js.Array[RefResource]

type ResultsPeriod = scala.Double

type RuleName = java.lang.String

type RuleType = java.lang.String

type S3BucketSafeName = java.lang.String

type S3PrefixSafeName = java.lang.String

type ScheduledSplitConfigList = js.Array[ScheduledSplitConfig]

type ScheduledStepList = js.Array[ScheduledSplit]

type SegmentArn = java.lang.String

type SegmentList = js.Array[Segment]

type SegmentName = java.lang.String

type SegmentOverridesList = js.Array[SegmentOverride]

type SegmentPattern = java.lang.String

type SegmentRef = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXPERIMENT
  - typings.awsSdk.awsSdkStrings.LAUNCH
  - java.lang.String
*/
type SegmentReferenceResourceType = _SegmentReferenceResourceType | java.lang.String

type SplitWeight = scala.Double

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Timestamp = js.Date

type TimestampList = js.Array[js.Date]

type TreatmentConfigList = js.Array[TreatmentConfig]

type TreatmentList = js.Array[Treatment]

type TreatmentName = java.lang.String

type TreatmentNameList = js.Array[TreatmentName]

type TreatmentToWeightMap = StringDictionary[SplitWeight]

type Uuid = java.lang.String

type VariableValueLongValueLong = scala.Double

type VariableValueStringValueString = java.lang.String

type VariationConfigsList = js.Array[VariationConfig]

type VariationName = java.lang.String

type VariationNameList = js.Array[VariationName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.LONG
  - typings.awsSdk.awsSdkStrings.DOUBLE
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - java.lang.String
*/
type VariationValueType = _VariationValueType | java.lang.String

type VariationsList = js.Array[Variation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-02-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
