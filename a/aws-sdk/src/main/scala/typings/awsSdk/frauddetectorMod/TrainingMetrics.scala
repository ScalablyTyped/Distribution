package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingMetrics extends js.Object {
  /**
    * The area under the curve. This summarizes true positive rate (TPR) and false positive rate (FPR) across all possible model score thresholds. A model with no predictive power has an AUC of 0.5, whereas a perfect model has a score of 1.0.
    */
  var auc: js.UndefOr[float] = js.native
  /**
    * The data points details.
    */
  var metricDataPoints: js.UndefOr[metricDataPointsList] = js.native
}

object TrainingMetrics {
  @scala.inline
  def apply(): TrainingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingMetrics]
  }
  @scala.inline
  implicit class TrainingMetricsOps[Self <: TrainingMetrics] (val x: Self) extends AnyVal {
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
    def setAuc(value: float): Self = this.set("auc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuc: Self = this.set("auc", js.undefined)
    @scala.inline
    def setMetricDataPointsVarargs(value: MetricDataPoint*): Self = this.set("metricDataPoints", js.Array(value :_*))
    @scala.inline
    def setMetricDataPoints(value: metricDataPointsList): Self = this.set("metricDataPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricDataPoints: Self = this.set("metricDataPoints", js.undefined)
  }
  
}

