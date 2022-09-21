package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrustStoreRequest extends StObject {
  
  /**
    * The ARN of the trust store.
    */
  var trustStoreArn: ARN
}
object DeleteTrustStoreRequest {
  
  inline def apply(trustStoreArn: ARN): DeleteTrustStoreRequest = {
    val __obj = js.Dynamic.literal(trustStoreArn = trustStoreArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrustStoreRequest]
  }
  
  extension [Self <: DeleteTrustStoreRequest](x: Self) {
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
  }
}
