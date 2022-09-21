package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFeedbackResponse extends StObject {
  
  var InsightFeedback: js.UndefOr[typings.awsSdk.devopsguruMod.InsightFeedback] = js.undefined
}
object DescribeFeedbackResponse {
  
  inline def apply(): DescribeFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFeedbackResponse]
  }
  
  extension [Self <: DescribeFeedbackResponse](x: Self) {
    
    inline def setInsightFeedback(value: InsightFeedback): Self = StObject.set(x, "InsightFeedback", value.asInstanceOf[js.Any])
    
    inline def setInsightFeedbackUndefined: Self = StObject.set(x, "InsightFeedback", js.undefined)
  }
}
