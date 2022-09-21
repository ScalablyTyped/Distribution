package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInsightRequest extends StObject {
  
  /**
    * The ID of the insight.
    */
  var Id: InsightId
}
object DeleteInsightRequest {
  
  inline def apply(Id: InsightId): DeleteInsightRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInsightRequest]
  }
  
  extension [Self <: DeleteInsightRequest](x: Self) {
    
    inline def setId(value: InsightId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
