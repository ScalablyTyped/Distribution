package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSamplingStatisticSummariesRequest extends StObject {
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetSamplingStatisticSummariesRequest {
  
  inline def apply(): GetSamplingStatisticSummariesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSamplingStatisticSummariesRequest]
  }
  
  extension [Self <: GetSamplingStatisticSummariesRequest](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
