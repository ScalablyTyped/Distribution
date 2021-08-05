package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrustedAdvisorCheckResultResponse extends StObject {
  
  /**
    * The detailed results of the Trusted Advisor check.
    */
  var result: js.UndefOr[TrustedAdvisorCheckResult] = js.undefined
}
object DescribeTrustedAdvisorCheckResultResponse {
  
  inline def apply(): DescribeTrustedAdvisorCheckResultResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckResultResponse]
  }
  
  extension [Self <: DescribeTrustedAdvisorCheckResultResponse](x: Self) {
    
    inline def setResult(value: TrustedAdvisorCheckResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
