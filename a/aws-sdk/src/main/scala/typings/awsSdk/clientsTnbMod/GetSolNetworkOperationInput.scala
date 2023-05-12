package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolNetworkOperationInput extends StObject {
  
  /**
    * The identifier of the network operation.
    */
  var nsLcmOpOccId: NsLcmOpOccId
}
object GetSolNetworkOperationInput {
  
  inline def apply(nsLcmOpOccId: NsLcmOpOccId): GetSolNetworkOperationInput = {
    val __obj = js.Dynamic.literal(nsLcmOpOccId = nsLcmOpOccId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolNetworkOperationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolNetworkOperationInput] (val x: Self) extends AnyVal {
    
    inline def setNsLcmOpOccId(value: NsLcmOpOccId): Self = StObject.set(x, "nsLcmOpOccId", value.asInstanceOf[js.Any])
  }
}
