package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutInsightSelectorsRequest extends js.Object {
  /**
    * A JSON string that contains the insight types you want to log on a trail. In this release, only ApiCallRateInsight is supported as an insight type.
    */
  var InsightSelectors: typings.awsSdk.cloudtrailMod.InsightSelectors = js.native
  /**
    * The name of the CloudTrail trail for which you want to change or add Insights selectors.
    */
  var TrailName: String = js.native
}

object PutInsightSelectorsRequest {
  @scala.inline
  def apply(InsightSelectors: InsightSelectors, TrailName: String): PutInsightSelectorsRequest = {
    val __obj = js.Dynamic.literal(InsightSelectors = InsightSelectors.asInstanceOf[js.Any], TrailName = TrailName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInsightSelectorsRequest]
  }
}

