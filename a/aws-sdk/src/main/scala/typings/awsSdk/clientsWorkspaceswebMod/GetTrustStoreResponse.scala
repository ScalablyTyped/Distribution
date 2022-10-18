package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrustStoreResponse extends StObject {
  
  /**
    * The trust store.
    */
  var trustStore: js.UndefOr[TrustStore] = js.undefined
}
object GetTrustStoreResponse {
  
  inline def apply(): GetTrustStoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTrustStoreResponse]
  }
  
  extension [Self <: GetTrustStoreResponse](x: Self) {
    
    inline def setTrustStore(value: TrustStore): Self = StObject.set(x, "trustStore", value.asInstanceOf[js.Any])
    
    inline def setTrustStoreUndefined: Self = StObject.set(x, "trustStore", js.undefined)
  }
}
