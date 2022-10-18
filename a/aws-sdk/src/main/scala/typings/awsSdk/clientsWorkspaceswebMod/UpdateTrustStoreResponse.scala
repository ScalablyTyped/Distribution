package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrustStoreResponse extends StObject {
  
  /**
    * The ARN of the trust store.
    */
  var trustStoreArn: ARN
}
object UpdateTrustStoreResponse {
  
  inline def apply(trustStoreArn: ARN): UpdateTrustStoreResponse = {
    val __obj = js.Dynamic.literal(trustStoreArn = trustStoreArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrustStoreResponse]
  }
  
  extension [Self <: UpdateTrustStoreResponse](x: Self) {
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
  }
}
