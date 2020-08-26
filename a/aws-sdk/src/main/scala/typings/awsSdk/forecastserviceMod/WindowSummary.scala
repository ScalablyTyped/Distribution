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
  def apply(): WindowSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowSummary]
  }
  @scala.inline
  implicit class WindowSummaryOps[Self <: WindowSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvaluationType(value: EvaluationType): Self = this.set("EvaluationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationType: Self = this.set("EvaluationType", js.undefined)
    @scala.inline
    def setItemCount(value: Integer): Self = this.set("ItemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCount: Self = this.set("ItemCount", js.undefined)
    @scala.inline
    def setMetrics(value: Metrics): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    @scala.inline
    def setTestWindowEnd(value: Timestamp): Self = this.set("TestWindowEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestWindowEnd: Self = this.set("TestWindowEnd", js.undefined)
    @scala.inline
    def setTestWindowStart(value: Timestamp): Self = this.set("TestWindowStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestWindowStart: Self = this.set("TestWindowStart", js.undefined)
  }
  
}

