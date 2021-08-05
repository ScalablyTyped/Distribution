package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightResultsRequest extends StObject {
  
  /**
    * The ARN of the insight for which to return results.
    */
  var InsightArn: NonEmptyString
}
object GetInsightResultsRequest {
  
  inline def apply(InsightArn: NonEmptyString): GetInsightResultsRequest = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightResultsRequest]
  }
  
  extension [Self <: GetInsightResultsRequest](x: Self) {
    
    inline def setInsightArn(value: NonEmptyString): Self = StObject.set(x, "InsightArn", value.asInstanceOf[js.Any])
  }
}
