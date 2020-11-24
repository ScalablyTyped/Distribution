package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): GetInsightSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightSelectorsResponse]
  }
  
  @scala.inline
  implicit class GetInsightSelectorsResponseOps[Self <: GetInsightSelectorsResponse] (val x: Self) extends AnyVal {
    
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
    def deleteInsightSelectors: Self = this.set("InsightSelectors", js.undefined)
    
    @scala.inline
    def setTrailARN(value: String): Self = this.set("TrailARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailARN: Self = this.set("TrailARN", js.undefined)
  }
}
