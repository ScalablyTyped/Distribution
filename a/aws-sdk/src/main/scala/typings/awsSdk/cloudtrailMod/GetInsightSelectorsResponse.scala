package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInsightSelectorsResponse extends js.Object {
  /**
    * A JSON string that contains the insight types you want to log on a trail. In this release, only ApiCallRateInsight is supported as an insight type.
    */
  var InsightSelectors: js.UndefOr[typings.awsSdk.cloudtrailMod.InsightSelectors] = js.native
  /**
    * The Amazon Resource Name (ARN) of a trail for which you want to get Insights selectors.
    */
  var TrailARN: js.UndefOr[String] = js.native
}

object GetInsightSelectorsResponse {
  @scala.inline
  def apply(InsightSelectors: InsightSelectors = null, TrailARN: String = null): GetInsightSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    if (InsightSelectors != null) __obj.updateDynamic("InsightSelectors")(InsightSelectors.asInstanceOf[js.Any])
    if (TrailARN != null) __obj.updateDynamic("TrailARN")(TrailARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightSelectorsResponse]
  }
}

