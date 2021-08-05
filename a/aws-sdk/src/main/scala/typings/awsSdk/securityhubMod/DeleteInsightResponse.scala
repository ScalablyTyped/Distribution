package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInsightResponse extends StObject {
  
  /**
    * The ARN of the insight that was deleted.
    */
  var InsightArn: NonEmptyString
}
object DeleteInsightResponse {
  
  inline def apply(InsightArn: NonEmptyString): DeleteInsightResponse = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInsightResponse]
  }
  
  extension [Self <: DeleteInsightResponse](x: Self) {
    
    inline def setInsightArn(value: NonEmptyString): Self = StObject.set(x, "InsightArn", value.asInstanceOf[js.Any])
  }
}
