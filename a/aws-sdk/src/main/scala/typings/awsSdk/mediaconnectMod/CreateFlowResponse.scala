package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFlowResponse extends StObject {
  
  var Flow: js.UndefOr[typings.awsSdk.mediaconnectMod.Flow] = js.undefined
}
object CreateFlowResponse {
  
  inline def apply(): CreateFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFlowResponse]
  }
  
  extension [Self <: CreateFlowResponse](x: Self) {
    
    inline def setFlow(value: Flow): Self = StObject.set(x, "Flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "Flow", js.undefined)
  }
}
