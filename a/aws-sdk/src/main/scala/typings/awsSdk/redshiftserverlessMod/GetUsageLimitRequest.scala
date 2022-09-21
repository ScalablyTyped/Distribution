package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsageLimitRequest extends StObject {
  
  /**
    * The unique identifier of the usage limit to return information for.
    */
  var usageLimitId: String
}
object GetUsageLimitRequest {
  
  inline def apply(usageLimitId: String): GetUsageLimitRequest = {
    val __obj = js.Dynamic.literal(usageLimitId = usageLimitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageLimitRequest]
  }
  
  extension [Self <: GetUsageLimitRequest](x: Self) {
    
    inline def setUsageLimitId(value: String): Self = StObject.set(x, "usageLimitId", value.asInstanceOf[js.Any])
  }
}
