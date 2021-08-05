package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrustResult extends StObject {
  
  /**
    * The Trust ID of the trust relationship that was deleted.
    */
  var TrustId: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustId] = js.undefined
}
object DeleteTrustResult {
  
  inline def apply(): DeleteTrustResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrustResult]
  }
  
  extension [Self <: DeleteTrustResult](x: Self) {
    
    inline def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
    
    inline def setTrustIdUndefined: Self = StObject.set(x, "TrustId", js.undefined)
  }
}
