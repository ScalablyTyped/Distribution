package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceRecommendationOption extends js.Object {
  /**
    * The instance type of the instance recommendation.
    */
  var instanceType: js.UndefOr[InstanceType] = js.native
  /**
    * The performance risk of the instance recommendation option. Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of your workload. The lowest performance risk is categorized as 0, and the highest as 5.
    */
  var performanceRisk: js.UndefOr[PerformanceRisk] = js.native
  /**
    * An array of objects that describe the projected utilization metrics of the instance recommendation option.
    */
  var projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics] = js.native
  /**
    * The rank of the instance recommendation option. The top recommendation option is ranked as 1.
    */
  var rank: js.UndefOr[Rank] = js.native
}

object InstanceRecommendationOption {
  @scala.inline
  def apply(
    instanceType: InstanceType = null,
    performanceRisk: Int | Double = null,
    projectedUtilizationMetrics: ProjectedUtilizationMetrics = null,
    rank: Int | Double = null
  ): InstanceRecommendationOption = {
    val __obj = js.Dynamic.literal()
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (performanceRisk != null) __obj.updateDynamic("performanceRisk")(performanceRisk.asInstanceOf[js.Any])
    if (projectedUtilizationMetrics != null) __obj.updateDynamic("projectedUtilizationMetrics")(projectedUtilizationMetrics.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceRecommendationOption]
  }
}

