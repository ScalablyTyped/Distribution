package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrustStoreRequest extends StObject {
  
  /**
    * The ARN of the trust store.
    */
  var trustStoreArn: ARN
}
object GetTrustStoreRequest {
  
  inline def apply(trustStoreArn: ARN): GetTrustStoreRequest = {
    val __obj = js.Dynamic.literal(trustStoreArn = trustStoreArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrustStoreRequest]
  }
  
  extension [Self <: GetTrustStoreRequest](x: Self) {
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
  }
}
