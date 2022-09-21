package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCanaryResponse extends StObject {
  
  /**
    * A structure that contains the full information about the canary.
    */
  var Canary: js.UndefOr[typings.awsSdk.syntheticsMod.Canary] = js.undefined
}
object GetCanaryResponse {
  
  inline def apply(): GetCanaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCanaryResponse]
  }
  
  extension [Self <: GetCanaryResponse](x: Self) {
    
    inline def setCanary(value: Canary): Self = StObject.set(x, "Canary", value.asInstanceOf[js.Any])
    
    inline def setCanaryUndefined: Self = StObject.set(x, "Canary", js.undefined)
  }
}
