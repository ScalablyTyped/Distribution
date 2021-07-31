package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutInsightSelectorsResponse extends StObject {
  
  /**
    * A JSON string that contains the insight types you want to log on a trail. In this release, only ApiCallRateInsight is supported as an insight type.
    */
  var InsightSelectors: js.UndefOr[typings.awsSdk.cloudtrailMod.InsightSelectors] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a trail for which you want to change or add Insights selectors.
    */
  var TrailARN: js.UndefOr[String] = js.undefined
}
object PutInsightSelectorsResponse {
  
  @scala.inline
  def apply(): PutInsightSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutInsightSelectorsResponse]
  }
  
  @scala.inline
  implicit class PutInsightSelectorsResponseMutableBuilder[Self <: PutInsightSelectorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsightSelectors(value: InsightSelectors): Self = StObject.set(x, "InsightSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightSelectorsUndefined: Self = StObject.set(x, "InsightSelectors", js.undefined)
    
    @scala.inline
    def setInsightSelectorsVarargs(value: InsightSelector*): Self = StObject.set(x, "InsightSelectors", js.Array(value :_*))
    
    @scala.inline
    def setTrailARN(value: String): Self = StObject.set(x, "TrailARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailARNUndefined: Self = StObject.set(x, "TrailARN", js.undefined)
  }
}
