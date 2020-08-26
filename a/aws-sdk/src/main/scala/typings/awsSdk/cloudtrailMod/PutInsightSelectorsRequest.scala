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
  @scala.inline
  implicit class PutInsightSelectorsRequestOps[Self <: PutInsightSelectorsRequest] (val x: Self) extends AnyVal {
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
    def setInsightSelectorsVarargs(value: InsightSelector*): Self = this.set("InsightSelectors", js.Array(value :_*))
    @scala.inline
    def setInsightSelectors(value: InsightSelectors): Self = this.set("InsightSelectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrailName(value: String): Self = this.set("TrailName", value.asInstanceOf[js.Any])
  }
  
}

