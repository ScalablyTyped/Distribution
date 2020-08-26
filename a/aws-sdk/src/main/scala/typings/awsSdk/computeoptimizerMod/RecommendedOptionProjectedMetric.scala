package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommendedOptionProjectedMetric extends js.Object {
  /**
    * An array of objects that describe a projected utilization metric.
    */
  var projectedMetrics: js.UndefOr[ProjectedMetrics] = js.native
  /**
    * The rank of the recommendation option projected metric. The top recommendation option is ranked as 1. The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked as 1 is related to the recommendation option that is also ranked as 1 in the same response.
    */
  var rank: js.UndefOr[Rank] = js.native
  /**
    * The recommended instance type.
    */
  var recommendedInstanceType: js.UndefOr[RecommendedInstanceType] = js.native
}

object RecommendedOptionProjectedMetric {
  @scala.inline
  def apply(): RecommendedOptionProjectedMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendedOptionProjectedMetric]
  }
  @scala.inline
  implicit class RecommendedOptionProjectedMetricOps[Self <: RecommendedOptionProjectedMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProjectedMetricsVarargs(value: ProjectedMetric*): Self = this.set("projectedMetrics", js.Array(value :_*))
    @scala.inline
    def setProjectedMetrics(value: ProjectedMetrics): Self = this.set("projectedMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectedMetrics: Self = this.set("projectedMetrics", js.undefined)
    @scala.inline
    def setRank(value: Rank): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    @scala.inline
    def setRecommendedInstanceType(value: RecommendedInstanceType): Self = this.set("recommendedInstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendedInstanceType: Self = this.set("recommendedInstanceType", js.undefined)
  }
  
}

