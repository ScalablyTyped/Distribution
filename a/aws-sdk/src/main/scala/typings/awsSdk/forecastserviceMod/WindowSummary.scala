package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowSummary extends js.Object {
  /**
    * The type of evaluation.    SUMMARY - The average metrics across all windows.    COMPUTED - The metrics for the specified window.  
    */
  var EvaluationType: js.UndefOr[typings.awsSdk.forecastserviceMod.EvaluationType] = js.native
  /**
    * The number of data points within the window.
    */
  var ItemCount: js.UndefOr[Integer] = js.native
  /**
    * Provides metrics used to evaluate the performance of a predictor.
    */
  var Metrics: js.UndefOr[typings.awsSdk.forecastserviceMod.Metrics] = js.native
  /**
    * The timestamp that defines the end of the window.
    */
  var TestWindowEnd: js.UndefOr[Timestamp] = js.native
  /**
    * The timestamp that defines the start of the window.
    */
  var TestWindowStart: js.UndefOr[Timestamp] = js.native
}

object WindowSummary {
  @scala.inline
  def apply(
    EvaluationType: EvaluationType = null,
    ItemCount: Int | scala.Double = null,
    Metrics: Metrics = null,
    TestWindowEnd: Timestamp = null,
    TestWindowStart: Timestamp = null
  ): WindowSummary = {
    val __obj = js.Dynamic.literal()
    if (EvaluationType != null) __obj.updateDynamic("EvaluationType")(EvaluationType.asInstanceOf[js.Any])
    if (ItemCount != null) __obj.updateDynamic("ItemCount")(ItemCount.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (TestWindowEnd != null) __obj.updateDynamic("TestWindowEnd")(TestWindowEnd.asInstanceOf[js.Any])
    if (TestWindowStart != null) __obj.updateDynamic("TestWindowStart")(TestWindowStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowSummary]
  }
}

