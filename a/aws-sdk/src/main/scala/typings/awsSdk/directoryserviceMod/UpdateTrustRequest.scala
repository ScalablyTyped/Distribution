package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrustRequest extends StObject {
  
  /**
    * Updates selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typings.awsSdk.directoryserviceMod.SelectiveAuth] = js.undefined
  
  /**
    * Identifier of the trust relationship.
    */
  var TrustId: typings.awsSdk.directoryserviceMod.TrustId
}
object UpdateTrustRequest {
  
  inline def apply(TrustId: TrustId): UpdateTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrustRequest]
  }
  
  extension [Self <: UpdateTrustRequest](x: Self) {
    
    inline def setSelectiveAuth(value: SelectiveAuth): Self = StObject.set(x, "SelectiveAuth", value.asInstanceOf[js.Any])
    
    inline def setSelectiveAuthUndefined: Self = StObject.set(x, "SelectiveAuth", js.undefined)
    
    inline def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
  }
}
