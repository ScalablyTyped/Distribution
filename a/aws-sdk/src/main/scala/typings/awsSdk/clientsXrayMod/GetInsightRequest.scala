package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightRequest extends StObject {
  
  /**
    * The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
    */
  var InsightId: typings.awsSdk.clientsXrayMod.InsightId
}
object GetInsightRequest {
  
  inline def apply(InsightId: InsightId): GetInsightRequest = {
    val __obj = js.Dynamic.literal(InsightId = InsightId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightRequest]
  }
  
  extension [Self <: GetInsightRequest](x: Self) {
    
    inline def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
  }
}
