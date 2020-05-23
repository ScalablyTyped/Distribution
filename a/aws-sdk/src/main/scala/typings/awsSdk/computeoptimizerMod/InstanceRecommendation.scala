package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceRecommendation extends js.Object {
  /**
    * The AWS account ID of the instance recommendation.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  /**
    * The instance type of the current instance.
    */
  var currentInstanceType: js.UndefOr[CurrentInstanceType] = js.native
  /**
    * The finding classification for the instance. Findings for instances include:     Underprovisioned —An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.     Overprovisioned —An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.     Optimized —An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.    The values that are returned might be UNDER_PROVISIONED, OVER_PROVISIONED, or OPTIMIZED. 
    */
  var finding: js.UndefOr[Finding] = js.native
  /**
    * The Amazon Resource Name (ARN) of the current instance.
    */
  var instanceArn: js.UndefOr[InstanceArn] = js.native
  /**
    * The name of the current instance.
    */
  var instanceName: js.UndefOr[InstanceName] = js.native
  /**
    * The time stamp of when the instance recommendation was last refreshed.
    */
  var lastRefreshTimestamp: js.UndefOr[LastRefreshTimestamp] = js.native
  /**
    * The number of days for which utilization metrics were analyzed for the instance.
    */
  var lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.native
  /**
    * An array of objects that describe the recommendation options for the instance.
    */
  var recommendationOptions: js.UndefOr[RecommendationOptions] = js.native
  /**
    * An array of objects that describe the source resource of the recommendation.
    */
  var recommendationSources: js.UndefOr[RecommendationSources] = js.native
  /**
    * An array of objects that describe the utilization metrics of the instance.
    */
  var utilizationMetrics: js.UndefOr[UtilizationMetrics] = js.native
}

object InstanceRecommendation {
  @scala.inline
  def apply(
    accountId: AccountId = null,
    currentInstanceType: CurrentInstanceType = null,
    finding: Finding = null,
    instanceArn: InstanceArn = null,
    instanceName: InstanceName = null,
    lastRefreshTimestamp: LastRefreshTimestamp = null,
    lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.undefined,
    recommendationOptions: RecommendationOptions = null,
    recommendationSources: RecommendationSources = null,
    utilizationMetrics: UtilizationMetrics = null
  ): InstanceRecommendation = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (currentInstanceType != null) __obj.updateDynamic("currentInstanceType")(currentInstanceType.asInstanceOf[js.Any])
    if (finding != null) __obj.updateDynamic("finding")(finding.asInstanceOf[js.Any])
    if (instanceArn != null) __obj.updateDynamic("instanceArn")(instanceArn.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (lastRefreshTimestamp != null) __obj.updateDynamic("lastRefreshTimestamp")(lastRefreshTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(lookBackPeriodInDays)) __obj.updateDynamic("lookBackPeriodInDays")(lookBackPeriodInDays.get.asInstanceOf[js.Any])
    if (recommendationOptions != null) __obj.updateDynamic("recommendationOptions")(recommendationOptions.asInstanceOf[js.Any])
    if (recommendationSources != null) __obj.updateDynamic("recommendationSources")(recommendationSources.asInstanceOf[js.Any])
    if (utilizationMetrics != null) __obj.updateDynamic("utilizationMetrics")(utilizationMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceRecommendation]
  }
}

