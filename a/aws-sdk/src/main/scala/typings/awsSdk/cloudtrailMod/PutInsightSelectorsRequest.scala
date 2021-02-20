package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutInsightSelectorsRequest extends StObject {
  
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
  implicit class PutInsightSelectorsRequestMutableBuilder[Self <: PutInsightSelectorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsightSelectors(value: InsightSelectors): Self = StObject.set(x, "InsightSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightSelectorsVarargs(value: InsightSelector*): Self = StObject.set(x, "InsightSelectors", js.Array(value :_*))
    
    @scala.inline
    def setTrailName(value: String): Self = StObject.set(x, "TrailName", value.asInstanceOf[js.Any])
  }
}
