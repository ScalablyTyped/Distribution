package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUsageLimitResponse extends StObject {
  
  /**
    * The returned usage limit object.
    */
  var usageLimit: js.UndefOr[UsageLimit] = js.undefined
}
object CreateUsageLimitResponse {
  
  inline def apply(): CreateUsageLimitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUsageLimitResponse]
  }
  
  extension [Self <: CreateUsageLimitResponse](x: Self) {
    
    inline def setUsageLimit(value: UsageLimit): Self = StObject.set(x, "usageLimit", value.asInstanceOf[js.Any])
    
    inline def setUsageLimitUndefined: Self = StObject.set(x, "usageLimit", js.undefined)
  }
}
