package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object computeoptimizerMod {
  type AccountId = java.lang.String
  type AccountIds = js.Array[typings.awsSdk.computeoptimizerMod.AccountId]
  type AutoScalingGroupArn = java.lang.String
  type AutoScalingGroupArns = js.Array[typings.awsSdk.computeoptimizerMod.AutoScalingGroupArn]
  type AutoScalingGroupName = java.lang.String
  type AutoScalingGroupRecommendationOptions = js.Array[typings.awsSdk.computeoptimizerMod.AutoScalingGroupRecommendationOption]
  type AutoScalingGroupRecommendations = js.Array[typings.awsSdk.computeoptimizerMod.AutoScalingGroupRecommendation]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.computeoptimizerMod.ClientApiVersions
  type Code = java.lang.String
  type CurrentInstanceType = java.lang.String
  type DesiredCapacity = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Finding_
    - typings.awsSdk.awsSdkStrings.RecommendationSourceType
    - java.lang.String
  */
  type FilterName = typings.awsSdk.computeoptimizerMod._FilterName | java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[typings.awsSdk.computeoptimizerMod.FilterValue]
  type Filters = js.Array[typings.awsSdk.computeoptimizerMod.Filter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Underprovisioned
    - typings.awsSdk.awsSdkStrings.Overprovisioned
    - typings.awsSdk.awsSdkStrings.Optimized
    - typings.awsSdk.awsSdkStrings.NotOptimized
    - java.lang.String
  */
  type Finding = typings.awsSdk.computeoptimizerMod._Finding | java.lang.String
  type GetRecommendationErrors = js.Array[typings.awsSdk.computeoptimizerMod.GetRecommendationError]
  type Identifier = java.lang.String
  type IncludeMemberAccounts = scala.Boolean
  type InstanceArn = java.lang.String
  type InstanceArns = js.Array[typings.awsSdk.computeoptimizerMod.InstanceArn]
  type InstanceName = java.lang.String
  type InstanceRecommendations = js.Array[typings.awsSdk.computeoptimizerMod.InstanceRecommendation]
  type InstanceType = java.lang.String
  type LastRefreshTimestamp = typings.std.Date
  type LookBackPeriodInDays = scala.Double
  type MaxResults = scala.Double
  type MaxSize = scala.Double
  type MemberAccountsEnrolled = scala.Boolean
  type Message = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Cpu_
    - typings.awsSdk.awsSdkStrings.Memory_
    - java.lang.String
  */
  type MetricName = typings.awsSdk.computeoptimizerMod._MetricName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Maximum_
    - typings.awsSdk.awsSdkStrings.Average_
    - java.lang.String
  */
  type MetricStatistic = typings.awsSdk.computeoptimizerMod._MetricStatistic | java.lang.String
  type MetricValue = scala.Double
  type MetricValues = js.Array[typings.awsSdk.computeoptimizerMod.MetricValue]
  type MinSize = scala.Double
  type NextToken = java.lang.String
  type PerformanceRisk = scala.Double
  type Period = scala.Double
  type ProjectedMetrics = js.Array[typings.awsSdk.computeoptimizerMod.ProjectedMetric]
  type ProjectedUtilizationMetrics = js.Array[typings.awsSdk.computeoptimizerMod.UtilizationMetric]
  type Rank = scala.Double
  type RecommendationOptions = js.Array[typings.awsSdk.computeoptimizerMod.InstanceRecommendationOption]
  type RecommendationSourceArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Ec2Instance_
    - typings.awsSdk.awsSdkStrings.AutoScalingGroup
    - java.lang.String
  */
  type RecommendationSourceType = typings.awsSdk.computeoptimizerMod._RecommendationSourceType | java.lang.String
  type RecommendationSources = js.Array[typings.awsSdk.computeoptimizerMod.RecommendationSource]
  type RecommendationSummaries = js.Array[typings.awsSdk.computeoptimizerMod.RecommendationSummary]
  type RecommendedInstanceType = java.lang.String
  type RecommendedOptionProjectedMetrics = js.Array[typings.awsSdk.computeoptimizerMod.RecommendedOptionProjectedMetric]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Active_
    - typings.awsSdk.awsSdkStrings.Inactive_
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type Status = typings.awsSdk.computeoptimizerMod._Status | java.lang.String
  type StatusReason = java.lang.String
  type Summaries = js.Array[typings.awsSdk.computeoptimizerMod.Summary]
  type SummaryValue = scala.Double
  type Timestamp = typings.std.Date
  type Timestamps = js.Array[typings.awsSdk.computeoptimizerMod.Timestamp]
  type UtilizationMetrics = js.Array[typings.awsSdk.computeoptimizerMod.UtilizationMetric]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-11-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.computeoptimizerMod._apiVersion | java.lang.String
}
