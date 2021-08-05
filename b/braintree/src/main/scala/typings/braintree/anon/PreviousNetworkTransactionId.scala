package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousNetworkTransactionId extends StObject {
  
  var previousNetworkTransactionId: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
}
object PreviousNetworkTransactionId {
  
  inline def apply(): PreviousNetworkTransactionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviousNetworkTransactionId]
  }
  
  extension [Self <: PreviousNetworkTransactionId](x: Self) {
    
    inline def setPreviousNetworkTransactionId(value: String): Self = StObject.set(x, "previousNetworkTransactionId", value.asInstanceOf[js.Any])
    
    inline def setPreviousNetworkTransactionIdUndefined: Self = StObject.set(x, "previousNetworkTransactionId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
