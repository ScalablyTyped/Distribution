package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTrustStoreRequest extends StObject {
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
  
  /**
    * The ARN of the trust store.
    */
  var trustStoreArn: ARN
}
object AssociateTrustStoreRequest {
  
  inline def apply(portalArn: ARN, trustStoreArn: ARN): AssociateTrustStoreRequest = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any], trustStoreArn = trustStoreArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTrustStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateTrustStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
  }
}
