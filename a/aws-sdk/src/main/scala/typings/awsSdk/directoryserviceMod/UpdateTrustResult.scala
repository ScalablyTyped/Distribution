package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrustResult extends StObject {
  
  var RequestId: js.UndefOr[typings.awsSdk.directoryserviceMod.RequestId] = js.undefined
  
  /**
    * Identifier of the trust relationship.
    */
  var TrustId: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustId] = js.undefined
}
object UpdateTrustResult {
  
  inline def apply(): UpdateTrustResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTrustResult]
  }
  
  extension [Self <: UpdateTrustResult](x: Self) {
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
    
    inline def setTrustIdUndefined: Self = StObject.set(x, "TrustId", js.undefined)
  }
}
