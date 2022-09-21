package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUsageLimitResponse extends StObject {
  
  /**
    * The deleted usage limit object.
    */
  var usageLimit: js.UndefOr[UsageLimit] = js.undefined
}
object DeleteUsageLimitResponse {
  
  inline def apply(): DeleteUsageLimitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteUsageLimitResponse]
  }
  
  extension [Self <: DeleteUsageLimitResponse](x: Self) {
    
    inline def setUsageLimit(value: UsageLimit): Self = StObject.set(x, "usageLimit", value.asInstanceOf[js.Any])
    
    inline def setUsageLimitUndefined: Self = StObject.set(x, "usageLimit", js.undefined)
  }
}
