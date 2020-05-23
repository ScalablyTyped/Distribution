package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentMetricSummary extends js.Object {
  /**
    * The average value of the metric.
    */
  var Avg: js.UndefOr[OptionalDouble] = js.native
  /**
    * The number of samples used to generate the metric.
    */
  var Count: js.UndefOr[OptionalInteger] = js.native
  /**
    * The most recent value of the metric.
    */
  var Last: js.UndefOr[OptionalDouble] = js.native
  /**
    * The maximum value of the metric.
    */
  var Max: js.UndefOr[OptionalDouble] = js.native
  /**
    * The name of the metric.
    */
  var MetricName: js.UndefOr[typings.awsSdk.sagemakerMod.MetricName] = js.native
  /**
    * The minimum value of the metric.
    */
  var Min: js.UndefOr[OptionalDouble] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: js.UndefOr[TrialComponentSourceArn] = js.native
  /**
    * The standard deviation of the metric.
    */
  var StdDev: js.UndefOr[OptionalDouble] = js.native
  /**
    * When the metric was last updated.
    */
  var TimeStamp: js.UndefOr[Timestamp] = js.native
}

object TrialComponentMetricSummary {
  @scala.inline
  def apply(
    Avg: js.UndefOr[OptionalDouble] = js.undefined,
    Count: js.UndefOr[OptionalInteger] = js.undefined,
    Last: js.UndefOr[OptionalDouble] = js.undefined,
    Max: js.UndefOr[OptionalDouble] = js.undefined,
    MetricName: MetricName = null,
    Min: js.UndefOr[OptionalDouble] = js.undefined,
    SourceArn: TrialComponentSourceArn = null,
    StdDev: js.UndefOr[OptionalDouble] = js.undefined,
    TimeStamp: Timestamp = null
  ): TrialComponentMetricSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Avg)) __obj.updateDynamic("Avg")(Avg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Last)) __obj.updateDynamic("Last")(Last.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Max)) __obj.updateDynamic("Max")(Max.get.asInstanceOf[js.Any])
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName.asInstanceOf[js.Any])
    if (!js.isUndefined(Min)) __obj.updateDynamic("Min")(Min.get.asInstanceOf[js.Any])
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn.asInstanceOf[js.Any])
    if (!js.isUndefined(StdDev)) __obj.updateDynamic("StdDev")(StdDev.get.asInstanceOf[js.Any])
    if (TimeStamp != null) __obj.updateDynamic("TimeStamp")(TimeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentMetricSummary]
  }
}

